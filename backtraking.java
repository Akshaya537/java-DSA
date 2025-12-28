package miniproject;

public class backtrackinfg {
	static void subset(int []a,int index,int sum,int target,String p) {
		if(sum==target) {
			System.out.println(p);
			return;
		}
		if(index==a.length||sum>target)
		return;
		subset(a,index+1,sum+a[index],target,p+a[index]+" ");
		subset(a,index+1,sum,target,p);
	
	}
	public static void main(String[] arg) {
		int []a= {3,4,2,6,7,2};
		int target=8;
		subset(a,0,0,target,"");
		}
}
