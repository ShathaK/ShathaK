
package pkg251_project;

import java.util.ArrayList;

/**
 *
 * @author Rahaf(1806039), Maha(1805384), Shatha(1806336)
 */
public class VeterinaryClinics extends Place {

    /**
     * empty constructor
     */
    public VeterinaryClinics() {
    }
    
    // method to get Veterinary Clinics
    @Override
    public ArrayList<Place> getPlace(){
        
        ArrayList<Place> Places = new ArrayList<>();
        Places.add(new Place("Jeddah","Alraghamah","clinics Alraghamah","open","05566XXXX","24/7"));
        Places.add(new Place("Mecca"," Alnasem","clinics Alnasem", "open","05493XXXX","24/7"));
        Places.add(new Place("Riyadh","Alrabia"," Alrabia","open","05588XXXX","24/7"));
        Places.add(new Place("Dammam","Alslama","clinics Alslama", "open","05797XXXX","24/7"));
        Places.add(new Place("Medina","alrawdah","clinics alrawdah", "close","05593XXXX","8 AM"));
        Places.add(new Place("Taif"," Alnoor","clinics Alnoor", "close " ,"05057XXXX","8 AM"));

        return Places;
    }
}
