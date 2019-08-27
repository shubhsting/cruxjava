package ASSIGNMENT1;

import java.util.*;

public class tree {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int[] pre = new int[a];
		int[] in = new int[a];
		for (int i = 0; i < a; i++) {
			pre[i] = scn.nextInt();
		}
		for (int i = 0; i < a; i++) {
			in[i] = scn.nextInt();
		}
		BinaryTree m = new BinaryTree(pre, in);
		System.out.println(m.isTreeBst());
	}

	public static class BinaryTree {
		Scanner scn = new Scanner(System.in);

		private class Node {
			int data;
			Node left;
			Node right;

		}

		private Node root;

		public BinaryTree(int[] pre, int[] in) {
			root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
		}

		private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
			if (plo > phi || ilo > ihi) {
				return null;
			}

			int nel = 0;
			int si = -1;
			Node node = new Node();
			node.data = in[plo];

			for (int i = ilo; i <= ihi; i++) {
				if (in[i] == pre[plo]) {
					si = i;
					break;
				}
				nel++;
			}
			node.left = construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
			node.right = construct(pre, plo + nel + 1, phi, in, si + 1, ihi);

			return node;
		}

		private class BTpair {
			boolean isBST = true;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			Node largestBSTRootNode;
			int size = 0;
		}

		public int isTreeBst() {
			return isTreeBst(root).size;

		}

		private BTpair isTreeBst(Node node) {
			if (node == null) {
				return new BTpair();
			}
			BTpair left = isTreeBst(node.left);
			BTpair right = isTreeBst(node.right);
			BTpair mn = new BTpair();
			mn.max = Math.max(Math.max(left.max, right.max), node.data);
			mn.min = Math.min(Math.min(left.min, right.min), node.data);

			if (left.max < node.data && right.min > node.data && left.isBST && right.isBST) {

				mn.isBST = true;
				mn.largestBSTRootNode = node;
				mn.size = left.size + right.size + 1;
			} else {
				mn.isBST = false;
				mn.size = Math.max(left.size, right.size);
				if (left.size > right.size) {
					mn.largestBSTRootNode = left.largestBSTRootNode;
				} else {
					mn.largestBSTRootNode = right.largestBSTRootNode;

				}
			}
			return mn;

		}
	}
}