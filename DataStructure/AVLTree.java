public class AVLTree{
    private Node root = null;

    public void AVLTree(){}
    
    public void AVLTree(Node root){
        this.root = root;
    }

    public Node getRoot(){
        return this.root;
    }

    public void insert(int x){
        if(root == null){
            Node v = new Node(x);
            root = v;
        }else{
            insertNode(x, root);
        }
    }

    public Node FindMin(Node root){
        if(root == null){
            return null;
        }else if(root.left == null){
            return root;
        }else{
            return FindMin(root.left);
        }
    }

    public Node FindMax(Node root){
        if(root == null){
            return null;
        }else if(root.right == null){
            return root;
        }else{
            return FindMax(root.right);
        }
    }

    public Node Find(int x){
        Node temp = root;
        while(temp != null){
            if(temp.val == x){
                break;
            }else{
                if(temp.val > x){
                    temp = temp.left;
                }else{
                    temp = temp.right;
                }
            }
        }
        return temp;
    }

    private Node insertNode(int x,Node root){
        if(root == null){
            return new Node(x);
        }else{
            if(root.val > x){
                root.left = insertNode(x, root.left);
                if(getHeight(root.left) - getHeight(root.right) == 2){
                    // TODO
                    if(root.left.val > x){
                        root = singleRotateLeft(root);
                    }else{
                        root = doubleRotateLeft(root);
                    }
                }

            }else{
                root.right = insertNode(x, root.right);
                if(getHeight(root.right) - getHeight(root.left) == 2){
                    // TODO
                    if(root.right.val < x){
                        root = singleRotateRight(root);
                    }else{
                        root = doubleRotateRight(root);
                    }
                }
            }
            root.height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
            return root;   
        }
    }

    public Node delete(int x){
        if(root != null){
            if(root.val == x){
                if(root.left == null && root.right == null){
                    root = null;
                }
                else if(root.left != null && root.right == null){

                }
            }
        }
        return root;
    }

    private Node singleRotateLeft(Node n){
        Node ret = n.left;
        n.left = ret.right;
        ret.right = n;
        ret.height = Math.max(getHeight(ret.left),getHeight(ret.right)) + 1;
        n.height = Math.max(getHeight(n.left),getHeight(n.night)) + 1;
        return ret;
    }

    private Node singleRotateRight(Node n){
        Node ret = n.right;
        n.right = ret.left;
        ret.left = n;
        ret.height = Math.max(getHeight(ret.left),getHeight(ret.right)) + 1;
        n.height = Math.max(getHeight(n.left),getHeight(n.night)) + 1;
        return ret;
    }

    private Node doubleRotateLeft(Node n){
        n.left = singleRotateRight(n.left);
        return singleRotateLeft(n);
    }

    private Node doubleRotateRight(Node n){
        n.right = singleRotateLeft(n.right);
        return singleRotateRight(n);
    }

    public int getHeight(Node n){
        if(n == null){
            return 0;
        }else{
            return 1 + Math.max(getHeight(n.left),getHeight(n.right));
        }
    }
}


class Node{
    int val;
    int height = 0;
    Node left = null;
    Node right = null;
    public void Node(int val){
        this.val = val;
    }

    public int getHeight(){
        return this.height;
    }
}