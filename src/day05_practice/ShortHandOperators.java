package day05_practice;

public class ShortHandOperators {

    public static void main(String[] args) {

        int a = 20;
        System.out.println(a);

        a = 40;
        System.out.println(a);

        a = 90;
        System.out.println(a);

        System.out.println("____________________________________________________________________________________");

        double balance = 100;

        balance += 1000;  //balance  = 100 + 1000
        System.out.println(balance);

        balance += 500;  // balanse = 1100 + 500
        System.out.println(balance);

        balance += 10000;
        System.out.println("balance = " + balance);

        balance -= 1000; // balance = 11600 - 1000 = 10600
        System.out.println("balance = " + balance);

        balance -= 5000; // 10600- 5000 = 5600
        System.out.println("balance = " + balance);

        System.out.println("---------------------------------------------------------------------------------------");

        double salary = 45000;
        salary *= 2; // salary = 45000 * 2 = 90000
        System.out.println("salary = " + salary);

        salary *= 3;
        System.out.println("salary = " + salary);

        double eth = 4;
         eth *= 250;
        System.out.println("eth = " + eth);

        eth /= 2;
        System.out.println("eth = " + eth);

        System.out.println("salary = " + salary);

        salary /= 2;
        System.out.println("salary = " + salary);

        int b = 39;
        b %= 7; // b = 39 % 7
        System.out.println(b);





    }
}
