import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Мальчик хочет написать на заборе признание в любви девочке из пятнадцати
//        букв и трех пробелов. На каждые три буквы мальчик тратит по 62 см длины
//        забора, а на каждый пробел - 12 см.Напишите программу, которая поможет по длине забора (введенной
//        пользователем) выяснить, поместится ли на забор такой длины надпись
//        мальчика
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
