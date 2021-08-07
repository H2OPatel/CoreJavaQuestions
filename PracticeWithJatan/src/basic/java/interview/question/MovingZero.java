package basic.java.interview.question;

public class MovingZero {

	public static void main(String[] args) {
		int[] a = {1,0,10,3,6,0,7,9,0,8};
		
		
		//output = {1,10,3,6,7,9,8,0,0,0}
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) {
				for(int j=i; j<a.length-1; j++) {
					a[j] = a[j+1];
				}
				a[a.length-1]=0;
			}
		}
		for(int i : a)
		System.out.println(i);

	}

}
