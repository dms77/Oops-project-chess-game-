
public class Driver {
	public Main main;
	public Piece piece;
	public Driver(){
		this.main=new Main();
		this.piece=new Piece();
	}
public static void main(String [] args){
     Driver obj = new Driver();
     obj.main.welcomeScreen();
     //obj.piece.get();
     //System.out.println(obj.main.sol.getx());
 }
}
