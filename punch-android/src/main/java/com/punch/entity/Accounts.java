package com.punch.entity;

import com.dynobjx.core.android.model.LongPkEntity;

public class Accounts extends LongPkEntity{

	private static final long serialVersionUID = 1L;
	
	String name;
	String description;
	String type;
	double balance;
	
}
