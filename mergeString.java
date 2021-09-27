public class mergeString {

    public static String mergeString1(String s1, String s2){
        String newSentence =  "";
        int size = s1.length() > s2.length() ? s2.length() : s1.length();
        for(int i= 0; i < size; i++) {
            newSentence += s1.charAt(i) + s2.charAt(i);
        }

        return  newSentence;
    }
    public static void main(String[] args) {
        String s1 = "hrte";
        String s2 = "aarslan";
        System.out.println(mergeString1(s1, s2));
    }
}
