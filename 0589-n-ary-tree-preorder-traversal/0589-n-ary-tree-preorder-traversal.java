/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;
}
*/

class Solution {

    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        dfs(root);
        return ans;
    }
    void dfs(Node root) {
        if (root == null) return;
        ans.add(root.val);

        for (Node child : root.children) {
            dfs(child);
        }
    }
}