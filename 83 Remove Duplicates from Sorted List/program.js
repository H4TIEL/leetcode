class ListNode
{
     constructor(val, next = null)
     {
          this.val = val
          this.next = next === undefined ? null : next
     }
}


/**
 * 
 * @param {ListNode} head 
 * @returns {ListNode}
 */
let deleteDuplicates = function (head)
{

     let current = head;
     while (current && current.next)
     {
          if (current.val === current.next.val)
          {
               current.next = current.next.next;
          } else
          {
               current = current.next;
          }
     }
     return head;
};


let head = new ListNode(1, new ListNode(1, new ListNode(2)));
deleteDuplicates(head)
while (head)
{
     console.log(head.val);
     head = head.next;
}
