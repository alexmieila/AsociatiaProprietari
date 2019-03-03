import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;





public class Runner  {

    private static final Logger LOGGER = Logger.getLogger(Runner.class.getName());



    public static void main(String[] args) {
/*
        Apartament apartament1 =  new Apartament(3, 15);
        Apartament apartament2 = new Apartament(4, 22);
        Apartament apartament3 = new Apartament(2, 41);
        Apartament apartament4 = new Apartament(3, 57);




        Locatar locatar1 = new Locatar("Mihai", apartament1);
        apartament1.addLoc(locatar1);

        Locatar locatar2 =  new Locatar("Ciprian", apartament2);
        Locatar locatar3 = new Locatar("Madalin", apartament2);
        apartament2.addLoc(locatar2);
        apartament2.addLoc(locatar3);


        Locatar locatar4 = new Locatar("Alex",  apartament3);
        apartament3.addLoc(locatar4);

        Locatar locatar5 =  new Locatar("Catalin", apartament4);
        apartament4.addLoc(locatar5);


        //adaugare apartamente in lista de apartamente
        //x este numele listei de ap




        List<Apartament> x = new ArrayList<>();

        x.add(apartament1);
        x.add(apartament2);
        x.add(apartament3);
        x.add(apartament4);



        Asociatie asociatie = new Asociatie(x);
        asociatie.getAllLocatarUnsorted();
        //System.out.println(asociatie.getAllLocatarUnsorted());



LOGGER.info(asociatie.SortbyName()+"");
LOGGER.info(asociatie.SortbyApartament() + " ");
asociatie.save();

*/

   Asociatie aaa = Asociatie.load();
        System.out.println(aaa);


    }


}