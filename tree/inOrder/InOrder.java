import tree.MyTreeNode;
import insert.TreeInsert;
import java.util.Stack;

public class InOrder extends TreeInsert{

    void findInOrder(MyTreeNode head) {
        Stack<MyTreeNode> stack = new Stack<MyTreeNode>();
        MyTreeNode current = head;
        while(current != null || stack.size() > 0) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.println(current.data);
            current = current.right;
        }
    }
    public static void main(String[] args) {
       InOrder obj = new InOrder();
       String arr[] = {"Shourya", "Mittal", "Is", "a", "Good", "Boy"};
       MyTreeNode head = obj.executeTreeOpr(arr);
       obj.findInOrder(head);
   } 
}