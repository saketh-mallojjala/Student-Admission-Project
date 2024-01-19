import java.util.Scanner;

public class studentdetails {
   String Name_of_Candidate;
   String Father_name;
   String Address;
   String Date_of_birth;
   String phonenumber;
   String Email_ID;
   String program_name;
   String branch_name;
   String Year_of_study;
   int course_num;
   String section;
   int student_Id;
   double attendence;

   void takestudentinput() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Name of the Candidate");
      String a1 = sc.nextLine();

      System.out.println("Enter the Father Name of the Candidate");
      String a2 = sc.nextLine();

      System.out.println("Enter the Address of the Candidate");
      String a3 = sc.nextLine();

      System.out.println("Enter the Date of birth of the Candidate");
      String a4 = sc.nextLine();

      System.out.println("Enter the phone number of the Candidate");
      String a5 = sc.nextLine();

      System.out.println("Enter the Email id of the Candidate");
      String a6 = sc.nextLine();

      System.out.println("Enter the program name of the Candidate");
      String a7 = sc.nextLine();

      System.out.println("Enter the branch name of the Candidate");
      String a8 = sc.nextLine();

      System.out.println("Enter the Year of Study of the Candidate");
      String a9 = sc.nextLine();

      System.out.println("Enter the course number  of the Candidate");
      System.out.println("0->CSE");
      System.out.println("1->ECE");
      System.out.println("2->CYS");
      int a10 = Integer.parseInt(sc.nextLine());

      System.out.println("Enter the Section of the Candidate");
      String a11 = sc.nextLine();

      System.out.println("Enter the last four digits of Aadhar Card of the Candidate");
      student_Id = Integer.parseInt(sc.nextLine());

      Name_of_Candidate = a1;
      Father_name = a2;
      Address = a3;
      Date_of_birth = a4;
      phonenumber = a5;
      Email_ID = a6;
      program_name = a7;
      branch_name = a8;
      Year_of_study = a9;
      course_num = a10;
      section = a11;
      System.out.println("Student details Successfully Saved");
   }

}
