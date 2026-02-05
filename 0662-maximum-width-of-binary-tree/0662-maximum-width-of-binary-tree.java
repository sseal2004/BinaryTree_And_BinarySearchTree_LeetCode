class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int maxWidth = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            int minIndex = q.peek().index; 
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair p = q.poll();
                int idx = p.index - minIndex;

                if (i == 0) first = idx;
                if (i == size - 1) last = idx;

                if (p.node.left != null)
                    q.add(new Pair(p.node.left, 2 * idx));
                if (p.node.right != null)
                    q.add(new Pair(p.node.right, 2 * idx + 1));
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }

    static class Pair {
        TreeNode node;
        int index;

        Pair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }
}
