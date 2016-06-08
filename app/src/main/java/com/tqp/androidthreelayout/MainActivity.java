package com.tqp.androidthreelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int tag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewStub stub = (ViewStub) findViewById(R.id.vs1);
        stub.inflate();
        final TextView text = (TextView) findViewById(R.id.textView);
        text.setText("点击button试一下");
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tag == 0){
                    tag ++;
                    stub.setVisibility(View.GONE);
                    ViewStub stub1 = (ViewStub) findViewById(R.id.vs2);
                    stub1.inflate();
                    ImageView imageView = (ImageView) findViewById(R.id.imageView);
                    text.setText("这就是ViewStub的效果, 以后记得多用它");
                    Button button2 = (Button) findViewById(R.id.button2);
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MainActivity.this, TextActivity.class);
                            startActivity(intent);
                        }
                    });
                }
            }
        });
    }
}
