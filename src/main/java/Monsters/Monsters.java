package Monsters;

import java.util.Random;

public class Monsters {

    double prędkość;
    double poziomżycia;
    Random generatorPowerAttack = new Random();

    public void setPrędkość(double prędkość) {
        this.prędkość = prędkość;
    }

    public void setPoziomżycia(double poziomżycia) {
        this.poziomżycia = poziomżycia;
    }

    public Monsters(){

    }

    public Monsters(double prędkość, double poziomżycia) {
        this.prędkość = prędkość;
        this.poziomżycia = poziomżycia;
    }

    public double getPrędkość() {
        return prędkość;
    }

    public double getPoziomżycia() {
        return poziomżycia;
    }

    public void atak(){
        System.out.println("To jest metoda ataku z klasy potwór");
        double v = generatorPowerAttack.nextDouble() * 10;
        System.out.println(v);

    }

    public void getAllInformation(){
        String poziomŻycia1 = String.format("%.2f", poziomżycia);
        System.out.println("Prędkość potwora to: " + prędkość + " Poziom życia to: " +  poziomŻycia1);
    }

}
