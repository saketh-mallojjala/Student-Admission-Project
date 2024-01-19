import java.util.Scanner;

// import org.w3c.dom.ls.LSParserFilter;

public class courseregistration {
   String course_code[];
   String course_name[];
   int Number_of_credits[];
   int passmarks[];
   int maxmarks[];
   double score[];
   String grade;

   void setcoursecode(int n_sub) {
      Scanner sc = new Scanner(System.in);
      course_code = new String[n_sub];
      course_name = new String[n_sub];
      Number_of_credits = new int[n_sub];
      passmarks = new int[n_sub];
      maxmarks = new int[n_sub];
      score = new double[n_sub];
      int i = 0;
      while (i < n_sub) {
         System.out.println("Enter course code  " + (i + 1));
         course_code[i] = sc.nextLine();
         System.out.println("Enter course name  " + (i + 1));
         course_name[i] = sc.nextLine();
         System.out.println("Enter number of credits of course  " + (i + 1));
         Number_of_credits[i] = Integer.parseInt(sc.nextLine());
         System.out.println("Enter passmarks of course   " + (i + 1));
         passmarks[i] = Integer.parseInt(sc.nextLine());
         System.out.println("Enter maximum marks of course   " + (i + 1));
         maxmarks[i] = Integer.parseInt(sc.nextLine());

         i++;
      }

   }

   void dispscore(int n_sub) {
      for (int l = 0; l < n_sub; l++) {
         System.out.println(score[l]);
      }
   }

}