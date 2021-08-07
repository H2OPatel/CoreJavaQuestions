package basic.java.interview.question;
/* count = 0, as is
 * 1, 10, 10, 3, ..., count = 1
 * 1, 10, 3, 3, 6..., count = 2
 * 1, 10, 3, 6, 6....., count = 3
 * 1, 10, 3, 6, 7, 0, 7, 9, 0, 8 ; count = 4
 * 1, 10, 3, 6, 7, 9, 7, 9, 0, 8; count = 5
 * 1, 10, 3, 6, 7, 9, 8, 9, 0, 8; count = 6;
 * 
 * 
 * 1, 10, 3, 6, 7, 7, 9, 0, 8
 * 
 * count = 0;
 * i-> 0 to a.length {
 *  if(a[i]!=0){
 *  	a[count] = a[i];
 *  	count++;
 *   }
 *  }
 *  we got count of non zeros and arranged them in the array at proper place, now the remaining elements are zeros.
 *  while(count<a.length){
 * 		a[count] = 0
 * 		count++; 
 * }
 * n+n = 2n = O(n)
 * for{
 * 	for{
 * 	}
 * }
 * n*n + n = n^2 = O(n^2)
 * n*logn + n = O(nlogn)
 */
/*
 * i = 0, a[i] = 1
 * i = 1, a[i] = 0
 * j = 1 to n-1 -> a[j] = a[j+1]
 * a[n] = 0;
 * 1, 10, 3, 6 , 0, 7, 9, 0, 8, 0
 * i = 2, 3
 * i = 4
 *  1, 10, 3, 6, 7, 9, 0, 8, 0, 0
 *  ... 
 * 
 */


public class MovingZeroAlt {

	public static void main(String[] args) {

		int[] a = {1,0,10,3,6,0,7,9,0,8};
		
		int count =0;
		
		for(int i = 0; i<a.length; i++) {
			if(a[i]!=0){
				a[count] = a[i];
				count++;
			}
		}
		while(count<=a.length-1) {
			a[count]=0;
			count++;
		}
		for(int i : a) {
			System.out.print(i + " ");
		}
		
	}

}
