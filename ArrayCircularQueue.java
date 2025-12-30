/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datasa2;

/**
 *
 * @author Nadeera
 */

public class ArrayCircularQueue {
    int[] q = new int[5];
    int front = 0, rear = 0;

    void enqueue(int x) {
        q[rear] = x;
        rear = (rear + 1) % 5;
    }

    int dequeue() {
        int val = q[front];
        front = (front + 1) % 5;
        return val;
    }
}
