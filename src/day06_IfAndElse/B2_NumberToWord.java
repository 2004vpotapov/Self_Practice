package day06_IfAndElse;

public class B2_NumberToWord {

    public static void main(String[] args) {

        int n1 = 5;

        String result = "";

        if(n1 == 1 ){
            result = "one";
        }
        if(n1 == 2){
            result = "two";
        }
        if(n1 == 3){
            result = "three";
        }
        if(n1 == 4){
            result = "four";
        }
        System.out.println(result);
    }
}
/*
2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement
 */