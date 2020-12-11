import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Employees empl1 = new Employees();
        Employees empl2 = new Employees();
        List<Integer> listEmpl1 = new ArrayList<>();
        List<Integer> listEmpl2 = new ArrayList<>();

        empl1.setJanuary(2000);
        empl1.setFebruary(3000);
        empl1.setMarch(2500);
        empl1.setApril(3300);

        listEmpl1.add(empl1.getJanuary());
        listEmpl1.add(empl1.getFebruary());
        listEmpl1.add(empl1.getMarch());
        listEmpl1.add(empl1.getApril());

        empl2.setJanuary(1300);
        empl2.setFebruary(2400);
        empl2.setMarch(1100);
        empl2.setApril(4200);

        listEmpl2.add(empl1.getJanuary());
        listEmpl2.add(empl1.getFebruary());
        listEmpl2.add(empl1.getMarch());
        listEmpl2.add(empl1.getApril());

        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        System.out.println("Choose employee: 1 or 2");

        int temp;
        temp = in.nextInt();

        if(temp==1) {
            System.out.println("Enter amount of months: 2 to 4");
            int amount = in2.nextInt();
            if(amount>=2 && amount<=4)
            System.out.println("Average salary of this employee:" + AverageSalary.calc(listEmpl1, amount));
            else System.out.println("Incorrect input");
        } else if (temp==2) {
            System.out.println("Enter amount of months: 2 to 4");
            int amount = in2.nextInt();
            if(amount>=2 && amount<=4)
            System.out.println("Average salary of this employee:" + AverageSalary.calc(listEmpl2, amount));
            else System.out.println("Incorrect input");
        } else System.out.println("Incorrect input");
    }
}
