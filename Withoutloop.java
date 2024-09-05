// I. Sum of all digits of any 4 digit numbers
public class Withoutloop {
 public static void main(String[] args) {
 int num=Integer.parseInt(args[0]);
 int temp=num;
 int sum=0;
 sum=(temp%10)+((temp/10)%10)+((temp/100)%10)+(temp/1000);
 System.out.println("Sum of all digits of "+num+" is :"+sum);
 }
}