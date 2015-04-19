package org.elvalad.fragment;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {
    private ImageButton historyButton;
    private ImageButton addEventButton;
    private ImageButton momentButton;
    private ImageButton homeButton;
    private ImageButton settingButton;
    private ListView eventListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initToolLayout();
        initListLayoyt();
        initMainLayout();
    }

    private void initToolLayout() {
        historyButton = (ImageButton) findViewById(R.id.history);
        historyButton.setVisibility(View.VISIBLE);
        historyButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v = findViewById(R.id.history);
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    historyButton.setImageResource(R.drawable.history_press);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    v.getBackground().setAlpha(150);
                    historyButton.setImageResource(R.drawable.history);
                }
                return false;
            }
        });
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                }
            }
        });

        addEventButton = (ImageButton) findViewById(R.id.add_event);
        addEventButton.setVisibility(View.VISIBLE);
        addEventButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v = findViewById(R.id.add_event);
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    addEventButton.setImageResource(R.drawable.add_press);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    v.getBackground().setAlpha(150);
                    addEventButton.setImageResource(R.drawable.add);
                }
                return false;
            }
        });
        addEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                }
            }
        });
    }

    private void initListLayoyt() {
        eventListView = (ListView) findViewById(R.id.event);
        eventListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, getData()));
    }

    private List<String> getData() {
        List<String> data = new ArrayList<>();
        data.add("碎片时间1");
        data.add("碎片时间2");
        data.add("碎片时间3");
        data.add("碎片时间4");
        data.add("碎片时间5");
        data.add("碎片时间6");
        data.add("碎片时间7");
        data.add("碎片时间8");
        data.add("碎片时间9");
        data.add("碎片时间10");
        data.add("碎片时间10");
        data.add("碎片时间12");
        return data;
    }

    private void initMainLayout() {
        momentButton = (ImageButton) findViewById(R.id.moment);
        momentButton.setVisibility(View.VISIBLE);
        momentButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v = findViewById(R.id.moment);
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    momentButton.setImageResource(R.drawable.moment_press);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    v.getBackground().setAlpha(150);
                    momentButton.setImageResource(R.drawable.moment);
                }
                return false;
            }
        });
        momentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                }
            }
        });

        homeButton = (ImageButton) findViewById(R.id.home);
        homeButton.setVisibility(View.VISIBLE);
        homeButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v = findViewById(R.id.home);
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    homeButton.setImageResource(R.drawable.home_press);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    v.getBackground().setAlpha(150);
                    homeButton.setImageResource(R.drawable.home);
                }
                return false;
            }
        });
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                }
            }
        });

        settingButton = (ImageButton) findViewById(R.id.setting);
        settingButton.setVisibility(View.VISIBLE);
        settingButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v = findViewById(R.id.setting);
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    settingButton.setImageResource(R.drawable.setting_press);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    v.getBackground().setAlpha(150);
                    settingButton.setImageResource(R.drawable.setting);
                }
                return false;
            }
        });
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.setting:
                        AlertDialog dialog = new AlertDialog.Builder(MainActivity.this).create();
                        Window window = dialog.getWindow();
                        window.setGravity(Gravity.BOTTOM);
                        window.setWindowAnimations(R.style.dialog_anim_style);
                        dialog.show();
                        dialog.getWindow().setContentView(R.layout.custom_dialog);
                        dialog.getWindow().setLayout(595, 375);
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
