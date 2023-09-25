package arrays1;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a= {20,10,30,5,25};
		System.out.println("Before Shorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;	
				}
			}
		}
		System.out.println("After Sorting of Arrays");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
