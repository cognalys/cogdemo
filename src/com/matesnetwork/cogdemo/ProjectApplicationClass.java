package com.matesnetwork.cogdemo;

import com.matesnetwork.callverification.Cognalys;

import android.app.Application;

public class ProjectApplicationClass extends Application{
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Cognalys.enableAnalytics(getApplicationContext(), true, true);
	}

}
