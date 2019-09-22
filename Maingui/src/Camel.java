import javax.swing.*;
public class Camel implements PieceType {
	private int source;
    private int dest;
    private JPanel panel;
    public Camel(int source,int dest, JPanel panel) {
    	this.source=source;
        this.dest=dest;
        this.panel=panel;
    }
	@Override
	public boolean isObstacle(int source, int dest, JPanel board) {
		int a=Math.abs((source/8)-(dest/8));
		int c = source%8;
		int d = dest%8;
		int m = Math.min(source,dest);
		int k= Math.max(source,dest);
		System.out.println(m%8);
		System.out.println(k%8);
		if(m%8>k%8)
		{
			for(int i=1;i<a;i++)
			{
				JButton x = (JButton)board.getComponent(m+i*8-i);
				//System.out.println(m);
				//System.out.println(m+i*8-i);
				if(x.getIcon()!=null)
				{
					return false;
				}
			}
		}
		else
		{
			for(int i=1;i<a;i++)
			{
				JButton x = (JButton)board.getComponent(m+i*8+i);
				//System.out.println(m+i*8+i);
				//System.out.println(m);
				if(x.getIcon()!=null)
				{
					return false;
				}
			}
			
		}
		return true;
		
		// TODO Auto-generated method stub
	
	}

	@Override
	public boolean isValid(int source, int dest, JPanel board) {
		int a=Math.abs(source/8-dest/8);
		int c = source%8;
		int d = dest%8;
		if(Math.abs(c-d)==a && isObstacle(source,dest,board))
		{
			return true;
		}
		return false;
	}
   
}
