class Solution {
    public int reversePairs(int[] nums) {
       return mergesort(nums,0,nums.length-1);
    }
    public int mergesort(int nums[],int low,int high){
        if(low>=high){
            return 0;
        }
        int mid=(low+high)/2;
        int count=0;
        count+=mergesort(nums,low,mid);
        count+=mergesort(nums,mid+1,high);
        count+=countpairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return count;
    }
    public int countpairs(int nums[],int low,int mid,int high){
        int right=mid+1;
        int count=0;
        for(int i=low;i<=mid;i++){
            while(right<=high && nums[i]>2L*nums[right]){
                right++;
            }
            count += right-(mid+1);
        }
        return count;
    }
    public void merge(int nums[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer>list=new ArrayList<>();
        while(left<=mid&& right<=high){
            if(nums[left]<=nums[right]){
                list.add(nums[left++]);
            }
            else{
                list.add(nums[right++]);
            }
        }
        while(left<=mid){
            list.add(nums[left++]);
        }
        while(right<=high){
            list.add(nums[right++]);
        }
        for(int i=low;i<=high;i++){
            nums[i]=list.get(i-low);
        }
    }
}
