package dataStructure.tree;

import java.util.Stack;

public class StackTraversal {
    public void pre(Tree root) {
        Stack<Tree> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Tree curr = stack.pop();
            System.out.print(" " + curr.data);
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
    }

    public void post(Tree root) {

    }

    public void in(Tree root) {
        Stack<Tree> stack = new Stack<>();
        Tree curr = root;

        while (curr != null || stack.size() > 0) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(" " + curr.data);
            curr = curr.right;
        }
    }
}
