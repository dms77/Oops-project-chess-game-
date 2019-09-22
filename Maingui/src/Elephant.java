import java.lang.Math;
import javax.swing.*;
public class Elephant implements PieceType{
    private int source;
    private int dest;
    private JPanel panel;
    public Elephant(){

    }
    public Elephant(int source,int dest, JPanel panel)
    {
        this.source=source;
        this.dest=dest;
        this.panel=panel;
    }
    @Override
    public boolean isObstacle(int source,int dest,JPanel board)
    {
        JButton b = (JButton)board.getComponent(dest);
        JButton c = (JButton)board.getComponent(source);
        int p = Math.min(source,dest);
        int q = Math.max(source,dest);
        boolean abc=false;
        if((q-p)%8==0)
        {
            for(int i=1;i<((q-p)/8);i++)
            {
                JButton x = (JButton)board.getComponent(p+(i*8));
                if(x.getIcon()!=null)
                {
                    abc=true;
                    break;
                }
            }
        }
        else if(source/8==dest/8)
        {
            for(int i=p+1;i<q;i++)
            {
                JButton x = (JButton)board.getComponent(i);
                if(x.getIcon()!=null)
                {
                    abc = true;
                }
               
            }
        }
        return abc;

    }
    @Override
    public boolean isValid(int source,int dest,JPanel board)
    {
        JButton b = (JButton)board.getComponent(dest);
        JButton c = (JButton)board.getComponent(source);
        String t = ((ImageIcon)c.getIcon()).getDescription();
        boolean abc;
        if(Math.abs(source-dest)%8==0 || (source/8)==(dest/8))
        {
            abc=true;
        }
        else{
            abc = false;
        }
        if(abc)
        {
            abc=!(isObstacle(source,dest,board));
        }
        return abc;
    }
}