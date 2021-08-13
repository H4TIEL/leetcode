from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def delete_duplicates(head: Optional[ListNode]) -> Optional[ListNode]:
    sorted_head = head
    while sorted_head is not None and sorted_head.next is not None:
        if sorted_head.val == sorted_head.next.val:
            sorted_head.next = sorted_head.next.next
        else:
            sorted_head = sorted_head.next
    return head


head_nodes = ListNode(1, ListNode(1, ListNode(2, ListNode(3, ListNode(3)))))
head_solution = delete_duplicates(head_nodes)


while head_solution is not None:
    print(head_solution.val)
    head_solution = head_solution.next