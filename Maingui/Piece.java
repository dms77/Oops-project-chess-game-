import javax.swing.*;
public  class Piece extends Main{
	private Main a;
	private int x;
	public Piece(int x)
	{
		this.x=9;
	}
	public void set(Main m)
	{
		this.a = m;
	}
	public int getx()
	{
		return this.x;
	}
System.out.println(x);
}
