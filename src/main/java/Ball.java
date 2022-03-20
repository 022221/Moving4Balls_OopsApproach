public class Ball {
    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 10;
    private int SpeedPerUnitFrame = 1;
    private int SpeedOfBall=0;
    private float FractionOfHeight = 0;

    Ball(int speedPerUnitFrame,float fractionOfHeight){
        SpeedPerUnitFrame = speedPerUnitFrame;
        FractionOfHeight = fractionOfHeight;
    }

    public int getSpeedOfBall(){
        SpeedOfBall = SpeedOfBall+SpeedPerUnitFrame;
        return SpeedOfBall;
    }

    public float getFractionalHeight(){
        return FractionOfHeight * HEIGHT;
    }
}
