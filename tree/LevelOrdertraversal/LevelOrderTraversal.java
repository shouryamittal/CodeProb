import insert.TreeInsert;
import tree.MyTreeNode;

public class LevelOrderTraversal extends TreeInsert{
    public static void main(String[] args) {
        LevelOrderTraversal itr = new LevelOrderTraversal();
        String arr[] = {"Mannu", "Mittal", "Is", "a", "Good", "Boy"};
        MyTreeNode head = itr.executeTreeOpr(arr);
        itr.printTree(head);
    }
}