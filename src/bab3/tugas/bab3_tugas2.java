/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab3.tugas;

/**
 *
 * @author Aan Bayu Saputra
 */




import java.util.ArrayList;
import java.util.List;

class Stack {
    private final List<Object> list = new ArrayList<>();
    private int currentIndex = -1;

    public void push(Object object) {
        list.add(object);
        currentIndex++;
    }

    public Object pop() {
        if (currentIndex < 0) {
            System.out.println("Stack is empty");
            return null;
        }
        Object object = list.remove(currentIndex);
        currentIndex--;
        return object;
    }

    public int count() {
        return list.size();
    }

    public Object peek() {
        if (currentIndex < 0) {
            System.out.println("Stack is empty");
            return null;
        }
        return list.get(currentIndex);
    }

    public void clear() {
        list.clear();
        currentIndex = -1;
    }
}

public class bab3_tugas2 {
    public static void main(String[] args) {
        System.out.println("Nama : Aan Bayu Saputra");
        System.out.println("NIM  : 32602000004");

        Stack stack = new Stack();
        stack.push("Aan");
        stack.push("Bayu");
        stack.push("Saputra");

        int count = stack.count();
        Object topData = stack.peek();

        System.out.println("Jumlah Data Pada Stack : " + count);
        System.out.println("Data Teratas Pada Stack : " + topData);
        System.out.println("===================================");

        Object poppedData = stack.pop();
        if (poppedData != null) {
            System.out.println("Objek yang dikeluarkan (Pop) : " + poppedData);
        }

        count = stack.count();
        topData = stack.peek();
        System.out.println("Jumlah Data Pada Stack setelah Pop: " + count);
        System.out.println("Data Teratas Pada Stack setelah Pop: " + topData);
    }
}

