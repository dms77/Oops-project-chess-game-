import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.event.MouseEvent;
import java.lang.Math;
public class Main implements ActionListener{
      private JFrame f;
      private JFrame f2;
      private JFrame f3;
      private JPanel main_gui;
      private JPanel board;
      private JPanel extra;
      private JPanel p;
      private Border thinBorder;
      private Border thinBorder2;
      private Border thinBorder3;
      private JButton [][] squares;
      private JToolBar tools;
      private JButton home;
      private JButton resetgame;
      private JLabel text;
      private JLabel text1;
      private String message;
      private Image img;
      private Image img2;
      private JButton B1;
      private JButton B2;
      private JButton B3;
      private int req;
      private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32;
      private Icon[][] pieces;
      private Icon I;
      private String icon_name;
      private boolean Y;
      private JLabel p1;
      private JLabel p2;
      private boolean white;
      private JLabel turn;
      private String player;
 /*By providing a private constructor you prevent class instances from being created in any place other than this very class.*/
  public Main(){
  	f=new JFrame("CHESSMATES");
  	f2=new JFrame("Welcome to CHESSMATES");
  	f3=new JFrame("Rules Page");
  	player=new String("White");
  	main_gui=new JPanel(new BorderLayout(0,0));
  	board = new JPanel (new GridLayout(8,8));
  	extra=new JPanel(new FlowLayout());//to disable auto resizing of JComponents
  	board.setPreferredSize(new Dimension(800, 800));
  	thinBorder = new LineBorder(Color.YELLOW, 5);
    squares = new JButton [8][8];
    tools=new JToolBar();
    home =new JButton("Home");
    home.addActionListener(this);
    resetgame=new JButton("Reset game");
    resetgame.addActionListener(this);
    message=new String("  The piece you are holding is ");
    text=new JLabel(message);
    text1=new JLabel("NONE");
    text1.setFont(new Font(message, Font.BOLD, 14));
    text1.setForeground(Color.RED);
    text.setFont(new Font(message, Font.BOLD, 14));
    text.setForeground(Color.WHITE);
    p1=new JLabel("        Player Turn: ");
    p1.setFont(new Font("        Player Turn: ", Font.BOLD, 14));
    p1.setForeground(Color.GREEN);
    turn=new JLabel(player);
    turn.setFont(new Font(player,Font.BOLD, 14));
    turn.setForeground(Color.RED);
    img=Toolkit.getDefaultToolkit().getImage("Real.jpeg");
    img2=Toolkit.getDefaultToolkit().getImage("Rules.jpg");
    B1=new JButton("Instructions");
    B1.addActionListener(this);
    B2=new JButton("Start Game");
    B2.addActionListener(this);
    B3=new JButton("Close");
    B3.addActionListener(this);
    p=new JPanel(new BorderLayout());
    thinBorder2 = new LineBorder(Color.BLUE, 5);
    thinBorder3= new LineBorder(Color.GREEN,5);
    pieces=new ImageIcon[4][8];
    pieces[0][0]=new ImageIcon("golden soldier.png");
    pieces[0][1]=new ImageIcon("golden soldier.png");
    pieces[0][2]=new ImageIcon("golden soldier.png");
    pieces[0][3]=new ImageIcon("golden soldier.png");
    pieces[0][4]=new ImageIcon("golden soldier.png");
    pieces[0][5]=new ImageIcon("golden soldier.png");
    pieces[0][6]=new ImageIcon("golden soldier.png");
    pieces[0][7]=new ImageIcon("golden soldier.png");
    pieces[1][0]=new ImageIcon("white soldier.png");
    pieces[1][1]=new ImageIcon("white soldier.png");
    pieces[1][1]=new ImageIcon("white soldier.png");
    pieces[1][2]=new ImageIcon("white soldier.png");
    pieces[1][3]=new ImageIcon("white soldier.png");
    pieces[1][4]=new ImageIcon("white soldier.png");
    pieces[1][5]=new ImageIcon("white soldier.png");
    pieces[1][6]=new ImageIcon("white soldier.png");
    pieces[1][7]=new ImageIcon("white soldier.png");
    pieces[2][0]=new ImageIcon("golden king.png");
    pieces[2][1]=new ImageIcon("golden minister.png");
    pieces[2][2]=new ImageIcon("golden elephant.png");
    pieces[2][3]=new ImageIcon("golden elephant.png");
    pieces[2][4]=new ImageIcon("golden horse.png");
    pieces[2][5]=new ImageIcon("golden horse.png");
    pieces[2][6]=new ImageIcon("golden camel.png");
    pieces[2][7]=new ImageIcon("golden camel.png");
    pieces[3][0]=new ImageIcon("white king.png");
    pieces[3][1]=new ImageIcon("white minister.png");
    pieces[3][2]=new ImageIcon("white elephant.png");
    pieces[3][3]=new ImageIcon("white elephant.png");
    pieces[3][4]=new ImageIcon("white horse.png");
    pieces[3][5]=new ImageIcon("white horse.png");
    pieces[3][6]=new ImageIcon("white camel.png");
    pieces[3][7]=new ImageIcon("white camel.png");
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double width = screenSize.getWidth();
    double height = screenSize.getHeight();
    req=0;
    white=true;
    }
  private void set(int req ){
       this.req=req;
  }
   private int get(){
        return this.req;
 }
 private void setI(Icon I){
 	this.I=I;
 }
 private Icon getI(){
 	return this.I;
 }
 private void setIName(String s){
 	this.icon_name=s;
 }
 private String getIName(){
 	return this.icon_name;
 }
 private boolean isExceptionOccured(){
 	return this.Y;
 }
 private boolean isWhite(){
 	return this.white;
 }
 private void setTurn(){
 	if(white)
 	    turn.setText("White");
 	else
 		turn.setText("Gold");
 }
  private void drawGrids(){
  	board.removeAll();
  	for(int i=0;i<8;i++){
  		for(int j=0;j<8;j++){
  			squares [i][j]=new JButton();
  			JButton bm=squares[i][j];
  			squares[i][j].addMouseListener(new MouseAdapter() {

      public void mousePressed(MouseEvent e){
                      int x=(e.getXOnScreen()-368)/100;//because screen size is 1536*864
                      int y=(e.getYOnScreen()-64)/100;
                      int req=y*8+x;
                      set(req);
                      setI(bm.getIcon());
                      bm.setBorder(thinBorder3);
                      if(bm.getIcon()!=null){
                      Y=false;
                      String t=((ImageIcon)bm.getIcon()).getDescription();
                      if((white&&(t.charAt(0)=='w'))||(!white&&(t.charAt(0)=='g'))){
                      	white=!white;
                       t=t.replace(".png","");
                      setIName(t);
                       text1.setText(t);}
                      else{
                      	 //white=!white;
                             JOptionPane.showMessageDialog(f, 
                              "It's Not Your Turn", 
                              "Oops", 
                              JOptionPane.WARNING_MESSAGE); }}
                      else{
                         Y=true;
                         text1.setText("NONE");
                      }
                       
                }
        public void mouseReleased(MouseEvent e)
               {
               	setTurn();
               	int x1 = (e.getXOnScreen()-368)/100;
               	int y1= (e.getYOnScreen()-64)/100;
               	int req1 = y1*8+x1;
                 JButton K=(JButton)board.getComponent(req1);
                 JButton K1=(JButton)board.getComponent(get());
                 text1.setText("NONE");
                if(!isExceptionOccured()){
                 if(K.getIcon()!=null){
                 String t1=((ImageIcon)K.getIcon()).getDescription();
                 if(getIName().charAt(0)==t1.charAt(0)){
                 	 white=!white;
                 	 setTurn();
               		JOptionPane.showMessageDialog(f, 
                              "you cannot kill your own army", 
                              "Oops", 
                              JOptionPane.WARNING_MESSAGE);
               	}
               	else{
                K.setIcon(null);
                K.setIcon(getI());
                K1.setIcon(null);
                board.repaint();}}
                else{
                	K.setIcon(getI());
                    K1.setIcon(null);
                    board.repaint();
                }
            }}

     public void mouseEntered(MouseEvent e) {
       bm.setBorder(thinBorder);
    }
public void mouseExited(MouseEvent e) {
      bm.setBorder(null);
                   }});

  			board.add(squares[i][j]);
  	if(i%2==0)	
  		squares[i][j].setBackground( j % 2 == 0 ? Color.white : Color.black );
  	else
  		squares[i][j].setBackground( j % 2 == 0 ? Color.black : Color.white );

  		}
  	}
  	insertIcons();}
  	private void insertIcons(){
       b1=(JButton)board.getComponent(8);
       b1.setIcon(pieces[0][0]);
       b2=(JButton)board.getComponent(9);
       b2.setIcon(pieces[0][1]);
       b3=(JButton)board.getComponent(10);
       b3.setIcon(pieces[0][2]);
       b4=(JButton)board.getComponent(11);
       b4.setIcon(pieces[0][3]);
       b5=(JButton)board.getComponent(12);
       b5.setIcon(pieces[0][4]);
       b6=(JButton)board.getComponent(13);
       b6.setIcon(pieces[0][5]);
       b7=(JButton)board.getComponent(14);
       b7.setIcon(pieces[0][6]);
       b8=(JButton)board.getComponent(15);
       b8.setIcon(pieces[0][7]);
       b9=(JButton)board.getComponent(48);
       b9.setIcon(pieces[1][0]);
       b10=(JButton)board.getComponent(49);
       b10.setIcon(pieces[1][1]);
       b11=(JButton)board.getComponent(50);
       b11.setIcon(pieces[1][2]);
       b12=(JButton)board.getComponent(51);
       b12.setIcon(pieces[1][3]);
       b13=(JButton)board.getComponent(52);
       b13.setIcon(pieces[1][4]);
       b14=(JButton)board.getComponent(53);
       b14.setIcon(pieces[1][5]);
       b15=(JButton)board.getComponent(54);
       b15.setIcon(pieces[1][6]);
       b16=(JButton)board.getComponent(55);
       b16.setIcon(pieces[1][7]);
       b17=(JButton)board.getComponent(0);
       b17.setIcon(pieces[2][2]);
       b18=(JButton)board.getComponent(7);
       b18.setIcon(pieces[2][3]);
       b19=(JButton)board.getComponent(1);
       b19.setIcon(pieces[2][4]);
       b20=(JButton)board.getComponent(6);
       b20.setIcon(pieces[2][5]);
       b21=(JButton)board.getComponent(2);
       b21.setIcon(pieces[2][6]);
       b22=(JButton)board.getComponent(5);
       b22.setIcon(pieces[2][7]);
       b23=(JButton)board.getComponent(3);
       b23.setIcon(pieces[2][0]);
       b24=(JButton)board.getComponent(4);
       b24.setIcon(pieces[2][1]);
       b25=(JButton)board.getComponent(56);
       b25.setIcon(pieces[3][2]);
       b26=(JButton)board.getComponent(63);
       b26.setIcon(pieces[3][3]);
       b27=(JButton)board.getComponent(57);
       b27.setIcon(pieces[3][4]);
       b28=(JButton)board.getComponent(62);
       b28.setIcon(pieces[3][5]);
       b29=(JButton)board.getComponent(58);
       b29.setIcon(pieces[3][6]);
       b30=(JButton)board.getComponent(61);
       b30.setIcon(pieces[3][7]);
       b31=(JButton)board.getComponent(59);
       b31.setIcon(pieces[3][1]);
       b32=(JButton)board.getComponent(60);
       b32.setIcon(pieces[3][0]);
   }
private void welcomeScreen(){
      f2.setContentPane(new JLabel(new ImageIcon(img)));
      f2.setLayout(new GridBagLayout());
      GridBagConstraints gbc = new GridBagConstraints();
      f2.setBackground(new Color(143,143,143));
      B1.setBackground(Color.CYAN);
      B2.setBackground(Color.ORANGE);
      gbc.gridwidth = GridBagConstraints.HORIZONTAL;
      f2.add(B1,gbc);
      f2.add(B2, gbc);
      f2.setResizable(false);
      f2.setExtendedState(JFrame.MAXIMIZED_BOTH); 
      f2.setVisible(true);
      f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
private void rulesPage(){
  f3.setContentPane(new JLabel(new ImageIcon(img2)));
   f3.setLayout(new BorderLayout());
  p.add(B3,BorderLayout.LINE_END);
   f3.setBackground(new Color(143,143,143));
   B3.setBackground(Color.RED);
   f3.add(p,BorderLayout.PAGE_END);
      f3.setExtendedState(JFrame.MAXIMIZED_BOTH); 
      f3.setResizable(false);
      f3.setVisible(true);
      f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
private void chessBoard(){
	drawGrids();
 	board.setBorder(new CompoundBorder(new EmptyBorder(5,5,5,5),new LineBorder(Color.CYAN,8)));
 	extra.add(board);
 	tools.add(resetgame);
 	resetgame.setBackground(Color.ORANGE);
 	home.setBackground(Color.ORANGE);
 	tools.add(home);
 	tools.add(text);
 	tools.add(text1);
 	tools.add(p1);
 	tools.add(turn);
 	text.setBackground(Color.WHITE);
 	tools.setBackground(Color.BLACK);
    tools.setFloatable(false);
 	main_gui.setBackground(Color.BLACK);
 	extra.setBackground(new Color(204,119,34));
 	main_gui.add(extra,BorderLayout.CENTER);
 	main_gui.add(tools,BorderLayout.PAGE_START);
    f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
 	f.add(main_gui);
 	f.setResizable(false);
 	f.setVisible(true);
 	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
 public static void main(String [] args){
 	Main main =new Main();
 	main.welcomeScreen();
 }

          @Override
     public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            if(s.equals("Reset game")){
            	        text1.setText("NONE");
                         f.dispose();
                         white=true;
                        chessBoard();
            	      }
            
          else if(s.equals("Home")){
              f.dispose();
          	welcomeScreen();
          }
         else if(s.equals("Close")){
         	f3.setVisible(false);
            welcomeScreen();
         }
         else if(s.equals("Start Game")){
         	f2.setVisible(false);
         	f2.revalidate();
         	chessBoard();
         }
         else if(s.equals("Instructions")){
         	f2.setVisible(false);
           rulesPage();
         }
		  }
}