static class Pair 
    {
        Node first;
        int second;

        public Pair(Node first, int second) 
        {
            this.first = first;
            this.second = second;
        }
    }
    
    static void allTraversal(Node root)
    {
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> post = new ArrayList<>();
        Stack<Pair> s = new Stack<>();

        s.push(new Pair(root, 1));
        while (!s.empty())
        {
            Pair p = s.peek();
            if (p.second == 1) 
            {
                s.peek().second++;
                pre.add(p.first.data);
                if (p.first.left != null) 
                {
                    s.push(new Pair(p.first.left, 1));
                }
            }
            else if (p.second == 2) {
                s.peek().second++;
                in.add(p.first.data);
                if (p.first.right != null) {
                    s.push(new Pair(p.first.right, 1));
                }
            }
            else {
                post.add(p.first.data);
                s.pop();
            }
        }

        System.out.print("Preorder Traversal: ");
        for (int i : pre) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Inorder Traversal: ");
        for (int i : in) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Postorder Traversal: ");
        for (int i : post) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
