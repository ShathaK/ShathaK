
package pkg251_project;

import java.util.*;

/**
 *
 * @author Rahaf(1806039), Maha(1805384), Shatha(1806336)
 */
public class SuppliesStores extends Place {

    /**
     * empty constructor
     */
    public SuppliesStores() {
        
    }
// method to get Supplies Stores
    @Override
    public ArrayList<Place> getPlace(){
        
        ArrayList<Place> Places = new ArrayList<>();
        Places.add(new Place("Jeddah"," Alraghamah" ,"cats Alraghamah", "open","05566XXXX","24/7"));
        Places.add(new Place("Mecca","Alnasem"," cats Alnasem", "open","05493XXXX","24/7"));
        Places.add(new Place("Riyadh"," Alrabia" ,"cats Alrabia", "open","05588XXXX","24/7"));
        Places.add(new Place("Dammam","Alslama","catsAlslama", "open" ,"05797XXXX","24/7"));
        Places.add(new Place("Medina", "alrawdah" ,"cats alrawdah", "close","05593XXXX","8 AM"));
        Places.add(new Place("Taif", "Alnoor","catsAlnoor","close" ,"05057XXXX","8 AM"));

        return Places;
    }
}
