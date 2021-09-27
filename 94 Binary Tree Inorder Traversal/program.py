from typing import Optional


class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def inorder_traversal(root: Optional[TreeNode]) -> []:
    """
    :type root: TreeNode
    :rtype: List[int]
    """
    traversal = []
    if root is None or root.val is None:
        return traversal

    if root.left is not None:
        if type(root.left) == TreeNode:
            left = inorder_traversal(root.left)
            traversal += left
        else:
            traversal.append(root.left)

    traversal.append(root.val)

    if root.right is not None:
        if type(root.right) == TreeNode:
            right = inorder_traversal(root.right)
            traversal += right
        else:
            traversal.append(root.right)

    return traversal

