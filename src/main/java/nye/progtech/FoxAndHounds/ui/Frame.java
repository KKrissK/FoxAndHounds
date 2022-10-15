package nye.progtech.FoxAndHounds.ui;

import javax.swing.*;

public class Frame extends JFrame {

public Frame(){
    setTitle("Fox and Hounds");
    setSize(1000, 620);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Board boardPanel = new Board();
    MouseControl mouse = new MouseControl(boardPanel);

   // setLayout(new FlowLayout());
    add(boardPanel);
    setVisible(true);
}
}
