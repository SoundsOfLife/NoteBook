/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    private Map<Integer, UndirectedGraphNode> miu = new HashMap<>();

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        return DFS(node);
    }

    public UndirectedGraphNode DFS(UndirectedGraphNode node) {
        if (node != null) {
            if (miu.containsKey(node.label)) {
                return miu.get(node.label);
            } else {
                UndirectedGraphNode copyNode = new UndirectedGraphNode(node.label);
                miu.put(node.label, copyNode);
                for (int i = 0; i < node.neighbors.size(); i++) {
                    copyNode.neighbors.add(DFS(node.neighbors.get(i)));
                }
                return copyNode;
            }
        } else {
            return null;
        }
    }
}