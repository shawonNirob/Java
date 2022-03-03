package dataStructure.ImpLinkedList;

import java.security.PublicKey;

public class MyLinkedList {
    public Node CreateNode(int data, Node next){
        Node node =new Node();
        node.val=data;
        node.next=next;
        return node;
    }
    public Node Insert(int data,Node head){
        Node node = CreateNode(data, null);

        if(head==null){
            head=node;
        }else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
        return head;
    }
    public void PrintList(Node head){
        while(head!=null){
            System.out.print(" " +head.val);
            head=head.next;
        }
    }
    public Node Prepend(int data, Node head){
        Node node =CreateNode(data, head);
        return node;
    }
    public Node Append(int data, Node head){
        Node node =CreateNode(data, null);
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=node;
        return head;
    }
    public int Search(int index, Node head){
        int count=0;
        Node curr=head;
        while (curr!=null){
            count++;
            if(count==index){
                return curr.val;
            }
            curr=curr.next;
        }
        return -1;
    }
    public Node DeleteNode(int index, Node head){
        Node node = CreateNode(-101,head);
        int count=0;
        Node curr=head;
        Node prev=node;
        while (curr!=null){
            count++;
            if(count==index){
                prev.next=curr.next;
                break;
            }
            prev=curr;
            curr=curr.next;
        }
        return prev.next;
    }

}
