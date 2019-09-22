import javax.swing.*;
public class King implements PieceType{
	private int source;
    private int dest;
    private JPanel panel;
    public King() {
    	
    }
    public King(int source,int dest,JPanel panel) {
    	this.source=source;
        this.dest=dest;
        this.panel=panel;
    }
	@Override
	public boolean isObstacle(int source, int dest, JPanel board) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isValid(int source, int dest, JPanel board) {
		  if(dest==source+8||dest==source-8||dest==source+9||dest==source+7||dest==source-7||dest==source-9||dest==source+1||dest==source-1)
		         return true;
	 return false;
	}

}
