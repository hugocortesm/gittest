package com.pech.tapestry.pages;

import org.apache.tapestry5.annotations.Property;

public class PechPage {

	@Property
	private String name;

	void OnActivate() {
		if(null == name) {
			name = "Pech!!";
		}
	}
}
