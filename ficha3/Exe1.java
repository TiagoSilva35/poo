public class Exe1{
    
    /** 
     * @param word
     * @return boolean
     */
    public static boolean palindromo(String word){
        boolean ans = false;
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) == word.charAt(word.length()- i - 1)){
                ans = true;
            }
            else{
                ans = false;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String word = "assa";
        if (palindromo(word) == true){
            System.out.printf("YES\n");
        }
        else
            System.out.printf("NO\n");
        

    }
}