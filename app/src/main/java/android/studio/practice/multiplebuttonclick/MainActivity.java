package android.studio.practice.multiplebuttonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton1, mButton2;
    TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mTextView1 = findViewById(R.id.textView1);

        mButton1.setOnClickListener(new MyOnclickListener());
        mButton2.setOnClickListener(new MyOnclickListener2());
    }
    private class MyOnclickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            mTextView1.setText("You clicked Hanbin's button!");
        }
    }
    private class MyOnclickListener2 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            mTextView1.setText("You clicked my 2nd button!");
        }
    }
}