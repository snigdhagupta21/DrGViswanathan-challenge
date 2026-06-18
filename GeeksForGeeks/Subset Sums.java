class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> subset=new ArrayList<>();
        int n=arr.length;
        func(0,0,arr,n,subset);
        return subset;
    }
    public void func(int index,int sum,int arr[], int n, ArrayList<Integer> subset){
        if(index==n){
            subset.add(sum);
            return;
        }
        func(index+1, sum + arr[index], arr, n, subset);
        func(index+1, sum, arr,n, subset);
    }
}
