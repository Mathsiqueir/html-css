/**
 * DRAW GOOGLE CHROME ICON WITH JAVA APPLET
 *
 * @author (CAHYA DYAZIN)
 * @github gist (https://gist.github.com/dyazincahya/faeb74b80bf95964ce07c043bd3e62df)
 * @version (8/10/2019)
 */

import java.awt.*;
import java.applet.*;

public class Chrome extends Applet
{
    public void paint(Graphics g)
    {
        Color myYellow = new Color(255,235,59); // #FFEB3B
        Color myRed = new Color(244,67,54); // #f44336
        Color myGreen = new Color(76,175,80); // #4CAF50
        Color myWhite = new Color(255,255,255); // #FFFFFF
        Color myBlue = new Color(33,150,243); // #2196F3
        
        g.setColor(myYellow);
        g.fillOval(100,100,200,200);
        g.setColor(myRed);
        g.fillArc(100,100,200,200,0,120);
        g.setColor(myGreen);
        g.fillArc(100,100,200,200,120,120);
        g.setColor(myWhite);
        g.fillOval(155,155,95,95);
        g.setColor(myBlue);
        g.fillOval(165,165,75,75);
    }
}