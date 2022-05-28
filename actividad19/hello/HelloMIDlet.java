/*
TOPICOS AVANZADOS DE PROGRAMACION
Actividad 19

Pablo Pizarro Chalup
20550431
 */

package hello;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

public class HelloMIDlet extends MIDlet implements CommandListener {

	private Form mMainForm;
	private Display display;

	public HelloMIDlet() {
		mMainForm = new Form("Hello ME");
		
		mMainForm.append(new StringItem (null, "Hola Worldi!"));
		mMainForm.addCommand(new Command("Exit", Command.EXIT, 0));
		mMainForm.setCommandListener(this);
	}
	
	public void startApp() {
		display = Display.getDisplay(this);
		display.setCurrent(mMainForm);
	}
	
	public void pauseApp() {
	}
	
	public void destroyApp(boolean unconditional) {
	}
	
	public void commandAction(Command aCmd, Displayable aDisp) {
		if(aCmd == new Command("Exit", Command.EXIT, 0)){
			destroyApp(True);
			notifyDestroyed();
		}
	}

}
