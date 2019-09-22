import javax.swing.*;
import java.lang.Math;
public class Horse implements PieceType {
	private int source;
	private int dest;
	private JPanel panel;
	
	public Horse(int source,int dest,JPanel panel)
	{
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
		JButton b = (JButton)board.getComponent(dest);
        JButton c = (JButton)board.getComponent(source);
        String t = ((ImageIcon)c.getIcon()).getDescription();
        if(Math.abs(source-dest)==17 || Math.abs(source-dest)==15 || Math.abs(source-dest)==10 || Math.abs(source-dest)==6)
        {
        	return true;
        }
		return false;
	}

}
