import tree.MyTreeNode;
import insert.TreeInsert;
import java.util.*;
public class DeleteNode extends TreeInsert{
    Queue<MyTreeNode> list = new LinkedList<>();

    void printMyree(MyTreeNode head) {
        MyTreeNode temp = head;
        if(temp == null) {
            return;
        }
        list.add(temp.left);
        list.add(temp.right);
        System.out.println(temp.data);
        printMyree(list.poll());
    }
    void deleteNode(MyTreeNode head, String keyToDelete) {
        MyTreeNode nodeToDelete = null;
        MyTreeNode lastNode = null;
        list.add(head);
        while(list.size() > 0) {
            MyTreeNode temp = list.poll();
            
            if(temp != null) {
                if(temp.data.equals(keyToDelete)){
                    nodeToDelete = temp;
                }
                lastNode = temp;
                list.add(temp.left);
                list.add(temp.right);
            }
        }
        if(nodeToDelete != null){
            nodeToDelete.data = lastNode.data;
            lastNode.data = "";
            lastNode = null;
        }
        else{
            System.out.println("No Element found");
        }
        printMyree(head);
    }
    public static void main(String[] args) {
        DeleteNode obj = new DeleteNode();
        String arr[] = {"Shourya", "Mittal", "Is", "a", "Good", "Boy"};
        MyTreeNode head = obj.executeTreeOpr(arr);
        System.out.println("Actual Tree");
        obj.printTree(head);
        System.out.println("Tree After deletion");
        obj.deleteNode(head, "Is");
    }
}