class LC_707 {

    class Node{

        int val;
        Node next;
        Node prev;

        Node(int val){

            this.val=val;
            this.next=null;
            this.prev=null;
        }
    }

    Node head;

    public MyLinkedList(){

        head=null;
    }

    public int get(int index){

        Node temp=head;

        int count=0;

        while(temp!=null){

            if(count==index){

                return temp.val;
            }

            count++;

            temp=temp.next;
        }

        return -1;
    }

    public void addAtHead(int val){

        Node newNode=new Node(val);

        if(head!=null){

            head.prev=newNode;

            newNode.next=head;
        }

        head=newNode;
    }

    public void addAtTail(int val){

        Node newNode=new Node(val);

        if(head==null){

            head=newNode;

            return;
        }

        Node temp=head;

        while(temp.next!=null){

            temp=temp.next;
        }

        temp.next=newNode;

        newNode.prev=temp;
    }

    public void addAtIndex(int index,int val){

        if(index==0){

            addAtHead(val);

            return;
        }

        Node temp=head;

        int count=0;

        while(temp!=null){

            if(count==index-1){

                break;
            }

            temp=temp.next;

            count++;
        }

        if(temp==null){

            return;
        }

        Node newNode=new Node(val);

        Node nextNode=temp.next;

        temp.next=newNode;

        newNode.prev=temp;

        newNode.next=nextNode;

        if(nextNode!=null){

            nextNode.prev=newNode;
        }
    }

    public void deleteAtIndex(int index){

        if(head==null){

            return;
        }

        if(index==0){

            head=head.next;

            if(head!=null){

                head.prev=null;
            }

            return;
        }

        Node temp=head;

        int count=0;

        while(temp!=null){

            if(count==index){

                break;
            }

            temp=temp.next;

            count++;
        }

        if(temp==null){

            return;
        }

        if(temp.prev!=null){

            temp.prev.next=temp.next;
        }

        if(temp.next!=null){

            temp.next.prev=temp.prev;
        }
    }
}