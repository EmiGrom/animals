package project;

public class Kot implements Głos {

    @Override
    public String dajGłos(int a){
        StringBuilder dajGłos = new StringBuilder();
        dajGłos.append("Kot: ");
        for (int i = 0; i<a; i++) {
            dajGłos.append(" Miau");
        }
        return dajGłos.toString();
    }
}