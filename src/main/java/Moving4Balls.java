import processing.core.PApplet;
public class Moving4Balls extends PApplet {

    Ball Ball1 = new Ball(1,(float)1/5);
    Ball Ball2 = new Ball(2,(float)2/5);
    Ball Ball3 = new Ball(3,(float)3/5);
    Ball Ball4 = new Ball(4,(float)4/5);

    public static void main(String [] args){
        PApplet.main("Moving4Balls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(Ball.WIDTH, Ball.HEIGHT);
    }

    @Override
    public void draw() {
        drawBall(Ball1.getSpeedOfBall(),Ball1.getFractionalHeight());
        drawBall(Ball2.getSpeedOfBall(),Ball2.getFractionalHeight());
        drawBall(Ball3.getSpeedOfBall(),Ball3.getFractionalHeight());
        drawBall(Ball4.getSpeedOfBall(),Ball4.getFractionalHeight());
    }

    public void drawBall(int speedOfBall, float height) {
        ellipse(speedOfBall, height, Ball.DIAMETER, Ball.DIAMETER);
    }
}
