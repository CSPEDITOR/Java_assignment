// 2. Write a java program to find simple interest?
public class SimpleIn {
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        float r = Float.parseFloat(args[1]);
        int t = Integer.parseInt(args[2]);
        float si = (p * t * r) / 100;
        System.out.println("Simple interest: " + si);
    }

}
