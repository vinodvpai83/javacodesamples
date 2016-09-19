package stackusingarray;

/**
 * Implement a stack using an array
 *
 * @param <E>
 */
public class Stack<E> {
	E[] arr;
	int top = -1;
	int size = 0;
	int capacity;
	
	@SuppressWarnings("unchecked")
	public Stack(int capacity) {
		this.capacity = capacity;
		arr = (E[]) new Object[capacity];
	}
	
	public boolean push(E elem) {
		if(isFull())
			return false;
		arr[top+1] = elem;
		this.top++;
		this.size++;
		return true;
	}
	
	public E pop() {
		if(this.size == 0)
			return null;
		this.size--;
		this.top--;
		E result = arr[top+1];
		arr[top + 1] = null;
		return result;
	}
	
	public E top() {
		return arr[top];
	}
	
	private boolean isFull() {
		return this.size == capacity;
	}
	
	@Override
	public String toString() {
		if(this.size == 0)
			return "";
		
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		for(E elem : arr) {
			sb.append(elem + ", ");
		}
		sb.append("]");
		
		return sb.toString();
	}
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(5);
		stack.push("123");
		stack.push("ABC");
		stack.push("DEF");
		stack.push("333");
		stack.push("XYZ");
		
		System.out.println(stack);
		
		System.out.println("Top: " + stack.top());
		
		System.out.println("Pop: " + stack.pop());
		System.out.println("Pop: " + stack.pop());
		
		System.out.println(stack);
		
		stack.push("LMN");
		stack.push("100");
		System.out.println(stack);
	}

}
