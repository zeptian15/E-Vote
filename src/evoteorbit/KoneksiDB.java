/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evoteorbit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author AlvaroDwi
 */
public class KoneksiDB {
    public static Connection connect(){
        Connection con = null;
        try{
            String url = "jdbc:sqlite:"+System.getProperty("user.dir")+"\\OrbitVote1920.db";
//            System.out.println(url);
            con = DriverManager.getConnection(url);
           // System.out.println("Sukses");
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Kesalahan Pada Database\n"+System.getProperty("user.dir")+"\\OrbitVote1920.db");
        }
        return con;
    }
}
