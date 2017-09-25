import java.util.Stack;

public class TwoStackQueue {
	static Stack<Integer> mStackPush = new Stack();
	static Stack<Integer> mStackPop = new Stack();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
			push(i);
		}

		System.out.println("mStackPush--" + mStackPush.toString());

		for (int i = 0; i < 1; i++) {
			pop();
		}
		// mStackPush.clear();
		// if (mStackPush.size() <= 0) {
		// while (mStackPop.size() > 0) {
		// mStackPush.push(mStackPop.pop());
		// }
		// }
		// System.out.println("mStackPush--" + mStackPush.toString());
	}

	public static void push(int data) {
		mStackPush.push(data);
	}

	public static int pop() {
		if (mStackPush.isEmpty()) {
			return -1;
		}

		if (mStackPop.size() <= 0) {
			while (mStackPush.size() > 0) {
				int value = mStackPush.peek();
				System.out.println("mStackPush---peek--" + value);
				mStackPop.push(mStackPush.pop());
			}
		}

		if (mStackPop.isEmpty()) {
			System.out.println("mStackPop--is empty");
		} else {
			System.out.println("mStackPop---" + mStackPop.toString());
			int head = mStackPop.pop();
			System.out.println("mStackPop---" + mStackPop.toString() + "---"
					+ head);

			return head;
		}

		return -1;
	}
}
