

 /* Definition for singly-linked list.*/
 //Question - Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 //Solution - Just copy the next of node to be deleted in it and delete the next.
 public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
 
class DeleteNodeInLL {
    public void deleteNode(ListNode node) {
        ListNode temp = node.next;
        node.val = node.next.val;
        node.next = node.next.next;
        temp = null;
    }
}