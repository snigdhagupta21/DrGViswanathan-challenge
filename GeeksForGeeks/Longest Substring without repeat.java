class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int left=0;
        int right=0;
        int n=s.length();
        int count=0;
        HashSet<Character>set=new HashSet<>();
        while(right<n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                count =Math.max(count,right-left+1);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return count;
    }
}
