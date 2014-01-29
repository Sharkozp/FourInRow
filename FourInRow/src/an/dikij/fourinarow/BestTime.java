package an.dikij.fourinarow;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class BestTime extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.besttime);
		
		Button button = (Button) findViewById(R.id.backButtonScore);
		button.setOnClickListener(new ChangeScreen().changeScreen(this, Main.class));
	}
}
