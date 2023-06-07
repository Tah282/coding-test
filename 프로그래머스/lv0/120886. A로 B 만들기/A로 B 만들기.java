import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] beforeC = before.toCharArray();
        char[] afterC = after.toCharArray();
        
        Arrays.sort(beforeC);
        Arrays.sort(afterC);
        
        String b = new String(beforeC);
        String a = new String(afterC);
        
        if(b.equals(a)){
            answer = 1;
        }
        
        return answer;
    }
}