package ds;

import ds.linear.linkedList.linkedList;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello, World!");

        linkedList list = new linkedList();
        for(int i=1; i<=5; i++){
            list.add(i*10);
        }
        list.printList();
        

    }
}