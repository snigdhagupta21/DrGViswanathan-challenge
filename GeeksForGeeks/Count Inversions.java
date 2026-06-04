class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
         return mergesort(arr,0,arr.length-1);
        
    }
    static int mergesort(int arr[],int low,int high){
        int count=0;
        if(low>=high){
            return count;
        }
        int mid=(high+low)/2;
        count+=mergesort(arr,low,mid);
        count+=mergesort(arr,mid+1,high);
        count+=merge(arr,low,mid,high);
        return count;
    }
    static int merge(int arr[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int count=0;
        ArrayList<Integer>list=new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
              list.add(arr[left++]);
            }
            else{
               count += (mid-left+1);
               list.add(arr[right++]);
            }
        }
        
        while(left<=mid){
            list.add(arr[left++]);
        }
        while(right<=high){
            list.add(arr[right++]);
        }
        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
        
        return count;
    }
    
}
