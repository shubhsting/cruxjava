package july22;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {
	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public BinaryTree() {
		root = construct(null, false);
	}

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

	public BinaryTree(int[] post, int[] in,String s) {
		root = construct1(post, 0, post.length - 1, in, 0, in.length - 1);
	}

	private Node construct1(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {
		if (plo > phi || ilo > ihi) {
			return null;
		}

		int nel = 0;
		int si = -1;
		Node node = new Node();
		node.data = in[phi];

		for (int i = ilo; i <= ihi; i++) {
			if (in[i] == post[phi]) {
				si = i;
				break;
			}
			nel++;
		}
		node.left = construct(post, plo , plo + nel, in, ilo, si - 1);
		node.right = construct(post, plo + nel, phi-1, in, si + 1, ihi);

		return node;
	}

	private Node construct(Node parent, boolean hln) {
		if (parent == null) {
			System.out.println("Enter data of root node ");

		} else {
			if (hln) {
				System.out.println("Enter data of left node of " + parent.data);
			} else {
				System.out.println("Enter data of right node of " + parent.data);
			}
		}
		int item = scn.nextInt();

		Node nn = new Node();

		System.out.println("Does it have left child");
		boolean flag = scn.nextBoolean();
		nn.data = item;
		if (flag) {
			nn.left = construct(nn, true);
		}
		System.out.println("Does it have right child");
		boolean right1 = scn.nextBoolean();
		if (right1)
			nn.right = construct(nn, false);

		return nn;
	}

	public void display() {
		display(root);
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}
		String str = "";
		if ((node.left == null)) {
			str += ".";

		} else {
			str += node.left.data;

		}

		str += "-->" + node.data + "<--";

		if (node.right == null) {
			str += ".";

		} else {
			str += node.right.data;

		}
		System.out.println(str);
		display(node.left);
		display(node.right);

	}

	public int size() {
		return size(root);
	}

	private int size(Node node) {
		if (node == null) {
			return 0;
		}
		int lf = size(node.left);
		int rf = size(node.right);
		return rf + lf + 1;
	}

	public int max() {
		return max(root);
	}

	// O(n)
	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int lm = max(node.left);
		int rm = max(node.right);

		return Math.max(node.data, Math.max(lm, rm));
	}

	public boolean find(int item) {
		return find(root, item);
	}

	// O(n)
	private boolean find(Node node, int item) {

		if (node == null) {
			return false;
		}

		if (node.data == item) {
			return true;
		}
		boolean leftn = find(node.left, item);
		boolean rightn = find(node.right, item);
		return leftn || rightn;
	}

	public int ht() {
		return ht(root);
	}

	// O(n)
	private int ht(Node node) {
		if (node == null) {
			return -1;
		}
		int htl = ht(node.left);
		int rtl = ht(node.right);
		return Math.max(htl, rtl) + 1;
	}

	private class HeapMover {
		int ans;
	}

	public int diameter1() {
		HeapMover mover = new HeapMover();
		diameter1(root, mover);
		return mover.ans;
	}

	private int diameter1(Node node, HeapMover mover) {

		if (node == null) {
			return -1;
		}

		int lh = diameter1(node.left, mover);
		int rh = diameter1(node.right, mover);

		int diameterPresentNode = lh + rh + 2;

		if (diameterPresentNode > mover.ans) {
			mover.ans = diameterPresentNode;
		}

		return Math.max(lh, rh) + 1;

	}

	public int diameter2() {
		return diameter2(root);
	}

	private int diameter2(Node node) {

		if (node == null) {
			return 0;
		}

		int ld = diameter2(node.left);
		int rd = diameter2(node.right);

		int sp = ht(node.left) + ht(node.right) + 2;

		int ans = Math.max(sp, Math.max(ld, rd));

		return ans;

	}

	private class DiaPair {
		int h = -1;
		int d = 0;
	}

	public int diameter3() {
		return diameter3(root).d;
	}

	private DiaPair diameter3(Node node) {
		if (node == null) {
			return new DiaPair();
		}

		DiaPair lft = diameter3(node.left);
		DiaPair rt = diameter3(node.right);

		DiaPair kft = new DiaPair();
		int ld = lft.d;
		int rd = rt.d;

		int sp = lft.h + rt.h + 2;

		kft.d = Math.max(sp, Math.max(ld, rd));

		kft.h = Math.max(lft.h, rt.h) + 1;

		return kft;
	}

	public boolean isBalanced() {

		return isBalanced(root);
	}

	private boolean isBalanced(Node node) {
		if (node == null) {
			return true;
		}
		boolean lft = isBalanced(node.left);
		boolean rt = isBalanced(node.right);

		int sp = ht(node.right) - ht(node.left);
		if ((sp == -1 || sp == 0 || sp == 1) && lft == true && rt == true) {
			return true;
		} else {
			return false;
		}
	}

	private class BalPair {
		boolean b = true;
		int h = -1;
	}

	public boolean isBalanced2() {

		return isBalanced2(root).b;
	}

	private BalPair isBalanced2(Node node) {
		if (node == null) {
			return new BalPair();
		}
		BalPair lbp = isBalanced2(node.left);
		BalPair rbp = isBalanced2(node.right);

		BalPair curr = new BalPair();

		int sp = lbp.h - rbp.h;
		if ((sp == -1 || sp == 0 || sp == 1) && lbp.b == true && rbp.b == true) {
			curr.b = true;
		} else {
			curr.b = false;
		}

		curr.h = Math.max(lbp.h, rbp.h) + 1;
		return curr;
	}

	public boolean FlipEqi(BinaryTree other) {
		return FlipEqi(this.root, other.root);
	}

	private boolean FlipEqi(Node root2, Node root3) {
		if (root2 == null && root3 == null) {
			return true;
		}
		if (root2 == null || root3 == null) {
			return false;
		}
		if (root2.data != root3.data) {
			return false;
		}
		boolean lft2 = FlipEqi(root2.left, root3.left);
		boolean rt2 = FlipEqi(root2.right, root3.right);
		boolean lft3 = FlipEqi(root2.left, root3.right);
		boolean rt3 = FlipEqi(root2.right, root3.left);

		return ((lft2 && rt2) || (lft3 && rt3));

	}

//NLR
	public void preorder() {
		preorder(root);
	}

	private void preorder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);
	}

//LRN
	public void postorder() {
		postorder(root);
	}

	private void postorder(Node node) {
		if (node == null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");
	}

//LNR
	public void inorder() {
		inorder(root);
	}

	private void inorder(Node node) {
		if (node == null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}

	private class Pair {
		Node n;
		boolean sd;
		boolean ld;
		boolean rd;

	}

	public void preorderI() {
		Stack<Pair> stack = new Stack<>();
		Pair startpair = new Pair();
		startpair.n = root;

		stack.push(startpair);
		while (!stack.isEmpty()) {
			Pair newpair = stack.peek();
			if (newpair.sd == false) {
				System.out.print(newpair.n.data + " ");
				newpair.sd = true;
			} else if (newpair.ld == false) {
				Pair k = new Pair();
				k.n = newpair.n.left;

				if (k.n != null)
					stack.push(k);
				newpair.ld = true;
			} else if (newpair.rd == false) {
				Pair l = new Pair();
				l.n = newpair.n.right;

				if (l.n != null)
					stack.push(l);
				newpair.rd = true;
			} else {
				stack.pop();
			}
		}

	}

	static int maxsum = Integer.MIN_VALUE;

	public int maxSubtreeSum() {
		maxSubtreeSum(root);
		return maxsum;
	}

	private int maxSubtreeSum(Node node) {
		if (node == null)
			return 0;
		int ls = maxSubtreeSum(node.left);
		int rs = maxSubtreeSum(node.right);
		int sumtemp = ls + rs + node.data;
		if (sumtemp > maxsum) {
			maxsum = sumtemp;
		}
		return sumtemp;
	}

	private class SubTreePair {
		int entireSum = 0;
		int maxSum = Integer.MIN_VALUE;
	}

	public int maxSubtreeSum2() {
		return maxSubtreeSum2(root).maxSum;
	}

	private SubTreePair maxSubtreeSum2(Node node) {
		if (node == null)
			return new SubTreePair();
		SubTreePair ls = maxSubtreeSum2(node.left);
		SubTreePair rs = maxSubtreeSum2(node.right);
		SubTreePair res = new SubTreePair();
		res.entireSum = ls.entireSum + rs.entireSum + node.data;
		res.maxSum = Math.max(ls.maxSum, Math.max(rs.maxSum, res.entireSum));
		return res;
	}

	private class BTpair {
		boolean isBST = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		Node largestBSTRootNode;
		int size = 0;
	}

	public boolean isTreeBst() {
		System.out.println(isTreeBst(root).size);
		System.out.println(isTreeBst(root).largestBSTRootNode.data);
		return isTreeBst(root).isBST;
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

	private class VOPair implements Comparable<VOPair> {
		int val;
		int hlevel;
		int vlevel;

		public VOPair(int val, int hlevel, int vlevel) {
			this.val = val;
			this.hlevel = hlevel;
			this.vlevel = vlevel;
		}

		@Override
		public String toString() {
			return val + "";
		}

		@Override
		public int compareTo(VOPair o) {
			return this.hlevel - o.hlevel;
		}
	}

	public void verticalDisplay() {
		HashMap<Integer, ArrayList<VOPair>> map = new HashMap<>();

		verticalDisplay(root, map, 0, 0);

		// keys sort
		ArrayList<Integer> allkeys = new ArrayList<>(map.keySet());
		Collections.sort(allkeys);

		// loop on all keys
		for (int key : allkeys) {

			// array list sort
			ArrayList<VOPair> list = map.get(key);
			Collections.sort(list);

			System.out.println(key + " -> " + list);
		}

		System.out.println(map);

	}

	private void verticalDisplay(Node node, HashMap<Integer, ArrayList<VOPair>> map, int hl, int vl) {

		if (node == null) {
			return;
		}

		if (!map.containsKey(vl)) {
			map.put(vl, new ArrayList<>());
		}

		VOPair np = new VOPair(node.data, hl, vl);
		map.get(vl).add(np);

		verticalDisplay(node.left, map, hl + 1, vl - 1);
		verticalDisplay(node.right, map, hl + 1, vl + 1);

	}

}
