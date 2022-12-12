package day05_practice;

public class RelationOperators {

    public static void main(String[] args) {

        int  a = 1000;
        int b = 200;
     //   System.out.println( a> b );
        boolean aIsGreater = a > b;

        System.out.println(aIsGreater);

        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        int score = 75;
        boolean passsed = score >= 60;
        System.out.println(passsed);

        System.out.println("------------------------------------------------------------------------------------------------------");


        int age = 21;
        boolean eligibleToBuyAlcohol = age>=21;
        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToVote = age >= 18;
        System.out.println(eligibleToVote);

        System.out.println("-------------------------------------------------------------------------------------");

        score = 48;
        boolean failed = score < 60;
        System.out.println(failed);

        System.out.println("--------------------------------------------------------------------");

        System.out.println('a' > 'b');
        //                 65 > 66

        // > < >=  <=  only for number

    }
}
