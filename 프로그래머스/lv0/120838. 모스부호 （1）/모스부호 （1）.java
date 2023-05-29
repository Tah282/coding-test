class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String []password = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String []let = letter.split(" ");
        for( String s : let ){
            for(int i=0; i<password.length; i++){
                if(s.equals(password[i])){
                    answer += Character.toString(i+'a');
                }
            }
        }
        
        
        return answer;
    }
}