import java.util.*;
import java.lang.*;
import java.io.*;

class Patient{
    String name;
    double height,weight;
    Patient(double w,double h)
    {
        weight=w;
        height=h;
    }
    double BMI()
    {
       
       return ((weight/(height*height))*703);
    }
}
    class Patients
{
  public static void main (String[] args)
 {
  Patient p=new Patient(80,165);
  System.out.println("BMI of a Patient:"+p.BMI());
  
 }
}
