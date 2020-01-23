package com.company;

public class LawnmoverShop {

    public static void main(String[] args) {
    Lawmoverr Siemenc = new Lawmoverr();
    Lawmoverr Husqvarna= new Lawmoverr(250,6000,"xs1500",1500,2000,30,220,"France","green");
    Lawmoverr Sip=new Lawmoverr(45,1200,"newlight",2000);
    Siemenc.toString();
        System.out.println("                         ");
        Husqvarna.toString();
        System.out.println("                         ");
        Sip.toString();
        System.out.println("                         ");
    
        Lawmoverr.printStaticVoltage();
        Husqvarna.printVoltage();
        System.out.println("                         ");
        
        Lawmoverr[] someLawnmowers = new Lawmoverr[4];
for(int count=0;count<4;count++) {
  someLawnmowers[count]= new Lawmoverr();
}

for (Lawmoverr equal: someLawnmowers) {
    equal.toString();
    System.out.println("                               ");
                          }
          }    
}
