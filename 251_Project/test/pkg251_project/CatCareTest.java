package pkg251_project;

//import java.io.*;
//import java.util.*;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Rahaf(1806039), Maha(1805384), Shatha(1806336)
// */
//public class CatCareTest {
//
//    /**
//     *
//     */
//    public CatCareTest() {
//    }
//
//    /**
//     *
//     */
//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    /**
//     *
//     */
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    /**
//     *
//     */
//    @Before
//    public void setUp() {
//        System.out.println("****************************************");
//    }
//
//    /**
//     *
//     */
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of Register method, of class CatBreeder.
//     * @throws java.io.FileNotFoundException
//     */
//    @Test
//    public void testRegister() throws FileNotFoundException {
//        System.out.println("Method that allow the cat breeder to register");
//        CatBreeder instance = new CatBreeder("Amal", "Amal@gmail.com", "AmalAma", "AmalAmal", "01/01/1999");
//        int[] result = instance.Register();
//        Scanner reader = new Scanner(new File("CatBreeder.txt"));
//        int[] expResult = {0, 0, 0, 0, 0, 0, 0};
//        String[] data;
//        while (reader.hasNextLine()) {
//            data = reader.nextLine().split(" # ");
//            if (data[1].equals(instance.getName())) {
//                expResult[0] = 1;
//                System.out.println("The User Name is already exist!!");
//            }
//            if (data[2].equals(instance.getEmail())) {
//                expResult[1] = 1;
//                System.out.println("The Email is already exist!!");
//            }
//        }
//        reader.close();
//        if (instance.getPassword().length() >= 7) {
//            if (instance.getPassword().length() == instance.getCopassword().length()) {
//                if (!instance.getPassword().matches(instance.getCopassword())) {
//                    expResult[3] = 1;
//                    System.out.println("The confairm password does not match the password!!");
//                }
//            } else {
//                expResult[3] = 1;
//                System.out.println("The confairm password does not match the password!!");
//            }
//        } else {
//            expResult[2] = 1;
//            System.out.println("The password should be more than 7 characters!!");
//        }
//        if (expResult[0] == 0 && expResult[1] == 0 && expResult[2] == 0 && expResult[3] == 0) {
//            System.out.println("The register proccess is completed!!");
//            instance.SaveInforamtion(instance);
//        }
////        assertArrayEquals(expResult, result);
//    }
//
//    /**
//     * Test of Login method, of class CatBreeder (Case1).
//     */
//    @Test
//    public void testLoginC(){
//        System.out.println("Method that allow the cat breeder to login");
//        CatBreeder instance = new CatBreeder("Admin", "Admin123");
//        CatBreeder result = instance.Login();
////        assertNotNull(result);
//    }
//
//    /**
//     * Test of Login method, of class CatBreeder (Case2).
//     */
//    @Test
//    public void testLoginF() {
//        System.out.println("Method that prevent the cat breeder from login, beacuse ethier the userName or the password is wrong.");
//        CatBreeder instance = new CatBreeder("Admin", "admin123");
//        CatBreeder result = instance.Login();
//        System.out.println("The entered username or password is wrong!");
////        assertNull(result);
//    }    
//    
//    /**
//     * Test of FindByID method, of class CatBreeder.
//     * @throws java.io.FileNotFoundException
//     */
//    @Test
//    public void testFindByID() throws FileNotFoundException {
//        System.out.println("Method that find the cat breeder by ID ");
//        String id = "0001";
//        String[] data;
//        CatBreeder instance = new CatBreeder();
//        Scanner reader = new Scanner(new File("CatBreeder.txt"));
//        CatBreeder expResult = new CatBreeder();
//        while (reader.hasNextLine()) {
//            data = reader.nextLine().split(" # ");
//            if (data[0].equals(id)) {
//                expResult = new CatBreeder(data[0], data[1], data[2], data[3], data[4], data[5]);
//            }
//        }
//        reader.close();
//        CatBreeder result = instance.FindByID(id);
//        System.out.println("The Expected result: " + expResult.toString());
//        System.out.println("The Method result: " + result.toString());
//        //assertTrue(expResult.toString().equals(result.toString()));
//    }
//
//    /**
//     * Test of setNewPassword, setPassword, and getPassword methods, of class CatBreeder.
//     */
//    @Test
//    public void testSetNewPassword() {
//        System.out.println("Method that takes the new password and confirm password to check if they met the requirments,"
//                + "then the system set them and upadate the database file");
//        CatBreeder instance = new CatBreeder().FindByID("0000");
//        System.out.println("The old password is " + instance.getPassword());
//        String password = "aadmin123";
//        String copassword = "Aadmin123";
//        String result = instance.setNewPassword(password, copassword);
//        String expResult = "";
//        if (password.length() >= 7) {
//            if (password.length() == copassword.length()) {
//                if (password.matches(copassword)) {
//                    expResult = ("Password Changed successfuly");
//                    instance.setPassword(password);
//                    instance.setCopassword(password);
//                    instance.SaveInforamtion(instance);
//                } else {
//                    System.out.println("The password won't change!");
//                    expResult = "The confirm password does not match the password!!";
//                }
//            } else {
//                System.out.println("The password won't change!");
//                expResult = "The confirm password does not match the password!!";
//            }
//        } else {
//            System.out.println("The password won't change!");
//            expResult = "The password should be more than 7 characters!!";
//        }
//        System.out.println("The Current password is " + instance.getPassword());
////        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of noCatPosts method, of class Cat.
//     * @throws java.io.FileNotFoundException
//     */
//    @Test
//    public void testNoCatPosts() throws FileNotFoundException {
//        System.out.println("Method that determine the order of the cats that will be displayed at the search page.");
//        Cat instance = new Cat();
//        int[] result = instance.noCatPosts();
//        int[] expResult = new int[3];
//        Scanner reader = new Scanner(new File("Cat.txt"));
//        int number = 0;
//        while (reader.hasNextLine()) {
//            number++;
//            reader.nextLine();
//        }
//        reader.close();
//        if (number > 0) { // number = 4
//            expResult[0] = number - 1; // expResult[0] = 3
//            if (number > 1) {
//                expResult[1] = number - 2; // expResult[1] = 2
//                if (number > 2) {
//                    expResult[2] = number - 3; // expResult[2] = 1 
//                }
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            assertTrue(expResult[i] == result[i]);
//        }
//    }
//
//    /**
//     * Test of noPosts method, of class CommunicationForum.
//     * @throws java.io.FileNotFoundException
//     */
//    @Test
//    public void testNoPosts() throws FileNotFoundException {
//        System.out.println("Method that calculate the number of posts by specific cat breeder's id, "
//                + "determine the order of the posts that will be displayed at the myposts page.");
//        String ID = "0000";
//        CommunicationForum instance = new CommunicationForum();
//        int[] expResult = new int[3];
//        int[] result = instance.noPosts(ID);
//        Scanner reader = new Scanner(new File("CommunicationFourm.txt"));
//        int number = 0;
//        String name = new CatBreeder().FindByID(ID).getName();
//        while (reader.hasNextLine()) {
//            String line = reader.nextLine();
//            if (line.equalsIgnoreCase("(Start)")) {
//                line = reader.nextLine();
//                String[] data = line.split(": ");
//                if (data[1].equals(name)) {
//                    number++;
//                }
//            }
//        }
//        reader.close();
//        if (number > 0) { // number = 2
//            expResult[0] = number - 1; // expResult[0] = 1
//            if (number > 1) {
//                expResult[1] = number - 2; // expResult[1] = 0
//                if (number > 2) { // the condition is false
//                    expResult[2] = number - 3;
//                }
//            }
//        }
////        assertTrue(Arrays.equals(expResult, result));
//    }
//
//    /**
//     * Test of SubmitReport method, of class Report.
//     * @throws java.io.FileNotFoundException
//     */
//    @Test
//    public void testSubmitReport() throws FileNotFoundException {
//        System.out.println("Method that allow the cat breeder to submit lost or found report,"
//                + " and print the report information into the database file.");
//        ArrayList<String> R = new ArrayList<>();
//        CatBreeder catB = new CatBreeder().FindByID("0000");
//        String report_info = "I found this cat\nShe is Brown cat";
//        String reporter_info = "my phone number 056*********";
//        Report instance = new Report("Taif", "Closed report", report_info, reporter_info, catB);
//        String result = instance.SubmitReport();
//        Scanner reader = new Scanner(new File("Report.txt"));
//        String expResult;
//        String line = "";
//        String word;
//        while (reader.hasNextLine()) {
//            word = reader.nextLine();
//            if (word.equalsIgnoreCase("(Start)")) {
//                while (!(word.equalsIgnoreCase("(End)"))) {
//                    line += word + "\n";
//                    word = reader.nextLine();
//                }
//                R.add(line + word);
//                line = "";
//            }
//        }
//        reader.close();
//        expResult = R.get(R.size() - 1);
//        System.out.println("The Result: \n" + result);
//        System.out.println("The Expected result: \n" + expResult);
////        assertEquals(result, expResult);
//    }
//
//    /**
//     * Test of Remove method, of class Cat.
//     */
//    @Test
//    public void testRemove() {
//        System.out.println("Method that remove specific cat from the cat care system and update the database file.");
//        Cat instance = new Cat("003", "Rahaf", "Unknown", "Female", "Short Hair", "Grey", "Unknown", "5.jpg");
//        Cat result = instance.Remove();
////        assertNull(result);
//    }
//
//}
