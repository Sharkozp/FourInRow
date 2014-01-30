package an.dikij.fourinarow;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class GameScreen extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game);
		
		Button button = (Button) findViewById(R.id.backButtonGame);
		button.setOnClickListener(new ChangeScreen().changeScreen(this, Main.class));
	}
}
