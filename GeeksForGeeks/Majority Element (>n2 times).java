class Solution {
    int majorityElement(int arr[]) {
        // code here
        int ele=-1;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                ele=arr[i];
                count++;
            }
            else{
                count += (arr[i]==ele)? 1:-1;
            }
        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                count++;
            }
        }
        if(count> arr.length/2){
            return ele;
        } 
        return -1;
    }
}
