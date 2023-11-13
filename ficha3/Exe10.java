import java.util.Scanner;

public class Exe10 {
    
    /** 
     * @param word
     * @param dicWord
     * @return boolean
     */
    public static boolean hasTwoMoreLetters(String word,String dicWord){
        return dicWord.length() - word.length() <= 2 ? true : false;
    }
    public static boolean remainingLetters(String word, String dicWord){
        int counter = 0;
        int len = dicWord.length() < word.length() ? dicWord.length() : word.length();
        for (int i = 2; i < len; i++) {
            if (word.charAt(i) != dicWord.charAt(i)) counter++;
        }
        return counter > 2 ? false : true;
    }
    public static boolean firstTwoLetters(String word, String dicWord){
        if (word.length() < 2 || dicWord.length() < 2){
            return false;
        }
        for (int i = 0; i < 2;  i++) {
            if (word.charAt(i) != dicWord.charAt(i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] dic = new String[10];
        for (int i = 0; i < dic.length; i++) {
            dic[i] = sc.nextLine();
        }
        boolean flag = false;
        String correctedSentence = "";
        String sentence = sc.nextLine();
        //System.out.println(sentence);
        for (String word : sentence.split(" ")){
            for (String dicWord : dic){
                if (firstTwoLetters(word, dicWord) && remainingLetters(word, dicWord) && hasTwoMoreLetters(word, dicWord)){
                    System.out.printf("%s -> %s? \n",word, dicWord);
                    String ans = sc.nextLine();
                    if (ans.charAt(0) == 's'){
                        correctedSentence += dicWord + " ";
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag){
                correctedSentence += word + " ";
            }
            else
                flag = false;

        }        
        System.out.printf("%s\n",correctedSentence);
        sc.close();
    }
}