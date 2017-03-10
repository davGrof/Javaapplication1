/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Date;

/**
 *
 * @author דוד
 */
public class Married extends CommunitMember implements ObligationsRights{
    
    public Married(String id, KIND kind, String name, String address, Date date, double learn, double work, double salary, VOLUNTEER volunt) {
        super(id, kind, name, address, date, learn, work, salary, volunt);
        
    }
    private String idPartner;
    public void setIdPartner(String id){
        idPartner = id;
    }
    public String getIdPartner(){
        return idPartner;
    }
    private int numSon;
    public void setNumSon(int num){
        numSon = num;
    }
    public int getNumSon(){
        return numSon;
    }
    
    public double tax (){
             if (getWork() == 0)
            return 0;
    else
            return 500;}
    public double max_gmach (){
    return 700;
    }
    public double volunteer_hours()
    {
        return 30;
    }
}
