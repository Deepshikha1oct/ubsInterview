package com.ubs.opsit.interviews.constants;

public enum Lamps {

	YELLOW("Y"), RED("R"), OFF("O");

	private String value;

	private Lamps(String value) {
		this.value = value;
	}

	public String getLampValue() {

		return value;

	}

}
