public class Second extends JPanel implements ActionListner{
	Timer t=new Timer(5,this);
	double x=0,y=0,velX=2,velY=2;
	public void paintCompnent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2= (Graphics2D) g;
		Ellipse2D circle =new Ellipse2D.Double(x,y,40,40);
		g2.fill(circle);
		t.start();
	}
	public void actionPerformed(ActionEvent e){
		x+=velX;
		y+=vely; 
		repaint();
	}
public static void main(String args[]){
	Second s=new Second();
	Jframe f= new Jframe();
	f.add(s);
	f.setVisible(true);
	f.setSize(500,500)
}
}