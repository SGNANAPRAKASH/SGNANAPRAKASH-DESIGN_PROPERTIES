package Task;

public class Calculator implements Interface_Task
{

	public static void main(String[] args) {
		
	}
	public float add(float x, float y) {
	
		return x+y;
	}

	public float sub(float x, float y) {

		return x-y;
	}

	public float mul(float x, float y) {
		
		return x*y;
	}
	
	public float div(float x, float y) {
		
		float ans=0;
		
		try
		{
			ans=x/y;
		}
		catch(Exception obj)
		{
			System.out.println(obj);
		}
		return ans;
	}
}
