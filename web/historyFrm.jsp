<%-- 
    Document   : historyFrm
    Created on : Dec 10, 2016, 11:35:44 AM
    Author     : Xiaowen Li
--%>
<%@include file="/header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Select yes or no to indicate if you have had any of the following</h3>
        <form action="Submit" method="post">
            <table>
                <tr>
                    <td>Name : </td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Bad breath</td>
                    <td><input type="radio" name="breath" value="Yes"> Yes
                        <input type="radio" name="breath" value="No" checked> No
                    </td>
                </tr>
                <tr>
                    <td>Bleeding gums</td>
                    <td><input type="radio" name="bleeding" value="Yes"> Yes
                        <input type="radio" name="bleeding" value="No" checked> No
                    </td>
                </tr>
                <tr>
                    <td>Loose teeth or broken fillings</td>
                    <td><input type="radio" name="teeth" value="Yes"> Yes
                        <input type="radio" name="teeth" value="No" checked> No
                    </td>
                </tr>
                <tr>
                    <td>Burning sensation on tonque</td>
                    <td><input type="radio" name="tonque" value="Yes"> Yes
                        <input type="radio" name="tonque" value="No" checked> No
                </tr>
                <tr>
                    <td>Sensitivity when biting</td>
                    <td><input type="radio" name="biting" value="Yes"> Yes
                        <input type="radio" name="biting" value="No" checked> No
                    </td>
                </tr>
                <tr>
                    <td>How often do you floss?</td>
                    <td><select name="floss">
                        <option>Once a day</option>
                        <option>Twice a day</option>
                        <option>Twice a week</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
