package Task;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calculator_Test
{
	Calculator obj=new Calculator();
	@Test
	public void add()
	{
		float p=obj.add(98765432f,786653421f);
		//assertEquals(885418853f,p);
	}
	@Test
	public void sub()
	{
		float q=obj.sub(987654332f,876543215f);
	//	assertEquals(111111117f,q);
	}
	@Test
	public void mul()
	{
		float r=obj.mul(8765442765f,9874525635f);
	//	assertEquals(8.65545893e19f,r);
	}
	@Test
	public void div()
	{
		float s=obj.div(877632565f,4572718718f);
	//	assertEquals(0.191927958f,s);
	}
	@Test
	public void add1()
	{
		float p=obj.add(98746.53462f,78665.543421f);
		//assertEquals(885418853f,p);
	}
	@Test
	public void sub1()
	{
		float q=obj.sub(98765.24332f,87654.213215f);
	//	assertEquals(111111117f,q);
	}
	@Test
	public void mul1()
	{
		float r=obj.mul(876544.2765f,987452.5635f);
	//	assertEquals(8.65545893e19f,r);
	}
	@Test
	public void div1()
	{
		float s=obj.div(8776320.565f,45727.18718f);
	//	assertEquals(0.191927958f,s);
	}
	@Test
	public void div2()
	{
		float s=obj.div(7346434564f, 0);
	}
	@Test
	public void sub2()
	{
		float s=obj.sub(0, 0);
	}

}
