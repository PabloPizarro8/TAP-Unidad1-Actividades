/*
TOPICOS AVANZADOS DE PROGRAMACION
Actividad 21

Pablo Pizarro Chalup
20550431
 */

package paquete;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

public class animacion extends MIDlet implements CommandListener {

	private Form mMainForm;
	private Display display;

	public animacion() {
		mMainForm = new Form("animacionMIDlet");
		
		mMainForm.append(new StringItem (null, "Hola pelota"));
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
