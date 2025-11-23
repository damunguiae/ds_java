package ds.linear.linkedList;

public class linkedList {

    private linkedNode head;
    private int size  = 0;

    public linkedList(){
    }

    public void  add(int value){
        if(this.head==null){
            this.head = new linkedNode(value, null);
            this.size++;
            return;
        }
        linkedNode currentNode = this.head;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(new linkedNode(value, null));
        this.size++;
    }

    public void printList(){
        linkedNode currentNode = this.head;
        while(currentNode != null){
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }

    public int getSize(){
        return this.size;
    }   
    
}
