package com.punch.entity;

import com.dynobjx.core.android.model.LongPkEntity;

public class Budgets extends LongPkEntity{

	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String description;
	String timeFrame;
	double total;
	double runningBalance;
	double frequency;
	

}
