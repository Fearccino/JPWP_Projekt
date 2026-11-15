public class Smiec {
    String nazwa;
    String docelowyKosz;
    boolean czyBrudny;
    boolean czyZlozony;
    Smiec czesc1;
    Smiec czesc2;

    public Smiec(String nazwa, Smiec czesc1, Smiec czesc2){
        this.nazwa=nazwa;
        this.docelowyKosz="Brak";
        this.czyBrudny = false;
        this.czyZlozony=true;
        this.czesc1=czesc1;
        this.czesc2=czesc2;
    }

    public Smiec(String nazwa, String docelowyKosz, boolean czyBrudny, boolean czyZlozony){
        this.nazwa = nazwa;
        this.docelowyKosz = docelowyKosz;
        this.czyBrudny = czyBrudny;
        this.czyZlozony = czyZlozony;
        this.czesc1=null;
        this.czesc2=null;
    }
}
