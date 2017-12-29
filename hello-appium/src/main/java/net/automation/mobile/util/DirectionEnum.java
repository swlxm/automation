package net.automation.mobile.util;

public enum DirectionEnum {

	UP("UP"),
	DOWN("DOWN"),
	LEFT("LEFT"),
	RIGHT("RIGHT");

	private String direction;
	
	DirectionEnum(String direction) {
		this.direction = direction;
	}
	
	public String getType() {
		return this.direction;
	}
	
	@Override
	public String toString() {
		return direction;
	}

}
