package dataStructure.tree;

public class PrintTree {
    public void preOrder(Tree root){
        System.out.print(" " +root.data);
        if(root.left!=null){
            preOrder(root.left);
        }
        if(root.right!=null){
            preOrder(root.right);
        }
    }
    public void postOrder(Tree root){
        if(root.left!=null){
            postOrder(root.left);
        }
        if(root.right!=null){
            postOrder(root.right);
        }
        System.out.print(" " +root.data);
    }
    public void inOrder(Tree root){
        if(root.left!=null){
            inOrder(root.left);
        }
        System.out.print(" " + root.data);
        if(root.right!=null){
            inOrder(root.right);
        }
    }
}
