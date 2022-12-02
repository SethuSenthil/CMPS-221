import java.util.*;

class HelloWorld {;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int userInt = sc.nextInt();

        boolean isPrime = true;

        if(userInt > 1){

         for (int i = 2; i <= userInt / 2; i++) {
         if (userInt % i == 0) {
              isPrime = false;
              break;
           }
         }

        }else{
            isPrime = false;
        }

        if(isPrime){
            System.out.println("You Entered a Prime Number");
        }else{
            System.out.println("You DID NOT enter a Prime Number");
        }
    }
};