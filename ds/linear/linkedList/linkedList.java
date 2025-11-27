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

    public linkedNode mergeList(linkedNode list1, linkedNode list2){
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.getData() < list2.getData()){
            list1.setNext(mergeList(list1.getNext(), list2));
            return list1;
        } else {
            list2.setNext(mergeList(list1, list2.getNext()));
            return list2;
        }

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
