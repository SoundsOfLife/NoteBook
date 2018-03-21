public class TrieTree{
    
}

class TrieNode{
    // 前缀出现的个数
    int count = 0;
    TrieNode[] next = new TrieNode[26];
    boolean isWord;
}