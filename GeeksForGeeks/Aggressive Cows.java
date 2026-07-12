class Solution {
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int low=1;
        int high=arr[arr.length-1] - arr[0];
        while(low<=high){
            int mid= (low+high)/2;
            if(isPossible(arr,mid,k)){
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return high;
    }
    public boolean isPossible(int arr[],int mid, int k){
        int count=1;
        int last=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-last>=mid){
                count++;
                last=arr[i];
            }
        }
        if(count>=k){
            return true;
        }
        return false;
    }
    
}
