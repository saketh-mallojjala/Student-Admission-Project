import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Assignment {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int numofstudents;
      int numofsubjectsineachcourse;
      int numoffaculty;
      int numofcourses;
      int numofdays;

      System.out.println("Enter the number of Bteach courses provided in the college");
      System.out.println("CSE");
      System.out.println("ECE");
      System.out.println("CYS ");
      numofcourses = Integer.parseInt(sc.nextLine());
      System.out.println("Enter the number of subjects in each course provided in the college");
      numofsubjectsineachcourse = Integer.parseInt(sc.nextLine());
      numoffaculty = numofsubjectsineachcourse * numofcourses;
      System.out.println("Enter total number of working days in the college");
      numofdays = Integer.parseInt(sc.nextLine());

      LinkedList<studentdetails> b1 = new LinkedList<>();
      LinkedList<facultydetails> b2 = new LinkedList<>();
      LinkedList<courseregistration> b3 = new LinkedList<>();
      LinkedList<mapstudents> b4 = new LinkedList<>();
      LinkedList<mapfaculty> b5 = new LinkedList<>();
      LinkedList<teachingsession> b6 = new LinkedList<>();

      choices ob1 = new choices();

      int choice;
      System.out.println("1.Student admission");
      System.out.println("2.Faculty Recruitment");
      System.out.println("3.Subjects Offered");
      System.out.println("4.Student-Course registration");
      System.out.println("5.Faculty-Subject mapping");
      System.out.println("6.Teaching Session");
      System.out.println("7.Students Attendance report");
      System.out.println("8.Students Marks report");
      System.out.println("9. Check Attendance of a Student");
      System.out.println("10.Marks Report of Individual student");
      System.out.println("11.Faculty Resignation");
      System.out.println("12.Student Admission Cancellation");
      System.out.println("13.Display Students List");
      System.out.println("14.Display Faculty List");
      System.out.println("Please enter the choice");

      choice = Integer.parseInt(sc.nextLine());
      while (choice <= 14) {
         ob1.getchoice(choice, b1, b2, b3, b4, b5, b6, numofdays, numofsubjectsineachcourse);
         System.out.println("1.Student admission");
         System.out.println("2.Faculty Recruitment");
         System.out.println("3.Subjects Offered");
         System.out.println("4.Student-Course registration");
         System.out.println("5.Faculty-Subject mapping");
         System.out.println("6.Teaching Session");
         System.out.println("7.Students Attendance report");
         System.out.println("8.Students Marks report");
         System.out.println("9. Check Attendance of a Student");
         System.out.println("10.Marks Report of Individual student");
         System.out.println("11.Faculty Resignation");
         System.out.println("12.Student Admission Cancellation");
         System.out.println("13.Display Students List");
         System.out.println("14.Display Faculty List");
         System.out.println("Please enter the choice");
         choice = Integer.parseInt(sc.nextLine());
      }

   }
}
