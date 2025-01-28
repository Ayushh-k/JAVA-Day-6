import java.util.Scanner;
public class longestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        String maxLengthWord = "";
        int maxLength = 0;

        for(String word: words){
            if(word.length()> maxLength){
                maxLengthWord = word;
                maxLength = word.length();
            }
        }

        System.out.println("Longest word = "+maxLengthWord);
    }
}
