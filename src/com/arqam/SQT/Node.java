package com.arqam.SQT;

 public class Node<T extends Comparable<T>> implements Comparable<T>
{
          T data;
    Node<T> left, right;

    public Node(T data, Node<T>  l, Node<T>  r)
    {
        left = l; right = r;
        this.data = data;
    }

    public Node(T data)
    {
        this(data, null, null);
    }

	 
	public int compareTo(T o) {
		if(data.compareTo(o)==0)
		return 0;
		else if(data.compareTo(o)==1)
			return 1;
		else
			return -1;
	}
	public String toString(){
		return data.toString();
	}

	 

}