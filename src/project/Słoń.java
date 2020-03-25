package project;

public class Słoń implements Animal, Glos, Lapy {
    int iloscLap;

    @Override
    public String dajGlos() {
        return "trutututut ";
    }

    //@Override
    //    public Integer iloscLap(int a) {
    //        return a = 4;
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
        this.iloscLap =iloscLap;
    }

    public int getIlośćŁap() {
        return iloscLap;
    }
}