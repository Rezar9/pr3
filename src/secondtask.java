package src;

public class secondtask {
    public static void main(String[] args){
        int k=999;
        int a,b,c,y;
        y=(k%100);
        a=((k-y)/100);
        c=(y%10);
        b=((y-(y%10))/10);
        if(a>b && a>c | a==c | a==b){
            System.out.println("найбільше число"+" "+a);
        }else if(b>a && b>c | b==a | b==c){
            System.out.println("найбільше число"+" "+b);
        }else if(c>a && c>b | c==a | c==b){
            System.out.println("найбільше число"+" "+c);
        }
        else{
            System.out.println("Всі числа рівні");
        }
    }
}
