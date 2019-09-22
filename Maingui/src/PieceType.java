import javax.swing.*;
public interface PieceType {
  public boolean isObstacle(int source,int dest,JPanel board );
  public boolean isValid(int source,int dest,JPanel board);
}
