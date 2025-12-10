class Solution {
    public int solution(int n) {
        int solution  = 0;
      if(n%2 == 0){  
        for(int i=1 ; i < n+1 ; i ++){
            if(i%2 == 0) {
                solution += i*i; 
            }
        }
      }else{
          for(int i=1 ; i < n+1 ; i ++){
            if(i%2 != 0) {
                solution += i;
            }
        } 
      }
   
        return solution ;
    }
}