public class Driver{
	public Main main;
	public Driver(){
		this.main=new Main();
	}
public static void main(String [] args){
     Driver obj = new Driver();
     obj.main.welcomeScreen();
     System.out.println(obj.main.sol.getx());
 }}