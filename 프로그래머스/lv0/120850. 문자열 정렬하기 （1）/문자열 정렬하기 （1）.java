import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
            
        String st = my_string.replaceAll("[a-z]","");     
        String[] str = st.split("");
        int[] answer = new int[str.length];
        
        for(int i=0; i<str.length; i++){
            answer[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}