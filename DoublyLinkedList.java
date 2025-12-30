/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datasa2;

/**
 *
 * @author Nadeera
 */

 public class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
        Node(int x) {
            data = x;
        }
    }

    Node head;

    void insert(int x) {
        Node n = new Node(x);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = n;
        n.prev = temp;
    }
}
