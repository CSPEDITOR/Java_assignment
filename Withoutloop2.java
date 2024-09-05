// IV. Sum of product of consecutive digits of any 4 digit number? Supoose
// num=1234 then output= 4*3+3*2+2*1
public class Withoutloop2 {
    public static void main(String[] args) {
    int num=Integer.parseInt(args[0]);
    int position=Integer.parseInt(args[1]);
    int value=((num/position)%10);
    System.out.println("Required value at "+position+"th position is:"+value+"\n");
    }
   }