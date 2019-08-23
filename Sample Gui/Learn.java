import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class Learn{
	public  JPanel gui=new JPanel(new BorderLayout(3,3));
	public JPanel Board=new JPanel (new GridLayout(8, 8));
	public void setupgame() {
		  for(int i=8;i<=15;i++) {
			  JLabel piece1 = new JLabel( new ImageIcon("golden soldier.png"));
			  JPanel panel1 = (JPanel)Board.getComponent(i);
			  panel1.add(piece1);
		  }
		  JLabel piece2=new JLabel(new ImageIcon("golden king.png"));
		  JPanel panel2=(JPanel)Board.getComponent(3);
		  MouseListener listener =new DragMouseAdapter();
		  piece2.addMouseListener(listener);
		  panel2.add(piece2);
		  JLabel piece3=new JLabel(new ImageIcon("golden minister.png"));
		  JPanel panel3=(JPanel)Board.getComponent(4);
		  panel3.add(piece3);
		  JLabel piece4=new JLabel(new ImageIcon("golden elephant.png"));
		  JPanel panel4=(JPanel)Board.getComponent(0);
		  panel4.add(piece4);
		  JLabel piece5=new JLabel(new ImageIcon("golden elephant.png"));
		   JPanel panel5=(JPanel)Board.getComponent(7);
		   panel5.add(piece5);
		   JLabel piece6=new JLabel(new ImageIcon("golden horse.png"));
		   JPanel panel6=(JPanel)Board.getComponent(1);
		   panel6.add(piece6);
		   JLabel piece7=new JLabel(new ImageIcon("golden horse.png"));
		   JPanel panel7=(JPanel)Board.getComponent(6);
		   panel7.add(piece7);
		   JLabel piece8=new JLabel(new ImageIcon("golden camel.png"));
		   JPanel panel8=(JPanel)Board.getComponent(2);
		   panel8.add(piece8);
		   JLabel piece9=new JLabel(new ImageIcon("golden camel.png"));
		   JPanel panel9=(JPanel)Board.getComponent(5);
		   panel9.add(piece9);
          


		  for(int i=48;i<=55;i++) {
			  JLabel piece1 = new JLabel(new ImageIcon("blue soldier.png"));
			  JPanel panel1 = (JPanel)Board.getComponent(i);
			  panel1.add(piece1);
		  }
		   JLabel piece1 = new JLabel(new ImageIcon("blue king.png"));
		  JPanel panel1 = (JPanel)Board.getComponent(60);
		  panel1.add(piece1);
		  JLabel piecea = new JLabel(new ImageIcon("blue minister.png"));
		  JPanel panela = (JPanel)Board.getComponent(59);
		  panela.add(piecea);
		  JLabel pieceb = new JLabel(new ImageIcon("blue elephant.png"));
		  JPanel panelb = (JPanel)Board.getComponent(63);
		  panelb.add(pieceb);
		  JLabel piecec = new JLabel(new ImageIcon("blue elephant.png"));
		  JPanel panelc = (JPanel)Board.getComponent(56);
		  panelc.add(piecec);
		  JLabel pieced = new JLabel(new ImageIcon("blue horse.png"));
		  JPanel paneld = (JPanel)Board.getComponent(62);
		  paneld.add(pieced);
		  JLabel piecee = new JLabel(new ImageIcon("blue horse.png"));
		  JPanel panele = (JPanel)Board.getComponent(57);
		  panele.add(piecee);
		  JLabel piecef = new JLabel(new ImageIcon("blue camel.png"));
		  JPanel panelf = (JPanel)Board.getComponent(58);
		  panelf.add(piecef);
		  JLabel pieceg = new JLabel(new ImageIcon("blue camel.png"));
		  JPanel panelg = (JPanel)Board.getComponent(61);
		  panelg.add(pieceg);

		  }
	public Learn(){
		JFrame f=new JFrame("chess");
	 gui.setBorder(new EmptyBorder(5,5,5,5));
	 JToolBar tools =new JToolBar();
	 tools.setFloatable(false);
	 gui.add(tools,BorderLayout.PAGE_START);
	 JButton b =new JButton("New");
	 tools.add(b);
	 b.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){  
		            setupgame();  
		    }  
		    });  
	 Board.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new LineBorder(new Color(204, 119, 34))));
	Color ochre= new Color(204,119,34);
      Board.setBackground(ochre);
	  for (int i = 0; i < 64; i++) {
		  JPanel square = new JPanel(new BorderLayout());
		  Board.add(square,SwingConstants.CENTER);
		  int row = (i / 8) % 2;
		  if (row == 0)
		  square.setBackground( i % 2 == 0 ? Color.white : Color.black );
		  else
		  square.setBackground( i % 2 == 0 ? Color.black : Color.white );
		  }
	  setupgame();
	  f.add(gui);
	  gui.add(Board);
	  f.setSize(800,800);
	  f.setResizable(false);
	  f.setVisible(true);
	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
public static void main(String [] args){
	new Learn();
}
}