package com.ccunix.icar.employees.enums;


public enum CartStateEnum {
	SUCCESS(1, "操作成功"), INNER_ERROR(-1001, "操作失败"), EMPTY(-1002, "车牌号为空");

	private int state;

	private String stateInfo;

	private CartStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public static CartStateEnum stateOf(int index) {
		for (CartStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}

}
