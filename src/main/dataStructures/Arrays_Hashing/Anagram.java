package Arrays_Hashing;

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String str1, String str2) {

        if(str1.length() != str2.length()) {
            return false;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

       return Arrays.equals(chars1, chars2);
    }
}
