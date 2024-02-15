package lesson8.GenericLinked;

public class GenericLinkedList<T> {
    private Node<T> head;

    //Inner class Node
    private static class Node<T>{
        T data;
        Node<T> next;
    
        //Node constructor
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    //to add new element
    public void add(T item){
        Node<T> newNode = new Node<>(item);
        if(head == null){
            head = newNode;
        }else{
            Node<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(T item){
        if(head == null){
            return; //return if the list is empty
        }

        if(head.data.equals(item)){
            head = head.next;
            return;
        }

        Node<T> current = head;
        while(current.next != null && !current.next.data.equals(item)){
            current = current.next; //assign current to the next node in line
        }

        if(current.next != null){
            //execute if the node to be deleted is found
            current.next = current.next.next;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }
}

