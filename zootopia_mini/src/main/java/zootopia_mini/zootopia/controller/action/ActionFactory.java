package zootopia_mini.zootopia.controller.action;

import zootopia_mini.zootopia.controller.main.MainAction;

public class ActionFactory {
	
	private static ActionFactory itc = new ActionFactory();
	
	public static ActionFactory getInstance() {
		return itc;
	}
	public Action getAction(String command) {
		Action ac =null;
		
		if(command.equals("main")) {
			ac = new MainAction();
		}
		
		return ac;
	}


}
