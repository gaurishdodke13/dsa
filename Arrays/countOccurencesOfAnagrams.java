import java.util.*;

class Solution {

    int search(String pat, String txt) {
        // HashMap<Integer, Integer> map1 = new HashMap<>();
        // HashMap<Integer, Integer> map2 = new HashMap<>();
        int map1[] = new int[26];
        int map2[] = new int[26];
        int result=0;
        
        for(int i=0; i<pat.length(); i++){
            char c = pat.charAt(i);
            int temp = c - 'a';
            map1[temp] += 1;
        }
        
        int i=0; 
        int j=0; 
        int k=pat.length();
        
        while(j<txt.length()){
            char c = txt.charAt(j);
            int temp = c - 'a';
            map2[temp] += 1;
            
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                if(Arrays.equals(map1, map2))
                    result++;
                char c1 = txt.charAt(i);
                int temp1 = c1 - 'a';
                
                map2[temp1] -= 1;
                
                i++;
                j++;
            }
        }
        
        return result;
    }
}