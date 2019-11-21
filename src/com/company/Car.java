package com.company;

public class Car extends Vehicle{

    private String make;
    private String style;
    private String doors;
    private String  sunroof;


   public Car(){
        super();
   }



    public Car(boolean starting, boolean stopping, boolean accelarating, int year, String make, String style, String doors, String sunroof) {
        super(starting, stopping, accelarating, year);
        this.make = make;
        this.style = style;
        this.doors = doors;
        this.sunroof = sunroof;
    }

    public String getMake() {

       return make;
    }

    public void setMake(String make) {

       this.make = make;
    }

    public String getStyle() {

       return style;
    }

    public void setStyle(String style) {

       this.style = style;
    }

    public String getDoors() {

       return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getSunroof() {
        return sunroof;
    }

    public void setSunroof(String sunroof) {

       this.sunroof = sunroof;
    }

    @Override
    public String toString() {
        return "Is this car starting: " + super.isStarting() + "\nIs this car stopping: " + super.isStopping() + "\n what is the make of your car? " + this.make
                +"\n what is the style of your car?"  + this.style + "\n how many door you car has?"  + this.doors + " \n what year model is your car?" + this.getYear();
    }
}




