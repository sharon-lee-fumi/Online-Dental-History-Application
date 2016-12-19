package data;

import business.History;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Xiaowen Li
 */
public class HistoryDB 
{
    public static int insert(History h) throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        PreparedStatement ps = null;
        Connection myCon = null;
        ConnectionControl conManager = null;
        try
        {
            // we will try to insert the data 
            String pstm = "INSERT INTO history(name,breath,bleeding,teeth,tonque,biting,floss)VALUES(?,?,?,?,?,?,?)";
            // establish the connection
            conManager = new ConnectionControl();
            myCon = conManager.connect();
            
            // create the preparedstatement object 
            ps = myCon.prepareStatement(pstm);

            // set the parameters of the sql statement object
            ps.setString(1, h.getName());
            ps.setString(2, h.getBreath());
            ps.setString(3, h.getBleeding());
            ps.setString(4, h.getTeeth());
            ps.setString(5, h.getTonque());
            ps.setString(6, h.getBiting());
            ps.setString(7, h.getFloss());

            // execute the statement 
            return ps.executeUpdate(); // return 1 if the insertion succeed

        } catch (SQLException e)
        {
            return 0;
        }
    }

}
