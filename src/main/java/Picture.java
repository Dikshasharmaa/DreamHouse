import java.awt.Rectangle;
import java.awt.geom.RectangularShape;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ,
 * converted for use with Replit
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 1.1 (24 May 2001)
 */
public class Picture {
  private Square wall;
  private Square wall2;
  private Square window;
  private Square window2;
  private Square door1;
  private Square door2;
  private Square garage;
  private Circle lock;
  private Triangle roof;
  private Triangle roof2;
  private Square grass;
  private Circle sun;

  /**
   * Constructor for objects of class Picture
   */
  public Picture() {
    // nothing to do... instance variables are automatically set to null
  }

  /**
   * Draw this picture.
   */
  public void draw() {
    wall = new Square();
    wall.changeColor("blue");
    wall.moveVertical(100);
    wall.moveHorizontal(-20);
    wall.changeSize(140);
    wall.makeVisible();

    wall2 = new Square();
    wall2.changeColor("blue");
    wall2.moveHorizontal(105);
    wall2.moveVertical(120);
    wall2.changeSize(120);
    wall2.makeVisible();

    window = new Square();
    window.changeColor("black");
    window.moveHorizontal(10);
    window.moveVertical(120);
    window.makeVisible();

    window2 = new Square();
    window2.changeColor("black");
    window2.moveHorizontal(60);
    window2.moveVertical(120);
    window2.makeVisible();

      door1 = new Square();
      door1.changeColor("black");
      door1.moveHorizontal(40);
      door1.moveVertical(210);
      door1.makeVisible();

      door2= new Square();
      door2.changeColor("black");
      door2.moveHorizontal(40);
      door2.moveVertical(190);
      door2.makeVisible();

    garage= new Square();
    garage.changeColor("yellow");
    garage.moveHorizontal(130);
    garage.moveVertical(160);
    garage.changeSize(80);
    garage.makeVisible();

    lock = new Circle();
    lock.changeColor("black");
    lock.moveHorizontal(235);
    lock.moveVertical(180);
    lock.changeSize(10);
    lock.makeVisible();
    

    roof = new Triangle();
    roof.changeSize(55, 150);
    roof.moveHorizontal(58);
    roof.moveVertical(80);
    roof.makeVisible();

    roof2 = new Triangle();
    roof2.changeSize(50, 130);
    roof2.moveHorizontal(177);
    roof2.moveVertical(110);
    roof2.makeVisible();

    grass = new Square();
    grass.changeColor("green");
    grass.moveHorizontal(-60);
    grass.moveVertical(235);
    grass.changeSize(700);
    grass.makeVisible();

    sun = new Circle();
    sun.changeColor("yellow");
    sun.moveHorizontal(180);
    sun.moveVertical(-10);
    sun.changeSize(60);
    sun.makeVisible();
  }

  /**
   * Change this picture to black/white display
   */
  public void setBlackAndWhite() {
    if (wall != null) // only if it's painted already...
    {
      wall.changeColor("black");
      window.changeColor("white");
      roof.changeColor("black");
      sun.changeColor("black");
    }
  }

  /**
   * Change this picture to use color display
   */
  public void setColor() {
    if (wall != null) // only if it's painted already...
    {
      wall.changeColor("red");
      window.changeColor("black");
      roof.changeColor("green");
      sun.changeColor("yellow");
    }
  }

}