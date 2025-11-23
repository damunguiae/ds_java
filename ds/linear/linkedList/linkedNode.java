package ds.linear.linkedList;

public class linkedNode {
    
    private int data;
    private linkedNode next;

    public linkedNode(int data, linkedNode next){
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }   
    public linkedNode getNext() {
        return next;
    }
    public void setNext(linkedNode next) {
        this.next = next;
    }   

}
