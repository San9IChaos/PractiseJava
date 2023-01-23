import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ruWord;
        String enWord = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово по русски");
        ruWord = sc.nextLine();
        dictionary(ruWord, enWord);

    }

    public static void dictionary(String ruWord, String enWord) {
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("Стол", "Table");
        dictionary.put("Доска", "Desk");

        enWord = dictionary.get(ruWord);

        if(dictionary.get(ruWord) == null) {
            System.out.println("Ваше слово не найдено");
        }
        else {
            System.out.println("Ваше слово по английски: " + enWord);
        }
    }
}