import java.util.ArrayList;

public class ZarzadcaGry {
    Kosz[] kosze;
    ArrayList<Smiec> tasmociag;

    public ZarzadcaGry (){
        tasmociag = new ArrayList<>();

        kosze = new Kosz[5];
        kosze[0] = new Kosz("Plastik");
        kosze[1]= new Kosz("Papier");
        kosze[2]=new Kosz("Szkło");
        kosze[3]=new Kosz("Bio");
        kosze[4]=new Kosz("Zmieszane");


        listaSmieci();
    }

    public void listaSmieci(){

        Smiec sloik = new Smiec("Szklany sloik", "Szkło", false, false);
        Smiec nakretka = new Smiec("Metalowa zakretka", "Plastik", false, false);
        tasmociag.add(new Smiec("Sloik z zakretka", sloik, nakretka));
        tasmociag.add(new Smiec("Karton po mleku","Plastik",true,false));
        tasmociag.add(new Smiec("Zatluszczony papier", "Zmieszane",true,false));
        tasmociag.add(new Smiec("Paragon","Zmieszane",false,false));
        tasmociag.add(new Smiec("Talerz ceramiczny", "Zmieszane", false, false));
        tasmociag.add(new Smiec("Karton po soku", "Plastik", true, false));
        tasmociag.add(new Smiec("Puszka po konserwie", "Plastik", true, false));
        tasmociag.add(new Smiec("Zatluszczony karton po pizzie", "Zmieszane", true, false));
        tasmociag.add(new Smiec("Lustro", "Zmieszane", false, false));
        tasmociag.add(new Smiec("Zuzyty recznik papierowy", "Zmieszane", true, false));
        tasmociag.add(new Smiec("Obierki po ziemniakach", "Bio", true, false));
        tasmociag.add(new Smiec("Folia babelkowa", "Plastik", false, false));
        tasmociag.add(new Smiec("Szklana butelka po soku", "Szkło", false, false));
        tasmociag.add(new Smiec("Opakowanie po jajkach", "Papier", false, false));
        tasmociag.add(new Smiec("Kapsulki po kawie","Zmieszane",true,false));
    }

    public void sortowanieSmieci(int numerKosza){
        Smiec smiec = tasmociag.get(0);
        kosze[numerKosza].wrzucSmiec(smiec);
        tasmociag.remove(0);
        if (tasmociag.isEmpty()){
            return; //koniec jezeli nie ma nic na tasmie
        }
    }

    public void rozdzielAktualnySmiec(){
        if(tasmociag.isEmpty()) return;
        Smiec aktualny = tasmociag.get(0);
        if (aktualny.czyZlozony && aktualny.czesc1 != null && aktualny.czesc2 !=null){
            tasmociag.remove(0);
            tasmociag.add(0,aktualny.czesc2);
            tasmociag.add(0,aktualny.czesc1);
        }
    }
}
