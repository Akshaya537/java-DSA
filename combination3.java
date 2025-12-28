package miniproject;

public class combination3 {
	static void combination(int[] a,int index,int k,int target,String p) 
	{
		if(target==0&&k==0) {
			System.out.println(p);
			return;
		}
		if(target<0) 
			return;
		for(int i=index;i<9;i++)
		{
		combination(a,index+1,k-1,target-a[i],p+a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int []a= {2,4,8,7,6,1};
		int target=6;
		int k=2;
		combination(a,0,k,target,"");
		}
}
