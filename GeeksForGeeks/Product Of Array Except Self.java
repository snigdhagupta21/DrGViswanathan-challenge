class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int prefix=1;
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=prefix;
            prefix *=arr[i];
        }
        int suffix=1;
        for(int i=arr.length-1;i>=0;i--){
            ans[i]*=suffix;
            suffix *=arr[i];
        }
        return ans;
    }
}
