package com.example.trees;

public class BST {
    static class Node {
        int key;
        Node left, right;
        Node(int k){ key = k; }
    }

    private Node root;

    public void insert(int key){ root = insertRec(root, key); }
    private Node insertRec(Node n, int k){
        if(n == null) return new Node(k);
        if(k < n.key) n.left = insertRec(n.left, k);
        else if(k > n.key) n.right = insertRec(n.right, k);
        return n;
    }

    public boolean search(int key){ return searchRec(root, key); }
    private boolean searchRec(Node n, int k){
        if(n == null) return false;
        if(k == n.key) return true;
        return k < n.key ? searchRec(n.left, k) : searchRec(n.right, k);
    }

    public void delete(int key){ root = deleteRec(root, key); }
    private Node deleteRec(Node n, int k){
        if(n == null) return null;
        if(k < n.key) n.left = deleteRec(n.left, k);
        else if(k > n.key) n.right = deleteRec(n.right, k);
        else {
            if(n.left == null) return n.right;
            if(n.right == null) return n.left;
            Node succ = minValueNode(n.right);
            n.key = succ.key;
            n.right = deleteRec(n.right, succ.key);
        }
        return n;
    }

    private Node minValueNode(Node n){
        Node cur = n;
        while(cur.left != null) cur = cur.left;
        return cur;
    }

    public void inorder(){ inorderRec(root); System.out.println(); }
    private void inorderRec(Node n){
        if(n != null){
            inorderRec(n.left);
            System.out.print(n.key + " ");
            inorderRec(n.right);
        }
    }
}
