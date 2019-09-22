import javax.swing.*;
public  class Piece extends Main{
	/*private JPanel B = super.getBoard();
	private  int S= super.getSource();
	private int D  = super.getDestination();*/
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

	/*public static void main(String [] args)
	{
		Piece obj =new Piece();
		//System.out.println(obj.S);
	}*/
	
  //public boolean isValid(int k);
  //public boolean movesPossible();
}