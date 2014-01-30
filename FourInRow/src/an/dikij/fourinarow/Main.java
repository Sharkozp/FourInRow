package an.dikij.fourinarow;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button timeButton = (Button) findViewById(R.id.bestTimeButton);
		timeButton.setOnClickListener(new ChangeScreen().changeScreen(this,
				BestTime.class));
		Button gameButton = (Button) findViewById(R.id.newGameButton);
		gameButton.setOnClickListener(new ChangeScreen().changeScreen(this,
				GameScreen.class));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(Main.this, BestTime.class);
		startActivity(intent);
		finish();
	}

}
