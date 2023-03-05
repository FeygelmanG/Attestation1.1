import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int inscription = ((15 / 3) * 62 + (12 * 3));
        Scanner input = new Scanner(System.in);
        System.out.println("Пожалуйста, введите длину забора:");
        int lengthFence = input.nextInt();
        if (inscription <= lengthFence) {
            System.out.println("Длины забора " + lengthFence + "см. хватит для надписи длиной " + inscription + "см.!");
        } else {
            System.out.println("Длины забора " + lengthFence + "см. не хватит для надписи длиной " + inscription + "см.!");
        }
    }
}
