// II. find the face value and position value of any 4 digit number?
public class Withoutloop1 {
    public static void main(String[] args) {
    int num=Integer.parseInt(args[0]);
    int f1=num%10;
    int f2=(num/10)%10;
    int f3=(num/100)%10;
    int f4=num/1000;
    int p1=f1;
    int p2=f2*10;
    int p3=f3*100;
    int p4=f4*1000;
    System.out.println(num+"\'s unit digit is "+f1+" and it's position value is "+p1);
    System.out.println(num+"\'s 10th digit is "+f2+" and it's position value is "+p2);
    System.out.println(num+"\'s 100th digit is "+f2+" and it's position value is "+p3);
    System.out.println(num+"\'s 1000th digit is "+f4+" and it's position value is "+p4);}
}
   