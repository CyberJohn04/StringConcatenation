public class StringConcatenation {

    public static String concatenateStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        char[] str3 = new char[len1 + len2 + 1]; 

        int i = 0;
        while (i < len1) {
            str3[i] = str1.charAt(i);
            i++;
        }

        str3[i] = ' '; 
        i++;
        int j = 0;
        while (i < len1 + len2 + 1) {
            str3[i] = str2.charAt(j);
            i++;
            j++;
        }

        return new String(str3);
    }

    public static void main(String[] args) {
        String str1 = "JOHN";
        String str2 = "BRYSON";
        String str3 = "CANONCE";
        String str4 = "LANDRITO";

        String temp1 = concatenateStrings(str1, str2);
        String temp2 = concatenateStrings(str3, str4);
        String finalString = concatenateStrings(temp1, temp2);

        System.out.println("Concatenated string: " + finalString);
    }
}
