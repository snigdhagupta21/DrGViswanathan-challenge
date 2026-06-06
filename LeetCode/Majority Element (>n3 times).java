class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>list=new ArrayList<>();
        int ele1=-1;
        int ele2=-1;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(count1==0&&nums[i]!=ele2){
                ele1=nums[i];
                count1++;
            }
            else if(count2==0&&nums[i]!=ele1){
                ele2=nums[i];
                count2++;
            }
            else if(nums[i]==ele1){
                count1++;
            }
            else if(nums[i]==ele2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        int min=nums.length/3;
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1){
                count1++;
            }
            if(nums[i]==ele2){
                count2++;
            }
        }
        if(count1>min){
               list.add(ele1);
        }
        if(count2>min&& ele1!=ele2){
               list.add(ele2);
        }
        
        return list;
        
    }
}
