class Solution {
    public String solution(String str1, String str2) {
     StringBuffer answer = new StringBuffer();
           
       char[] ch1 = str1.toCharArray(); 
       char[] ch2 = str2.toCharArray(); 
        int size = ch1.length >= ch2.length ? ch1.length : ch2.length;
        for(int i = 0 ; i<size ;i++){
    if (i < ch1.length) answer.append(ch1[i]);
    if (i < ch2.length) answer.append(ch2[i]);
        }
        
      
 
      
        
        return answer.toString();
    }
}