package cs143;

import java.util.EmptyStackException;

public class Stack<Item> implements StackInterface<Item>{

private class link
{
	private Item data;
	private link next;
	
	public link(Item data, link next)
	{
		this.data = data;
		this.next = next;
		
	}
	
}
private link topStackLink = null;
private int size = 0;

	@Override
	public void push(Item item) {
		topStackLink = new link(item , topStackLink);
		size ++;
		
	}

	@Override
	public void pop() 
	{
	  if (topStackLink == null) 
		  {
		  throw new EmptyStackException();
		  }
	  else
		  {
			  topStackLink = topStackLink.next;
			  size --;
		
			  
		  }
      
	}

	@Override
	public Item top() {
		 
		 if (topStackLink == null) 
		  {
		  throw new EmptyStackException();
		  }else
		  {
		return topStackLink.data;
		  }
		
	}

	@Override
	public Item topAndPop() {
		Item item = top();
		pop();
		return item;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0)
		{
			return true;
		}
		else
		{
		return false;
		}
	}

	@Override
	public void makeEmpty() {
	while (topStackLink != null)
	{
		pop();
	}
		
	}

	@Override
	public int size() {
		return size;
	}

}
