package pkg251_project;

import java.io.*;
import java.util.*;

/**
 *
 * @author Rahaf(1806039), Maha(1805384), Shatha(1806336)
 * 
 */
public class Cat {
    
    // The Cat Class Data filed
    public String ID;
    public String name;
    public String age;
    public String gender;
    public String catBreed;
    public String color;
    public String photo;
    public String weight;
    
    // The Cats will contains all the cats that are in the system
    public ArrayList<Cat> Cats = new ArrayList<>();
    
    // The Database File
    public File database = new File("Cat.txt");

    /**
     * The empty consturctor
     */
    public Cat() {
        this.ID = IDGenerator();
    }

    /**
     * @param name cat name
     * @param age cat age
     * @param gender cat gender
     * @param catBreed cat breed
     * @param color cat color
     * @param photo cat photo
     * @param weight cat weight
     */
    public Cat(String name, String age, String gender, String catBreed, String color, String photo, String weight) {
        this.ID = IDGenerator();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.catBreed = catBreed;
        this.color = color;
        this.photo = photo;
        this.weight = weight;
    }

    /**
     * @param ID cat 
     * @param name cat
     * @param age cat
     * @param gender cat
     * @param catBreed cat
     * @param color cat
     * @param weight cat
     * @param photo cat
     */
    public Cat(String ID, String name, String age, String gender, String catBreed, String color, String weight, String photo) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.catBreed = catBreed;
        this.color = color;
        this.photo = photo;
        this.weight = weight;
    }

    /**
     * This method to Generat cat ID
     * @return String variable
     */
    public String IDGenerator() {
        String Id = "000";
        try {
            int counter = CatNumber();
            if (counter < 10) {
                Id = "00";
            } else if (counter < 100) {
                Id = "0";
            } else {
                Id = "";
            }
            Id += counter;
        } catch (Exception ex) {
            System.out.println("An error occurred in ID Generator method.");
        }
        return Id;
    }

    /**
     * This method return the numbers of cats
     * @return int variable
     */
    public int CatNumber() {
        int counter = 0;
        try {
            Scanner reader = new Scanner(database);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                counter++;
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("An error occurred when the system count the cat number.");
        }
        return counter;
    }

    /**
     * This method used to read all the cats' informations that in database file.
     * ID # name # age # gender # catBreed # color # weight  # photo
     * @return c 
     */
    public ArrayList<Cat> ReadInformation() {
        ArrayList<Cat> c = new ArrayList<>();
        try {
            Scanner reader = new Scanner(database);
            String line;
            String[] data;
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                data = line.split(" # ");
                Cat cat = new Cat(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]);
                c.add(cat);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred when the system read the cat inforamtion.");
        }
        return c;
    }
    
    /**
     * This method used to add the cat informations into the database file.
     */
    public void AddCat() {
        try {
            Cats = ReadInformation();
            PrintWriter writer = new PrintWriter(database);
            for (int i = 0; i < Cats.size(); i++) {
                writer.println(Cats.get(i).toString());
            }
            writer.println(this.toString());
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * This method used to remove the cat from the database file.
     * @return cat
     */
      public Cat Remove() {
        Cat c = null;
        try {
            Cats = ReadInformation();
            PrintWriter writer = new PrintWriter(database);
            for (int i = 0; i < Cats.size(); i++) {
                if (Cats.get(i).getID().equals(this.getID())) {
                     Cats.remove(Cats.get(i));
                     c = null;
                } 
            }
            for (int i = 0; i < Cats.size(); i++) {
                writer.println(Cats.get(i).toString());
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("An error occurred when the system try to remove the cat.");
        }
        return c;
      }
      
    /**
     * This method return the postion of the 3 cat information depending on the number of cats.
     * @return int[] variable
     */
    public int[] noCatPosts() {
        int[] n = new int[3];
        try {
            int number = CatNumber();
            Cats = ReadInformation();
            if (number > 0) {
                n[0] = Cats.size() - 1;
                if (number > 1) {
                    n[1] = Cats.size() - 2;
                    if (number > 2) {
                        n[2] = Cats.size() - 3;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return n;
    }

    /**
     * This method used to return the information of the cat.
     * @return String variable
     */
    public String PrintInfo() {
        String list = "";
        String[] info = this.toString().split(" # ");
        list = "Name: " + info[1] + "\n"
              + "Gender: " + info[3] + "\n"
              + "Color: " + info[5] + "\n"
              + "Cat Breed: " + info[4] + "\n"
              + "Age: " + info[2] + "\n"
              + "Weight: " + info[6] + "\n";     
        return list;
    }
    

    /**
     * The Getter methods
     */
        
    /**
     *
     * @return String variable
     */
    public String getID() {
        return ID;
    }

    /**
     *
     * @return String variable
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return String variable
     */
    public String getAge() {
        return age;
    }

    /**
     *
     * @return String variable
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @return String variable
     */
    public String getCatBreed() {
        return catBreed;
    }

    /**
     *
     * @return String variable
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @return String variable
     */
    public String getPhoto() {
        return photo;
    }

    /**
     *
     * @return String variable
     */
    public String getWeight() {
        return weight;
    }

    /**
     * The Setter methods
     */
    
    /**
     *
     * @param name the cat name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param age the cat age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     *
     * @param gender the cat gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @param color the cat color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @param photo the cat photo
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     *
     * @param catBreed the cat breed
     */
    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }    

    /**
     *
     * @param weight the cat weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }
    
    /**
     * The toString method return the all cat information 
     * @return String variable
     */
    @Override
    public String toString() {
        return this.getID() + " # " + this.getName() + " # " + this.getAge() + " # " + this.getGender() + " # " + this.getCatBreed() + " # " + this.getColor() + " # " + this.getWeight() + " # " + this.getPhoto();
    }

}
