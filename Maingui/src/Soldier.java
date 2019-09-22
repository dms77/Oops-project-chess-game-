import javax.swing.*;
public class Soldier implements PieceType{
    private int source;
    private int dest;
    private JPanel panel;
    public Soldier() {

    }
    public Soldier(int source,int dest,JPanel panel) {
        this.source=source;
        this.dest=dest;
        this.panel=panel;
    }
    @Override
    public boolean isObstacle(int source, int dest, JPanel board) {
        JButton b = (JButton)board.getComponent(dest);
        JButton c = (JButton)board.getComponent(source);
        String t = ((ImageIcon)c.getIcon()).getDescription();
        if(b.getIcon()!=null && source+8==dest && t.charAt(0)=='g')
        {
            return true;
        }
        else if(b.getIcon()!=null && source+16==dest && t.charAt(0)=='g')
        {
            JButton h  = (JButton)board.getComponent(source+8);
            if(source>7 && source<15 && h.getIcon()!=null)
            {
                return true;
            }

        }
        else if(b.getIcon()!=null && source-8==dest && t.charAt(0)=='w')
        {
            return true;
        }
        else if(b.getIcon()!=null && source-16==dest && t.charAt(0)=='w')
        {
            JButton h  = (JButton)board.getComponent(source-8);
            if(source>47 && source<55 && h.getIcon()!=null)
            {
                return true;
            }
        }

        return false;

    }

    @Override
    public boolean isValid(int source, int dest, JPanel board) {
        JButton b = (JButton)board.getComponent(dest);
        JButton c = (JButton)board.getComponent(source);
        String t = ((ImageIcon)c.getIcon()).getDescription();
        if(t.charAt(0)=='g')
        {
            if(isObstacle(source,dest,board))
            {
                return false;
            }
            if(source+8==dest)
            {
                return true;
            }
            else if(source+7==dest || source+9==dest)
            {
                if(b.getIcon()!=null)
                {
                    return true;
                }
                else
                {
                    return false;
                }

            }
            else if(source+16==dest && source>7 && source<16)
            {
                return true;
            }
            return false;

        }
        else
        {
            if(isObstacle(source,dest,board))
            {
                return false;
            }
            else if(source-8==dest)
            {
                return true;
            }
            else if(source-7==dest || source-9==dest)
            {
                if(b.getIcon()!=null)
                {
                    return true;
                }
                else
                {
                    return false;
                }

            }
            else if(source-16==dest && source>47 && source<56)
            {
                return true;
            }

        }
        return false;

    }


}