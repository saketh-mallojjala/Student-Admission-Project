
import java.util.Scanner;

public class mapstudents {

   int Roll_no;
   String naaam;
   courseregistration Cousrse_code1;

   void mapstudentcourse(studentdetails a, courseregistration b) {
      Scanner sc = new Scanner(System.in);
      naaam = a.Name_of_Candidate;
      Roll_no = a.student_Id;
      Cousrse_code1 = b;

   }

}
