//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Point.java
//  @ Date : 09/04/2013
//  @ Author : 
//
//



package tpwifibot;


public class Point {
	private short x;
	private short y;
	public Point(short x, short y) 
        {
            this.x=x;
            this.y=y;
	}
	
	public Point() 
        {
            x=0;
            y=0;
	}
	
	private void translateX(short dX) 
        {
           x= (short)(x+ dX);
	}
	
	private void translateY(short dY)
        {
            y= (short)(y+dY);
	}
	public void translate(short dX, short dY)
        {
            translateX(dX);
            translateY(dY);
        }
	public short getX()
        {
            return x;
	}
	
	public short getY()
        {
            return y;
	}
	
	public void affiche() 
        {
            System.out.println("Le robot se trouve en ("+x+","+y+")");
	}
}
