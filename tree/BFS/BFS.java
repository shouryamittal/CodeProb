import tree.MyTreeNode;
import insert.TreeInsert;

public class BFS extends TreeInsert {
    void bfs(MyTreeNode head) {
        list.add(head);
        while(list.size() > 0) {
            MyTreeNode temp = list.poll();
            if(temp != null) {
                System.out.println(temp.data);
                list.add(temp.left);
                list.add(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        BFS obj = new BFS();
        String arr[] = {"Shourya", "Mittal", "Is", "a", "Good", "Boy"};
        MyTreeNode head = obj.executeTreeOpr(arr);
        obj.list.clear();
        obj.bfs(head);      
    }
}