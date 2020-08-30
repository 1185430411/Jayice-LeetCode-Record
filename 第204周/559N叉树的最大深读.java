给定一个 N 叉树，找到其最大深度。

最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。

例如，给定一个 3叉树 :

 



 

我们应返回其最大深度，3。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        Queue<Node>queue=new LinkedList();
        queue.add(root);
        int ans=0;
        while(queue.size()!=0){
            ans++;
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node node = queue.poll();
                for(Node child:node.children){
                    queue.add(child);
                }
            }
        }
        return ans;
    }
}
