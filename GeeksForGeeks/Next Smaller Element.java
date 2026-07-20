class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        Stack <Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[i]<=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                result.add(-1);
            }
            else{
                result.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        Collections.reverse(result);
        return result;
    }
}
