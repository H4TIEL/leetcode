package com.company;


public class Main {

    public static void main(String[] args) {
        ListNode firstList =  new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode secondList =  new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode mergedList = mergeTwoLists(firstList, secondList);
        while (mergedList.next != null){
            System.out.println(mergedList.val);
            mergedList = mergedList.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while(l1.next != null && l2.next != null){
            if (l1.val <= l2.val){
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        }
        if(l1.next != null) tail.next = l1;
        if(l2.next != null) tail.next = l2;
        return dummy.next;
    }

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}