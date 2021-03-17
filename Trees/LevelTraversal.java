class Node{
    int data;
    Node left, right;

    Node(int d){
        data =d;
        left =right =null;
    }
}
public class LevelTraversal {
    Node root;

    public LevelTraversal(){
        root =null;
    }

    public void level(Node root) {
        int h =height(root);
        //System.out.println(h);
        //For reversing traversal, use the for loop in decrementing fashion
        for(int i=1; i<=h; i++){
            print(root, i);
        }
    }

    public void print(Node root,int i){
        if(root==null)
            return;
        else if(i==1)
            System.out.println(root.data);
        else if(i>1){
                print(root.left, i-1);
                print(root.right, i-1);
        }
    }

    //Getting height of tree
    public int height(Node root){
        if(root==null)
            return 0;
        else{
            int lheight =height(root.left);
            int rheight =height(root.right);

            if(lheight>rheight)
                return(lheight+1);
            else
                return(rheight+1);
        }
    }

    public static void main(String[] args){
        LevelTraversal t =new LevelTraversal();
        t.root =new Node(1);
        t.root.left =new Node(2);
        t.root.right =new Node(3);
        t.root.left.left =new Node(4);
        t.root.left.right =new Node(5);

        System.out.println("Level Traversal: ");
        t.level(t.root);
    }
}
