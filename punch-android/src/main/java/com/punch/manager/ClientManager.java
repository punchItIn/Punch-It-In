package com.punch.manager;

import java.util.ArrayList;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import android.util.Log;

import com.dynobjx.core.android.service.CustomHttpClient;

public class ClientManager {
	
	public static String TAG = "CLIENT_MANAGER";
	
	public static int postExpense(String id, String expense) {
		int result = 0;
		String url = "http://10.0.2.2/";
		ArrayList<NameValuePair> postParameters = new ArrayList<NameValuePair>();
		postParameters.add(new BasicNameValuePair("id", id));
		postParameters.add(new BasicNameValuePair("expense", expense));
		try {
			result = CustomHttpClient.executeHTTPPost(url, postParameters);

		} catch (Exception e) {
			e.printStackTrace();
		}
		Log.d(TAG, url);
		return result;
	}

}
