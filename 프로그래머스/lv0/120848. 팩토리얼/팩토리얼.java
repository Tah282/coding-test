class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=0; i<=10; i++){
            if (n >= Factorial(i)){
                answer = i;
            }else{
                break;
            }
        }
        
        return answer;
    }
    
    public int Factorial(int num){
        if (num > 1){
            return num*Factorial(num-1);
        }
        return num;
    }
}