class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        int xr=0;
        long count=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            xr=xr^arr[i];
            int rem=xr^k;
            if(map.containsKey(rem)){
                count=count+map.get(rem);
            }
            map.put(xr,map.getOrDefault(xr,0)+1);
        }
        return count;
    }
}
