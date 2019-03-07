package Questions.question8;

import java.util.Scanner;

public class ReadWordsFromWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        while (!string.equals("done")) {
            if (string.charAt(0) == string.charAt(string.length() - 1)) {
                System.out.println("first character and last character is equal " + string);
            } else {
                System.out.println("first Character and last Character is not equal " + string);
            }
            string = sc.next();
        }
    }
}
