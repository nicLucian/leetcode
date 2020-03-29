package problem14;

import java.util.List;

class SolutionWithTrie {
    public static void main(String[] args) {
        SolutionWithTrie solutionWithTrie = new SolutionWithTrie();
        String[] strings = {"flower","flow","flight"};
        System.out.println(solutionWithTrie.longestCommonPrefix(strings));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        Trie trie = new Trie();
        for (int i = 1; i < strs.length; i++) {
            trie.insert(strs[i]);
        }
        return trie.longestCommonPrefix(strs[0]);
    }

    private class Trie {
        private TrieNode mRoot = new TrieNode();

        public void insert(String word) {
            TrieNode trieNode = mRoot;
            for (int i = 0; i < word.length(); i++) {
                char currentCh = word.charAt(i);
                if (!trieNode.containsKey(currentCh)) {
                    trieNode.put(currentCh, new TrieNode());
                }
                trieNode = trieNode.get(currentCh);
            }
            trieNode.setEnd();
        }

        public boolean search(String word) {
            TrieNode node = mRoot;
            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                if (node.containsKey(currentChar)) {
                    node = node.get(currentChar);
                } else {
                    break;
                }
            }
            return node.isEnd();
        }

        public String longestCommonPrefix(String word) {
            StringBuilder prefix = new StringBuilder();
            TrieNode node = mRoot;
            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                if (node.containsKey(currentChar) && node.size() == 1 && !node.isEnd()) {
                    prefix.append(currentChar);
                    node = node.get(currentChar);
                } else {
                    return prefix.toString();
                }
            }
            return prefix.toString();
        }
    }

    private class TrieNode {
        private static final int R = 26;

        private TrieNode[] mNodes;
        private boolean mIsEnd;
        private int mSize;

        public TrieNode() {
            mNodes = new TrieNode[R];
        }

        public boolean containsKey(char ch) {
            return mNodes[ch - 'a'] != null;
        }

        public TrieNode get(char ch) {
            return mNodes[ch - 'a'];
        }

        public void put(char ch, TrieNode node) {
            mNodes[ch - 'a'] = node;
            mSize++;
        }

        public int size() {
            return mSize;
        }

        public void setEnd() {
            mIsEnd = true;
        }

        public boolean isEnd() {
            return mIsEnd;
        }
    }
}
