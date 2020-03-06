package collectionframework;

public class Linkedlist {

	Node head;
	public void insert(int data)
	{
		Node node= new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else 
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	public void print()
	{
		Node node=head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	public void fetch(int index)
	{
		Node n=head;
		for(int i=0;i<=index;i++)
		{
			if(i==index)
			{
				System.out.print("Fetched value:"+(n.data));
			}
			else
			{
				n=n.next;
			}
		}
	}
	public void addAtStart(int data)
	{
		Node node= new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
	}
	public void add(int index,int data)
	{
		Node node= new Node();
		node.data=data;
		node.next=null;
		Node n=head;
		if(index==0)
		{
			addAtStart(data);
		}
		else
		{
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
	}
	public void delete(int index)
	{
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			Node n=head;
			Node n1=null;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			System.out.print("The deleted element:"+n1.data);
		}
	}
}