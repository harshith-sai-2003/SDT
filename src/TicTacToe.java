import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{

    Random random=new Random();
    JFrame frame=new JFrame();
    JFrame inp=new JFrame();
    JPanel title_panel=new JPanel();
    JPanel button_panel=new JPanel();
    JLabel textfiled=new JLabel();
    JButton[] buttons=new JButton[9];
    boolean player1_turn,isDraw=true;
    String Player1, Player2,p1,p2,winner;
    int turn=0;
    TicTacToe(){
        Player1=JOptionPane.showInputDialog(inp,"Enter Player 1 name:");
        p1=JOptionPane.showInputDialog(inp,"Player1: X or O?");
        Player2=JOptionPane.showInputDialog(inp,"Enter Player 2 name:");
        p2=p1.equals("X")?"O":"X";
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfiled.setBackground(new Color(25,25,25));
        textfiled.setForeground(new Color(25,255,0));
        textfiled.setFont(new Font("Ink Free",Font.BOLD,75));
        textfiled.setHorizontalAlignment(JLabel.CENTER);
        textfiled.setText("Tic-Tac-Toe");
        textfiled.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);

        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground((new Color(150,150,150)));

        for(int i=0;i<9;i++){
            buttons[i]=new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);

        }

        title_panel.add(textfiled);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);
        player1_turn=firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        turn++;
        for(int i=0;i<9;i++){
            if(e.getSource()==buttons[i]){
                if(player1_turn){
                    if(buttons[i].getText().equals("")){
                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText(p1);
                        player1_turn=false;
                        textfiled.setText(Player2+"'s Turn");
                        check();
                    }
                }
                else{
                    if(buttons[i].getText().equals("")){
                        buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText(p2);
                        player1_turn=true;
                        textfiled.setText(Player1+"'s Turn");
                        check();
                    }
                }
            }
        }
        if(turn==9)
            checkDraw();
    }

    public boolean firstTurn(){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(random.nextInt(2)==0){
            textfiled.setText(Player1+"'s Turn");
            return true;
        }
        else{
            textfiled.setText(Player2+"'s Turn");
            return false;
        }
    }

    public String check(){
        if(
                (buttons[0].getText().equals("X")) &&
                (buttons[1].getText().equals("X")) &&
                (buttons[2].getText().equals("X"))
        ){
            winner= xWins(0,1,2);
        }
        if(
                (buttons[3].getText().equals("X")) &&
                (buttons[4].getText().equals("X")) &&
                (buttons[5].getText().equals("X"))
                ){
            winner= xWins(3,4,5);
        }
        if(
                (buttons[6].getText().equals("X")) &&
                (buttons[7].getText().equals("X")) &&
                (buttons[8].getText().equals("X"))
        ){
            winner= xWins(6,7,8);
        }
        if(
                (buttons[0].getText().equals("X")) &&
                        (buttons[3].getText().equals("X")) &&
                        (buttons[6].getText().equals("X"))
        ){
            winner= xWins(0,3,6);
        }
        if(
                (buttons[2].getText().equals("X")) &&
                        (buttons[5].getText().equals("X")) &&
                        (buttons[8].getText().equals("X"))
        ){
            winner= xWins(2,5,8);
        }
        if(
                (buttons[1].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[7].getText().equals("X"))
        ){
            winner= xWins(1,4,7);
        }
        if(
                (buttons[0].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[8].getText().equals("X"))
        ){
            winner= xWins(0,4,8);
        }
        if(
                (buttons[2].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[6].getText().equals("X"))
        ){
            winner= xWins(2,4,6);
        }


        if(
                (buttons[0].getText().equals("O")) &&
                        (buttons[1].getText().equals("O")) &&
                        (buttons[2].getText().equals("O"))
        ){
            winner= oWins(0,1,2);
        }
        if(
                (buttons[3].getText().equals("O")) &&
                        (buttons[4].getText().equals("O")) &&
                        (buttons[5].getText().equals("O"))
        ){
            winner= oWins(3,4,5);
        }
        if(
                (buttons[6].getText().equals("O")) &&
                        (buttons[7].getText().equals("O")) &&
                        (buttons[8].getText().equals("O"))
        ){
            winner= oWins(6,7,8);
        }
        if(
                (buttons[0].getText().equals("O")) &&
                        (buttons[3].getText().equals("O")) &&
                        (buttons[6].getText().equals("O"))
        ){
            winner= oWins(0,3,6);
        }
        if(
                (buttons[2].getText().equals("O")) &&
                        (buttons[5].getText().equals("O")) &&
                        (buttons[8].getText().equals("O"))
        ){
            winner= oWins(2,5,8);
        }
        if(
                (buttons[1].getText().equals("O")) &&
                        (buttons[4].getText().equals("O")) &&
                        (buttons[7].getText().equals("O"))
        ){
            winner= oWins(1,4,7);
        }
        if(
                (buttons[0].getText().equals("O")) &&
                        (buttons[4].getText().equals("O")) &&
                        (buttons[8].getText().equals("O"))
        ){
            winner= oWins(0,4,8);
        }
        if(
                (buttons[2].getText().equals("O")) &&
                        (buttons[4].getText().equals("O")) &&
                        (buttons[6].getText().equals("O"))
        ){
            winner= oWins(2,4,6);
        }
        return winner;
    }

    public String xWins(int a, int b, int c){
        isDraw=false;
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        for(int i=0;i<9;i++){
            buttons[i].setEnabled(false);
        }
        winner=p1.equals("X")?Player1:Player2;
        textfiled.setText(winner+" Wins!!");
        return winner;
    }

    public String oWins(int a, int b, int c){
        isDraw=false;
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        for(int i=0;i<9;i++){
            buttons[i].setEnabled(false);
        }
        String winner;
        winner=p1.equals("O")?Player1:Player2;
        textfiled.setText(winner+" Wins!!");
        return winner;
    }

    public String checkDraw(){
        if(isDraw) {
            winner = "Draw";
            textfiled.setText("Draw");
        }
        return winner;
    }
}
