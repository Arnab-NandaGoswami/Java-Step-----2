package studentdetails;
import java.util.*;
public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min,max,pf,total,avg;
        System.out.print("Enter the Roll No of the Student: ");
        int roll = sc.nextInt();
        System.out.print("Enter the Name of the Student: ");
        String name = sc.next();
        System.out.print("Enter the Grade of the Student: ");
        char grade = sc.next().charAt(0);
        System.out.print("Enter the No of Subject1: ");
        int sub1 = sc.nextInt();
        min = max = sub1;
        System.out.print("Enter the No of Subject2: ");
        int sub2 = sc.nextInt();
        if(sub2<min){
            min = sub2;
        }
        if(sub2>min){
            max = sub2;
        }
        System.out.print("Enter the No of Subject3: ");
        int sub3 = sc.nextInt();
        if(sub3<min){
            min = sub3;
        }
        if(sub3>min){
            max = sub3;
        }
        System.out.print("Enter the No of Subject4: ");
        int sub4 = sc.nextInt();
        if(sub4<min){
            min = sub4;
        }
        if(sub4>min){
            max = sub4;
        }
        System.out.print("Enter the No of Subject5: ");
        int sub5 = sc.nextInt();
        if(sub5<min){
            min = sub5;
        }
        if(sub5>min){
            max = sub5;
        }
        System.out.print("Enter the No of Subject6: ");
        int sub6 = sc.nextInt();
        if(sub6<min){
            min = sub6;
        }
        if(sub6>min){
            max = sub6;
        }
        System.out.println("Roll No of the Student is - " + roll);
        System.out.println("Name of the Student is - " + name);
        System.out.println("Grade of the Student is - " + grade);
        System.out.println("Marks of Subject1 is - " + sub1);
        System.out.println("Marks of Subject2 is - " + sub2);
        System.out.println("Marks of Subject3 is - " + sub3);
        System.out.println("Marks of Subject4 is - " + sub4);
        System.out.println("Marks of Subject5 is - " + sub5);
        System.out.println("Marks of Subject3 is - " + sub6);
        System.out.println("Marks of minimum subject is - " + min);
        System.out.println("Marks of maximum Subject is - " + max);
        if(min<41){
            System.out.println("Status - Fail");
        }else{
            System.out.println("Status - Pass");
        }
        System.out.println("Total Marks - " + (sub1+sub2+sub3+sub4+sub5+sub6));
        System.out.println("Average Marks - " + (sub1+sub2+sub3+sub4+sub5+sub6)/6);
    }
}
