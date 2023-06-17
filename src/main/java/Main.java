import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = "ження";
        int count = findSymbolOccurance(name, 'н');

        System.out.println(count);

        System.out.println(findWordPosition("ження", "я"));
        System.out.println("mystring".charAt(2));

        randomWorld();
    }

    private static int findSymbolOccurance(String name, char search) {
        int count = 0;
        for (char one : name.toCharArray()) {
            if (one == search) {
                count++;
            }
        }
        return count;
    }

    private static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    private static void randomWorld() {
        String[] home = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        Scanner scanner = new Scanner(System.in);
        int index = new Random().nextInt(home.length);

        String randomWord = home[index];
        boolean result = false;
        while (!result) {
            System.out.println("Enter any word: ");

            String userWord = scanner.nextLine().toLowerCase().strip();
            if(randomWord.equals(userWord)){
                System.out.printf("Correct answer! The computere word is: %s\nThe user word is: %s\n", randomWord, userWord);
                result = true;
            }else {
                System.out.printf("Wrong answer!");
                int limit = Math.min(randomWord.length(), userWord.length());
                StringBuilder word = new StringBuilder();
                for (int i = 0; i < limit; i++) {
                    char computerChar = randomWord.charAt(i);
                    char userChar = userWord.charAt(i);

                    if (computerChar == userChar) {
                        word.append(computerChar);
                    } else {
                        word.append("#");
                    }
                }
                int fixedHiddenWordLength = 15;
                int remainingLength = fixedHiddenWordLength - word.length();
                word.append("#".repeat(remainingLength));
                System.out.printf("The secret word is: %s \n", word);
            }
        }
    }
}

