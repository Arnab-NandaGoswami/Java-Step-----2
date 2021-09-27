import java.util.Scanner;

public class EvenOdd {

    static void func(int n){
      if(num % 2 == 0)
           return true;
      else
           return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        if(func(num))
          System.out.println(num + " is even");
        else
          System.out.println(num + " is odd");
    }
}
