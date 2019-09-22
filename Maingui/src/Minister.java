import javax.swing.*;
public class Minister implements PieceType{
	private int source;
	private int dest;
	private JPanel panel;
	public Minister(int source,int dest,JPanel panel)
	{
		this.source=source;
		this.dest=dest;
		this.panel= panel;
	}

	@Override
	public boolean isObstacle(int source, int dest, JPanel board) {
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

	        public boolean isobstacle(int source, int dest, JPanel board) {
	    		int a=Math.abs((source/8)-(dest/8));
	    		int c = source%8;
	    		int d = dest%8;
	    		int m = Math.min(source,dest);
	    		int k= Math.max(source,dest);
	    		System.out.println(m%8);
	    		System.out.println(k%8);
	    		if(m%8>k%8)
	    		{
	    			for(int i=1;i<a;i++)
	    			{
	    				JButton x = (JButton)board.getComponent(m+i*8-i);
	    				System.out.println(m);
	    				System.out.println(m+i*8-i);
	    				if(x.getIcon()!=null)
	    				{
	    					return false;
	    				}
	    			}
	    		}
	    		else
	    		{
	    			for(int i=1;i<a;i++)
	    			{
	    				JButton x = (JButton)board.getComponent(m+i*8+i);
	    				System.out.println(m+i*8+i);
	    				System.out.println(m);
	    				if(x.getIcon()!=null)
	    				{
	    					return false;
	    				}
	    			}
	    			
	    		}
	    		return true;
	    		
	    		// TODO Auto-generated method stub
	    	
	    	}
		
	

	@Override
	public boolean isValid(int source, int dest, JPanel board) {
		JButton b = (JButton)board.getComponent(dest);
        JButton c = (JButton)board.getComponent(source);
        String t = ((ImageIcon)c.getIcon()).getDescription();
        int a=Math.abs(source/8-dest/8);
		int x = source%8;
		int y = dest%8;
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
        
		if(Math.abs(x-y)==a && isobstacle(source,dest,board))
		{
			abc=true;
		}
		else if(Math.abs(x-y)==a && !isobstacle(source,dest,board))
		{
			abc = false;
		}
		
        return abc;
		
	}

}
