class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n=val.length;
        ArrayList<double[]>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new double[]{
                (double) val[i]/wt[i],
                val[i],
                wt[i]
            });
        }
        list.sort((a,b)-> Double.compare(b[0],a[0]));
        double ans=0.0;
        for( double l[]:list){
            double ratio= l[0];
            int value= (int) l[1];
            int weight=(int) l[2];
            if(capacity>=weight){
                ans += value;
                capacity -=weight;
            }
            else{
                ans += ratio*capacity;
                break;
            }
            
        }
        return ans;
    }
}
