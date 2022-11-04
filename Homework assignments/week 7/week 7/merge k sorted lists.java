 class Solution {
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        return RecursiveMerge(lists,0,lists.length-1);
    }
    
    public static ListNode RecursiveMerge(ListNode[] lists, int start, int end){
        if(start == end)
            return lists[start];
        if(end - start == 1)
            return mergeTwoLists(lists[start], lists[end]);
        int mid = (start + end) / 2;
        ListNode left = RecursiveMerge(lists, start, mid);
        ListNode right = RecursiveMerge(lists, mid + 1, end);
        return mergeTwoLists(left,right);

    }
    
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode newHead = head;
        recursiveSort(newHead,list1,list2);
        return head.next;
    }
    
    public static void recursiveSort(ListNode head, ListNode list1, ListNode list2){
          if(list1 == null){
              head.next = list2;
              return;
          }
          if(list2 == null){
              head.next = list1;
              return;
          }
          
          if(list1.val < list2.val){
              head.next = list1;
              recursiveSort(head.next,list1.next,list2);
          }
          else{
              head.next = list2;
              recursiveSort(head.next, list1, list2.next);
          }
    }
}