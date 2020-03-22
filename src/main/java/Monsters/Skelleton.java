package Monsters;

public class Skelleton extends Monsters{
    String name;

    public Skelleton(double prędkość, double poziomżycia, String name) {
        super(prędkość, poziomżycia);
        this.name = name;
    }



    public void atak(Monsters kogo){
        System.out.println("Szkielet strzela z łuku");
        double v = generatorPowerAttack.nextDouble() * 10;
        String vAsString = String.format("%.2f" , v);
        System.out.println(vAsString);
        double hpleft = kogo.getPoziomżycia() - v;
        kogo.setPoziomżycia(hpleft);
    }

    @Override
    public void getAllInformation(){
        String poziomŻycia1 = String.format("%.2f", poziomżycia);
        System.out.println("Prędkość potwora twojego szkieleta to: " + prędkość + " Poziom życia twojego szkieleta to: " + poziomŻycia1);
    }



}
