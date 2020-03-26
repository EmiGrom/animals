package project;

public class Losos implements Animal, Glos, Lapy {
    int iloscLap;

    @Override
    public String dajGlos() {
        return "aaammm aammm" ;
    }
    //@Override
    //    public Integer iloscLap(int a) {
    //        return  a=0;
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
        return "0";
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
