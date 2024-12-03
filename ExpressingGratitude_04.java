import java.util.Scanner;

public class ExpressingGratitude_04 {
    public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        return recipientName;
    }

    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you "+name+" For being the best teacher in the world. \n"+
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void sayAdditionalGreetings()  {
        String name = getGreetingRecipient();
        System.out.println("May " +name+ " always be easy and given a lot of goodness.");
    }

    public static void main(String[] args) {
        sayThankyou();
        sayAdditionalGreetings();
    }
}
