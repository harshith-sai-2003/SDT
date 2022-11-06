import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class sDisplay {
    JFrame disp=new JFrame();
    sDisplay(){
        disp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        disp.setSize(300,300);
        disp.getContentPane().setBackground(new Color(50,50,50));
        disp.setLayout(new BorderLayout());
        disp.setVisible(true);
    }
}
