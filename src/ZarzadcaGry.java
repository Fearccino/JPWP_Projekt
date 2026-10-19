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

        tasmociag.add(new Smiec("Karton po mleku","Plastik",true,false));
        tasmociag.add(new Smiec("Zatluszczony papier", "Zmieszane",true,false));
        tasmociag.add(new Smiec("Paragon","Zmieszane",false,false));
    }
}
