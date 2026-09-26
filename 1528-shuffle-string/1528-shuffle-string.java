class Solution {
    public String restoreString(String s, int[] indices) {
        int n=indices.length;
        char[] arr=new char[n];
        char[] arr1=new char[n];
        
        arr1=s.toCharArray();
        for(int i=0;i<n;i++){
            
            arr[indices[i]]=arr1[i];
        }
        String a=new String(arr);
        return a;
    }
}