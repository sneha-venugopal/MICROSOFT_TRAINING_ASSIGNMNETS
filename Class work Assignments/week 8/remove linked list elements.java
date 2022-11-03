class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans= new ListNode();
        ListNode cur= ans;
        ListNode temp = head;

        while(temp != null){
            if(temp.val != val){
                cur.next = new ListNode(temp.val);
                cur = cur.next;
            }

            temp= temp.next;
        }

        return ans.next;
    }
}