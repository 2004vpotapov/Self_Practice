package day06_IfAndElse;

public class p {
    public static void main(String[] args) {

        int number = 91;
        String result = "";

        if(number >= 90){
            result =  "Your tank is full";
        }

        if(number < 90 && number >= 80){
            result = "Still okay";
        }

        if(number < 80 && number >= 70){
            result = "Don't go too far";
        }

        if(number < 70 &&number >= 60){
            result = "Start to head back";
        }

        if(number < 60 && number >= 50){
            result = "Be careful now you at 50%";
        }

        System.out.println(result);
    }
}
