/*This traversal can be printed in reverse using a Stack and a Queue. Use the stack to poll and then put
that node in the stack. Once all nodes are pushed onto the stack, the peek() the stack for the topmost node
and print that node.
*/

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left, right;

    Node(int d){
        data =d;
        left =right =null;
    }
}

public class LevelTreeQueue {
    Node root;

    LevelTreeQueue(){
        root =null;
    }

    public void levelqueue(Node root){
        Queue<Node> queue =new LinkedList<Node>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node temp =queue.poll();
            System.out.println(temp.data);

            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
    }

    public static void main(String[] args){
        LevelTreeQueue t =new LevelTreeQueue();
        t.root =new Node(1);
        t.root.left =new Node(2);
        t.root.right =new Node(3);
        t.root.left.left =new Node(4);
        t.root.right.right =new Node(5);

        System.out.println("Level Order Traversal is:");
        t.levelqueue(t.root);
    }
}
