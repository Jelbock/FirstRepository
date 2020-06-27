/**
 * Created by Марина on 21.06.2020.
 */
public class Vector2D {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double length(){
        return Math.sqrt(x*x + y*y);
    }
}
