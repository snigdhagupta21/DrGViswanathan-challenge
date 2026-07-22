class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> stack=new Stack<>();
        int max=0;
        int n=heights.length;
        for(int i=0;i<=n;i++){
            while(!stack.isEmpty() && (i==n || heights[stack.peek()]>=heights[i])){
                int height= heights[stack.pop()];
                int nse=i;
                int pse;
                if(stack.isEmpty()){
                    pse=-1;
                }
                else{
                    pse=stack.peek();
                }    
                int area= height * (nse-pse-1);
                max=Math.max(max, area);
            }
            stack.push(i);
        }
        return max;
    }
}
