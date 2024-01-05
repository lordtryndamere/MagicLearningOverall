package com.magic.dsa.exercises;

public class  LinkedList {
    private  Node head;
    private   Node tail;
    private int size;
    //Nested Class
    public class Node {

     public    int value;
      public  Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }


    }

    public  LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void printList() {
        System.out.println(size);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void getHead() {
            System.out.println(head.value);
    }
    public void getTail() {
        System.out.println(tail.value);
    }

    public void getSize() {
        System.out.println(size);
    }

    public void append(int value) {
    Node newNode = new Node(value);
    if(head==null){
        head=newNode;
        tail=newNode;
    }
    tail.next=newNode;
    tail = newNode;
    size++;
    }
    public void prepend(int value) {
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void delete(int value){
        if(size==0){
            return;
        }
        if(value==head.value){
            head=head.next;
            size--;
            return;
        }
        Node temp=head;
        while(temp.next.value!=value){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;

    }

    public Node removeLast(){
        if(size == 0) return  null;
        Node previous = head;
        Node current = head;
        while(current.next != null){
            previous = current;
            current = current.next;
        }

        tail = previous;
        tail.next = null;
        size--;
        if(size == 0){
            head = null;
            tail = null;
        }
        return current;

    }

    public Node removeFirst(){
        if(size == 0) return  null;
        Node current = head;
        head = head.next;
        size--;
        if(size == 0){
            tail = null;
        }
        return current;
    }
    public Node get(int index){
        if(index < 0 || index >= size) return null;
        Node temp = head;
       // int i = 0;
//        while(i< index){
//            temp = temp.next;
//            i++;
//        }
        for (int i = 0; i<index; i++) temp = temp.next;
        return temp;
    }
    public boolean set(int index,int newValue){
        Node temp = get(index);
        if(temp != null){
            temp.value = newValue;
            return  true;
        }
        return false;

    }

    public boolean insert(int index, int value){
        boolean outBoundValidation = index< 0 || index > size;
        boolean prependValidation = index == 0;
        boolean appendValidation = index == size;
        if(outBoundValidation) return  false;
        if(prependValidation){
            prepend(value);
            return  true;
        }
        if(appendValidation){
            append(value);
            return  true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return  true;

    }

    public Node remove(int index){
        boolean outBoundValidation = index< 0 || index > size;
        boolean prependValidation = index == 0;
        boolean appendValidation = index == size-1;
        if(outBoundValidation) return null;
        if(prependValidation) return removeFirst();
        if(appendValidation) return removeLast();
        Node prev = get(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        size--;
        return  temp;
    }

}
