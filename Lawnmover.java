package com.company;

public class Lawnmover {
    private static int voltageInVolts;

    protected String colourOfLawnmover = "for your choice";
    protected String producingCountry = "choose your country";

    private int bevelWidthInSantymetres;
    private int enginePowerInVats;
    private String model = "choose it";
    private int fuelVolumeInLiters;

    private int priceOfLawnmoverInHryvnas;
    private int turnsPerSecond;

    public Lawnmover() {
    }

    public Lawnmover(int width, int power, String modell, int volume) {
        this(width,power,modell,volume,0,0,0,null,null);

    }

    public Lawnmover(int width, int power, String modell, int volume, int price, int turns,
                     int voltage, String country, String colour) {
        resetValues(width, power, modell, volume, price, turns, voltage, country, colour);
    }

    public String getColourOfLawnmover() {
        return colourOfLawnmover;
    }

    public void setColourOfLawnmover(String colourOfLawnmover) {
        this.colourOfLawnmover = colourOfLawnmover;
    }

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public int getBevelWidthInSantymetres() {
        return bevelWidthInSantymetres;
    }

    public void setBevelWidthInSantymetres(int bevelWidthInSantymetres) {
        this.bevelWidthInSantymetres = bevelWidthInSantymetres;
    }

    public int getEnginePowerInVats() {
        return enginePowerInVats;
    }

    public void setEnginePowerInVats(int enginePowerInVats) {
        this.enginePowerInVats = enginePowerInVats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuelVolumeInLiters() {
        return fuelVolumeInLiters;
    }

    public void setFuelVolumeInLiters(int fuelVolumeInLiters) {
        this.fuelVolumeInLiters = fuelVolumeInLiters;
    }

    public int getPriceOfLawnmoverInHryvnas() {
        return priceOfLawnmoverInHryvnas;
    }

    public void setPriceOfLawnmoverInHryvnas(int priceOfLawnmoverInHryvnas) {
        this.priceOfLawnmoverInHryvnas = priceOfLawnmoverInHryvnas;
    }

    public int getTurnsPerSecond() {
        return turnsPerSecond;
    }

    public void setTurnsPerSecond(int turnsPerSecond) {
        this.turnsPerSecond = turnsPerSecond;
    }

    static void printStaticVoltage() {
        System.out.println("The Static Voltage is: " + voltageInVolts);

    }

    public void printVoltage() {
        System.out.println("The Voltage is: " + voltageInVolts);
    }

    @Override
    public String toString() {
        printVoltage();
        System.out.println("Grass bevel width is: " + bevelWidthInSantymetres);
        System.out.println("Engine power of  lawnmover is: " + enginePowerInVats);
        System.out.println("Model of  lawnmover is: " + model);
        System.out.println("Fuel Volume of  lawnmover is: " + fuelVolumeInLiters);
        System.out.println("Price of lawnmover is: " + priceOfLawnmoverInHryvnas);
        System.out.println("Turns Per Second are: " + turnsPerSecond);
        System.out.println("Producing Country is: " + producingCountry);
        System.out.println("Colour of lawnmover is: " + colourOfLawnmover);
        return null;
    }

    public void resetValues(int width, int power, String modell, int volume, int price, int turns,
                            int voltagge, String country, String colour) {
        this.bevelWidthInSantymetres = width;
        this.enginePowerInVats = power;
        this.model = modell;
        this.fuelVolumeInLiters = volume;
        this.priceOfLawnmoverInHryvnas = price;
        this.turnsPerSecond = turns;
        voltageInVolts = voltagge;
        this.producingCountry = country;
        this.colourOfLawnmover = colour;
    }
}
