/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import business.History;
import data.HistoryDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Xiaowen Li
 */
public class Submit extends HttpServlet
{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        response.setContentType("text/html;charset=UTF-8");
        
        String name = request.getParameter("name");
        String breath = request.getParameter("breath");
        String bleeding = request.getParameter("bleeding");
        String teeth = request.getParameter("teeth");
        String tonque = request.getParameter("tonque");
        String biting = request.getParameter("biting");
        String floss = request.getParameter("floss");

        PrintWriter out = response.getWriter();

        if (name.trim().length() == 0)
        {
            out.print("The name cannot be empty. Please enter a name.");
            RequestDispatcher rd1 = request.getRequestDispatcher("/historyFrm.jsp");
            rd1.include(request, response);
        } else if (breath.trim().length() == 0)
        {

            out.print("The breath cannot be empty. Please select a breath.");
            RequestDispatcher rd2 = request.getRequestDispatcher("/historyFrm.jsp");
            rd2.include(request, response);
        } else if (bleeding.trim().length() == 0) 
        {

            out.print("The bleeding cannot be empty. Please select a bleeding.");
            RequestDispatcher rd3 = request.getRequestDispatcher("/historyFrm.jsp");
            rd3.include(request, response);
        } else if (teeth.trim().length() == 0) 
        {
            out.print("The teeth cannot be empty. Please select a teeth.");
            RequestDispatcher rd4 = request.getRequestDispatcher("/historyFrm.jsp");
            rd4.include(request, response);
        } else if (tonque.trim().length() == 0) 
        {
            out.print("The tonque cannot be empty. Please select a tonque.");
            RequestDispatcher rd4 = request.getRequestDispatcher("/historyFrm.jsp");
            rd4.include(request, response);
        } else if (biting.trim().length() == 0) 
        {
            out.print("The biting cannot be empty. Please select a biting.");
            RequestDispatcher rd4 = request.getRequestDispatcher("/historyFrm.jsp");
            rd4.include(request, response);
        } else if (floss.trim().length() == 0)
        {
            out.print("The floss cannot be empty. Please select a floss.");
            RequestDispatcher rd4 = request.getRequestDispatcher("/historyFrm.jsp");
            rd4.include(request, response);
        } else
        {
            History myHistory = new History(name, breath, bleeding, teeth, tonque, biting, floss);

            int h = HistoryDB.insert(myHistory);
            //SurveyDB.insert(mySurvey);
            request.setAttribute("myHistoryHolder", myHistory);
            RequestDispatcher rd = request.getRequestDispatcher("/confirm.jsp");
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(Submit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            Logger.getLogger(Submit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            Logger.getLogger(Submit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(Submit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            Logger.getLogger(Submit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            Logger.getLogger(Submit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
