package basic.java.array;

public class PrintDuplicate {

	public static void main(String[] args) {
	
		int[] a = new int[]{1,2,2,2,4,4,7,7,7,7,9,6};
		int[] fr = new int[a.length];
		int visited = -1;
		for (int i=0;i<a.length;i++) {
			int count =1;
		for(int j= i+1;j<a.length;j++) {
			if(a[i] == a[j]) {
				count++;
				fr[j] = visited;
			}
		} if(fr[i] != visited) {
			fr[i] = count;	
		}
		}
		for(int i = 0; i<fr.length; i++) {
			if(a[i] != visited) {
				System.out.println("value of this element is : "+ a[i] + " and it has been repeated " + fr[i] + " times");
				}
			}
		
	}

}
