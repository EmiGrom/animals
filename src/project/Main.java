package projekt;

import project.Animal;
import project.Kot;
import project.Losos;
import project.Pies;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> AnimalList = new ArrayList<>();
        AnimalList.add(new Kot());
        AnimalList.add(new Pies());
        AnimalList.add(new Losos());
        for (Animal one:AnimalList){
            System.out.println(one.dajGlos());
            System.out.println(one.iloscLap(0));
        }


    }


}
//Praca w grupach. Udostępniacie sobie repozytorium
// nawzajem i dodajecie zwierzęta Lew, Łosoś, Słoń oraz
// utworzyć