package problems;


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode resultList = new ListNode(0);

        ListNode headNode = resultList;

        while (true) {

            if(list1 == null){
                resultList.next = list2;
                break;
            }
            if(list2 == null){
                resultList.next = list1;
                break;
            }
            if(list1.val <list2.val){
                resultList.next = list1;
                list1 = list1.next;
            } else {
                resultList.next = list2;
                list2 = list2.next;
            }
            resultList = resultList.next;


        }

        return headNode.next;

    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(-9, new ListNode(3));
        ListNode list2 = new ListNode(5, new ListNode(7));

        Solution solution = new Solution();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }

}