class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        ArrayList<int []>list=new ArrayList<>();
        int n=start.length;
        for(int i=0;i<n;i++){
            list.add(new int[]{start[i] , finish[i]});
        }
        list.sort((a,b)-> a[1]-b[1]);
        int count=1;
        int lastfinish=list.get(0)[1];
        for(int i=1;i<n;i++){
            if(list.get(i)[0]>lastfinish){
                count++;
                lastfinish=list.get(i)[1];
            }
        }
        return count;
    }
}
