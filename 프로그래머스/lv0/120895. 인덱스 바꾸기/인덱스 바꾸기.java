class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        String[] arr = my_string.split("");
        String c1 = arr[num1];
        String c2 = arr[num2];
        arr[num1] = c2;
        arr[num2] = c1;
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}