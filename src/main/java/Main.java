import Monsters.Monsters;
import Monsters.Skelleton;
import Monsters.Zoombie;
public class Main {

    public static void main(String[] args) {
        Monsters p = new Monsters(11, 15);
        Skelleton s = new Skelleton(11, 12.5, "Stefan");
        Zoombie z = new Zoombie(8, 15);

     /*   System.out.println(z.getPoziomżycia());
        System.out.println(p.getPrędkość());
        System.out.println(s.getPrędkość());
        System.out.println(s.getPoziomżycia());
        System.out.println(z.getPrędkość());
        System.out.println(s.getName());

      */

        int numberOfRounds = 1;
        for (int fight = 1; z.getPoziomżycia() > 0 && s.getPoziomżycia() >0; fight++){
            if( z.getPoziomżycia() > 0 && s.getPoziomżycia() > 0) {
                System.out.println("Runda: " + fight);
                s.atak(z);
                z.atak(s);
                s.getAllInformation();
                z.getAllInformation();
                numberOfRounds = fight;
            }
        }

        if (s.getPoziomżycia() > z.getPoziomżycia()) {
            System.out.println("Szkielet wygrał walkę po: " + numberOfRounds + " rundach!");
        }else if (z.getPoziomżycia() > s.getPoziomżycia()){
            System.out.println("Zoombie wygrał walkę po: " + numberOfRounds + " rundach!");
        }else
            System.out.println("Był remis po: " + numberOfRounds + " rundach!");

    }

}
