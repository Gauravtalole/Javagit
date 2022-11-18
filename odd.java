package EvenorOdd;

public class even {
	int a=3;
	void Even()
	{
		if(a%2!==0)
		{
			System.out.println("Number is odd");
		}
		else
		{
			System.out.println("Number is even");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		even e=new even();
		e.Even();

	}

}
