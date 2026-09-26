class Solution {
    public String reversePrefix(String s, int k) {
        int i=0,n=k-1;
        char[] arr=s.toCharArray();
        while(i<n){
            char temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            i++;
            n--;
        }
          String o=new String(arr);
          return o;
        
    }
}