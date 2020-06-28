package LinkedList;

public class LinkedList {
	Node head;
	Node tail;
	int nodeCount;
	void addnode(Object data)
	{
		Node node;
		if(head==null)
		{
			node=new Node(data);
			head=node;
			tail=node;
			nodeCount++;
		}
		else
		{
			node=new Node(data);
			tail.next=node;
			tail=node;
			nodeCount++;
		}
		Node temp=head;
	}

	void deleteAtIndex(int index) {
		if (index==1) {
			deleteAtFirst();
		} else if (index == nodeCount) {
			deleteAtLast();
		} else {
			System.out.println("deleteAtIndex()");
				Node temp=head;
			if(index==2)
			{
				head.next=head.next.next;
				nodeCount--;
			}
			else{
			for (int j=1;j<=index-2;j++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
			nodeCount--;
		}

	}
	}
	void deleteAtFirst()
	{
		System.out.println("deleteAtFirst()");
		if(nodeCount==1)
		{
			head=null;
			tail=null;
		}
		else{
		head=head.next;
	}


		nodeCount--;

	}
	void deleteAtLast() {
		System.out.println("deleteAtLast()");
		if (nodeCount == 2) {
			tail = head;
			head.next = null;
		} else {
			Node temp=head;
			for(int i=1;i<=nodeCount-2;i++)
			{
				temp=temp.next;
			}
			temp.next=null;
			tail=temp;

			}
		nodeCount--;
		}
	void displayList()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+"\n");
			temp=temp.next;

			
		}
		System.out.println("List size is: " +nodeCount);
	}
	
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.addnode(7);
		l.addnode(8);
		l.addnode(9);
		l.addnode(10);
		l.addnode(11);l.addnode(12);l.addnode(13);l.addnode(14);
		l.deleteAtIndex(5);
		l.deleteAtLast();
		l.deleteAtFirst();
		l.displayList();

	}

}
