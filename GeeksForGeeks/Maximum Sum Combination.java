import java.util.*;

class Solution {
    
    static class Node {
        int sum, i, j;
        
        Node(int sum, int i, int j){
            this.sum = sum;
            this.i = i;
            this.j = j;
        }
    }
    
    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
        
        int n = a.length;
        Arrays.sort(a);
        Arrays.sort(b);
        PriorityQueue<Node> pq = new PriorityQueue<>(
            (x, y) -> y.sum - x.sum
        );
        
        HashSet<String> set = new HashSet<>();
        pq.add(new Node(a[n-1] + b[n-1], n-1, n-1));
        set.add((n-1) + "," + (n-1));
        
        ArrayList<Integer> result = new ArrayList<>();
        
        while(k-- > 0){
            Node curr = pq.poll();
            result.add(curr.sum);
            
            int i = curr.i;
            int j = curr.j;
            if(i-1 >= 0 && !set.contains((i-1) + "," + j)){
                pq.add(new Node(a[i-1] + b[j], i-1, j));
                set.add((i-1) + "," + j);
            }
            if(j-1 >= 0 && !set.contains(i + "," + (j-1))){
                pq.add(new Node(a[i] + b[j-1], i, j-1));
                set.add(i + "," + (j-1));
            }
        }
        
        return result;
    }
}
