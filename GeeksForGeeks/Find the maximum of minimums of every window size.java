class Solution {
    public ArrayList<Integer> maxOfMins(int[] arr) {
        // code here
        int n=arr.length;
        int pse[]=new int[n];
        int nse[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                pse[i]= -1;
            }
            else{
                pse[i]= stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nse[i]=n;
            }
            else{
                nse[i]=stack.peek();
            }
            stack.push(i);
        }
        int ans[]=new int[n+1];
        Arrays.fill(ans, Integer.MIN_VALUE);
        for(int i=0;i<n;i++){
            int len=nse[i]-pse[i]-1;
            ans[len]= Math.max(ans[len],arr[i]);
        }
        for(int i=n-1;i>=1;i--){
            ans[i]= Math.max(ans[i],ans[i+1]);
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=1;i<=n;i++){
            result.add(ans[i]);
        }
        return result;
        
    }
}
