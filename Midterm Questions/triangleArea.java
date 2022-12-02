
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter side A:");
        int a = sc.nextInt();

        System.out.println("Please enter side B:");
        int b = sc.nextInt();

        System.out.println("Please enter side C:");
        int c = sc.nextInt();



        if(a > 0 && b > 0 && c > 0 && c < a + b && b < c + a && a < c + b){;
           double s = 0.5 * (a + b + c);
           double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

           System.out.println("Area is: " + area);

        }else{
            System.out.println("Invalid Triangle");
        }
    }
}