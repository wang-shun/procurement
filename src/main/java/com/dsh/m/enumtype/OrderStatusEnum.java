package com.dsh.m.enumtype;

public enum OrderStatusEnum {
	
	WAIT(1, "待发货"),
	RECEIVED(2, "接受订单"),
	MODIFYED(3, "修改待确认"),
	SENDED(4, "已发货"),
	FINISHED(5, "已完成"),
	CANCELED(6, "已取消");
	
	private int code;
	private String desc;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	private OrderStatusEnum(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	public static OrderStatusEnum getEnumByCode(int code) {
		for(OrderStatusEnum enumtype:values()) {
			if(enumtype.getCode()==code)
				return enumtype;
		}
		return null;
	}

}
