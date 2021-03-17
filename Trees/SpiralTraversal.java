class Node{
    int data;
    Node left, right;

    Node(int d){
        data =d;
        left =right =null;
    }
}
public class SpiralTraversal {
    Node root;

    public SpiralTraversal(){
        root =null;
    }

    public void spiral(Node root) {
        boolean ltr =false;
        int h =height(root);
        //System.out.println(h);
        for(int i=1; i<=h; i++){
            print(root, ltr,i);
            ltr = !ltr;
        }
    }

    public void print(Node root, boolean x, int i){
        if(root==null)
            return;
        else if(i==1)
            System.out.println(root.data);
        else if(i>1){
            if(x) {
                print(root.left, x, i - 1);
                print(root.right, x, i - 1);
            }
            //Else block will only finish after both statements are executed.
            else{
                print(root.right, x, i - 1);
                print(root.left, x, i - 1);
            }
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
        SpiralTraversal t =new SpiralTraversal();
        t.root =new Node(1);
        t.root.left =new Node(2);
        t.root.right =new Node(3);
        t.root.left.left =new Node(4);
        t.root.left.right =new Node(5);

        System.out.println("Spiral Traversal: ");
        t.spiral(t.root);
    }
}
