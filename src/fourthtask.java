package src;

public class fourthtask {
    public static void main(String[] args){
        String choose="Погодитись";
        String ii="Yes";
        switch(choose) {
            case "Погодитись":
                switch (ii){
                    case "Yes":
                        System.out.println("Я погоджуюся!");
                        break;
                    case "Y":
                        System.out.println("Я погоджуюся!");
                        break;
                    case "Ok":
                        System.out.println("Я погоджуюся!");
                        break;
                    case "+":
                        System.out.println("Я погоджуюся!");
                        break;
                    case "ОК":
                        System.out.println("Я погоджуюся!");
                        break;
                    case "OK":
                        System.out.println("Я погоджуюся!");
                        break;
                    case "Так":
                        System.out.println("Я погоджуюся!");
                        break;
                    default:
                        System.out.println("Не розумію");
                    }
                    break;
            case "Відмовитись":
                switch (ii){
                    case "No":
                        System.out.println("Я відмовляюсь!");
                        break;
                    case "N":
                        System.out.println("Я відмовляюсь!");
                        break;
                    case "-":
                        System.out.println("Я відмовляюсь!");
                        break;
                    case "NO":
                        System.out.println("Я відмовляюсь!");
                        break;
                    case "Ні":
                        System.out.println("Я відмовляюсь!");
                        break;
                    default:
                        System.out.println("Я не розумію");
                }break;
        }
    }
}
