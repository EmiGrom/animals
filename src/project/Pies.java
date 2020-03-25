package project;

public class Pies implements Głos {

    @Override
    public String dajGłos(int a){
        StringBuilder dajGłos = new StringBuilder();
        dajGłos.append("Pies: ");
        for (int i = 0; i<a; i++) {
            dajGłos.append(" Hau");
        }
        return dajGłos.toString();
    }
}