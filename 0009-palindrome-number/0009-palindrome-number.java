class Solution {
    public boolean isPalindrome(int x) {
       if(x<0){
        return false;
       }

       String y=Integer.toString(x);
        int i=0;
        int j=y.length()-1;
        while(i<j){
            if(y.charAt(i)!=y.charAt(j)){
                return false;
            }
            i++;
            j--;
           
        }
        return true;

    }
   
}