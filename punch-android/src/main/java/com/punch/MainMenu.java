package com.punch;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.dynobjx.core.android.domain.BaseActivity;
import com.punch.manager.ClientManager;

public class MainMenu extends BaseActivity implements OnClickListener {

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
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.ivExpenses:

			break;
		case R.id.ivHome:

			break;
		case R.id.ivBadge:

			break;
		default:
			break;
		}

	}
}
