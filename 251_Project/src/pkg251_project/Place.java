package pkg251_project;

import java.util.*;

/**
 *
 * @author Rahaf(1806039), Maha(1805384), Shatha(1806336)
 */
public class Place {
    
    // The Place Class Data filed
    String location;
    String name;
    String destination;
    String state;
    String phoneNumber;
    String openingTime;

    /**
     * Defult constructor
     */ 
    public Place() {
    }

    /**
     *
     * @param location places
     * @param name places
     * @param destination places
     * @param state places
     * @param phoneNumber places
     * @param openingTime places
     */
    public Place(String location, String name, String destination, String state, String phoneNumber, String openingTime) {
        this.location = location;
        this.name = name;
        this.destination = destination;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.openingTime = openingTime;
    }

    /**
     * This method used to get all the Places
     * @return array places
     */
    public ArrayList<Place> getPlace() {

        return null;
    }

    /**
     * This method to print the Place information for specific city
     * @param p places
     * @param city city
     * @return list of the places information
     */
    public String print(ArrayList<Place> p, String city) {
        String list = "";
        int count = 1;
        for (int i = 0; i < p.size(); i++) {
            if (city.equalsIgnoreCase(p.get(i).getLocation())) {
                list += "Place " + count + ": " + p.get(i).toString() + "\n";
                count++;
            }
        }
        return list;
    }

    /**
     *
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     *
     * @param location places
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @param name places
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     *
     * @param destination places
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     *
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state places
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber places
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @return openingTime
     */
    public String getOpeningTime() {
        return openingTime;
    }

    /**
     *
     * @param openingTime places
     */
    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    /**
     * The toString method return the all Places information 
     * @return String variable
     */
    @Override
    public String toString() {
        return "location=" + location + ", name=" + name + ", destination=" + destination + ", state=" + state + ", phoneNumber=" + phoneNumber + ", openingTime=" + openingTime;
    }

}
