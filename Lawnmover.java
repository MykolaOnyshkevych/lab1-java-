package com.company;

public class Lawmoverr {
    private static int voltageInVolts;

    protected String colourOfLawnmover="for your choice";
    protected String producingCountry="choose your country";

    private int bevelWidthInSantymetres;
    private int enginePowerInVats;
    private String model="choose it";
    private int fuelVolumeInLiters;

    private int priceOfLawnmoverInHryvnas;
    private int turnsPerSecond;
    public Lawmoverr(){}

    public Lawmoverr (int width,int power,String modell, int volume) {
        this.bevelWidthInSantymetres= width;
        this.enginePowerInVats= power;
        this.model= modell;
        this.fuelVolumeInLiters= volume;
    }

    public Lawmoverr (int width,int power, String modell,int volume,int price, int turns,
                      int voltage,String country,String colour)  {

        this( width, power,modell,volume);
        this.priceOfLawnmoverInHryvnas=price;
        this.turnsPerSecond=turns;
       voltageInVolts=voltage;
        this.producingCountry=country;
        this.colourOfLawnmover=colour;
    }

    void setPriceofLawnmover(int price){
        this.priceOfLawnmoverInHryvnas = price;}

    double getPriceofLawnmover() {
        return priceOfLawnmoverInHryvnas;
    }
    void  setTurnsPerSecond(int turns){
        this.turnsPerSecond = turns;}

    double getTurnsPerSecond() {
        return turnsPerSecond;
    }

    static void printStaticVoltage(){
            System.out.println("The Static Voltage is: "+voltageInVolts);
           
        }

        public void printVoltage(){
            System.out.println("The Voltage is: "+voltageInVolts);
        }
        
 @Override
   public String toString(){
     printVoltage();
    System.out.println("Grass bevel width is: "+bevelWidthInSantymetres);
    System.out.println("Engine power of  lawnmover is: "+enginePowerInVats);
    System.out.println("Model of  lawnmover is: "+model);
    System.out.println("Fuel Volume of  lawnmover is: "+fuelVolumeInLiters);
    System.out.println("Price of lawnmover is: "+priceOfLawnmoverInHryvnas);
    System.out.println("Turns Per Second are: "+turnsPerSecond);
    System.out.println("Producing Country is: "+producingCountry);
    System.out.println("Colour of lawnmover is: "+ colourOfLawnmover);
          return null;
           }

    public void resetValues (int width,int power, String modell,int volume,int price, int turns,
                             int voltagge,String country,String colour) {
        this.bevelWidthInSantymetres= width;
        this.enginePowerInVats= power;
        this.model= modell;
        this.fuelVolumeInLiters= volume;
        this.priceOfLawnmoverInHryvnas=price;
        this.turnsPerSecond=turns;
        voltageInVolts=voltagge;
        this.producingCountry=country;
        this.colourOfLawnmover=colour;
    }
}
