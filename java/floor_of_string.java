import java.util.*;

//Smallest letter grater than target letter letters wrap around
public class Lettergreaterter_then_target_letter {
	public static void main(String[] args) {
	char[] arr= {'d','c','j'};
	char d=ceilingletters(arr,'j');
	System.out.println(d);
	}

		static char ceilingletters(char[] arr,char target)
		{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target>=arr[mid])
				start=mid+1;
			else 
				end=mid-1;	
			}
//		if(start==a.length)
			return arr[start%arr.length];
//		else
//		return a[start];

	}

}
