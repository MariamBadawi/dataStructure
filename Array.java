public class Array {
	
	private int s;
	private int l[];
	public Array(int length) {
		l=new int[length];
	}
	public void print() {
		for (int i:l) {
			System.out.println(i);
		}
	}
	public void insert(int element) {
		if(this.l.length==s) {
			int newl[]=new int [s*2];
			for (int i=0;i<s;i++) {
				newl[i]=l[i];
			}
			
			l=newl;
		}
		l[s++]=element;
	}
	public int indexOf(int item) {
		for(int i=0;i<s;i++) {
			if(l[i]==item) 
				return i;
		}
		return -1;
		
	}
