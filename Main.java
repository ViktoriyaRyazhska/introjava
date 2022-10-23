import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {

  private static void createAndShowGUI() {

    JFrame jFrame = new JFrame("About pets)");
    jFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
    jFrame.setSize(400, 450);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label = new JLabel("My lovely dog");
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
    jFrame.add(label);

    JLabel photo1 = new JLabel(new ImageIcon("retriever-puppy.gif"));
    //JLabel photo1 = new JLabel(new ImageIcon("dogsleep.gif"));
    photo1.setHorizontalAlignment(JLabel.CENTER);
    jFrame.add(photo1);

    JButton button = new JButton("Let's go to a walk!");
    button.setHorizontalAlignment(JButton.CENTER);
    button.setPreferredSize(new Dimension(320, 50));
    button.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
    jFrame.add(button);

    JLabel photo2 = new JLabel(new ImageIcon("dog1.gif"));
    //JLabel photo2 = new JLabel(new ImageIcon("cute-cartoon.gif"));
    photo2.setHorizontalAlignment(JLabel.CENTER);
    photo2.setPreferredSize(new Dimension(320, 350));
    
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label.setText("GO TO A WALK(((((");
        jFrame.add(photo2);
        photo1.setVisible(false);
        button.setVisible(false);
      }
    });

    jFrame.setVisible(true);
  }

  @Override
  public String toString() {
    return "Main []";
  }

  public static void main(String[] args) {
    createAndShowGUI();
  }
}
