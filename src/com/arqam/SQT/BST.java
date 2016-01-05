package com.arqam.SQT;
import java.util.Scanner;

/**
 * Created by Arqam on 12/20/2015.
 */
public class BST<T extends Comparable<T>>  { 
	
protected Node<T>  root;
    public BST() {
        root = null;
    }
    public void printBST (){
        System.out.print("1 - InOrder\n2 - PreOrder\n3 - PostOrder\nEnter your choice  --->>>      ");
        Scanner input = new Scanner(System.in);
        int choice;
        try {
            choice = input.nextInt();
        }
        catch (Exception e){
            choice=0;
        }
        switch ( choice){
            case 1:
                inorder(root);
                break;
            case 2:
                preorder(root);
                break;
            case 3:
                postorder(root);
                break;
            default:
                System.out.print("\n\n\t\tInvalid input\n\n");
        }
    }

    public boolean isEmpty(){
        return root==null;
    }


    public Node<T> search(T t) {
        Node<T> p=root;
        while (p != null)
            if (p.compareTo(t)==0)
                return p;
            else if (p.compareTo(t)==1)
                p = p.left;
            else 
            	p = p.right;
        return null;
    }
    public void preorder() {
    	preorder(root);
    }
    public void preorder(Node<T>  p) {
        if (p != null) {
            System.out.print(p.data+" ");
            preorder(p.left);
            preorder(p.right);
        }
    }
    public void inorder() {
    	inorder(root);
    }
    public void inorder(Node<T>  p) {
        if (p != null) {
            inorder(p.left);
            System.out.print(p.data+" ");
            inorder(p.right);
        }
    }
    public void postorder() {
    	postorder(root);
    }
    public void postorder(Node<T>  p) {
        if (p != null) {
            postorder(p.left);
            postorder(p.right);
            System.out.print(p.data+" ");
        }
    }
    public void insert(T el) {
        Node<T>  p = root, prev = null;
        while (p != null) {
            prev = p;
            if (p.compareTo(el)==-1)
                p = p.right;
            else p = p.left;
        }
        if (root == null) // tree is empty;
            root = new Node<T>(el);
        else if (prev.compareTo(el)==-1)
            prev.right = new Node<T>(el);
        else prev.left = new Node<T>(el);
    }
    public T deleteNode(T el) {
        Node<T> tmp=null, node, p = root, prev = null;
        T delitem;
        while (p != null && p.data != el) {
            prev = p;
            if (p.compareTo(el)==-1)
                p = p.right;
            else p = p.left;
        }
        node = p;
        delitem=p.data;
        if (p != null && p.data == el) {
            if (node.right == null) // node has no right child: its left
                node = node.left; // child (if any) is attached to its
// parent;
            else if (node.left == null) // node has no left child: its right
                node = node.right; // child is attached to its parent;
            else { // be ready for merging subtrees;
                tmp = node.left; // 1. move left
                while (tmp.right != null) // 2. and then right as far as
                    tmp = tmp.right; // possible;
                tmp.right = // 3. establish the link between
                        node.right; // the rightmost node of the left
// subtree and the right subtree;
                node = node.left; // 4.
            }
            if (p == root)
                root = node;
            else if (prev.left == p)
                prev.left = node;
            else prev.right = node; // 5.
        }
        else if (root != null)
            System.out.println("key " + el + " is not in the tree");
        else System.out.println("the tree is empty");
		return delitem;
    }
}
