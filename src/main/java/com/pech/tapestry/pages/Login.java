package com.pech.tapestry.pages;

import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionAttribute;
import org.apache.tapestry5.corelib.components.Zone;

import com.pech.tapestry.model.login.User;

public class Login {

	@Property
	private String username;
	@Property
	private String password;

	@Property
	@SessionAttribute
	private User user;

	@InjectComponent
	private Zone zone;

	public Object onActivate() {
		if (user == null) {
			user = new User();
		}
		return null;
	}

	void onValidateFromLoginForm() {
		System.out.println("User: " + username);
		System.out.println("Password: " + password);
		user.setUsername(username);
		user.setPassword(password);
	}

}
