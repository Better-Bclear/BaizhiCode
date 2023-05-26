import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        String str1 = "pwwkew";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(str1));
    }
    public int lengthOfLongestSubstring(String s) {
        if (s==null||s.length()==0){
            return 0;
        }
        List<Character> list = new ArrayList<>();
        List<Integer> times = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.clear();
            for(int j = i;j<s.length();j++){
                if(!list.contains(s.charAt(j))){
                    list.add(s.charAt(j));
                }else{
                    break;
                }
            }
            times.add(list.size());
        }
        return Collections.max(times);
    }
}

