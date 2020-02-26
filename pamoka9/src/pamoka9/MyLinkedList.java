/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pamoka9;

/**
 *
 * @author Dell
 */
public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
        head = null;
    }

    public void add(Object ob) {
        Node n = new Node();
        n.value = ob;
        if (head == null) {
            head = n;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = n;
        }
    }

    public int size() {
        Node last = head;
        int i = 0;
        while (last != null) {
            last = last.next;
            i++;
        }
        return i;
    }

    public Object get(int i) {
        Node last = head;
        if (i < 0||i>size()) {
            System.out.println("blogas indeksas");
            return null;
        } else {
            for (int j = 0; j < i; j++) {
                last = last.next;
            }
        }
        return last.value;
    }

    public void set(Object ob, int i) {
        Node last = head;
        if (i > size() || i < 0) {
            System.out.println("blogas indeksas ");
            return;
        } else {
            for (int k = 0; k < i; k++) {
                last = last.next;
            }
            last.value = ob;
        }
    }

    public void remove(int i) {
        Node last = head;
        if (i != 0) {
            if (i > size() || i < 0) {
                System.out.println("blogas indeksas55");
                return;
            } else {
                for (int k = 0; k < i - 1; k++) {
                    last = last.next;
                }
                last.next = last.next.next;
            }
        } else {
            head = head.next;
        }
    }

    void print() {
        Node last = head;
        if(size()==0){
            System.out.println("LinkedList tuscias");
            return;
        }
        while (last != null) {
            System.out.print(last.value + ", ");
            last = last.next;
        }
        System.out.println();

    }
   

    private class Node {

        Node next;
        Object value;
    }
}
