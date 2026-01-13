/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa4;

public class TowerOfHanoi {

    public static void solve(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println(from + " -> " + to);
            return;
        }

        solve(n - 1, from, aux, to);
        System.out.println(from + " -> " + to);
        solve(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        int n = 3;
        solve(n, 'A', 'C', 'B');
    }
}
