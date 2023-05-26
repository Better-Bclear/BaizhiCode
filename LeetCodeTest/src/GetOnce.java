public class GetOnce {
    public static void main(String[] args) {
        String[] s1 = new String[]{"leetcode","is","amazing","as","is","amazing","leetcode","is"};
        String[] s2 = new String[]{"amazing","leetcode","is"};
        GetOnce getOnce = new GetOnce();
        System.out.println(getOnce.countWords(s1, s2));
    }
    public int countWords(String[] words1, String[] words2) {
        int result = 0;
        int time = 0;
        for(int i = 0;i<words1.length;i++){
            time = 0;
            for(int j = 0;j<words2.length;j++){
                if(words1[i]==words2[j]){
                    time++;
                }
                if(time>1){
                    break;
                }
            }
            if(time==1){
                result++;
            }
        }
        return result;
    }
}
