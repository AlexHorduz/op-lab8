package client_package;

import laba8_proga_Horduz.Circle;
import laba8_proga_Horduz.Rectangle;

public class Client {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		System.out.println(rec.toString());
		System.out.println(rec.getPerimeter());
		System.out.println(rec.getArea());
		rec.setHeight(10);
		System.out.println(rec.getPerimeter());
		System.out.println(rec.getArea());
		System.out.print("\n");
		
		Rectangle rec1 = new Rectangle(5, 4);
		System.out.println(rec1.toString());
		System.out.println(rec1.getPerimeter());
		System.out.println(rec1.getArea());
		rec1.setHeight(10);
		System.out.println(rec1.getPerimeter());
		System.out.println(rec1.getArea());
		System.out.print("\n\n");

		
		Circle c = new Circle();
		System.out.println(c.toString());
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
		System.out.println(c.getRadius());
		c.setRadius(5);
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
		System.out.println(c.getRadius());
		System.out.print("\n");
		
		Circle c1 = new Circle(10);
		System.out.println(c1.toString());
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getRadius());
		c1.setRadius(20);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getRadius());
		System.out.print("\n\n");
		
		System.out.println(c.equals(rec));
		
		System.out.println(c.equals(c1));
		c1.setRadius(c.getRadius());
		System.out.println(c.equals(c1));
		
		System.out.println(rec.equals(rec1));
		rec1.setHeight(rec.getHeight());
		rec1.setWidth(rec.getWidth());
		System.out.println(rec.equals(rec1));
	}
}
