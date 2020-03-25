import project.Kot;
import project.Pies;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Kot kot1 = new Kot();
        Kot kot2 = new Kot();
        Kot kot3 = new Kot();

        List<Kot> kotList = new ArrayList<>();
        kotList.add(kot1);
        kotList.add(kot2);
        kotList.add(kot3);

        System.out.println((kot1.dajGłos(6)));

        System.out.println(kotList);

        Pies pies1 = new Pies();
        Pies pies2 = new Pies();
        Pies pies3 = new Pies();

        List <Pies> piesList = new ArrayList<>();
        piesList.add(pies1);
        piesList.add(pies2);
        piesList.add(pies3);


        System.out.println(kotList);
        System.out.println(piesList);

    }
}