package cz.ales17.tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe implements ActionListener {

    // Instance of the rand class - determines the first turn player
    Random random = new Random();
    // GUI
    JFrame frame = new JFrame();
    JPanel titlePanel = new JPanel( );
    JPanel buttonPanel = new JPanel();
    JLabel textField = new JLabel();
    // Array of JButtons - 9 buttons
    JButton[] buttons = new JButton[9];
    // One bool is enough - there are just 2 player
    boolean player1Turn;
    public TicTacToe() {
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(800,800);
       frame.getContentPane().setBackground(new Color(50,50,50));
       frame.setLayout(new BorderLayout());
       frame.setVisible(true);
       textField.setBackground(new Color(25,25,25));
       textField.setForeground(new Color(25,255,0));
       textField.setFont(new Font("Ink Free",0,70));
       textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setVerticalAlignment(SwingConstants.CENTER);

       textField.setText("Tic-Tac-Toe");
       textField.setOpaque(true);


       titlePanel.setLayout(new BorderLayout());
       titlePanel.setBounds(0,0,800,100);

       buttonPanel.setLayout(new GridLayout(3,3));
       buttonPanel.setBackground(new Color(150,150,150));

        for(int i=0;i<9;i++) {
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

       titlePanel.add(textField);
       frame.add(titlePanel,"North");
       frame.add(buttonPanel);
       // Game start
       firstTurn();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void firstTurn() {
        // Wait until program shows X turn or O turn
        try{Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
        // 0 = p1, 1 = p2
        if(random.nextInt(2)==0) {player1Turn=true;
        textField.setText("X turn");} else{player1Turn=false; textField.setText("O turn");}
    }

    public void check() {
    }

    //passing winning parameters a, b, c
    public void xWins(int a, int b, int c) {
    }

    public void oWins(int a, int b, int c) {
    }
}
