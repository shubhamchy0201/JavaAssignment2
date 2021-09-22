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
        boolean result=true;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(!((ch>=97 && ch<=122) || (ch>=65 && ch<=90)))
            {
                result=false;
                break;
            }
        }
        return result;
    }
}
