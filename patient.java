package project;
import java.util.Scanner;
/*
Auther : Muhammad Bilal Qamar
*/
public class patient implements home
{
    private static patient instance = new patient();
    String pid, pname, disease, sex, admit_status;
    int age;
    protected patient(){}
    public static patient getInstance(){
      return instance;
   }

    public void new_info()
    {
        String us;
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        pid = input.nextLine();
        System.out.print("name:-");
        pname = input.nextLine();
        System.out.print("disease:-");
        disease = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("admit_status:-");
        admit_status = input.nextLine();
        System.out.print("age:-");
        age = input.nextInt();
    }
    public void get_info()
    {
        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t" + age);
    }

}
