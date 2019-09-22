import javax.swing.*;
public class Piece {
	 private int source;
	 private int dest;
	 private JPanel board;
	 private Soldier sol;
	 private Elephant ele;
	 private Camel cam;
	 private King king;
	 private Minister min;
	 private Horse hor;
	 private String t;
	 public Piece() {
	 }
     
     public Piece(int s,int d,JPanel b) {
    	 this.t=null;
    	 this.source=s;
    	 this.dest=d;
    	 this.board=b;
     }
    public String getSourceIconName() {
      JButton k=(JButton)board.getComponent(source);
      if(k.getIcon()!=null) {
    	 t=((ImageIcon)k.getIcon()).getDescription();
      }
	return t;}
     public boolean isValid() {
    	boolean K=false;
    	try {
    	K=getSourceIconName().contains("soldier");}
    	catch(Exception e) {
    		System.out.println("Exception Handled");
    		return false;
    	}
    	if(K) {
    	sol=new Soldier(source,dest,board);
    	return (sol.isValid(source, dest, board));
    }
    	else if(getSourceIconName().contains("elephant")) {
        ele=new Elephant(source,dest,board);
     return(ele.isValid(source, dest, board));
     }
    	else if(getSourceIconName().contains("horse")) {
         hor=new Horse(source,dest,board);
         return(hor.isValid(source, dest, board));
         }
    	
    	else if(getSourceIconName().contains("camel")) {
            cam=new Camel(source,dest,board);
            return(cam.isValid(source, dest, board));}
    	else if(getSourceIconName().contains("king")) {
             king=new King(source,dest,board);
            return(king.isValid(source, dest, board));}
    	else if(getSourceIconName().contains("minister")) {
            min=new Minister(source,dest,board);
           return(min.isValid(source, dest, board));}
    	
    
   return false; 
}
}