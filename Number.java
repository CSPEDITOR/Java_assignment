// . Write a java program to find greatest among three numbers?
public class Number {
    public static void main(String[] args) {

        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int number3= Integer.parseInt(args[2]);
     // int g= (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        int greatest = (number1 > number2)? (number1 > number3)? number1 : number3 : (number2 > number3)? number2  : number3 ;
        System.out.println("the Greatest Number thilu : "+greatest);
        
    }
    
}
