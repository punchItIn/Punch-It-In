package com.punch;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.dynobjx.core.android.domain.BaseActivity;

public class ExpenseIncomeScreen extends BaseActivity implements android.view.View.OnClickListener {
	
	private ImageView ivExpenses;
	private ImageView ivHome;
	private ImageView ivBadges;
	
	@Override
	public void onCreate(Bundle s) {
		super.onCreate(s);
		setContentView(R.layout.main);
		initComponents();
	}
	
	public void initComponents() {
		ivExpenses = (ImageView) findViewById(R.id.ivExpenses);
		ivHome = (ImageView) findViewById(R.id.ivHome);
		ivBadges = (ImageView) findViewById(R.id.ivBadge);

		ivExpenses.setOnClickListener(this);
		ivHome.setOnClickListener(this);
		ivBadges.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
