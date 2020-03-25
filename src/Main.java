import project.Kot;
import project.Pies;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kot kot1 = new Kot();
        System.out.println(kot1.dajGłos(5));

        Pies pies1 = new Pies();
        System.out.println(pies1.dajGłos(5));

        List<Kot> kotList = new ArrayList<>();
        kotList.add(new Kot());
        kotList.add(new Kot());
        kotList.add(new Kot());

        System.out.println(kotList);

        List<Pies> piesList = new ArrayList<>();
        piesList.add(new Pies());
        piesList.add(new Pies());
        piesList.add(new Pies());

        System.out.println(piesList);
    }
}
