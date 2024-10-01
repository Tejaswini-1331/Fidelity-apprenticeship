package Day7.LinkedList;
public class Main {

    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    static class Linkedlist{
        Node head;
        Node tail;
        int size=0;

        //displaying node
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void insert(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next = newNode;
                tail=newNode;
            }
            size++;
        }

        public void addfirst(int data){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next = head;
                head=temp;
            }
        }

        public void addlast(int data){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next = temp;
                tail=temp;
            }
            size++;
        }

        public void addAt(int data, int pos){
            Node newnode = new Node(data);
            Node temp = head;
            if(pos==0){
              addfirst(data);
            }
            else if(pos==size){
                addlast(data);
            }
            else{
                for(int i=0;i<pos;i++){
                    temp=temp.next;
                }
                newnode.next=temp.next;
                temp.next=newnode;
            }
            size++;
        }
        public void reverse(){
            Node prev=null, curr=head, next;
            while(curr!=null){
                next =curr.next;

                curr.next =prev;
                prev=curr;
                curr =next;

            }
            head = prev;
        }
    }


    public static void main(String[] args) {
        Linkedlist a = new Linkedlist();
        a.insert(10); a.insert(20); a.insert(30); a.insert(40);
        a.display();
        a.reverse();
        a.display();

    }
}
