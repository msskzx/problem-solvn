package preez.mayhem.implementation;

import java.util.LinkedList;
import java.util.Queue;

public class TreesBFS {

	static Tree x;

	static void bfs() {
		Queue<Node> queue = new LinkedList<>();
		if (x.root != null)
			queue.add(x.root);
		while (!queue.isEmpty()) {
			Node cur = queue.remove();
			System.out.print(cur + ", ");
			if (cur.left != null)
				queue.add(cur.left);
			if (cur.right != null)
				queue.add(cur.right);
		}
	}

	/**
	 * Write a method LinkList path(Object key) that returns a linked list
	 * starting from the root, including all nodes on the path to a certain
	 * target node (with a value key) and including the target node.
	 * 
	 * @param key
	 * @return LinkedList
	 */
	static LinkedList<Node> path(Comparable<Object> key) {
		LinkedList<Node> nodes = new LinkedList<>();
		Node cur = x.root;

		while (cur != null) {
			if (cur.equals(key)) {
				nodes.add(cur);
				return nodes;
			}
			if (cur.data.compareTo(key) < 0)
				cur = cur.left;
			if (cur.data.compareTo(key) > 0)
				cur = cur.right;
		}
		return null;
	}

}

class Node {
	Comparable<Object> data;
	Node left, right;

	@Override
	public String toString() {
		return data.toString();
	}
}

class Tree {
	Node root;
}