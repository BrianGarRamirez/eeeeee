import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {
    Game game;
    Timer timer;
    Sprite sprite;
    Board(Game game){
        this.game =game;
        setPreferredSize(new Dimension(1000,800));

        setBackground(Color.BLACK);
        timer = new Timer(1000/60,this);
        timer.start();
    }

    public void setup(){
        sprite = new Sprite(Color.RED,0,0,)
    }



    public void paintComponent(Graphics g){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
