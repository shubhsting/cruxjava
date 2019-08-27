package july22;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// 60 true 40 true 20 false false true 50 false true 55 false false true 80 false true 90 false false
	 
		// 1 true 4 false false true -5 false false true -3 true -4 false false true 5 true 6 false false true 7 false false
		// 100 true 50 true 5 false false true 60 true 55 false false true 70 false false true 200 true 250 false false true 300 true 250 false false true 400 true 350 false false true 500 false false 

		int[] in = { 1,2,3};
		int[] pre = { 1,3,2};
		BinaryTree m = new BinaryTree(in,pre,"");
		//System.out.println(m.isTreeBst());
		//System.out.println(m.diameter1());
		m.display();
		//BinaryTree m2 = new BinaryTree();

//
//		System.out.println(m.find(30));
//		System.out.println(m.ht());
//		System.out.println(m.max());
//		System.out.println(m.size());
//		System.out.println(m.diameter3());
		// System.out.println(m.isBalanced());
		// System.out.println(m.FlipEqi(m2));
//		m.preorder();
//		System.out.println();
//		m.preorderI();
//		System.out.println(m2.isTreeBst());
		// System.out.println(m.maxSubtreeSum());
		// System.out.println(m.maxSubtreeSum2());
	}

}
