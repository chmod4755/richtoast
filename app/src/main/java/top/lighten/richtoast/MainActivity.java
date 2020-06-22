package top.lighten.richtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button button = (Button) findViewById(R.id.show_btn);
		button.setOnClickListener(this::showTip);
	}

	private void showTip(View view) {
		Toast toast = new Toast(this);
		LayoutInflater layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
		View v = layoutInflater.inflate(R.layout.layout_toast, null);
//		TextView textView = v.findViewById(R.id.diary_toast_tv);
		toast.setView(v);
		toast.show();
	}
}