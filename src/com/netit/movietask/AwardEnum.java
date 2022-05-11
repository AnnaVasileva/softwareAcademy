// © 2022 Anna Vasileva. All rights reserved.

package com.netit.movietask;

public enum AwardEnum {

	OSCAR("Oscar"), GOLDEN_GLOBE("Golden Globe"), GOLDEN_LION("Golden Lion");

	public String label;

	private AwardEnum(String label) {
		this.label = label;
	}
}
