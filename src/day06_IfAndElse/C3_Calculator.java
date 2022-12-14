package day06_IfAndElse;

public class C3_Calculator {

    public static void main(String[] args) {

        double n1 = 10.0;
        double n2 = 20.0;

        char mathOperator = '+';

        if (mathOperator == '+') {
            System.out.println(n1 + n2);
        }
        if (mathOperator == '-') {
            System.out.println(n1 - n2);
        }
        if (mathOperator == '*') {
            System.out.println(n1 * n2);
        }
        if (mathOperator == '/') {
            System.out.println(n1 / n2);

        }
        if (mathOperator != '+' && mathOperator != '-' && mathOperator != '*' && mathOperator != '/') {
            System.out.println("invalid operator");
        }
    }
}
/*
3. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30
 */