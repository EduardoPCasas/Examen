package com.personajes.springboot.web.app.model;

public class Varita {

	private String wood = "";

	private String core = "";

	private String length = "";

	public Varita(String wood, String core, String length) {
		super();
		this.wood = wood;
		this.core = core;
		this.length = length;
	}

	public Varita() {
	}

	public String getWood() {
		return wood;
	}

	public void setWood(String wood) {
		this.wood = wood;
	}

	public String getCore() {
		return core;
	}

	public void setCore(String core) {
		this.core = core;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Varita [wood=" + wood + ", core=" + core + ", length=" + length + "]";
	}


}
