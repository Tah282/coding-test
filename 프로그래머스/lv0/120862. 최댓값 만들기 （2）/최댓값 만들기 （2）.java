import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int n1 = 0;
        int n2 = 0;
        Arrays.sort(numbers);
        n1 = numbers[numbers.length-1]*numbers[numbers.length-2];
        n2 = numbers[0]*numbers[1];
        if(n1>n2){
            answer = n1;
        }else{
            answer = n2;
        }
        
        return answer;
    }
}