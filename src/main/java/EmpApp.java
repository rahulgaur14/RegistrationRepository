import java.util.*;
public class EmpApp {
    static int x;
    public void meth1()
    {
        if(x<30000){
            double ta = x*7/100;
            System.out.println("TA : "+ta);
            double da = x*9/100;
            System.out.println("DA : "+da);
            double hra = x*11/100;
            System.out.println("HRA : "+hra);
            double pf = x*15/100;
            System.out.println("PF : "+pf);
            double gs = x+ta+da+hra;
            System.out.println("Gross Salary : "+gs);
            double ns = gs-pf;
            System.out.println("Net Salary : "+ns);
        }
        else if(x>=30000 && x<50000){
            double ta = x*12/100;
            System.out.println("TA : "+ta);
            double da = x*13/100;
            System.out.println("DA : "+da);
            double hra = x*17/100;
            System.out.println("HRA : "+hra);
            double pf = x*22/100;
            System.out.println("PF : "+pf);
            double gs = x+ta+da+hra;
            System.out.println("Gross Salary : "+gs);
            double ns = gs-pf;
            System.out.println("Net Salary : "+ns);
        }
        if(x>=50000){
            double ta = x*17/100;
            System.out.println("TA : "+ta);
            double da = x*19/100;
            System.out.println("DA : "+da);
            double hra = x*21/100;
            System.out.println("HRA : "+hra);
            double pf = x*25/100;
            System.out.println("PF : "+pf);
            double gs = x+ta+da+hra;
            System.out.println("Gross Salary : "+gs);
            double ns = gs-pf;
            System.out.println("Net Salary : "+ns);
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee No : ");
        sc.nextInt();
        System.out.print("Employee Name : ");
        sc.next();
        System.out.print("Employee Salary : ");
        x = sc.nextInt();
        new EmpApp().meth1();

    }
}
