import java.util.Random;
import java.util.Stack;

public class MinStack {

	/**
	 * @param args
	 */

	static Stack<Integer> mStack = new Stack();
	static Stack<Integer> mStackMin = new Stack();

	public static void main(String[] args) {

		int[] s = new int[6];
		s[0] = 12;
		s[1] = 32;
		s[2] = 24;
		s[3] = 14;
		s[4] = 8;
		s[5] = 2;

		// 备用栈冗余存储最小值方法
		// for (int i = 0; i < 6; i++) {
		// push(s[i]);
		// int mini = peekMin();
		// if (!mStackMin.isEmpty() && mini < s[i]) {
		// pushMin(mini);
		// } else {
		// pushMin(s[i]);
		// }
		// }
		//
		// System.out.println("mStack--push-" + mStack.toString());
		// int value = pop();
		// int value1 = popMin();
		// System.out.println("mStack--pop-" + mStack.toString() + "--value--"
		// + value + "--min--pop-" + value1);
		// int num = peek();
		// System.out.println("mStack--peek-" + mStack.toString() + "--num--"
		// + num);
		// int min = peekMin();
		// System.out.println("mStackMin---" + mStackMin.toString() + "--min--"
		// + min);

		// 备用栈去重
		for (int i = 0; i < 6; i++) {
			push(s[i]);
			int mini = peekMin();
			if (mStackMin.isEmpty() || s[i] < mini) {
				pushMin(s[i]);
			}
		}

		System.out.println("mStack--push-" + mStack.toString());
		int num = peek();
		System.out.println("mStack--peek-" + num);
		int min = peekMin();
		System.out.println("mStackMin--peekMin-" + mStackMin.toString() + "--"
				+ num);
		int popValue = pop();
		if (num == min) {
			int v = popMin();
			System.out.println("mStack--pop-" + popValue);
			System.out.println("mStackMin--popMin-" + v);
		}
		int v = peekMin();
		System.out.println("mStackMin--peekMin-" + mStackMin.toString() + "---"
				+ v);
		System.out.println("mStack--" + mStack.toString());
	}

	public static void push(int value) {
		mStack.push(value);
	}

	public static int pop() {
		if (mStack.isEmpty()) {
			return -1;
		}
		int value = mStack.pop();
		return value;
	}

	public static int peek() {
		if (mStack.isEmpty()) {
			return -1;
		}
		int value = mStack.peek();
		return value;
	}

	public static void pushMin(int value) {
		mStackMin.push(value);
	}

	public static int popMin() {
		if (mStackMin.isEmpty()) {
			return -1;
		}
		int value = mStackMin.pop();
		return value;
	}

	public static int peekMin() {
		if (mStackMin.isEmpty()) {
			return -1;
		}
		int value = mStackMin.peek();
		return value;
	}
}
