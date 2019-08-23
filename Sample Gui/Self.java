import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.TransferHandler;
import java.awt.BorderLayout;
import javax.swing.TransferHandler;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.RepaintManager;
import java.awt.event.MouseEvent;
//import java.awt.event.MouseMotionListner;
public class Self /*extends JFrame*/ implements MouseListener,MouseMotionListener {
	  public JFrame f=new JFrame("Welcome! to chess champ");
	  public JPanel main_gui=new JPanel(new BorderLayout(3,3));
    public JPanel Board = new JPanel (new GridLayout(8,8));
    public JLabel chessPiece;
    public Image image;
    Border thickBorder  = new LineBorder(Color.YELLOW, 5);
    Border thickBorder1  = new LineBorder(Color.RED, 5);
    public ImageIcon gs = new ImageIcon("golden soldier.png");
    public ImageIcon gk = new ImageIcon("golden king.png");
    public ImageIcon gm = new ImageIcon("golden minister.png");
    public ImageIcon ge = new ImageIcon("golden elephant.png");
    public ImageIcon gh = new ImageIcon("golden horse.png");
    public ImageIcon gc = new ImageIcon("golden camel.png");
    public ImageIcon ws = new ImageIcon("white soldier.png");
    public ImageIcon wk = new ImageIcon("white king.png");
    public ImageIcon wm = new ImageIcon("white minister.png");
    public ImageIcon we = new ImageIcon("white elephant.png");
    public ImageIcon wh = new ImageIcon("white horse.png");
    public ImageIcon wc = new ImageIcon("white camel.png");
    //public int x,y; 
    public JLayeredPane layeredPane;
//public DragImage(Image i){
	//image=i;
	//addMouseMotionListener(this);
//}
    static int imageWidth = 60, imageHeight = 60;
  int imageX, imageY;
 /* public Self(Image i) {
    image = i;
    addMouseMotionListener(this);
  }*/
  /*public void mouseDragged(MouseEvent e) {
    imageX = e.getX();
    imageY = e.getY();
    repaint();
  }*/
  /*public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    g2.drawImage(image,this, imageX, imageY);
  }*/

public void Setupgame(){
	for(int i=8;i<=15;i++) {
			  JLabel piece1 = new JLabel(gs);
			  JButton panel1 = (JButton)Board.getComponent(i);
			  panel1.add(piece1);
		  }
    for(int i=48;i<=55;i++) {
			  JLabel piece1= new JLabel(ws);
			  JButton panel1 = (JButton)Board.getComponent(i);
			  panel1.add(piece1);
		  }
          JLabel piece2=new JLabel(gk);
		  JButton panel2=(JButton)Board.getComponent(3);
		  panel2.add(piece2);
		  panel2.revalidate();//to refresh screen
	      //panel2.repaint();//to refresh screen
		  JLabel piece3=new JLabel(gm);
		  JButton panel3=(JButton)Board.getComponent(4);
		  piece3.addMouseListener(new MouseAdapter() {
    @Override
    public void mousePressed(MouseEvent e){
        System.out.println(e.getX()+" "+e.getY());
       // panel3.setBorder(thickBorder1);
        //piece3.setVisible(false);
    }
    public void mouseReleased(MouseEvent e) {
	  
	//panel3.setBorder(null);
}
public void mouseEntered(MouseEvent e) {
       panel3.setBorder(thickBorder);
    }
public void mouseExited(MouseEvent e) {
	panel3.setBorder(null);
}
public void mouseDragged(MouseEvent e) {
    imageX = e.getX();
    imageY = e.getY();
    //repaint();
  }

});
		/*  piece3.addMouseListener(new MouseAdapter() {
    @Override
    /*public void mousePressed(MouseEvent e) {
        System.out.println(e.getX()+" "+e.getY());
        panel3.setBorder(thickBorder);
    }*/
    /*public void mouseReleased(MouseEvent e) {
	   System.out.println("Mouse Released");
	
}
});*/

		  panel3.add(piece3);
		  JLabel piece4=new JLabel(ge);
		  JButton panel4=(JButton)Board.getComponent(0);
          panel4.add(piece4);
          JLabel piece5=new JLabel(ge);
          JButton panel5=(JButton)Board.getComponent(7);
          panel5.add(piece5);
          JLabel piece6=new JLabel(gh);
		  JButton panel6=(JButton)Board.getComponent(1);
		  panel6.add(piece6);
		  JLabel piece7=new JLabel(gh);
		  JButton panel7=(JButton)Board.getComponent(6);
		  panel7.add(piece7);
		  JLabel piece8=new JLabel(gc);
		  JButton panel8=(JButton)Board.getComponent(2);
		  panel8.add(piece8);
		  JLabel piece9=new JLabel(gc);
		  JButton panel9=(JButton)Board.getComponent(5);
		  panel9.add(piece9);
		  JLabel piece1 = new JLabel(wk);
		  JButton panel1 = (JButton)Board.getComponent(60);
		  panel1.add(piece1);
		  JLabel piecea = new JLabel(wm);
		  JButton panela = (JButton)Board.getComponent(59);
		  panela.add(piecea);
		  JLabel pieceb = new JLabel(we);
		  JButton panelb = (JButton)Board.getComponent(63);
		  panelb.add(pieceb);
		  JLabel piecec = new JLabel(we);
		  JButton panelc = (JButton)Board.getComponent(56);
		  panelc.add(piecec);
		  JLabel pieced = new JLabel(wh);
		  JButton paneld = (JButton)Board.getComponent(62);
		  paneld.add(pieced);
		  JLabel piecee = new JLabel(wh);
		  JButton panele = (JButton)Board.getComponent(57);
		  panele.add(piecee);
		  JLabel piecef = new JLabel(wc);
		  JButton panelf = (JButton)Board.getComponent(58);
		  panelf.add(piecef);
		  JLabel pieceg = new JLabel(wc);
		  JButton panelg = (JButton)Board.getComponent(61);
		  panelg.add(pieceg);

         
   }

   public void Draw_grids(){
   	for (int i = 0; i < 64; i++) {
		  JButton square = new JButton(/*new BorderLayout()*/);
		  Board.add(square,SwingConstants.CENTER);
		  int row = (i / 8) % 2;
		  if (row == 0)
		  square.setBackground( i % 2 == 0 ? Color.white : Color.black );
		  else
		  square.setBackground( i % 2 == 0 ? Color.black : Color.white );
		  }
   }
/* @Override
 public void mouseDragged(MouseEvent e){
 	 mx = e.getX();
     my =e.getY();
     mouseDragged=true;
     e.consume();
 }
@Override
public void mouseMoved(MouseEvent e){
  mx = e.getX();
  my =e.getY();
  mouseDragged=false;
  e.consume();
}*/
 public Self(){
 	//Dimension boardsize= new Dimension(800,800);
 	//layeredPane =new JLayeredPane();
 	//getContentPane().add(layeredPane);
 	//layeredPane.setPrefferedSize(boardsize);
 	//layeredPane.addMouseListener(this);
 	//layeredPane.addMouseMotionListner(this);
 	main_gui.setBorder(new EmptyBorder(5,5,5,5));
 	JToolBar tools =new JToolBar();
 	tools.setFloatable(false);
 	main_gui.add(tools,BorderLayout.PAGE_START);
 	JButton b=new JButton("New game");
 	b.setBackground(new Color(204,119,34));
 	b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
             Setupgame();
	  
        }  
    });  
 	tools.add(b);
 	Board.setBorder(new CompoundBorder(new EmptyBorder(5,5,5,5),new LineBorder(new Color(204, 119, 34))));
    Color ochre=new Color(204,119,34);
    Board.setBackground(ochre);
    Draw_grids();
    f.add(main_gui);
    main_gui.add(Board);
    //Board.addMouseListener(this);
    //Board.addMouseMotionListener(this);
    /*String imageFile = "blue King.png";
 	Image image = Toolkit.getDefaultToolkit().getImage(Self.class.getResource(imageFile));
    image = image.getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);
    JButton panelt = (JButton)Board.getComponent(30);*/

    //JLabel piece3 = new JLabel
    //panelt.add(image);
    //layeredPane.add(Board, JLayeredPane.DEFAULT_LAYER);
    f.setSize(800,800);
    f.setResizable(false);
    //f.pack();
    //f.setSize(800,800);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
 public static void main(String [] args){
    new Self();
   // public 
 }
 /*@Override
public void mouseDragged(MouseEvent e) {
	// TODO Auto-generated method stub
	
}*/

@Override
public void mouseMoved(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseDragged(MouseEvent e) {
   
    //repaint();
  }

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}}