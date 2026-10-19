public class Kosz {
    String rodzaj;
    double poziomCzystosci;
    double poziomZapelnienia;
    public Kosz(String rodzaj){
        this.rodzaj = rodzaj;
        this.poziomCzystosci = 100;
        this.poziomZapelnienia = 0;
    }

    public void wrzucSmiec(Smiec smiec){
        this.poziomZapelnienia += 10.0; // jak do kosza jest wrzucany smiec to zapelenienie wzrasta o 10
        if (smiec.czyBrudny){
            this.poziomCzystosci -= 15.0;  // jak smiec jest brudny to poziom czystosci spada o 15
        }
        if(!smiec.docelowyKosz.equals(this.rodzaj)){
            this.poziomCzystosci-=25.0; // zle posortowany smiec powoduje spadek czystosci o 25
        }
    }
}
