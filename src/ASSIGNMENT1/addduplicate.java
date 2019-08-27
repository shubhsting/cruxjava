package ASSIGNMENT1;

import java.util.*;
public class addduplicate {
	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root;
	private int size;

	public addduplicate() {
		this.root = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void add(int data) {
		this.add(data, this.root);
	}

	private void add(int data, Node node) {
		if (this.isEmpty()) {
			Node n = new Node(data, null, null);
			this.size++;
			this.root = n;
			return;
		} else {
			if (data > node.data && node.right == null) {
				Node n = new Node(data, null, null);
				this.size++;
				node.right = n;
			}
			
			else if (data == node.data && node.left != null) {
				Node n = new Node(data, null, null);
				this.size++;
				n.left=node.left;
				node.left = n;
			}
			else if (data <= node.data && node.left == null) {
				Node n = new Node(data, null, null);
				this.size++;
				node.left = n;
			}
			else if (data > node.data) {
				add(data, node.right);
			} else if (data < node.data) {
				add(data, node.left);
			}
		}
	}

	public void display() {
		this.display(this.root);
	}

//        public void remove(int data) {
//		this.root = this.remove(this.root, data);
//	}

//	private Node remove(Node node, int data) {
//		if (node == null) {
//			return null;
//		}
//		if (data < node.data) {
//			node.left = this.remove(node.left, data);
//			return node;
//		} else if (data > node.data) {
//			node.right = this.remove(node.right, data);
//			return node;
//		} else {
//			if (node.left == null && node.right == null) {
//				this.size--;
//				return null;
//			} else if (node.left == null) {
//				this.size--;
//				return node.right;
//			} else if (node.right == null) {
//				this.size--;
//				return node.left;
//			} else {
//				int lmax = this.max(node.left);
//				node.data = lmax;
//				node.left = this.remove(node.left, lmax);
//				return node;
//			}
//		}
//	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + " => ");
		} else {
			System.out.print("END => ");
		}
		System.out.print(node.data);
		if (node.right != null) {
			System.out.print(" <= " + node.right.data);
		} else {
			System.out.print(" <= END");
		}
		System.out.println();
		if (node.left != null) {
			display(node.left);
		}
		if (node.right != null) {
			display(node.right);
		}
	}	
	public void duplicate() {
	        this.duplicate(this.root);
	    }

	    private void duplicate(Node node) {
	        if(node==null){
	            return;
	        }
                
                duplicate(node.left);
                duplicate(node.right);
                int data =node.data;
                this.add(data);
	    }
	    
	    public static void main (String[] args) {
	        addduplicate bst=new addduplicate();
            Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        for(int i=0;i<n;i++){
	           bst.add(s.nextInt()); 
	        }
		    bst.duplicate();
		    bst.display();
	    }
}
