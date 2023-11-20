package LinkedList;

public class ReverseLinkedList_Recursively {
//10->4->3 hear Head will be 4 and head.next will be 3 after reverse method return.
	Node reverse(Node head) {
		if(head==null|| head.next==null){
			return head;
		}
Node NewHead =reverse(head.next);
	Node HeadNext = head.next;
	HeadNext.next=head;
	head.next=null;
	return NewHead;

	}
	public static void main(String[] args) {

	}

}
