package com.ccunix.icar.employees.enums;

public enum VipCartEnum {
	SUCCESS(1, "操作成功"), INNER_ERROR(-1001, "操作失败"), EMPTY(-1002, "车牌号为空");
	private int state;

	private String stateInfo;

	private VipCartEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public static VipCartEnum stateOf(int index) {
		for (VipCartEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}

}
