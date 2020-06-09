import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (2 == 2) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите, пожалуйста, текст:");
            String str = sc.nextLine();
            if (str.length() == 0) {
                System.out.println("Вы не ввели текст");
            } else if (str.trim().length() == 0) {
                System.out.println("Вы ввели одни пробелы. Вы не выйдете из программы пока не введете текст.");
            } else {
                String s1 = str.replaceAll("\\s+", " ");
                Text text = new Text(s1);
                System.out.println("\n" + text);
                text.filterText();
                System.out.println(text);

            }
            break;

        }
    }

}
