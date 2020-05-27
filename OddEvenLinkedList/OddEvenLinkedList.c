#include <stdio.h>
//Definition for singly-linked list.
//Quest- Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
struct ListNode {
    int val;
    struct ListNode *next;
};
struct ListNode* oddEvenList(struct ListNode* head){
        if(head == NULL){
            return NULL;
        }
        if(head->next == NULL){
            return head;
        }
        struct ListNode *odd = head;
        struct ListNode *even = head->next;
        struct ListNode *temp = head->next;
        
        while(odd != NULL && odd->next != NULL && even!=NULL && even->next != NULL) {
            odd->next = odd->next->next;
            odd = odd->next;
            even->next = even->next->next;
            even = even->next;
        }
        
        odd->next = temp;
        return head;
}   