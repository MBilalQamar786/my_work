package project;
import java.util.Scanner;
/*
Auther : Muhammad Bilal Qamar
*/
public class doctor implements home
{
    private static doctor instance = new doctor();
    String did, dname, specilist, appoint, doc_qual;
    int droom;
    protected doctor(){}
    public static doctor getInstance(){
      return instance;
   }

    
    public void new_info()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        did = input.nextLine();
        System.out.print("name:-");
        dname = input.nextLine();
        System.out.print("specilization:-");
        specilist = input.nextLine();
        System.out.print("work time:-");
        appoint = input.nextLine();
        System.out.print("qualification:-");
        doc_qual = input.nextLine();
        System.out.print("room no.:-");
        droom = input.nextInt();
    }
    public void get_info()
    {
        System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + droom);
    }
}
