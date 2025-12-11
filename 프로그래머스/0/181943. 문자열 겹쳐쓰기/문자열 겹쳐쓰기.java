class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String h = my_string;
        String o = overwrite_string;
           String a = h.substring(0,s);
        String b = h.substring(s+o.length() ,h.length()); 
        
    	    String d= a + o + b;
    	 
    	    return 	d;
}
}