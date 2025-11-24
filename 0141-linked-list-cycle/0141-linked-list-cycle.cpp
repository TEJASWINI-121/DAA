/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        set<ListNode *>s;
        ListNode *curr=head;
        while(curr!=NULL){
            if(s.insert(curr).second==false){
                return true;
            }
            curr = curr->next;
        }
        return false;
    }
};