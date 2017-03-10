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
public class Bachelor extends CommunitMember implements ObligationsRights{
    private int YearsStudy;
    public void setYearStudy(int stud)
    {
        YearsStudy = stud;
    }
    public int getYearsStudy(){
        return YearsStudy;
    }
    private boolean Alone;
     public void setAlone(boolean alone)
    {
        Alone = alone;
    }
    public boolean getAlone(){
        return Alone;
    }
    public Bachelor (String id,KIND kind, String name,String address, Date date,double learn,double work, double salary , VOLUNTEER volunt,int year, boolean alone)
    {
        super(id,kind,name,address,date,learn,work,salary,volunt);
        YearsStudy = year;
        Alone = alone;
    }
    public double tax (){
        if (getWork() == 0)
            return 0;
    else
            return 100;}
    public double max_gmach (){return 0;}
    public double volunteer_hours(){return 20;}
}
