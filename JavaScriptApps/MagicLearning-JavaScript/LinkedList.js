

class LinkedList {

     head;
     tail;
     length;
     constructor() {
         this.head = null;
         this.tail = null;
         this.length = 0;


     }
     push(value) {
         let newNode = new Node(value);
         if(!this.head) {
             this.head = newNode;
             this.tail = newNode;
         } else {
             this.tail.next = newNode;
             this.tail = newNode;
         }
         this.length++;
         return this;
     }
     unshift(value) {
         let newNode = new Node(value);
         if(!this.head) {
             this.head = newNode;
             this.tail = newNode;
         } else {
             newNode.next = this.head;
             this.head = newNode;
         }
         this.length++;
         return this;
     }

     printList(){

         let current = this.head;
         while(current) {
             console.log(current.value);
             current = current.next;
         }
     }


}


class Node {

     value;
     next;
     constructor(value) {
         this.value =  value;
         this.next = null;
     }

}

let list = new LinkedList();
list.push(5);
list.push(10);
list.push(15);
list.printList()