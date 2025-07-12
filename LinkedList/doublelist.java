class node {
    int data;
    node next;
    node prev;

    node ( int data){
        this.data = data;
        this.next = null;
        this.prev = null;

    }
}

public class doublelist {

    node head;

    public void add(int data){
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        node current = head;
        while (current.next!= null) {
            current = current.next;    
        }
        current.next = newnode;
        newnode.prev = current;
    }

    public void inserthead(int data){
        node newnode = new node (data);

        if (head != null){
            newnode.next = head;
            head.prev = newnode;

        }

        head = newnode; 
      
    }

    public void delete(int data){
        if (head == null) return;

        node current = head;

        while (current!= null && current.data != data) {
            current = current.next;     
        }

        if (current == null) return;

        if (current.prev != null ){
            current.prev.next = current.next;

        } else {
            head = current.next;
        }

        if (current.next != null){
            current.next.prev = current.prev;
        }
    }

    public void print(){
        node current = head;
        while (current != null) {
            System.out.println(current.data + "<->") ;
            current = current.next;
        }
        System.out.println("null");
    }

    public void backward(){

        if (head == null) return;
        node current = head;
        while (current != null) { 
            current = current.next;
        }

        while (current != null) { 
            System.out.println(current.data + "<->");
            current = current.prev;
        }
        System.out.println("null");
    }



}

