package week1.Assignments;



public class ArmStrong {


	public static void main(String[] args) {

		ArmStrong test1 = new ArmStrong();
		
		 boolean res = test1.isArmStrong(153);
		System.out.println(res);


	}

	public static boolean isArmStrong(long num) {
		 long sum=0,rem;
		 long temp;
	      temp=num;
	      boolean result=false;
	      while(num>0){
	    	  
	        rem=num%10;
	        sum=sum+(rem*rem*rem);
	        num=num/10;
	      }
	      if(temp==sum){
	    	  result = true;
	        return result;
	      }
	      else{
	    	  result = false;
	        return result;
	      }
	}

}
