package com.example.trees;

public class App {
    public static void main(String[] args){
        BST bst = new BST();
        int[] b = {1,2,3,10,4,5,9,7,8,6};
        for(int v : b) bst.insert(v);
        System.out.print("BST inorder: "); bst.inorder();

        AVL avl = new AVL();
        int[] a = {1,2,3,10,4,5,9,7,8,6};
        for(int v : a) avl.insert(v);
        System.out.print("AVL inorder: "); avl.inorder();
    }
}
