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
enum KIND {man,women};
enum VOLUNTEER{physical,spiritual,music}

public class CommunitMember {
    CommunitMember(String id,KIND kind, String name,String address, Date date,double learn,double work, double salary , VOLUNTEER volunt){
       Id = id;
       Kind = kind;
       Name = name;
       Address = address;
       Learn = learn;
       Work=work;
       Salary = salary;
       Vt = volunt;
    }
    private String Id;
    public void setId(String id)
            {
    Id = id;
    }
    public String getId(){
    return Id;}
    
    private KIND Kind;
    public void setKind(KIND kind){
        Kind = kind;
    }
    public KIND getKind(){
        return Kind;
    }
    
    private String Name;
    public void setName(String name)
    {
        Name = name;
    }
    public String getName(){
        return Name;
    }
    
    private String Address;
    public void setAddress(String address)
    {
        Address = address;
    }
    public String getAddress(){
        return Address;
    }
    
    private Date Dt;
    public void setDate(Date date)
    {
       Dt = date;
    }
    public Date getDate(){
        return Dt;
    }
    
    private double Learn;
    public void setLearn(double learn)
    {
       Learn = learn;
    }
    public double getLearn(){
        return Learn;
    }
    
    private double Work;
     public void setWork(double work)
    {
       Work = work;
    }
    public double getWork(){
        return Work;
    }
    
    private double Salary;
     public void setSalary(double salary)
    {
       Salary = salary;
    }
    public double getSalary(){
        return Salary;
    }
    
    private VOLUNTEER Vt;
     public void setVt(VOLUNTEER vot)
    {
       Vt = vot;
    }
    public VOLUNTEER getVt(){
        return Vt;
    }
    
}
