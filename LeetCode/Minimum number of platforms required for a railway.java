class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n=arr.length;
        int i=1;
        int j=0;
        int platform=1;
        int maxplatform=1;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                platform++;
                i++;
            } else{
                platform--;
                j++;
            }
            maxplatform=Math.max(maxplatform,platform);
        }
        return maxplatform;
    }
}
