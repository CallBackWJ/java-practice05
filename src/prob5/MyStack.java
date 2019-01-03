package prob5;

public class MyStack {
	private int top;
	private String[] buffer;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		top=-1;
		buffer=new String[capacity];
	}

	public void push(String s) {
		if(buffer.length==(top+1))
			stackResize();
		buffer[++top]=s;
	}
	
	public void stackResize()
	{
		String[] temp=new String[buffer.length*2];
		
		for(int i=0;i<buffer.length;i++)
		{
			temp[i]=buffer[i];
		}
		buffer=temp;
	}

	public String pop() throws MyStackException {
		
		if(isEmpty()) throw new MyStackException();
		return buffer[top--];
	}

	public boolean isEmpty() {
		return top == -1;
	}
}