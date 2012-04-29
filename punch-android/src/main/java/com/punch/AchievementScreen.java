package com.punch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.dynobjx.core.android.domain.BaseActivity;

public class AchievementScreen extends BaseActivity implements OnClickListener{
	
	private ImageView ivExpense;
	private ImageView ivHome;
	
	public void onCreate(Bundle s){
		super.onCreate(s);
		setContentView(R.layout.achievement_screen);
	
	}
	
	public void initComponents(){
		ivExpense = (ImageView) findViewById(R.id.ivExpenses);
		ivHome = (ImageView) findViewById(R.id.ivHome);
		
		ivExpense.setOnClickListener(this);
		ivHome.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.ivExpenses:
			startActivity(new Intent(this, ExpenseIncomeScreen.class));
			break;
			
		case R.id.ivHome:
			startActivity(new Intent(this, MainMenu.class));
			break;

		default:
			break;
		}
	}

}
