package com.account.controller.action;

public class ActionFactory {
	
	private ActionFactory() {}
	
	private static ActionFactory instance = new ActionFactory();
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		
		if(command.equals("account_info")) {
			action = new AccountInfo();
		} else if(command.equals("account_form")) {
			action = new AccountFormAction();
		} else if(command.equals("account_form2")) {
			action = new AccountFormAction2();
		} else if(command.equals("account_success")) {
			action = new AccountSuccessAction();
		} else if(command.equals("login_form")) {
			action = new LoginFormAction();
		} else if(command.equals("email_login_form")) {
			action = new EmailLoginFormAction();
		} else if(command.equals("phone_login_form")) {
			action = new PhoneLoginFormAction();
		} else if(command.equals("login_success")) {
			action = new LoginSuccessAction();
		} else if(command.equals("qna_main")) {
			action = new QNAMainAction();
		}
		
		return action;
	}
}
