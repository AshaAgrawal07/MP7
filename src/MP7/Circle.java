package MP7;

import java.awt.*;


public class Circle 
{
    private double x;
    private double y;
    private double r;
    private Color c;
//hi    
    public Circle()
    {
        x = 0; y = 0; r = 0; c = new Color(0,0,0);
    }
    
    public Circle(double a, double b, double w, Color d)
    {
        x = a; y = b; r = w; c = d;
    }
    
    public Circle create()
    {
        x = 600*Math.random();
        y = 600*Math.random();
        r = 75*Math.random();
        c = new Color((int)(255*Math.random()), (int)(255*Math.random()), (int)(255*Math.random()));
        
        Circle bleh = new Circle(x, y, r, c);
        return bleh;
    }

    public Circle changeColor()
    {
        c = Color.BLACK;
        return this;
    }
    
    public double getRad()
    {
        return r;
    }
    
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public Color getC()
    {
        return c;
    }
}
