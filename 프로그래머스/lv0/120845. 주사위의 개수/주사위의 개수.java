class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;        
        int g = box[0]/n;
        int s = box[1]/n;
        int h = box[2]/n;
        
        answer = g*s*h;
        
        return answer;
    }
}