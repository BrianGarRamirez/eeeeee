import java.awt.*;

public class Sprite {

        Color color;
        int x,y,width,height;
        double dx,dy;
        final int SPEED = 5;

        public Sprite(Color color, int x, int y, int width, int height){

            this.color = color;
            this.x=x;
            this.y = y;
            this.width = width;
            this.height = height;

            while((int) dx ==0 || (int) dy ==0){
                double angle = 2 *Math.PI * (Math.random() + 1);
                double speed = (SPEED * Math.random() +1);
                dx = Math.cos(angle) * speed;
                dy = Math.sin(angle) *speed;
            }

        }

        public void paint(){
            
        }



}
