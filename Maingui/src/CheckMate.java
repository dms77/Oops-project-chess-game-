import javax.swing.*;
public class CheckMate {
    private JPanel board;
    private JFrame f;
   public CheckMate(JPanel board,JFrame f) {
	   this.board=board;
	   this.f=f;
   }
  private boolean isWhiteKingAlive() {
	  for(int i=0;i<64;i++) {
		  JButton B=(JButton)board.getComponent(i);
		  if(B.getIcon()!=null) {
			  if(((ImageIcon)B.getIcon()).getDescription().contains("white king")) {
				  return true;
			  }
		  }
	  }
	  return false;
  }
  private boolean isGoldKingAlive(){
	  for(int i=0;i<64;i++) {
		  JButton B=(JButton)board.getComponent(i);
		  if(B.getIcon()!=null) {
			  if(((ImageIcon)B.getIcon()).getDescription().contains("golden king")) {
				  return true;
			  }
		  }
	  }
	  return false;
  }
  public boolean checkForCheckMate() {
	  if(!isGoldKingAlive()) {
		  JOptionPane.showMessageDialog(f, 
                  "White Army Own the Game", 
                  "Game Over", 
                  JOptionPane.WARNING_MESSAGE);
		  return true;
	  }
	  if(!isWhiteKingAlive()) {
		  JOptionPane.showMessageDialog(f, 
                  "Gold Army Own the Game", 
                  "Game Over", 
                  JOptionPane.WARNING_MESSAGE);
		  return true;
	  }
	  return false;
	  
  }
}
