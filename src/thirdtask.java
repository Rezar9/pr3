package src;

public class thirdtask {
    public static void main(String[] args){
        int a=10;//де ви будете
        int b=9;//де ви зараз
        if(a<10 && b<11 && b>-1 && a>0) {
            if (a > b) {
            }
            if (a == 2 && a > b) {
                a = 2 + 1;
            }
            if (a > b && a < 10 && b < 11 && b > -1 && a > 0) {
                System.out.println("ви піднялися на" + " " + a + " " + "поверх");
            }

            if (a < b) {
            }
            if (a == 2) {
                a = a - 1;
            }
            if (a < b && a < 10 && b < 11 && b > -1 && a > 0) {
                System.out.println("ви опустилися на" + " " + a + " " + "поверх");
            }
        }else{
                            System.out.println("Такого поверху не існує");
                            }

    }
}
