import java.io.Serializable;
import java.util.Comparator;
import java.util.List;


    public class Locatar implements Serializable {



    public static class ComparatorByName implements Comparator<Locatar> {

       @Override
       public int compare(Locatar o1, Locatar o2)
       {

           return o1.nume.compareTo(o2.nume);
       }



    }



        public static class ComparatorByApartament implements Comparator< Locatar> {


        @Override
        public int compare(Locatar o1, Locatar o2) {
            return o1.ap.compareTo(o2.ap);
        }
    }



    private String nume;
    private Apartament ap;




    public Locatar(String nume, Apartament ap) {

        this.nume =  nume;
        this.ap = ap;



    }

    @Override
    public String toString() {

        return "Nume Locatar: " + nume + ", " + "Numar Apartament: "+ ap.getNumarApartament();
    }







    }