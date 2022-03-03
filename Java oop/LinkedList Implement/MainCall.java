package dataStructure.ImpLinkedList;

public class MainCall {
    public static void main(String[] args) {
        Node head = null, n1, n2;
        MyLinkedList node = new MyLinkedList();
        head= node.Insert(34,head);
        head= node.Insert(56, head);
        n2 = node.Insert(100, head);
        head = n2;
        //node.PrintList(head);
        head=node.Prepend(10,head);
        node.PrintList(head);
        head=node.Append(58, head);
        System.out.println();
        node.PrintList(head);
        System.out.println();
        System.out.println(node.Search(3, head));

        head = node.DeleteNode(1,head);
        System.out.println();
        node.PrintList(head);
    }
}
