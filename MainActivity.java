package com.example.app03;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.option_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int itemId = item.getItemId();
		String moji = "";

		switch (itemId) {
		case R.id.item1 : moji = "メニュー１が選択されました。"; break;
		case R.id.item2 : moji = "メニュー２が選択されました。"; break;
		case R.id.item3 : moji = "メニュー３が選択されました。"; break;
		case R.id.item4 : moji = "サブメニュー１が選択されました。"; break;
		case R.id.item5 : moji = "サブメニュー２が選択されました。"; break;
		}

		Toast t = Toast.makeText(this, moji, Toast.LENGTH_SHORT);
		t.show();

		return super.onOptionsItemSelected(item);
	}
}
