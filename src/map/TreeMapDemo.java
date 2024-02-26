package map;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    
    // Function to check if a word is
    // palindrome
    static boolean checkPalin(String word)
    {
        int n = word.length();
        word = word.toLowerCase();
        for (int i=0; i<n; i++,n--)
           if (word.charAt(i) != word.charAt(n - 1))
              return false;       
        return true;
    }
     
    // Function to count palindrome words
    static int countPalin(String str)
    {        
        // to check last word for palindrome
        str = str + " ";
         
        // to store each word
        String word = "";
        int count = 0;
        HashMap<String ,Integer> map=new HashMap();
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
             
            // extracting each word
            if (ch != ' ')
                word = word + ch;
            else {
                if (checkPalin(word))
                {
                	//Integer integer = map.get(word);
                	if(map.containsKey(word))
                	{
                	map.put(word, map.get(word)+1);
                	}
                	else {
                		map.put(word, 1);
                	}
                }
                    count++;
                word = "";
            }
        }
        System.out.println(map);
         
        return count;
    }
   
    // Driver code
    public static void main(String args[])
    {
    	String str="MADAM MADAM NITIN NITIN 121 212 121";
 //      System.out.println(countPalin("madam madam"
   //               + "Arora teaches malayalam"));
//                   
//        System.out.println(countPalin("Nitin "
//                        + "speaks malayalam"));
    	countPalin(str);
    }

}
