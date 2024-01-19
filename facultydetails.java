
import java.util.Scanner;

public class facultydetails {
   String Name_of_Faculty;
   String faculty_Father_name;
   String faculty_Address;
   String faculty_Date_of_birth;
   String faculty_phonenumber;
   String faculty_Email_ID;
   String list_of_qualifications;
   String University_Nmae;
   String Year_of_pass;
   String CGPA;
   int facultyteachcoursenum;

   int Employee_Id;

   void takefacultyinput() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Name of the faculty");
      String a1 = sc.nextLine();

      System.out.println("Enter the Father Name of the faculty");
      String a2 = sc.nextLine();

      System.out.println("Enter the Address of the faculty");
      String a3 = sc.nextLine();

      System.out.println("Enter the Date of birth of the faculty");
      String a4 = sc.nextLine();

      System.out.println("Enter the phone number of the faculty");
      String a5 = sc.nextLine();

      System.out.println("Enter the Email id of the faculty");
      String a6 = sc.nextLine();

      System.out.println("Enter the Qualification of the faculty");
      String a12 = sc.nextLine();

      System.out.println("Enter the University Name of the faculty");
      String a13 = sc.nextLine();

      System.out.println("Enter the Year of Pass of the faculty");
      String a14 = sc.nextLine();

      System.out.println("Enter the CGPA of the faculty");
      String a15 = sc.nextLine();

      System.out.println("Enter the last four digits of Aadhar Card of the faculty");
      Employee_Id = Integer.parseInt(sc.nextLine());

      System.out.println("Enter the course number of the faculty");
      System.out.println("0->CSE");
      System.out.println("1->ECE");
      System.out.println("2->CYS");

      facultyteachcoursenum = Integer.parseInt(sc.nextLine());

      Name_of_Faculty = a1;
      faculty_Father_name = a2;
      faculty_Address = a3;
      faculty_Date_of_birth = a4;
      faculty_phonenumber = a5;
      faculty_Email_ID = a6;
      list_of_qualifications = a12;
      University_Nmae = a13;
      Year_of_pass = a14;
      CGPA = a15;
      System.out.println("faculty details Successfully Saved");
   }

}