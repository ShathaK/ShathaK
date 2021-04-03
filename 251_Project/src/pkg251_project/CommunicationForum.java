package pkg251_project;

import java.io.*;
import java.util.*;

/**
 *
 * @author Rahaf(1806039), Maha(1805384), Shatha(1806336)
 */
public class CommunicationForum {

    // The CommunicationForum Class Data filed
    public String message;
    public String photo;
    public CatBreeder sender = new CatBreeder();

    // The posts will contains all the posts that are in the system where Myposts will contains all the posts by specific user
    public ArrayList<CommunicationForum> posts = new ArrayList<>();
    ArrayList<CommunicationForum> Myposts = new ArrayList<>();

    // The catBreeders contains all the catBreeders that are in the system
    public ArrayList<CatBreeder> catBreeders = sender.ReadInforamtion();

    // The Database File
    public File database = new File("CommunicationFourm.txt");

    /**
     * Defult constructor
     */
    public CommunicationForum() {
        this.message = null;
        this.photo = null;
        this.sender = null;
    }

    /**
     *
     * @param message fourm
     * @param sender fourm
     */
    public CommunicationForum(String message, CatBreeder sender) {
        this.message = message;
        this.sender = sender;
    }

    /**
     *
     * @param message fourm
     * @param photo fourm
     * @param sender fourm
     */
    public CommunicationForum(String message, String photo, CatBreeder sender) {
        this.message = message;
        this.photo = photo;
        this.sender = sender;
    }

    /**
     * This method used to print the post information into file.
     * (Start)
     * by: Sender
     * massege
     * image: photo (not required)
     * (End)
     */
    public void AddPost() {
        try {
            posts = ReadInformation();
            PrintWriter writer = new PrintWriter(database);
            for (int i = 0; i < posts.size(); i++) {
                writer.println(posts.get(i).toString());
            }
            writer.println(this.toString());
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * This method return the postion of the 3 posts depending on the number of posts.
     * @param ID fourm
     * @return n fourm
     */
    public int[] noPosts(String ID) {
        int[] n = new int[3];
        try {
            int number = myPostsize(ID);
            if (number > 0) {
                n[0] = Myposts.size() - 1;
                if (number > 1) {
                    n[1] = Myposts.size() - 2;
                    if (number > 2) {
                        n[2] = Myposts.size() - 3;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return n;
    }

    /**
     * This method return the number of posts by specific user.
     * @param id fourm
     * @return size fourm
     */
    public int myPostsize(String id) {
        try {
            Myposts = Myposts(id);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return Myposts.size();
    }

    /**
     * This method return all the posts by specific user as array list.
     * @param id fourm
     * @return array fourm
     */
    public ArrayList<CommunicationForum> Myposts(String id){
        try {
            posts = ReadInformation();
            Myposts = new ArrayList<>();
            for (int i = 0; i < posts.size(); i++) {
                if (posts.get(i).getSender().getID().equals(id)) {
                    Myposts.add(posts.get(i));
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return Myposts;
    }


    /**
     * This method used to read the posts information from file,
     * And return all the information as ArrayList of CommunicationForum.
     * @return ArrayList fourm
     */
    public ArrayList<CommunicationForum> ReadInformation() {
        ArrayList<CommunicationForum> c = new ArrayList<>();
        try {
            Scanner reader = new Scanner(database);
            String line, message = "", photo = "null", senderName = "";
            String[] data;
            CatBreeder sender = new CatBreeder();
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                if (line.equalsIgnoreCase("(Start)")) {
                    message = "";
                    line = reader.nextLine();
                    data = line.split(": ");
                    senderName = data[1];
                    line = reader.nextLine();
                    while (!line.equalsIgnoreCase("(End)")) {
                        if (line.contains("image:")) {
                            data = line.split(": ");
                            photo = data[1];
                        } else {
                            message += line + "\n";
                        }
                        line = reader.nextLine();
                    }
                    CatBreeder b = sender.FindCatBreeder(senderName);
                    CommunicationForum cF = new CommunicationForum(message, photo, b);
                    c.add(cF);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred when the system read the cat breeder inforamtion.");
        }
        return c;
    }

    /**
     * This method used to update the posts' information that in the file.
     * @param c fourm
     */
    public void UpdateInformation(ArrayList<CommunicationForum> c) {
        try {
            PrintWriter writer = new PrintWriter(database);
            for (int i = 0; i < c.size(); i++) {
                writer.println(c.get(i).toString());
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     *
     * Setter Methods
     */
    
    /**
     *
     * @param message fourm
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @param photo fourm
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     *
     * @param sender fourm
     */
    public void setSender(CatBreeder sender) {
        this.sender = sender;
    }

    /**
     *
     * Getter Methods
     */
    
    /**
     *
     * @return String
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @return String
     */
    public String getPhoto() {
        return photo;
    }

    /**
     *
     * @return String
     */
    public CatBreeder getSender() {
        return sender;
    }

    /**
     * The toString method return the all CommunicationForum information 
     * @return String variable
     */
    @Override
    public String toString() {
        return "(Start)\n"
                + "by: " + this.getSender().getName() + "\n"
                + this.getMessage() + "\n"
                + "image: " + this.getPhoto() + "\n"
                + "(End)";
    }

}
