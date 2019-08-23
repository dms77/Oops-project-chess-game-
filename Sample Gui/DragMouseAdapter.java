import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class DragMouseAdapter extends MouseAdapter {
	public void mousePressed(MouseEvent e) {
		JComponent c = (JComponent) e.getSource();
		TransferHandler handler = c.getTransferHandler();
		handler.exportAsDrag(c, e, TransferHandler.MOVE);
	}
}
