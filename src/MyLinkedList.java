public class MyLinkedList <T>{
    private Node<T> head;
    private Node<T> tail;
    public MyLinkedList(){
        this.head=null;
        this.tail = null;
    }
    public void addFirst(T data){
        Node<T> firstnode = new Node<>(data);
        firstnode.next = head;
        head=firstnode;
    }
    public void add(T data){
        Node<T> newNode=new Node<>(data);
       if(head ==null){
           head=tail=newNode;
       }
       else{
           tail.next=newNode;
           tail=newNode;
       }

    }
    public void addLast(T data){
        if(tail == null){
            tail = new Node<T>(data);
            return;
        }
        Node <T> currentnode = tail;
        while(currentnode.next != null){
            currentnode=currentnode.next;
        }
        currentnode.next=new Node<T>(data);

    }
    public int get(T data){
        if(head==null){
            return -1;
        }
        if(head.data==data){
            return 0;
        }
        Node <T> currentNode = head;
        int result =0;
        while(currentNode.next!=null){
            ++result;
            if(currentNode.next.data==data){
                return result;
            }
            currentNode=currentNode.next;
        }
        return -1;
    }
    public void remove(T data){
        if(head ==null){
            return;
        }
        if(head.data==data){
            head=head.next;
            return;
        }
        Node currentNode = head;
        while (currentNode.next!=null){
            if(currentNode.next.data==data){
                currentNode.next=currentNode.next.next;
                return;
            }
            currentNode=currentNode.next;
        }
    }
    private class Node<T>{
        private T data;
        private Node<T> next;
        private Node <T> prev;
        public Node(T data){
            this.data=data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next + "prev="+prev+
                    '}';
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +"prev="+ head.prev+
                '}';
    }
}