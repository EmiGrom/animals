import project.Kot;
import project.Pies;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Kot kot1 = new Kot();

        List<Kot> kotList = new ArrayList<>();
        kotList.add(new Kot());
        kotList.add(new Kot());
        kotList.add(new Kot());

        System.out.println((kot1.dajGłos(6)));

        System.out.println(kotList);

        Pies pies1 = new Pies();
        List <Pies> piesList = new ArrayList<>();
        piesList.add(new Pies());
        piesList.add(new Pies());
        piesList.add(new Pies());

        System.out.println((pies1.dajGłos(6)));

        System.out.println(kotList);
        System.out.println(piesList);

    }
}