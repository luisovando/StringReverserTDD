public class ReverseWords {
    public static String reverseWords(String s) {

        if (s == null || s.trim().isEmpty()) return "";

        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length-1; i>=0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }

        return sb.toString().trim();
    }
}
