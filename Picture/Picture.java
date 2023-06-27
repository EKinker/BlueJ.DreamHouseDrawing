
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square night;
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle moon;
    private Triangle treeTop;
    private Triangle treeSecond;
    private Triangle treeThird;
    private Triangle treeBottom;
    
    private Circle ball1;
    private Circle ball2;
    private Circle ball3;
    private Circle ball4;
    private Circle ball5;
    
    private Circle snowManTop;
    private Circle snowManMid;
    private Circle snowManBottom;
    private Circle snowManLeftEye;
    private Circle snowManRightEye;
    
    private Square doorTop;
    private Square doorBottom;
    private Circle doorKnob;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        night = new Square();
        night.changeColor("black");
        night.changeSize(300);
        night.moveHorizontal(-60);
        night.moveVertical(-100);
        night.makeVisible();
        
        wall = new Square();
        wall.moveVertical(100);
        wall.moveHorizontal(-20);
        wall.changeSize(100);
        wall.makeVisible();
        wall.changeColor("blue");

        window = new Square();
        window.changeColor("yellow");
        window.moveVertical(110);
        window.makeVisible();

        treeTop = new Triangle();
        treeTop.moveVertical(160);
        treeTop.moveHorizontal(190);
        treeTop.makeVisible();
        
        treeSecond = new Triangle();
        treeSecond.changeSize(40,50);
        treeSecond.makeVisible();
        treeSecond.moveVertical(170);
        treeSecond.moveHorizontal(190);
        
        treeThird = new Triangle();
        treeThird.changeSize(50,60);
        treeThird.makeVisible();
        treeThird.moveHorizontal(190);
        treeThird.moveVertical(180);
        
        treeBottom = new Triangle();
        treeBottom.makeVisible();
        treeBottom.changeSize(60,70);
        treeBottom.moveHorizontal(190);
        treeBottom.moveVertical(190);
        
        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(40);
        roof.moveVertical(95);
        roof.makeVisible();
        roof.changeColor("blue");

        moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(180);
        moon.moveVertical(-10);
        moon.changeSize(60);
        moon.makeVisible();
        
        ball1 = new Circle();
        ball1.changeColor("red");
        ball1.changeSize(10);
        ball1.makeVisible();
        ball1.moveHorizontal(200);
        ball1.moveVertical(140);
        
        ball2 = new Circle();
        ball2.changeColor("yellow");
        ball2.changeSize(10);
        ball2.makeVisible();
        ball2.moveHorizontal(220);
        ball2.moveVertical(123);
        
        ball3 = new Circle();
        ball3.changeColor("blue");
        ball3.changeSize(10);
        ball3.makeVisible();
        ball3.moveHorizontal(220);
        ball3.moveVertical(160);
        
        ball4 = new Circle();
        ball4.changeColor("magenta");
        ball4.changeSize(10);
        ball4.makeVisible();
        ball4.moveHorizontal(207);
        ball4.moveVertical(180);
        
        ball5 = new Circle();
        ball5.changeColor("yellow");
        ball5.changeSize(10);
        ball5.makeVisible();
        ball5.moveHorizontal(230);
        ball5.moveVertical(190);
        
        snowManTop = new Circle();
        snowManTop.makeVisible();
        snowManTop.changeColor("white");
        snowManTop.changeSize(20);
        snowManTop.moveHorizontal(147);
        snowManTop.moveVertical(130);
        
        snowManMid = new Circle();
        snowManMid.makeVisible();
        snowManMid.changeColor("white");
        snowManMid.changeSize(25);
        snowManMid.moveHorizontal(145);
        snowManMid.moveVertical(148);
        
        snowManBottom = new Circle();
        snowManBottom.makeVisible();
        snowManBottom.changeColor("white");
        snowManBottom.changeSize(35);
        snowManBottom.moveHorizontal(140);
        snowManBottom.moveVertical(170);
        
        snowManLeftEye = new Circle();
        snowManLeftEye.makeVisible();
        snowManLeftEye.changeSize(5);
        snowManLeftEye.changeColor("black");
        snowManLeftEye.moveHorizontal(150);
        snowManLeftEye.moveVertical(133);
        
        snowManRightEye = new Circle();
        snowManRightEye.makeVisible();
        snowManRightEye.changeSize(5);
        snowManRightEye.changeColor("black");
        snowManRightEye.moveHorizontal(158);
        snowManRightEye.moveVertical(133);
        
        doorTop = new Square();
        doorTop.makeVisible();
        doorTop.changeColor("red");
        doorTop.moveHorizontal(35);
        doorTop.moveVertical(149);
        
        doorBottom = new Square();
        doorBottom.makeVisible();
        doorBottom.changeColor("red");
        doorBottom.moveHorizontal(35);
        doorBottom.moveVertical(170);
        
        doorKnob = new Circle();
        doorKnob.makeVisible();
        doorKnob.changeColor("black");
        doorKnob.changeSize(5);
        doorKnob.moveHorizontal(100);
        doorKnob.moveVertical(159);
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            moon.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            moon.changeColor("yellow");
        }
    }

}
