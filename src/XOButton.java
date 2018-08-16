import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class XOButton extends JButton implements ActionListener {

    private ImageIcon X, O;
    private Cell value = Cell.Blank;
    private int xID, yID;

    public XOButton(int x, int y) {
        X = new ImageIcon(this.getClass().getResource("X.png"));
        O = new ImageIcon(this.getClass().getResource("O.png"));
        this.addActionListener(this);
        this.xID = x;
        this.yID = y;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (TicTacToe.gameOver == false) {

            if (TicTacToe.counter % 2 == 0) {
                    TicTacToe.msg.setText("Player 2 Turn");
            } else
                TicTacToe.msg.setText("Player 1 Turn");

            if (value == Cell.Blank) {
                TicTacToe.counter++;
                value = TicTacToe.turn;
                TicTacToe.clickedX = this.xID;
                TicTacToe.clickedY = this.yID;
                if (value == Cell.Cross) {
                    setIcon(X);
                    // TODO
                    TicTacToe.checkLines();
                    TicTacToe.turn = Cell.Circle;
                } else {
                    setIcon(O);
                    // TODO
                    TicTacToe.checkLines();
                    TicTacToe.turn = Cell.Cross;
                }
            }

        }


    }

    public void setValue(Cell value) {
        this.value = value;
    }

    public Cell getValue() {
        return value;
    }
}
