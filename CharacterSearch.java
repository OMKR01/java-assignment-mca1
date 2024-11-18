import java.util.Scanner;

public class CharacterSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);
        int count = countOccurrences(inputString, searchChar);
        System.out.println("The character '" + searchChar + "' appears " + count + " times in the string.");

        scanner.close();
    }

    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }
}
