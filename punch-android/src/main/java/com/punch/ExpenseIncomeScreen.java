package com.punch;

import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.dynobjx.core.android.domain.BaseActivity;

public class ExpenseIncomeScreen extends BaseActivity implements
		OnClickListener {

	private ImageView ivExpenses;
	private ImageView ivHome;
	private ImageView ivBadges;
	private LinearLayout llExpense;
	private LinearLayout llIncome;
	private Button btnExpense;
	private Button btnIncome;
	private Button btnSubmitExpense;
	private Button btnSubmitIncome;
	private Button btnDateExpense;
	private Button btnDateIncome;
	private int[] intDate;
	private Spinner spCategories;
	private Spinner spSubCategories;
	
	@Override
	public void onCreate(Bundle s) {
		super.onCreate(s);
		setContentView(R.layout.expense);
		initComponents();
	}

	public void initComponents() {
		spCategories = (Spinner) findViewById(R.id.spCategories);
		spSubCategories = (Spinner) findViewById(R.id.spSubCategories);
		btnDateExpense = (Button) findViewById(R.id.btnDateExpense);
		btnDateIncome = (Button) findViewById(R.id.btnDateIncome);
		btnSubmitExpense = (Button) findViewById(R.id.btnSubmitExpense);
		btnSubmitIncome = (Button) findViewById(R.id.btnSubmitIncome);
		ivExpenses = (ImageView) findViewById(R.id.ivExpenses);
		ivHome = (ImageView) findViewById(R.id.ivHome);
		ivBadges = (ImageView) findViewById(R.id.ivBadge);
		llExpense = (LinearLayout) findViewById(R.id.llExpense);
		llIncome = (LinearLayout) findViewById(R.id.llIncome);
		btnExpense = (Button) findViewById(R.id.btnExpense);
		btnIncome = (Button) findViewById(R.id.btnIncome);
		llExpense.setVisibility(View.VISIBLE);
		llIncome.setVisibility(View.INVISIBLE);
		ivExpenses.setOnClickListener(this);
		ivHome.setOnClickListener(this);
		ivBadges.setOnClickListener(this);
		btnExpense.setOnClickListener(this);
		btnIncome.setOnClickListener(this);
		btnSubmitExpense.setOnClickListener(this);
		btnSubmitIncome.setOnClickListener(this);
		btnDateExpense.setOnClickListener(this);
		btnDateIncome.setOnClickListener(this);
		
		spCategories.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, getResources()
						.getStringArray(R.array.categories)));
		
		spCategories.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int pos, long id) {
				if(pos == 0){
					spSubCategories.setAdapter(new ArrayAdapter<String>(getApplicationContext(),
							android.R.layout.simple_spinner_item, getResources()
									.getStringArray(R.array.home)));
				}else if(pos == 1){
					spSubCategories.setAdapter(new ArrayAdapter<String>(getApplicationContext(),
							android.R.layout.simple_spinner_item, getResources()
									.getStringArray(R.array.food)));
					
				}else if(pos == 2){
					spSubCategories.setAdapter(new ArrayAdapter<String>(getApplicationContext(),
							android.R.layout.simple_spinner_item, getResources()
									.getStringArray(R.array.shopping)));
					
				}else if(pos == 3){
					spSubCategories.setAdapter(new ArrayAdapter<String>(getApplicationContext(),
							android.R.layout.simple_spinner_item, getResources()
									.getStringArray(R.array.entertainment)));
					
				}else if(pos == 4){
					spSubCategories.setAdapter(new ArrayAdapter<String>(getApplicationContext(),
							android.R.layout.simple_spinner_item, getResources()
									.getStringArray(R.array.health)));
					
				}else if(pos == 5){
					spSubCategories.setAdapter(new ArrayAdapter<String>(getApplicationContext(),
							android.R.layout.simple_spinner_item, getResources()
									.getStringArray(R.array.transportation)));
					
				}else if(pos == 6){
					spSubCategories.setAdapter(new ArrayAdapter<String>(getApplicationContext(),
							android.R.layout.simple_spinner_item, getResources()
									.getStringArray(R.array.miscellaneous)));
				}
			
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		Calendar calendar = Calendar.getInstance();
		intDate = new int[] { calendar.get(Calendar.YEAR),
				calendar.get(Calendar.MONTH),
				calendar.get(Calendar.DAY_OF_MONTH) };
		btnDateExpense.setText(intDate[0]+ "/" + (intDate[1] + 1) + "/" + intDate[2]);
		btnDateIncome.setText(intDate[0] + "/" + (intDate[1] + 1) + "/" + intDate[2]);
	
	}

	private DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {

		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			intDate[0] = year;
			intDate[1] = monthOfYear;
			intDate[2] = dayOfMonth;
			btnDateExpense.setText(intDate[0]+ "/" + (intDate[1] + 1) + "/" + intDate[2]);
			btnDateIncome.setText(intDate[0] + "/" + (intDate[1] + 1) + "/" + intDate[2]);
		}
	};
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btnDateExpense:
			DatePickerDialog datePickerDialog = new DatePickerDialog(this,
					mDateSetListener, intDate[0], intDate[1], intDate[2]);
			datePickerDialog.show();
			break;
		case R.id.btnDateIncome:

			break;

		case R.id.btnSubmitExpense:
			Dialog dialog = new Dialog(this, android.R.style.Theme_Translucent_NoTitleBar);
			dialog.setTitle("COFFEE BADGE!");
			dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
			dialog.setContentView(R.layout.dialog_badge);
			
			dialog.setOnDismissListener(new OnDismissListener() {
				
				@Override
				public void onDismiss(DialogInterface arg0) {
					startActivity(new Intent(getApplicationContext(), MainMenu.class));
				}
			});
			dialog.show();

			break;
		case R.id.btnSubmitIncome:
			finish();
			break;

		case R.id.btnExpense:
			llExpense.setVisibility(View.VISIBLE);
			llIncome.setVisibility(View.INVISIBLE);
			break;

		case R.id.btnIncome:
			llExpense.setVisibility(View.INVISIBLE);
			llIncome.setVisibility(View.VISIBLE);
			break;

		case R.id.ivExpenses:

			break;
		case R.id.ivHome:
			startActivity(new Intent(this, MainMenu.class));
			break;
		case R.id.ivBadge:
			startActivity(new Intent(this, AchievementScreen.class));
			break;
		default:
			break;
		}
	}

}
