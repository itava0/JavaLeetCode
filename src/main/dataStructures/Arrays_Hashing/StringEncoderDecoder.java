package Arrays_Hashing;

import java.util.ArrayList;
import java.util.List;

//Design an algorithm to encode a list of strings
// to a string. The encoded string is then sent over
// the network and is decoded back to the original list of strings.
//
//Please implement encode and decode

//Input: ["lint","code","love","you"]
//Output: ["lint","code","love","you"]
//Explanation:
//One possible encode method is: "lint:;code:;love:;you"

public class StringEncoderDecoder {
    public static String encode(List<String> strList) {
        StringBuilder encodedStr = new StringBuilder();
        for (String str : strList) {
            encodedStr.append(str).append(":;");  // Delimiter between strings
        }
        return encodedStr.toString();
    }

    public static List<String> decode(String encodedStr) {
        String[] decodedArray = encodedStr.split(":;");
        List<String> decodedList = new ArrayList<>();
        for (String str : decodedArray) {
            decodedList.add(str);
        }
        return decodedList;
    }

    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("lint");
        originalList.add("code");
        originalList.add("love");
        originalList.add("you");

        // Encode the list
        String encodedString = encode(originalList);
        System.out.println(encodedString);  // Output: "lint:;code:;love:;you:;"

        // Decode the encoded string
        List<String> decodedList = decode(encodedString);
        System.out.println(decodedList);  // Output: ["lint", "code", "love", "you"]
    }
}
