import java.util.Scanner;

public class teachingsession {
   int E_id;

   String date[];
   String period;
   int attendence[];
   String st_name;
   int st_id;
   String subject;
   int n_days_present;
   double percentage;
   double marks_obtained;
   String f_name;

   void record(mapfaculty a, int n_days, mapstudents b, int n_sub) {
      Scanner sc = new Scanner(System.in);

      if (b.Cousrse_code1.equals(a.Course_teach)) {
         date = new String[n_days];
         attendence = new int[n_days];
         E_id = a.ID;
         st_id = b.Roll_no;
         subject = a.sub_handle;
         f_name = a.name_s;
         st_name = b.naaam;
         System.out.println("please give attendence for subject " + a.sub_handle);
         System.out.println("Student Name: " + b.naaam);
         System.out.println("Faculty : " + a.name_s);
         int i = 0;

         while (i < n_days) {

            System.out.println("Enter the date of day " + (i + 1));
            date[i] = sc.nextLine();
            System.out.println(
                  "Give attendence for  " + st_name + "  with respect to dates(give 1 if present else give 0)");
            attendence[i] = Integer.parseInt(sc.nextLine());
            i++;
         }

         int sum = 0;
         for (int j = 0; j < n_days; j++) {
            sum = sum + attendence[j];

         }
         n_days_present = sum;
         percentage = (100 * n_days_present) / (n_days);
         System.out.println("Enter marks obtained in course  " + subject + " for student " + st_name);
         marks_obtained = Double.parseDouble(sc.nextLine());

      }
   }

   void attendence_report() {

      if (st_name != null && subject != null) {
         System.out
               .println("The attendence of  " + st_name + "  is  " + percentage + " percentage in course " + subject);
         System.out.println("If any queries, please contact faculty " + f_name);
      }

   }

   void marks_report() {
      if (st_name != null && subject != null) {
         System.out.println(st_name + " : " + subject + " : " + marks_obtained + " : ");
         System.out.println("If any queries, please contact faculty " + f_name);
      }

   }

   void individualmarks() {
      if (st_name != null && marks_obtained > 0) {
         System.out.println(subject + "->" + marks_obtained);
      }

   }

   void individualattendence() {
      if (st_name != null && percentage > 0) {
         System.out.println(subject + "->" + percentage);
      }
   }

}
