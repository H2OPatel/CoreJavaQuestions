package basic.java.array;

public class Arrayfreq {

	public static void main(String[] args) {
		
		int[] a = {6,6,5,7,7,7,5,5,5,2,3};
		int[] fr = new int[a.length];
		
		int visited = -1;
		int count;
		for(int i = 0 ; i<a.length;i++) {
			count =1;
			//visited = -1;
			for(int j =(i+1);j<a.length;j++) {
				if(a[i] == a[j]) {
					count++;
					fr[j] =visited;
				}
			}
			
			if(fr[i] != visited) {
				fr[i] = count;
			}
			
				
		}
		
		for(int i = 0; i<fr.length;i++) {
			if(fr[i] != visited) {
				System.out.println("the occurance of the element "+ a[i]+" is "+fr[i]);
			}
		}

	}

}
