package project;

public class Kot implements Animal, Glos, Lapy {
    int iloscLap;

    @Override
    public String dajGlos() {
        return "miaaau ";
    }

    //@Override
    //    public Integer iloscLap(int a) {
    //        return a = 5;
    //    }
    //}

    public String iloscLap(int a) {
        StringBuilder iloscLap = new StringBuilder();
        iloscLap.append(a);
        return iloscLap.toString();
    }

    @Override
    public void setIloscLap() {

    }

    @Override
    public String iloscLap() {
        return "4";
    }

    @Override
    public void IloscLap() {
        this.iloscLap = iloscLap;
    }

    public void setIloscLap(int iloscLap) {
        this.iloscLap = iloscLap;
    }

    public int getIloscLap() {
        return iloscLap;
    }
}