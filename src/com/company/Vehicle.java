package com.company;

public class Vehicle {
    private double gasmilage;
    private String color;
    private String size;
    private double horsepower;
    private int year;
    private boolean starting;
    private boolean stopping;
    private boolean accelarating;





    public Vehicle(double gasmilage, String color, String size, double horsepower, int year) {
        this.gasmilage = gasmilage;
        this.color = color;
        this.size = size;
        this.horsepower = horsepower;
        this.year = year;
    }

    //default constuctor for declaring default values
    public Vehicle (){
        this.starting = false;
        this.stopping = false;
        this.accelarating=false;

    }

    public Vehicle (boolean starting,boolean stopping,boolean accelarating,int year){
        this.starting = starting;
        this.stopping = stopping;
        this.accelarating=accelarating;
        this.year=year;
    }

    public double getGasmilage() {

        return gasmilage;
    }

    public void setGasmilage(double gasmilage) {

        this.gasmilage = gasmilage;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String getSize() {

        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public double getHorsepower() {

        return horsepower;
    }

    public void setHorsepower(double horsepower) {

        this.horsepower = horsepower;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }


    // creating this method to include these variables in child class
    public Vehicle(boolean starting, boolean stopping, boolean accelarating, String size, String color) {
        this.starting = starting;
        this.stopping = stopping;
        this.accelarating = accelarating;

    }
        public boolean isStarting() {

        return starting;
        }

        public void setStarting(boolean starting) {

        this.starting = starting;
        }

        public boolean isStopping() {

        return stopping;
        }

        public void setStopping(boolean stopping) {

        this.stopping = stopping;
        }

        public boolean isAccelarating() {

        return accelarating;
        }

        public void setAccelarating(boolean accelarating) {
            this.accelarating = accelarating;

    }
}
