
import java.util.Scanner;

public class mapfaculty {
   int ID;
   int flag = 0;
   String name_s;
   courseregistration Course_teach;
   String sub_handle;
   String course_enter;
   String teach_year;
   String teach_section;
   int k;

   void mapfacultycourse(courseregistration a, facultydetails b, int n_sub) {
      Scanner sc = new Scanner(System.in);
      ID = b.Employee_Id;
      Course_teach = a;
      name_s = b.Name_of_Faculty;

      System.out.println("Please enter the Course  handle by the faculty");
      course_enter = sc.nextLine();
      int i = 0;
      while (i < n_sub) {
         if (course_enter.equals(a.course_code[i])) {
            k = i;
            sub_handle = a.course_code[i];
            flag = 1;
            break;

         }

         i++;
      }
      if (flag == 0) {
         System.out.println("NO such faculty exist");
      }

      else {
         // System.out.println("please enter the year the faculty deal with(year
         // corresponding to the students study)");
         // teach_year = sc.nextLine();

         // System.out.println("please enter the section the faculty deal with");
         // teach_section = sc.nextLine();

      }

   }

}
