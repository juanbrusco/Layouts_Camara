package android.com.layouts_camara;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnLinear = (Button) findViewById(R.id.btnLinear);
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, LinearLayoutActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
        Button btnFrame = (Button) findViewById(R.id.btnFrame);
        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, FrameLayoutActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
        Button btnRelative = (Button) findViewById(R.id.btnRelative);
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
        Button btnTable = (Button) findViewById(R.id.btnTable);
        btnTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, TableLayoutActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
        Button btnGrid = (Button) findViewById(R.id.btnGrid);
        btnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, GridLayoutActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
        Button btnTab = (Button) findViewById(R.id.btnTab);
        btnTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, TabLayoutActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
        Button btnCamara = (Button) findViewById(R.id.btnCamara);
        btnCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, CameraActivity.class);
                MainActivity.this.startActivity(myIntent);
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
