public class CountVowels {
    public static void main(String[] args) {
        System.out.println("Count :: "+countVowels("Chetan"));
    }

    public static int countVowels(String str){
        int count = 0;
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == 'a' || c =='e' || c == 'i' || c == 'o' || c == 'u') count++;
        }
        return count;
    }
}
