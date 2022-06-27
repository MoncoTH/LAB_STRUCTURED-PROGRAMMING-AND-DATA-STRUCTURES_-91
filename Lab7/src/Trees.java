	import java.util.*;
	import java.io.*;

	class Trees {

		class Node {
			int key;
			Node left, right;

			public Node(int item) {
				key = item;
				left = right = null;
			}
		}

		Node root;

		Trees() {
			root = null;
		}

		void insert(int key) {
			root = insertRec(root, key);
		}

		Node insertRec(Node root, int key) {

			if (root == null) {
				root = new Node(key);
				return root;
			}

			if (key < root.key)
				root.left = insertRec(root.left, key);
			else if (key > root.key)
				root.right = insertRec(root.right, key);

			return root;
		}

		void inorder() {
			inorderRec(root);
		}

		void inorderRec(Node root) {
			if (root != null) {
				inorderRec(root.left);
				System.out.print(root.key + " ");
				inorderRec(root.right);
			}
		}

		public static void main(String[] args) {
			Trees tree = new Trees();
			int num = 0, i = 0;
			Scanner input = new Scanner(System.in);
			for (i = 1; i <= 10; i++) { // รับค่า10ครั้ง
				System.out.print("Number " + i + " : ");
				num = input.nextInt();
				tree.insert(num);
			}
			System.out.print("Inorder ....\n");
			tree.inorder();
		}
	}