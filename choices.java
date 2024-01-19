
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class choices {

   void getchoice(int a, LinkedList<studentdetails> b1, LinkedList<facultydetails> b2,
         LinkedList<courseregistration> b3, LinkedList<mapstudents> b4, LinkedList<mapfaculty> b5,
         LinkedList<teachingsession> b6, int numofdays, int numofsubjectsineachcourse) {
      Scanner sc = new Scanner(System.in);
      switch (a) {
         case 1:
            studentdetails c1 = new studentdetails();
            c1.takestudentinput();
            b1.add(c1);
            break;
         case 2:
            facultydetails c2 = new facultydetails();
            c2.takefacultyinput();
            b2.add(c2);
            break;
         case 3:
            courseregistration c3 = new courseregistration();
            c3.setcoursecode(numofsubjectsineachcourse);
            b3.add(c3);
            break;
         case 4:

            int i = 0;
            while (i < b1.size()) {
               mapstudents c4 = new mapstudents();
               c4.mapstudentcourse(b1.get(i), b3.get(b1.get(i).course_num));
               b4.add(c4);
               i++;
            }

            break;

         case 5:
            int j = 0;
            while (j < b2.size()) {
               mapfaculty c5 = new mapfaculty();
               c5.mapfacultycourse(b3.get(b2.get(j).facultyteachcoursenum), b2.get(j), numofsubjectsineachcourse);
               b5.add(c5);
               j++;
            }

            break;

         case 6:

            for (int k = 0; k < b2.size(); k++) {
               for (int p = 0; p < b1.size(); p++) {
                  teachingsession c6 = new teachingsession();
                  c6.record(b5.get(k), numofdays, b4.get(p), numofsubjectsineachcourse);
                  b6.add(c6);
               }
            }

            System.out.println("size of the collection:" + b6.size());

            break;

         case 7:

            for (int k2 = 0; k2 < b6.size(); k2++) {
               if (b6.get(k2) != null) {
                  b6.get(k2).attendence_report();
               }

            }

            break;
         case 8:
            for (int k3 = 0; k3 < b6.size(); k3++) {
               if (b6.get(k3) != null) {
                  b6.get(k3).marks_report();
               }
            }

            break;

         case 9:
            System.out.println("Enter the name of a student to display marksreport");
            String name = sc.nextLine();
            int flag4 = 0;
            for (int j1 = 0; j1 < b1.size(); j1++) {
               int k1 = j1;
               if (b6.get(k1).st_name != null) {
                  if (b6.get(k1).st_name.equals(name)) {
                     System.out.println("Marks Report of a Student " + name);
                     while (k1 < b6.size()) {
                        b6.get(k1).individualmarks();
                        k1 = k1 + b1.size();

                     }
                     flag4 = 1;
                     break;
                  }

               }

            }
            if (flag4 == 0) {
               System.out.println("Student not found");
            }
            break;

         case 10:
            System.out.println("Enter the name of a student to display attendence report");
            String name1 = sc.nextLine();
            int flag3 = 0;
            for (int j1 = 0; j1 < b1.size(); j1++) {
               int k1 = j1;
               if (b6.get(k1).st_name != null) {
                  if (b6.get(k1).st_name.equals(name1)) {
                     System.out.println("Attendence Report of a Student " + name1);
                     while (k1 < b6.size()) {
                        b6.get(k1).individualattendence();
                        k1 = k1 + b1.size();

                     }
                     flag3 = 1;
                     break;
                  }
               }

            }
            if (flag3 == 0) {
               System.out.println("Student not found");
            }
            break;

         case 11:
            System.out.println("Enter the name of the faculty to remove from the list");
            String facname;
            facname = sc.nextLine();
            int p = 0;
            int flag = 0;
            while (p < b2.size()) {
               if (b2.get(p).Name_of_Faculty.equals(facname)) {
                  flag = 1;
                  b2.remove(p);

                  int s1 = 0;
                  while (s1 < b6.size()) {
                     if (b6.get(s1).st_name != null) {
                        if (facname.equals(b6.get(s1).f_name)) {
                           b6.remove(s1);
                        }
                     }
                     s1++;
                  }
                  int t1 = 0;
                  while (t1 < b5.size()) {
                     if (facname.equals(b5.get(t1).name_s)) {
                        b4.remove(t1);
                     }
                     t1++;
                  }

                  System.out.println("Faculty details are Successfully removed");
                  break;
               }
               p++;
            }
            if (flag == 0) {
               System.out.println("Faculty not found");

            }
            break;
         case 12:
            System.out.println("Enter the name of the Student to remove from the list");
            String studentname;
            studentname = sc.nextLine();
            int flag1 = 0;
            int p1 = 0;
            while (p1 < b1.size()) {
               if (b1.get(p1).Name_of_Candidate.equals(studentname)) {
                  flag1 = 1;
                  b1.remove(p1);
                  int q1 = 0;
                  while (q1 < b6.size()) {
                     if (b6.get(q1).st_name != null) {
                        if (studentname.equals(b6.get(q1).st_name)) {
                           b6.remove(q1);
                        }
                     }

                     q1++;
                  }
                  int x1 = 0;
                  while (x1 < b4.size()) {
                     if (studentname.equals(b4.get(x1).naaam)) {
                        b4.remove(x1);
                     }
                     x1++;
                  }
                  System.out.println("Student  details are Successfully removed");
                  break;

               }
            }
            if (flag1 == 0) {
               System.out.println("Student not found");

            }
            break;

         case 13:
            int f = 0;
            System.out.println("The list of the students are: ");
            while (f < b1.size()) {
               System.out.println(b1.get(f).Name_of_Candidate);
               f++;
            }

            break;
         case 14:
            int d = 0;
            System.out.println("The list of the faculty are: ");
            while (d < b2.size()) {
               System.out.println(b2.get(d).Name_of_Faculty);
               d++;
            }
            break;

      }

   }

}
