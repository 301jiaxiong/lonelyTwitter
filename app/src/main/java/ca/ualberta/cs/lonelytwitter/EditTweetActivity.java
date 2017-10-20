package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class EditTweetActivity extends Activity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        Intent intent = getIntent();

        /*Take from https://stackoverflow.com/questions/8452526/android-can-i-use-putextra-to-pass-multiple-values
        //2017/10/19
         */

        //collect the item's value from MainActivity

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        textView = (TextView) findViewById(R.id.text);
        textView.setText(message);
    }
}
