package insert;
import tree.MyTreeNode;
import java.util.*;

public class TreeInsert{
    Queue<MyTreeNode>list = null;
    public TreeInsert() {
        this.list = new LinkedList<>();
    }
    public MyTreeNode createMyTreeNode(String data) {
        MyTreeNode newNode = new MyTreeNode();
        newNode.data = data;
        newNode.left = null;
        newNode.right = null;
        return newNode; 
    }
    public MyTreeNode levelOrderInsert(MyTreeNode head, MyTreeNode newNode) {
        if(head == null) {
            head = newNode;
            return head;
        }
        list.add(head);
        while(list.size() > 0) {
            MyTreeNode temp = list.poll();
            if(temp != null) {
                if(temp.left == null ) {
                    temp.left = newNode;
                    break;
                }
                else {
                    list.add(temp.left);
                }
                if(temp.right == null) {
                    temp.right = newNode;
                    break;
                }
                else {
                    list.add(temp.right);
                }
            }
        }
        return head;
    }
    public MyTreeNode insert(String data, MyTreeNode head) {
        MyTreeNode newNode = createMyTreeNode(data);
        return levelOrderInsert(head, newNode);
    }

    public void printTree(MyTreeNode head) {
        MyTreeNode temp = head;
        if(temp == null) {
            return;
        }
        list.add(temp.left);
        list.add(temp.right);
        System.out.println(temp.data);
        printTree(list.poll());
    }

    public MyTreeNode executeTreeOpr(String arr[]) {
        MyTreeNode head = null;
        for(String item: arr) {
            head = insert(item, head);
        }
        this.list.clear();
        return head;
    }

    public static void main(String[] args) {
        TreeInsert tree = new TreeInsert();
        String arr[] = {"Shourya", "Mittal", "Is", "a", "Good", "Boy"};
        MyTreeNode head = tree.executeTreeOpr(arr);
        
        tree.printTree(head);
    }
}