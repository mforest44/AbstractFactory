
import javax.swing.*;

/**
 * Created by Maxime Forest on 10/01/2017.
 */
public class MarioThemeButton extends JButton implements IButton{

    public JButton getButton(){
        return new MarioTheme().createButton();
    }
}
