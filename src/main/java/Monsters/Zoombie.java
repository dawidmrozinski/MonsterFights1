package Monsters;

public class Zoombie extends Monsters {

    public Zoombie(double prędkość, double poziomżycia){
        super(prędkość, poziomżycia);

    }

    public void atak(Monsters kogo){
        System.out.println("Zombie gryzie");
        double v = generatorPowerAttack.nextDouble() * 10;
        String vAsString = String.format("%.2f" , v);
        System.out.println(vAsString);
        double hpleft = kogo.getPoziomżycia() - v;
        kogo.setPoziomżycia(hpleft);

    }
    @Override
    public void getAllInformation(){
        String poziomŻycia1 = String.format("%.2f", poziomżycia);
        System.out.println("Prędkość twojego Zoombie to: " + prędkość + " Poziom życia twojego Zoombie to: " + poziomŻycia1);
    }


}
