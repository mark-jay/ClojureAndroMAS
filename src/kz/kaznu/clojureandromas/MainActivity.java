package kz.kaznu.clojureandromas;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button runButton = (Button) findViewById(R.id.runButton);
        Button clearButton = (Button) findViewById(R.id.clearButton);
        
        runButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				TextView resultView = (TextView) findViewById(R.id.resultView);
				String inputText = ((TextView)findViewById(R.id.inputEditText)).getText().toString();
				resultView.setText(resultView.getText()+inputText);
			}
		});
        
        clearButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				TextView resultView = (TextView) findViewById(R.id.resultView);
				resultView.setText("");
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
