package com.adipso.udacity.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {

    private Toast mCurrentToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init
        mCurrentToast = null;
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
            Toast.makeText(this, getString(R.string.activity_main_msg_settings), Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Toast newToast = null;

        int idView = v.getId();
        switch (idView) {
            case R.id.cmd_media_streamer:
                newToast = Toast.makeText(this, getString(R.string.activity_main_msg_button_format, getString(R.string.activity_main_cmd_media_streamer)), Toast.LENGTH_SHORT);
                break;
            case R.id.cmd_super_duo1:
                newToast = Toast.makeText(this, getString(R.string.activity_main_msg_button_format, getString(R.string.activity_main_cmd_super_duo1)), Toast.LENGTH_SHORT);
                break;
            case R.id.cmd_super_duo2:
                newToast = Toast.makeText(this, getString(R.string.activity_main_msg_button_format, getString(R.string.activity_main_cmd_super_duo2)), Toast.LENGTH_SHORT);
                break;
            case R.id.cmd_ant_terminator:
                newToast = Toast.makeText(this, getString(R.string.activity_main_msg_button_format, getString(R.string.activity_main_cmd_ant_terminator)), Toast.LENGTH_SHORT);
                break;
            case R.id.cmd_materialize:
                newToast = Toast.makeText(this, getString(R.string.activity_main_msg_button_format, getString(R.string.activity_main_cmd_materialize)), Toast.LENGTH_SHORT);
                break;
            case R.id.cmd_captsone:
                newToast = Toast.makeText(this, getString(R.string.activity_main_msg_button_format, getString(R.string.activity_main_msg_cmd_captstone)), Toast.LENGTH_SHORT);
                break;
        }

        if (newToast != null) {
            if (mCurrentToast != null) {
                mCurrentToast.cancel();
            }
            mCurrentToast = newToast;
            mCurrentToast.show();
        }
    }
}
