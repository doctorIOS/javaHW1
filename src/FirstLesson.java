import java.util.Scanner;

public class FirstLesson {

    public static void main(String[] args) {
        System.out.println("ЗАДАЧА №1 и №2");
        System.out.println("Введите любое число:");
        Scanner setString = new Scanner(System.in);
        String str = setString.nextLine();
        if (str.equals(new StringBuilder(str).reverse().toString())) {
            System.out.println(str + " - " +"ПОЛИНДРОМ");
        } else {
            System.out.println(str + " - " +"НЕ_ПОЛИНДРОМ");
        }
        char[] strToArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
            myFunc();
    }

    private static void myFunc() {
        System.out.println("ЗАДАЧА №3");
        Scanner scan = new Scanner(System.in);
        int room;
        System.out.println("Комната: ");
        room = scan.nextInt();
        int entrance = (room - 1) / 36 + 1;
        int level = (room - 36 * (entrance - 1) - 1) / 4 + 1;
        if (room > 0 && room < 145) {
            System.out.println("Подъезд: " + entrance + " Этаж:" + level);
        } else {
                System.out.println("Такой комнаты нет!");
        }
    }

}
