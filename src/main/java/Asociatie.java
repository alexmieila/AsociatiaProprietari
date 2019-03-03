import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;




public class Asociatie implements Serializable {


    List <Apartament> apartamentList;

    Asociatie(List<Apartament> lista) {

        this.apartamentList = lista;
    }

    @Override
    public String toString() {
        return apartamentList.toString();
    }



    public List <Locatar> getAllLocatarUnsorted() {

        List<Locatar> tmpList = new ArrayList<>();

        for(int i= 0; i<apartamentList.size(); ++i)
        {
            List<Locatar> obj = apartamentList.get(i).getLocatarList();
            tmpList.addAll(obj);

        }
        return tmpList;

    }


    public List<Locatar> SortbyName() {

        ArrayList<Locatar> tempLocatari =  new ArrayList<>();

        for(Apartament apartament: apartamentList) {

            tempLocatari.addAll(apartament.getLocatarList());

        }

        Collections.sort(tempLocatari, new Locatar.ComparatorByName());
        return tempLocatari;


        }


        public List<Locatar> SortbyApartament() {

        ArrayList<Locatar> tempLoc = new ArrayList<>();

        for(Apartament apartament : apartamentList) {

            tempLoc.addAll(apartament.getLocatarList());

        }

        Collections.sort(tempLoc, new Locatar.ComparatorByApartament());
        return  tempLoc;
        }


    public void save(){

        try{
            FileOutputStream file = new FileOutputStream("asoc.db");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(this);

            out.close();
            file.close();
        }

        catch (IOException ex){

            System.out.println("IOException is caught");
        }
    }



    public static Asociatie load(){

        Asociatie obj = null;
        try{
            FileInputStream file = new FileInputStream("asoc.db");
            ObjectInputStream in = new ObjectInputStream(file);

            obj = (Asociatie)in.readObject();

            in.close();
            file.close();
        }

        catch (IOException ex){

            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }



    }





