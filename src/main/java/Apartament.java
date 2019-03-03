import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Apartament implements Serializable {

    int numarCamere ;

    int numarApartament ;

    List<Locatar> locatarList;




    public Apartament(int numarCamere, int numarApartament) {


      this.numarCamere = numarCamere;
      this.numarApartament = numarApartament;
      locatarList =  new ArrayList<>();

    }


    public String toString() {

        return  "numar camere: " +  numarCamere+", " + "numar apartament: "  + " " +  numarApartament + ", " + "locatari: " + locatarList;

    }

    public  void addLoc (Locatar loc)  {
    locatarList.add(loc);


    }

    public int getNumarApartament() {
        return numarApartament;
    }


    public List<Locatar> getLocatarList() {
        return locatarList;
    }




    public int compareTo(Apartament o) {
        return this.numarApartament - o.numarApartament;
    }
}
