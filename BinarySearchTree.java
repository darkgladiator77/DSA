/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa6;


public class BinarySearchTree {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    void insert(int data) {
        root = insertNode(root, data);
    }

    Node insertNode(Node root, int data) {
        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insertNode(root.left, data);
        else
            root.right = insertNode(root.right, data);

        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);

        bst.inorder(bst.root);
    }
}
