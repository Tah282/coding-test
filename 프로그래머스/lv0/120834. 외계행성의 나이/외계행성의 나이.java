class Solution {
    public String solution(int age) {
        String answer = "";
        String s = Integer.toString(age);
        String[] ages = s.split("");
        
        for(int i=0; i<ages.length; i++){
            answer += (char)(Integer.parseInt(ages[i])+97);
        }
        
        return answer;
    }
}