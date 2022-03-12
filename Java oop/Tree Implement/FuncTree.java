package dataStructure.tree;

public class FuncTree {
    public Tree createNode(int item){
        Tree newNode =new Tree();
        newNode.data = item;
        newNode.left = null;
        newNode.right = null;

        return newNode;
    }
    public void addLeft(Tree node, Tree child){
        node.left = child;
    }
    public void addRight(Tree node, Tree child){
        node.right = child;
    }
    public Tree createTree(){
        Tree root;
        root=createNode(2);
        Tree seven=createNode(7);
        Tree nine=createNode(9);
        addLeft(root, seven);
        addRight(root, nine);

        Tree one=createNode(1);
        Tree six=createNode(6);
        addLeft(seven, one);
        addRight(seven, six);

        Tree five=createNode(5);
        Tree ten=createNode(10);
        addLeft(six, five);
        addRight(six, ten);

        Tree eight = createNode(8);
        addRight(nine, eight);

        Tree three = createNode(3);
        Tree four = createNode(4);
        addLeft(eight,three);
        addRight(eight, four);
        System.out.println();

        return root;
    }
}
