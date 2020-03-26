package project;

import project.Animal;
import project.Kot;
import project.Losos;
import project.Pies;
import project.Lew;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> AnimalList = new ArrayList<>();
        AnimalList.add(new Kot());
        AnimalList.add(new Pies());
        AnimalList.add(new Słoń());
        AnimalList.add(new Losos());
        AnimalList.add(new Lew());
        for (Animal one : AnimalList) {
            System.out.println(" Animal: " + one.getClass().getSimpleName() + " ilość nóg: " + one.iloscLap() + " i wydaje z siebie dzwięk: " + one.dajGlos());
            // System.out.println(one.iloscLap(0));

            //tu koniec pierwotnej wersji
        }

        //próby z dalszą częścią zadania
        Kot kot1 = new Kot();
        kot1.setIloscLap(7);

        Pies pies1 = new Pies();
        pies1.setIloscLap(8);

        Losos losos1 = new Losos();
        losos1.setIloscLap(8);

        Słoń słoń1 = new Słoń();
        słoń1.setIloscLap(8);

        Lew lew1 = new Lew();
        lew1.setIloscLap(7);

        List<Animal> AnimalList2 = new ArrayList<>();
        AnimalList2.add(kot1);
        AnimalList2.add(pies1);
        AnimalList2.add(losos1);
        AnimalList2.add(słoń1);
        AnimalList2.add(lew1);


        for (Animal two : AnimalList2) {
            System.out.println("Animal 2: " + two.getClass().getSimpleName() + " ma " + two.iloscLap(4) + " łap " + " i wydaje taki dźwięk: " + two.dajGlos());
        }

    }
}

//Praca w grupach. Udostępniacie sobie repozytorium
// nawzajem i dodajecie zwierzęta Lew, Łosoś, Słoń oraz
// utworzyć