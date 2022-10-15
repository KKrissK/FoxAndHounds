package nye.progtech.FoxAndHounds.ui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

import nye.progtech.FoxAndHounds.service.*;


public class MouseControl extends JPanel implements ActionListener, MouseListener {


    private Board boardPanel;
    private Fox fox = new Fox();
    private Hounds hounds = new Hounds();
    private Play play = new Play(fox, hounds);


    public MouseControl(Board boardPanel) {
        this.boardPanel = boardPanel;
        boardPanel.init(this);
        setLayout(new GridBagLayout());
        update();
        (new Thread(play)).start();
    }



    private void update() {
        boardPanel.showState(play.getState());
    }

    public void actionPerformed(ActionEvent e) {}

    public void mousePressed(MouseEvent e) {
        play.step(Integer.parseInt(e.getComponent().getName()));
        update();
    }

    public void mouseClicked(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    public void mouseReleased(MouseEvent e) { }


}
