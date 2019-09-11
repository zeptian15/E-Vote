/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evoteorbit;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author AlvaroDwi
 */
public class Voter {
    int idCalon = 0;
    long startTime;
    long endTime;
    Connection koneksi;
    
    public Voter(){
        koneksi = KoneksiDB.connect();
    }
    
    public void setPilihan(int id){
        this.idCalon = id;
    }
    
    public void startVote(){
        startTime = System.currentTimeMillis();
    }
    public void endVote(){
        endTime = System.currentTimeMillis();
        try{
            Statement stmt = koneksi.createStatement();
            String sql = "INSERT INTO vote (id_calon,waktu) values('"+idCalon+"','"+voteTime()+" detik')";
            System.out.println(sql);
            int berhasil = stmt.executeUpdate(sql);
            if(berhasil == 1){
                System.out.println("Data Berhasil Dimasukkan");
            }else{
                System.out.println("Data Gagal Dimasukkan");
            }
        }catch(SQLException ez){
            ez.printStackTrace();
        }
    }
    
    public double voteTime(){
        long deltaTime = this.endTime - this.startTime;
        double voteTime = deltaTime/1000.0;
        
        return voteTime;
    }
    
    public String printPilihan(){
        String nama_calon="";
        if(idCalon!=0){
            System.out.println("Waktu Vote : "+voteTime()+" detik");
            switch(idCalon){
                case 1 : 
                    nama_calon = "Helmy";break;
                case 2 : 
                    nama_calon = "Daffa";break;
                case 3 : 
                    nama_calon = "Ihsan";break;
            }
        }
        return nama_calon;
    }
}
