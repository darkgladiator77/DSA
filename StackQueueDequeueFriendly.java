/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datasa2;

/**
 *
 * @author Nadeera
 */

import java.util.Stack;

public class StackQueueDequeueFriendly {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        s1.push(x);
    }

    int dequeue() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int val = s2.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return val;
    }
}

