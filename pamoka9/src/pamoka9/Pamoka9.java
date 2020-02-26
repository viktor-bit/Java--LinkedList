/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pamoka9;

import java.io.*;

/**
 *
 * @author Dell
 */
public class Pamoka9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        MyLinkedList l = new MyLinkedList();
//        l.add("1");
//        l.add("2");
//        l.add("3");
//        l.add("4");
        l.print();
        System.out.println("LinkedList leght = " + l.size());
        System.out.println("LinkedList elementas " + l.get(3));
        l.set("55", 3);
        System.out.println("LinkedList elementas " + l.get(3));
        l.print();
        l.remove(0);
        l.add("F");
        l.print();
        l.remove(1);

        l.print();
        
//        System.out.println(MyLinkedList.class);
//        Object a;
//        a = MyLinkedList.class.getPackage();
//        System.out.println(a);
//        File f = new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\pamoka9\\src\\pamoka9");
//        System.out.println(f);


//
//        try (InputStream  is = new FileInputStream(f)) {
//            int b;
//            while ( (b = is.read())  != -1) {
//                System.out.print(b + " ");
//            }
//        }
    }
}
