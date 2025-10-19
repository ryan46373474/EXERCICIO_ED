package com.example.trees;

public class AVL {
    static class Node {
        int key, height;
        Node left, right;
        Node(int k){ key = k; height = 1; }
    }

    private Node root;

    private int height(Node n){ return n == null ? 0 : n.height; }
    private int balance(Node n){ return n == null ? 0 : height(n.left) - height(n.right); }

    private Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }

    private Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }

    public void insert(int key){ root = insertRec(root, key); }
    private Node insertRec(Node n, int k){
        if(n == null) return new Node(k);
        if(k < n.key) n.left = insertRec(n.left, k);
        else if(k > n.key) n.right = insertRec(n.right, k);
        else return n;
        n.height = 1 + Math.max(height(n.left), height(n.right));
        int b = balance(n);
        if(b > 1 && k < n.left.key) return rightRotate(n);
        if(b < -1 && k > n.right.key) return leftRotate(n);
        if(b > 1 && k > n.left.key){
            n.left = leftRotate(n.left);
            return rightRotate(n);
        }
        if(b < -1 && k < n.right.key){
            n.right = rightRotate(n.right);
            return leftRotate(n);
        }
        return n;
    }

    public void delete(int key){ root = deleteRec(root, key); }
    private Node deleteRec(Node n, int k){
        if(n == null) return null;
        if(k < n.key) n.left = deleteRec(n.left, k);
        else if(k > n.key) n.right = deleteRec(n.right, k);
        else {
            if(n.left == null || n.right == null){
                Node t = (n.left != null) ? n.left : n.right;
                if(t == null) n = null;
                else n = t;
            } else {
                Node succ = minValueNode(n.right);
                n.key = succ.key;
                n.right = deleteRec(n.right, succ.key);
            }
        }
        if(n == null) return n;
        n.height = 1 + Math.max(height(n.left), height(n.right));
        int b = balance(n);
        if(b > 1 && balance(n.left) >= 0) return rightRotate(n);
        if(b > 1 && balance(n.left) < 0){
            n.left = leftRotate(n.left);
            return rightRotate(n);
        }
        if(b < -1 && balance(n.right) <= 0) return leftRotate(n);
        if(b < -1 && balance(n.right) > 0){
            n.right = rightRotate(n.right);
            return leftRotate(n);
        }
        return n;
    }

    private Node minValueNode(Node n){
        Node cur = n;
        while(cur.left != null) cur = cur.left;
        return cur;
    }

    public boolean search(int key){ return searchRec(root, key); }
    private boolean searchRec(Node n, int k){
        if(n == null) return false;
        if(k == n.key) return true;
        return k < n.key ? searchRec(n.left, k) : searchRec(n.right, k);
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
