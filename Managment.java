package project;
import java.util.Calendar;
import java.util.Scanner;
/*
Auther : Muhammad Bilal Qamar
*/
public class Managment {
    public void manage(){
         String months[] = {
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to BAHA Hospital Management System  ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        System.out.println("\n--------------------------------------------------------------------------------");
         System.out.println("                            ***SIGNUP HERE***");
        System.out.println("\n--------------------------------------------------------------------------------");
       
            Register register = new Register();
         
            
            Scanner scanner = new Scanner(System.in);
           
            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.print(" Enter firstName => ");
            System.out.println("\n--------------------------------------------------------------------------------");
            String firstName = scanner.nextLine();
            register.setFirstName(firstName);

            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.print(" Enter lastName => ");
            System.out.println("\n--------------------------------------------------------------------------------");
            String lastName = scanner.nextLine();
            register.setLastName(lastName);

            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.print(" Enter userName => ");
            System.out.println("\n--------------------------------------------------------------------------------");
            String userName = scanner.nextLine();
            register.setUserName(userName);

            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.print(" Enter password => ");
            System.out.println("\n--------------------------------------------------------------------------------");
            String password = scanner.nextLine();
            register.setPassword(password);

            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.print(" Enter emailId => ");
            System.out.println("\n--------------------------------------------------------------------------------");
            String emailId = scanner.nextLine();
            register.setEmailId(emailId);

            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.print(" Enter phoneNo => ");
            System.out.println("\n--------------------------------------------------------------------------------");
            long phoneNo = scanner.nextLong();
            register.setPhoneNo(phoneNo);

            System.out.println(register.toString());
            System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to BAHA Hospital Management System ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        System.out.println("\n--------------------------------------------------------------------------------");
         System.out.println("                             ***LOGIN HERE***");
        System.out.println("\n--------------------------------------------------------------------------------");
            Login lo=new Login();
            lo.us=userName;
            lo.pw=password;
            lo.login();
            
    
/***************************************************************************************************************************/
        doctor[] d = new doctor[25];
        patient[] p = new patient[100];
        staff[] s = new staff[100];
        int i;
        for (i = 0; i < 25; i++)
            d[i] = new doctor();
        for (i = 0; i < 100; i++)
            p[i] = new patient();
        for (i = 0; i < 100; i++)
            s[i] = new staff();
        d[0].did = "01";
        d[0].dname = "Dr.Bilal Qamar";
        d[0].specilist = "ENT";
        d[0].appoint = "5-11AM";
        d[0].doc_qual = "MBBS";
        d[0].droom = 17;
        d[1].did = "02";
        d[1].dname = "Dr.Anas Ansari";
        d[1].specilist = "Physician";
        d[1].appoint = "10-3AM";
        d[1].doc_qual = "MBBS";
        d[1].droom = 45;
        d[2].did = "03";
        d[2].dname = "Dr.Ahmed-uddin-Khan";
        d[2].specilist = "Surgeon";
        d[2].appoint = "8-2AM";
        d[2].doc_qual = "MBBS";
        d[2].droom = 8;
        d[3].did = "04";
        d[3].dname = "Dr.Humza Mahboob";
        d[3].specilist = "Artho";
        d[3].appoint = "10-4PM";
        d[3].doc_qual = "MBBS";
        d[3].droom = 40;
        
        p[0].pid = "01";
        p[0].pname = "Bilal";
        p[0].disease = "fever";
        p[0].sex = "Male";
        p[0].admit_status = "y";
        p[0].age = 20;
        p[1].pid = "02";
        p[1].pname = "Anas";
        p[1].disease = "Cold";
        p[1].sex = "Male";
        p[1].admit_status = "y";
        p[1].age = 22;
        p[2].pid = "03";
        p[2].pname = "Ahmed";
        p[2].disease = "Headache";
        p[2].sex = "Male";
        p[2].admit_status = "y";
        p[2].age = 21;
        p[3].pid = "04";
        p[3].pname = "Humza";
        p[3].disease = "fever-cold";
        p[3].sex = "Male";
        p[3].admit_status = "y";
        p[3].age = 19;
        
        s[0].sid = "01";
        s[0].sname = "Bilal";
        s[0].desg = "Worker";
        s[0].sex = "Male";
        s[0].salary = 5000;
        s[1].sid = "02";
        s[1].sname = "Anas";
        s[1].desg = "Nurse";
        s[1].sex = "Male";
        s[1].salary = 2000;
        s[2].sid = "03";
        s[2].sname = "Ahmed";
        s[2].desg = "Worker";
        s[2].sex = "Male";
        s[2].salary = 5000;
        s[3].sid = "04";
        s[3].sname = "Humza";
        s[3].desg = "Nurse";
        s[3].sex = "Male";
        s[3].salary = 20000;
        
        
        int count1 = 4, count2 = 4, count3 = 4;
        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1;
        while (status == 1)
        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctos  2. Patients  3. Staff ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                      **DOCTOR SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s1 = 1;
                        while (s1 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Doctors List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        d[count1].new_info();count1++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count1; j++)
                                        {
                                            d[j].get_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
                        }
                        break;
                    }
                case 2:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **PATIENT SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s2 = 1;
                        while (s2 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Patients List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        p[count2].new_info();count2++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count2; j++) {
                                            p[j].get_info();
                                        }
                                        break;
                                        
                                    }
                                    
                            }
                            System.out.println("Appoinment has been generated");
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s2 = input.nextInt();
                        }
                        break;
                    }
                 case 3:
                    {
                        s3 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                       **STAFF SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s3 == 1)
                        {
                           
                            System.out.println("1.Add New Entry \n2.Existing Worker List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        s[count3].new_info();count3++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Gender \t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count3; j++)
                                                s[j].get_info();
                                        }
                                        break;
                                    
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s3 = input.nextInt();
                        }
                        break;
                    }   
                default:
                    {
                        System.out.println(" You Have Enter Wrong Choice!!!");
                    }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    
        

}
}

    

