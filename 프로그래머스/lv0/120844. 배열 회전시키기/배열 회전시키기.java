class Solution {
    public int[] solution(int[] numbers, String direction) {
        int l = numbers.length;
        int[] answer = new int[l];
        
        if(direction.equals("right")){
            int n = numbers[l-1];
            for(int i=0; i<l; i++){
                if(i != l-1 ){
                    answer[i+1] = numbers[i];
                }
            }
            answer[0] = n;
        }else{
            int n = numbers[0];
            for(int i=0; i<l; i++){
                if(i != l-1 ){
                    answer[i] = numbers[i+1];
                }
            }
            answer[l-1] = n;
        }
        
        return answer;
    }
}