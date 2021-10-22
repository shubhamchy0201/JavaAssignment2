import java.util.Scanner;

public class LettersOfAlphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter String: ");
        String string=sc.nextLine();
        boolean checkAlphatbet=checkAllAlphabets(string);
        if(checkAlphatbet)
        {
            System.out.println("All characters are alphabet.");
        }
        else
        {
            System.out.println("Some characters are either number or special symbol.");
        }
    }

    private static boolean checkAllAlphabets(String str) {
        int index = 0;
        boolean[] count = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            } else if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            }
            count[index] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!count[i]) {
                return false;
            }
        }
        return true;
    }
}
//Time Complexity :- O(N)
//Space Complexity :-O(N)
//Here N is length of string
