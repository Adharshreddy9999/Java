import java.util.*;
public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++; //step 1
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2
        newNode.next=head;
        //step 3
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void addatIndex(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("Linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        return val;
    }
    public int removeLast(){
         if(size==0){
            System.out.println("Linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-3;i++){
            prev=prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }
    public int search(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head,int key){
      if(head==null){
        return -1;
      }  
      if(head.data==key){
        return 0;
      }
      int idx=helper(head.next,key);
      if(idx==-1){
        return -1;
      }
      return idx+1;
    }

    public int recSearch(int key){
        return helper(head,key);

    }
    public void print(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    //slow fast approach
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head==null|| head.next==null){
            return true;
        }
        //find mid
        Node midNode=findMid(head);
        //reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        //check
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String args[]){
        LinkedList l1=new LinkedList();
        System.out.println("Adding numbers at first:");
        l1.addFirst(2);
        l1.addFirst(1);
        l1.print();
        System.out.println("Adding numbers at last:");
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.print();
        System.out.println("Adding number at particular index:");
        l1.addatIndex(2,9);
        l1.print();
        System.out.println("Size of linkedlist: "+l1.size);
        System.out.println("Removing first number:");
        l1.removeFirst();
        l1.print();
        System.out.println("Removing last number:");
        l1.removeLast();
        l1.print();
        System.out.println("Searching for a number:");
        System.out.println("index: "+l1.search(9));
        System.out.println("Searching for a number(recursion):");
        System.out.println("index: " +l1.search(9));
        System.out.println("Reverse order:");
        l1.reverse();
        l1.print();
        System.out.println("Checking whether Linkedlist is palindrome or not :");
        System.out.println(l1.checkPalindrome());
    }
    
}
