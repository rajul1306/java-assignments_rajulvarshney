package com.company;
import java.util.Scanner;
class rooom{
    boolean ac=true, fan=true, home=true, light=true;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("your AC is ON of OFF");
        String a=sc.next();
        System.out.println("Your Home theater is ON or OFF");
        String b=sc.next();
        System.out.println("Your light is On or OFF");
        String c=sc.next();
        System.out.println("Your fan is ON or OFF");
        String d=sc.next();
        if(a.equalsIgnoreCase("off")){
            ac=false;
        }
        else if(b.equalsIgnoreCase("off")){
            home=false;
        }
        else if(c.equalsIgnoreCase("off")){
            light=false;
        }
        else if(d.equalsIgnoreCase("off")){
            fan=false;
        }

    }
    public void print(){
        if ((ac && home && light && fan)||(ac && home && fan)){
            System.out.println("Overload");
            System.out.println("Total power consuming capacity is 2kw");
        }
        else {
            System.out.println("Enjoy your life ");
        }
    }
}
public class Room {
    public static void main(String[] args) {
        rooom r=new rooom();
        r.input();
        r.print();

    }
}
