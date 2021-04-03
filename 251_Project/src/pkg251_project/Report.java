package pkg251_project;

import java.io.*;
import java.util.*;

/**
 *
 * @author Rahaf(1806039), Maha(1805384),Shatha(1806336)
 */
public class Report {

    // The Report Class Data filed
    public String Type;
    public String location;
    public String photo;
    public String state;
    public String report_info;
    public String reporter_info;
    public CatBreeder reporter = new CatBreeder();
    
    // The Reports will contains all the reports that are in the system where Myreport will contains all the reports by specific user
    public ArrayList<Report> Reports = new ArrayList<>();
    public ArrayList<Report> Myreport = new ArrayList<>();
    
    // The catBreeders contains all the catBreeders that are in the system
    public ArrayList<CatBreeder> catBreeders = reporter.ReadInforamtion();
    
    // The Database File
    public File database = new File("Report.txt");

    /**
     *constructor
     */
    public Report() {
        this.location = "";
        this.photo = null;
        this.state = null;
        this.report_info = "";
        this.reporter_info = "";
        this.reporter = new CatBreeder();
    }

    /**
     *
     * @param type Report
     * @param location Report
     * @param photo Report
     * @param state Report
     * @param report_info Report
     * @param reporter_info Report
     * @param reporter Report
     */
    public Report(String type, String location, String photo, String state, String report_info, String reporter_info, CatBreeder reporter) {
        this.location = location;
        this.photo = photo;
        this.state = state;
        this.report_info = report_info;
        this.reporter_info = reporter_info;
        this.reporter = reporter;
        this.Type = type;
    }

    /**
     *
     * @param location Report
     * @param state Report
     * @param report_info Report
     * @param reporter_info Report
     * @param reporter Report
     */
    public Report(String location, String state, String report_info, String reporter_info, CatBreeder reporter) {
        this.location = location;
        this.state = state;
        this.report_info = report_info;
        this.reporter_info = reporter_info;
        this.reporter = reporter;
    }
    
    
    // (Start)
    // by: Sender
    // location: Location
    // state: (Opened report/Opened report)
    // report_info
    // reporter: reporter_info
    // image: Photo (not required)
    // (End)
    /**
     * This method used to print the information into file.
     * @return string  
     */
    public String SubmitReport() {
        try {
            Reports = ReadInformation();
            PrintWriter writer = new PrintWriter(database);
            for (int i = 0; i < Reports.size(); i++) {
                writer.println(Reports.get(i).toString());
            }
            writer.println(this.toString());
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        return this.toString();
    }


    /**
     * This method used to read the information from file to return ArrayList of Report.
     * @return R
     */
    public ArrayList<Report> ReadInformation() {
        ArrayList<Report> R = new ArrayList<>();
        try {
            Scanner reader = new Scanner(database);
            String line, report_info, photo = "null", senderName,
                    location, reporter_info, state, type;
            String[] data;
            CatBreeder sender = new CatBreeder();
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                if (line.equalsIgnoreCase("(Start)")) {
                    report_info = "";
                    line = reader.nextLine();
                    data = line.split(": ");
                    senderName = data[1];
                    line = reader.nextLine();
                    data = line.split(": ");
                    location = data[1];
                    line = reader.nextLine();
                    data = line.split(": ");
                    state = data[1];
                    line = reader.nextLine();
                    while (!line.contains("reporter:")) {
                        report_info += line + "\n";
                        line = reader.nextLine();
                    }
                    data = line.split(": ");
                    reporter_info = data[1];
                    line = reader.nextLine();
                    while (!line.contains("image:")) {
                        reporter_info += line + "\n";
                        line = reader.nextLine();
                    }
                    data = line.split(": ");
                    photo = data[1];
                    type = reader.nextLine();
                    CatBreeder c = sender.FindCatBreeder(senderName);
                    Report r = new Report(type, location, photo, state, report_info, reporter_info, c);
                    R.add(r);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred when the system read the cat breeder inforamtion.");
        }
        return R;
    }

    
    /**
     * This method used to update the information that in the file
     * @param R Report
     */
    public void UpdateInformation(ArrayList<Report> R) {
        try {
            PrintWriter writer = new PrintWriter(database);
            for (int i = 0; i < R.size(); i++) {
                writer.println(R.get(i).toString());
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
    
    /**
     * 
     * @param ID Report
     * @return int[]
     */
    public int[] noReports(String ID) {
        int[] n = new int[3];
        try {
            int number = myReportsize(ID);
            if (number > 0) {
                n[0] = Myreport.size() - 1;
                if (number > 1) {
                    n[1] = Myreport.size() - 2;
                    if (number > 2) {
                        n[2] = Myreport.size() - 3;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return n;
    }

    /**
     *
     * @param id Report
     * @return Reportsize
     */
    public int myReportsize(String id) {
        try {
            Myreport = Myreports(id);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return Myreport.size();
    }

    /**
     *
     * @param id Report
     * @return Myreport
     */
    public ArrayList<Report> Myreports(String id){
        try {
            Reports = ReadInformation();
            Myreport = new ArrayList<>();
            for (int i = 0; i < Reports.size(); i++) {
                if (Reports.get(i).getReporter().getID().equals(id)) {
                    Myreport.add(Reports.get(i));
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return Myreport;
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
     * @return photo
     */
    public String getPhoto() {
        return photo;
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
     * @return report_info
     */
    public String getReport_info() {
        return report_info;
    }

    /**
     *
     * @return reporter_info
     */
    public String getReporter_info() {
        return reporter_info;
    }

    /**
     *
     * @return reporter
     */
    public CatBreeder getReporter() {
        return reporter;
    }

    /**
     *
     * @param location Report
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @param photo Report
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     *
     * @param state Report
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @param report_info Report
     */
    public void setReport_info(String report_info) {
        this.report_info = report_info;
    }

    /**
     *
     * @param reporter_info Report
     */
    public void setReporter_info(String reporter_info) {
        this.reporter_info = reporter_info;
    }

    /**
     *
     * @param reporter Report
     */
    public void setReporter(CatBreeder reporter) {
        this.reporter = reporter;
    }

    /**
     *
     * @return Type
     */
    public String getType() {
        return Type;
    }

    /**
     *
     * @param Type Report
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * The toString method return the all reports information 
     * @return String variable
     */
    @Override
    public String toString() {
        return "(Start)\n"
                + "by: " + this.getReporter().getName() + "\n"
                + "location: " + this.getLocation() + "\n"
                + "state: " + this.getState() + "\n"
                + this.getReport_info() + "\n"
                + "reporter: " + this.getReporter_info() + "\n"
                + "image: " + this.getPhoto() + "\n"
                + this.getType() + "\n"
                + "(End)";
    }
}
