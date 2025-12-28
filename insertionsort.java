package miniproject;

public class insertionsort {
		public static void main(String[]args) {
			int arr[]= {5,6,8,7,-1,9,4,9};
			for(int i=1;i<arr.length;i++) {
			    int k = arr[i];
			    int j=i-1;
			    while(j>=0&&arr[j]>k)
			    {
			        arr[j+1]=arr[j];
			        j--;
			    }
			    arr[j+1]=k;
				 
		}
			for(int num:arr) {
				System.out.println(num);
			}
	}
}
