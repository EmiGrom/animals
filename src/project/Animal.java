package project;

public interface Animal extends Glos,Lapy {
    String iloscLap(int a);

    @Override
    default void setIloscLap() {

    }

    @Override
    default void IloscLap() {

    }
}
///String dajGlos();
//Integer iloscLap(int a);
//}