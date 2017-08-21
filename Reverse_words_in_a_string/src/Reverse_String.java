public class Reverse_String {
    public static void main(String[] args) {
        String test = "Manoj is the best lol";
        String[] words = test.split(" ");
        StringBuilder sb = new StringBuilder();
//        String output = "";
        for (String word : words) {
            for(int i = word.length() ; i > 0; i--) {
                sb.append(word.charAt(i - 1));
            }
            if(words[words.length - 1] != word)
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
