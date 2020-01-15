package com.company;

public class Lawmoverr {
    private static int voltage;

    protected String colouroflawnmover="for your choice";
    protected String producingcountry="choose your country";

    private int bevelwidth;
    private int enginepower;
    private String model="choose it";
    private int fuelvolume;

    private int priceoflawnmover;
    private int turnspersecond;
    public Lawmoverr(){}

    public Lawmoverr (int width,int power,String modell, int volume) {
        this.bevelwidth= width;
        this.enginepower= power;
        this.model= modell;
        this.fuelvolume= volume;
    }

    public Lawmoverr (int width,int power, String modell,int volume,int price, int turns,
                      int voltagge,String country,String colour)  {

        this( width, power,modell,volume);
        this.priceoflawnmover=price;
        this.turnspersecond=turns;
        voltage=voltagge;
        this.producingcountry=country;
        this.colouroflawnmover=colour;
    }

    void setPriceofLawnmover(int price){
        this.priceoflawnmover = price;}

    double getPriceofLawnmover() {
        return priceoflawnmover;
    }
    void  setTurnsPerSecond(int turns){
        this. turnspersecond = turns;}

    double getTurnsPerSecond() {
        return turnspersecond;
    }

    static void printStaticVoltage(){
            System.out.println("The Static Voltage is: "+voltage);
           
        }

        public void printVoltage(){
            System.out.println("The Voltage is: "+voltage);}
        
 @Override
   public String toString(){
     printVoltage();
    System.out.println("Grass bevel width is: "+bevelwidth);
    System.out.println("Engine power of  lawnmover is: "+enginepower);
    System.out.println("Model of  lawnmover is: "+model);
    System.out.println("Fuel Volume of  lawnmover is: "+fuelvolume);
    System.out.println("Price of lawnmover is: "+priceoflawnmover);
    System.out.println("Turns Per Second are: "+turnspersecond);
    System.out.println("Producing Country is: "+producingcountry);
    System.out.println("Colour of lawnmover is: "+ colouroflawnmover);
          return null;
           }

    public void resetValues (int width,int power, String modell,int volume,int price, int turns,
                             int voltagge,String country,String colour) {
        this.bevelwidth= width;
        this.enginepower= power;
        this.model= modell;
        this.fuelvolume= volume;
        this.priceoflawnmover=price;
        this.turnspersecond=turns;
        voltage=voltagge;
        this.producingcountry=country;
        this.colouroflawnmover=colour;
    }
}