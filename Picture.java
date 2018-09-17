/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square back;
    private Square shipwhite1;
    private Square shipwhite2;
    private Square shipwhite3;
    private Square shipwhite4;
    private Square shipwhite5;
    private Square shipwhite6;
    private Square shipwhite7;
    private Square shipwhite8;
    private Square shipwhite9;
    private Square shipwhite0;
    private Square shipwhite11;
    private Square shipwhite12;
    private Square shipwhite13;
    private Square shipwhite14;
    private Square shipwhite15;
    private Square shipred1;
    private Square shipred2;
    private Square shipred3;
    private Square shipred4;
    private Square shipred5;
    private Square shipred6;
    private Square ship1;
    private Square ship2;
    private Square ship3;
    private Square ship4;
    private Square ship5;
    private Square ship6;
    private Square ship7;
    private Square ship8;
    private Square ship9;
    private Square shipp1;
    private Square shipp8;
    private Square shipp2;
    private Square shipp3;
    private Square shipp4;
    private Square shipp5;
    private Square shipp6;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        back = new Square();
        shipwhite1 = new Square();
        shipwhite2 = new Square();
        shipwhite3 = new Square();
        shipwhite4 = new Square();
        shipwhite5 = new Square();
        shipwhite6 = new Square();
        shipwhite7 = new Square();
        shipwhite8 = new Square();
        shipwhite9 = new Square();
        shipwhite0 = new Square();
        shipred1 = new Square();
        shipred2 = new Square();
        shipred3 = new Square();
        shipred4 = new Square();
        shipred5 = new Square();
        shipred6 = new Square();
        ship1 = new Square();
        ship2 = new Square();
        ship3 = new Square();
        ship4 = new Square();
        ship5 = new Square();
        ship6 = new Square();
        ship7 = new Square();
        ship8 = new Square();
        ship9 = new Square();
        shipp1 = new Square();
        shipp2 = new Square();
        shipp3 = new Square();
        shipp4 = new Square();
        shipp5 = new Square();
        shipp6 = new Square();
        shipp1 = new Square();
        roof = new Triangle();  
        sun = new Circle();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            back.changeColor("black");
            back.moveHorizontal(-400);
            back.moveVertical(-150);
            back.changeSize(1000);
            back.makeVisible();
            
            shipwhite1.changeColor("white");
            shipwhite1.moveHorizontal(-80);
            shipwhite1.moveVertical(100);
            shipwhite1.changeSize(10);
            shipwhite1.makeVisible();
    
            shipwhite2.changeColor("white");
            shipwhite2.moveHorizontal(-80);
            shipwhite2.moveVertical(110);
            shipwhite2.changeSize(10);
            shipwhite2.makeVisible();
            
            shipwhite3.changeColor("white");
            shipwhite3.moveHorizontal(-80);
            shipwhite3.moveVertical(120);
            shipwhite3.changeSize(10);
            shipwhite3.makeVisible();
            
            shipwhite4.changeColor("white");
            shipwhite4.moveHorizontal(-80);
            shipwhite4.moveVertical(130);
            shipwhite4.changeSize(10);
            shipwhite4.makeVisible();
            
            shipwhite5.changeColor("white");
            shipwhite5.moveHorizontal(-90);
            shipwhite5.moveVertical(130);
            shipwhite5.changeSize(10);
            shipwhite5.makeVisible();
            
            shipwhite6.changeColor("white");
            shipwhite6.moveHorizontal(-90);
            shipwhite6.moveVertical(140);
            shipwhite6.changeSize(10);
            shipwhite6.makeVisible();
            
            shipwhite7.changeColor("red");
            shipwhite7.moveHorizontal(-90);
            shipwhite7.moveVertical(150);
            shipwhite7.changeSize(10);
            shipwhite7.makeVisible();
            
            shipwhite8.changeColor("red");
            shipwhite8.moveHorizontal(-90);
            shipwhite8.moveVertical(160);
            shipwhite8.changeSize(10);
            shipwhite8.makeVisible();
            
            shipwhite9.changeColor("red");
            shipwhite9.moveHorizontal(-80);
            shipwhite9.moveVertical(140);
            shipwhite9.changeSize(10);
            shipwhite9.makeVisible();
            
            shipwhite0.changeColor("red");
            shipwhite0.moveHorizontal(-80);
            shipwhite0.moveVertical(150);
            shipwhite0.changeSize(10);
            shipwhite0.makeVisible();
            
            shipred1.changeColor("red");
            shipred1.moveHorizontal(-70);
            shipred1.moveVertical(150);
            shipred1.changeSize(10);
            shipred1.makeVisible();
            
            shipred2.changeColor("red");
            shipred2.moveHorizontal(-70);
            shipred2.moveVertical(160);
            shipred2.changeSize(10);
            shipred2.makeVisible();
            
            shipred3.changeColor("white");
            shipred3.moveHorizontal(-80);
            shipred3.moveVertical(160);
            shipred3.changeSize(10);
            shipred3.makeVisible();
            
            shipred4.changeColor("white");
            shipred4.moveHorizontal(-60);
            shipred4.moveVertical(160);
            shipred4.changeSize(10);
            shipred4.makeVisible();
            
            shipred5.changeColor("white");
            shipred5.moveHorizontal(-60);
            shipred5.moveVertical(150);
            shipred5.changeSize(10);
            shipred5.makeVisible();
            
            shipred6.changeColor("blue");
            shipred6.moveHorizontal(-60);
            shipred6.moveVertical(140);
            shipred6.changeSize(10);
            shipred6.makeVisible();
            
            ship2.changeColor("white");
            ship2.moveHorizontal(-70);
            ship2.moveVertical(130);
            ship2.changeSize(10);
            ship2.makeVisible();
            
            ship3.changeColor("white");
            ship3.moveHorizontal(-70);
            ship3.moveVertical(140);
            ship3.changeSize(10);
            ship3.makeVisible();
            
            ship4.changeColor("white");
            ship4.moveHorizontal(-50);
            ship4.moveVertical(140);
            ship4.changeSize(10);
            ship4.makeVisible();
            
            ship5.changeColor("white");
            ship5.moveHorizontal(-50);
            ship5.moveVertical(130);
            ship5.changeSize(10);
            ship5.makeVisible();
            
            ship6.changeColor("red");
            ship6.moveHorizontal(-50);
            ship6.moveVertical(120);
            ship6.changeSize(10);
            ship6.makeVisible();
            
            ship7.changeColor("blue");
            ship7.moveHorizontal(-50);
            ship7.moveVertical(150);
            ship7.changeSize(10);
            ship7.makeVisible();
            
            ship8.changeColor("white");
            ship8.moveHorizontal(-50);
            ship8.moveVertical(160);
            ship8.changeSize(10);
            ship8.makeVisible();
            
            ship9.changeColor("white");
            ship9.moveHorizontal(-50);
            ship9.moveVertical(170);
            ship9.changeSize(10);
            ship9.makeVisible();
            
            shipp1.changeColor("white");
            shipp1.moveHorizontal(-60);
            shipp1.moveVertical(170);
            shipp1.changeSize(10);
            shipp1.makeVisible();
            
            shipp2.changeColor("white");
            shipp2.moveHorizontal(-7tksa0);
            shipp2.moveVertical(170);
            shipp2.changeSize(10);
            shipp2.makeVisible();
            
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        back.changeColor("black");
        shipwhite1.changeColor("white");
        shipwhite2.changeColor("white");
        shipwhite3.changeColor("white");
        shipwhite4.changeColor("white");
        shipwhite5.changeColor("white");
        shipwhite6.changeColor("white");
        shipwhite7.changeColor("white");
        shipwhite8.changeColor("white");
        shipwhite9.changeColor("white");
        shipwhite0.changeColor("white");
        shipred1.changeColor("white");
        shipred2.changeColor("white");
        shipred3.changeColor("white");
        shipred4.changeColor("white");
        shipred5.changeColor("white");
        shipred6.changeColor("white");
        ship1.changeColor("white");
        ship2.changeColor("white");
        ship3.changeColor("white");
        ship4.changeColor("white");
        ship5.changeColor("white");
        ship6.changeColor("white");
        ship7.changeColor("white");
        ship8.changeColor("white");
        ship9.changeColor("white");
        shipp1.changeColor("white");
        shipp2.changeColor("white");
        shipp3.changeColor("white");
        shipp4.changeColor("white");
        shipp5.changeColor("white");
        shipp6.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        back.changeColor("red");
        shipwhite1.changeColor("black");
        shipwhite2.changeColor("black");
        shipwhite3.changeColor("black");
        shipwhite4.changeColor("black");
        shipwhite5.changeColor("black");
        shipwhite6.changeColor("black");
        shipwhite7.changeColor("black");
        shipwhite8.changeColor("black");
        shipwhite9.changeColor("black");
        shipwhite0.changeColor("black");
        shipred1.changeColor("black");
        shipred2.changeColor("black");
        shipred3.changeColor("black");
        shipred4.changeColor("black");
        shipred5.changeColor("black");
        shipred6.changeColor("black");
        ship1.changeColor("white");
        ship2.changeColor("white");
        ship3.changeColor("white");
        ship4.changeColor("white");
        ship5.changeColor("white");
        ship6.changeColor("white");
        ship7.changeColor("white");
        ship8.changeColor("white");
        ship9.changeColor("white");
        shipp1.changeColor("white");
        shipp2.changeColor("white");
        shipp3.changeColor("white");
        shipp4.changeColor("white");
        shipp5.changeColor("white");
        shipp6.changeColor("white");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
