package pkg251_project;

import java.io.*;
import java.util.*;

/**
 *
 * @author Rahaf(1806039), Maha(1805384), Shatha(1806336)
 */
public class CatBreeder {

    // The CatBreeder Class Data filed
    public String ID; // Start from 0000
    public String name;
    public String email;
    public String password;
    public String copassword;
    public String birthDate;
    public String imagePath;

    // The catBreeders will contains all the catBreeders that are in the system
    public ArrayList<CatBreeder> catBreeders = new ArrayList<>();

    // The Database File
    public File database = new File("CatBreeder.txt");

    /**
     * Defult constructor
     */
    public CatBreeder() {
        ID = "0000";
        name = "Admin";
        email = "Admin@gmail.com ";
        password = "Admin123";
        birthDate = "16/9/1999";
        imagePath = null;
    }

    /**
     *
     * @param email cat breeder
     */
    public CatBreeder(String email) {
        this.email = email;
    }

    /**
     *
     * @param name cat breeder
     * @param password cat breeder
     */
    public CatBreeder(String name, String password) {
        this.name = name;
        this.password = password;
        this.imagePath = null;
    }

    /**
     *
     * @param ID cat breeder
     * @param name cat breeder
     * @param email cat breeder
     * @param password cat breeder
     * @param birthDate cat breeder
     * @param imagePath cat breeder
     */
    public CatBreeder(String ID, String name, String email, String password, String birthDate, String imagePath) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthDate = birthDate;
        this.imagePath = imagePath;
    }

    /**
     *
     * @param name cat breeder
     * @param email cat breeder
     * @param password cat breeder
     * @param copassword cat breeder
     * @param birthDate cat breeder
     */
    public CatBreeder(String name, String email, String password, String copassword, String birthDate) {
        this.ID = IDGenerator();
        this.name = name;
        this.email = email;
        this.password = password;
        this.copassword = copassword;
        this.birthDate = birthDate;
        this.imagePath = null;
    }

    /**
     * This method used to print the information into file, Or Update existing
     * information in the file. ID # name # email # password # birthDate # imagePath (not required).
     *
     * @param cB cat breeder
     */
    public void SaveInforamtion(CatBreeder cB) {
        try {
            catBreeders = ReadInforamtion();
            boolean flag = false;
            PrintWriter writer = new PrintWriter(database);
            for (int i = 0; i < catBreeders.size(); i++) {
                String[] c = catBreeders.get(i).toString().split(" # ");
                String[] c2 = cB.toString().split(" # ");
                if (c[0].equals(c2[0])) {
                    writer.println(cB.toString());
                    flag = true;
                } else {
                    writer.println(catBreeders.get(i).toString());
                }
            }
            if (!flag) {
                writer.println(cB.toString());
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * This method used to read the information from file, And return ArrayList
     * String of cat breeders' information. ID # name # email # password # birthDate # imagePath (not required).
     * @return c //List of Cat Breeder
     */
    public ArrayList<CatBreeder> ReadInforamtion() {
        ArrayList<CatBreeder> c = new ArrayList<>();
        try {
            Scanner reader = new Scanner(database);
            String line;
            String[] data;
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                data = line.split(" # ");
                CatBreeder cb = new CatBreeder(data[0], data[1], data[2], data[3], data[4], data[5]);
                c.add(cb);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred when the system read the cat breeder inforamtion.");
        }
        return c;
    }

    /**
     * This method used to generate id for cat breeder.
     *
     * @return Id
     */
    public String IDGenerator() {
        String Id = "0000";
        try {
            int counter = CatBreedersNumber();
            if (counter < 10) {
                Id = "000";
            } else if (counter < 100) {
                Id = "00";
            } else if (counter < 1000) {
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
     * This method used to count the no. of cat breeders
     *
     * @return counter
     */
    public int CatBreedersNumber() {
        int counter = 0;
        try {
            Scanner reader = new Scanner(database);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                counter++;
            }
            reader.close();

        } catch (FileNotFoundException ex) {
            System.out.println("An error occurred when the system count the cat breeder number.");
        }
        return counter;
    }

    /**
     * This method used to find the Cat Breeder by name
     *
     * @param name cat breeder
     * @return c // CatBreeder
     */
    public CatBreeder FindCatBreeder(String name) {
        CatBreeder c = null;
        try {
            catBreeders = ReadInforamtion();
            for (int i = 0; i < catBreeders.size(); i++) {
                if (catBreeders.get(i).getName().equals(name)) {
                    c = catBreeders.get(i);
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred when the system try to find the cat breeder.");
        }
        return c;
    }

    /**
     * This method used to find the Cat Breeder by ID
     *
     * @param id cat breeder
     * @return c // CatBreeder
     */
    public CatBreeder FindByID(String id) {
        CatBreeder c = null;
        try {
            catBreeders = ReadInforamtion();
            for (int i = 0; i < catBreeders.size(); i++) {
                if (catBreeders.get(i).getID().equals(id)) {
                    c = catBreeders.get(i);
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred when the system try to find the cat breeder.");
        }
        return c;
    }

    /**
     * This method to check user information to complete register proccess.
     * @return int[]
     */
    public int[] Register() {
        int checkname = 0, checkemail = 0, checkpassword = 0, checkcopassword = 0;
        int checkday = 0, checkmonth = 0, checkyear = 0;
        String[] date = this.getBirthDate().split("/");
        int day = Integer.valueOf(date[0]);
        int month = Integer.valueOf(date[1]);
        int year = Integer.valueOf(date[2]);
        int[] array = new int[7];
        try {
            catBreeders = ReadInforamtion();
            for (int i = 0; i < catBreeders.size(); i++) {
                if (catBreeders.get(i).getName().equalsIgnoreCase(this.getName())) {
                    checkname = 1;
                }
                if (catBreeders.get(i).getEmail().equalsIgnoreCase(this.getEmail())) {
                    checkemail = 1;
                }
            }
            if (this.getPassword().length() < 7) {
                checkpassword = 1;
            }
            if (!this.getPassword().matches(this.getCopassword())) {
                checkcopassword = 1;
            }
            if (day <= 0 || day > 31) {
                checkday = 1;
            }
            if (month < 1 || month > 12) {
                checkmonth = 1;
            }
            if (year < 1900 || year > 2020) {
                checkyear = 1;
            }
            array[0] = checkname;
            array[1] = checkemail;
            array[2] = checkpassword;
            array[3] = checkcopassword;
            array[4] = checkday;
            array[5] = checkmonth;
            array[6] = checkyear;
        } catch (Exception e) {
            System.out.println("An error occurred when the system try to Register this cat breeder.");
        }
        return array;
    }

    /**
     * This method to check user information to complete the login process
     * @return CatBreeder
     */
    public CatBreeder Login() {
        CatBreeder c = null;
        try {
            catBreeders = ReadInforamtion();
            for (int i = 0; i < catBreeders.size(); i++) {
                if (catBreeders.get(i).getName().equalsIgnoreCase(this.getName())) {
                    if (catBreeders.get(i).getPassword().equals(this.getPassword())) {
                        c = catBreeders.get(i);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred when the system try to Login this cat breeder.");
        }
        return c;
    }

    /**
     * This method used to get a new password
     * @return CatBreeder
     */
    public CatBreeder ForgetPass() {
        CatBreeder checkemail = null;
        try {
            catBreeders = ReadInforamtion();
            for (int i = 0; i < catBreeders.size(); i++) {
                if (catBreeders.get(i).getEmail().equalsIgnoreCase(this.getEmail())) {
                    checkemail = catBreeders.get(i);
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred when the system try to check email of this cat breeder.");
        }
        return checkemail;
    }

    /**
     * This method used to set new password
     * @param password cat breeder
     * @param copassword cat breeder
     * @return massege
     */
    public String setNewPassword(String password, String copassword) {
        String massege = "";
        if (password.length() < 7) {
            massege = "The Password should be more than 7 characters!!";
        } else if (!copassword.equals(password)) {
            massege = "The confirm password does not match the password!!";
        } else {
            this.setPassword(password);
            this.setCopassword(copassword);
            this.SaveInforamtion(this);
            massege = "Password Change successfuly";
        }
        return massege;
    }

    /**
     * The Getter methods
     */
    /**
     *
     * @return ID
     */
    public String getID() {
        return ID;
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
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     *
     * @return image path
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     *
     * @return birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     *
     * @return copassword
     */
    public String getCopassword() {
        return copassword;
    }

    /**
     * The Setter methods
     */
    /**
     *
     * @param email cat breeder
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param password cat breeder
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @param copassword cat breeder
     */
    public void setCopassword(String copassword) {
        this.copassword = copassword;
    }

    /**
     *
     * @param imagePath cat breeder
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     *
     * @param birthDate cat breeder
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * The toString method return the all Cat Breeder information
     *
     * @return String variable
     */
    @Override
    public String toString() {
        return this.getID() + " # " + this.getName() + " # " + this.getEmail() + " # " + this.getPassword() + " # " + this.getBirthDate() + " # " + this.getImagePath();
    }

}
