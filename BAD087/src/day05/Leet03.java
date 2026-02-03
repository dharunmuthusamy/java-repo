package day05; 

import java.util.*; 

public class Leet03 { 
    public static int lengthOfLongestSubstring(String s) { 
        int left = 0, right = 0; 
        HashSet<Character> hs = new HashSet<>(); 
        int max = 0; 
        
        for (right = 0; right < s.length(); right++) { 
            while (hs.contains(s.charAt(right))) { 
                hs.remove(s.charAt(left)); 
                left++; 
            } 
            hs.add(s.charAt(right)); 
            max = Math.max(max, right - left + 1); 
        } 
        return max; 
    } 

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        if (sc.hasNext()) {
            String s = sc.next(); 
            System.out.print(lengthOfLongestSubstring(s)); 
        }
        sc.close();
    }
} 