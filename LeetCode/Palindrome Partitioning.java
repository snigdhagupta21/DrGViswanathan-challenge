class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> list=new ArrayList<>();
        func(0,s,list,res);
        return res;
    }
    public void func(int index,String s, List<String> list, List<List<String>> res){
        if(index== s.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isboolean(s,index,i)){
                list.add(s.substring(index, i+1));
                func(i+1,s,list,res);
                list.remove(list.size()-1);

            }
        }
    }
    public boolean isboolean(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start)!= s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
