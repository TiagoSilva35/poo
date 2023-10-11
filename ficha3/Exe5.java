import java.util.Scanner;

public class Exe5 {
    public static int compare(String sentence, String word){
        int times = 0;
        for (String i : sentence.split(" ")) {
            if (i.compareTo(word) == 0) times++;
        }
        return times;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String word = sc.next();
        sc.close();
        System.out.printf("%d\n",compare(sentence, word));

    }
}
