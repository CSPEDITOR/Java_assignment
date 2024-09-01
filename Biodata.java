// 1. Write a java program to print your biodata?
class Biodata{

    public static void main(String[] args) {
        System.out.println("Your bio Data :---------");
        String name = args[0];

        System.out.println("Name : " + name);

        int age = Integer.parseInt(args[1]);
        System.out.println("Age: " + age);

        String gender = args[2];
        System.out.println("Gender : " + gender);

        String address = args[3];
        System.out.println("Address: " + address);

    }
}
