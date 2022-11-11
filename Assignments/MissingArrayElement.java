package week1.Assignments;

import java.util.Arrays;

public class MissingArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MissingArrayElement array=new MissingArrayElement();
     
     int[] a = {1,2,3,4,7,6,8};
     Arrays.sort(a);
     array.miss(a,a.length);
     
	}
	
	public void miss(int a[],int size) {
		
		
		for(int i=0;i<size-1;i++)
		{
			if (a[i]==a[i+1]) {
				continue;
			}
			
			else
			{
				for (int j = a[i] + 1; j < a[i + 1]; j++) {
					System.out.println(j);
			}
		}
			
		
	}

}
}
