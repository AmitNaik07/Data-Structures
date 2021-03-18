class Node{
    int data;
    Node left, right;

    Node(int d){
        data =d;
        left =right =null;
    }
}

public class TreeMirror {
    Node root;

    public TreeMirror(){
        root =null;
    }

    public boolean mirror(Node root){
        Node temp1 =root;
        Node temp2 =root;

        return(check(temp1, temp2));
    }

    public boolean check(Node temp1, Node3 temp2){
        if(temp1==null && temp2==null)
            return true;
        else {
            if(temp1!=null && temp2!=null && temp1.data == temp2.data) {
                return (check(temp1.left, temp2.right) && check(temp1.right, temp2.left));
            }
        }
        return false;
    }

    public static void main(String[] args){
        TreeMirror t =new TreeMirror();
        t.root =new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(2);
        t.root.left.left = new Node(3);
        t.root.left.right = new Node(4);
        t.root.right.left = new Node(4);
        t.root.right.right = new Node(3);

        if(t.mirror(t.root))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
