package stringInterview;
import java.util.HashMap;
import java.util.Map;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Declaring the String
        String str = "Alice is girl and Bob is boy";
        // Declaring a HashMap of <String, Integer>
        Map<String, Integer> hashMap = new HashMap();
 
        // Splitting the words of string
        // and storing them in the array.
        String[] words = str.split(" ");
        System.out.println(words.length);
       int count =0;
        for (String word : words) {
             count++;
            // Asking whether the HashMap contains the
            // key or not. Will return null if not.
            Integer integer = hashMap.get(word);
 
            if (integer == null)
                // Storing the word as key and its
                // occurrence as value in the HashMap.
                hashMap.put(word, 1);
 
            else {
                // Incrementing the value if the word
                // is already present in the HashMap.
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
        System.out.println(count);
	}

}
