package facade.sample01.application;

import facade.sample01.subsystem.GeneralSwitchFacade;

public class Client {
	public static void main(String args[]) {
		GeneralSwitchFacade gsf = new GeneralSwitchFacade();
		
		gsf.on();
		
		System.out.println("-----------------------");
		
		gsf.off();
	}
}
