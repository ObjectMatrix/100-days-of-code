package lrucache;

public class Page {
	public int data;
	public int key;
	public Page next;
	
	public Page(int key, int data) {
		this.data = data;
		this.key = key;
	}
}
