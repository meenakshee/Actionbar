package com.example.minaxipc.actionbar;

import android.content.ClipData;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        return true;
    }

    public boolean onOptionItemSelected( MenuItem item){
        return MenuChoice(item);
    }
    private void CreateMenu(Menu menu){
        MenuItem mnu1=menu.add(0,0,0,"Item1");{
            mnu1.setIcon(R.drawable.ic_launcher);
            mnu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
        MenuItem mnu2=menu.add(0,1,1,"Item2");{
            mnu2.setIcon(R.drawable.ic_launcher);
            mnu2.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
        MenuItem mnu3=menu.add(0,2,2,"Item3");{
            mnu3.setIcon(R.drawable.ic_launcher);
            mnu3.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
        MenuItem mnu4=menu.add(0,3,3,"Item4");{
            mnu4.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
        MenuItem mnu5=menu.add(0,4,4,"Item5");{
            mnu5.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
} private boolean MenuChoice(MenuItem item){
        switch (item.getItemId()){
            case 0:
                Toast.makeText(this, "You clicked one",Toast.LENGTH_LONG).show();
                return true;
            case 1:
                Toast.makeText(this, "You clicked two",Toast.LENGTH_LONG).show();
               return true;
              case 2:
               Toast.makeText(this, "You clicked three",Toast.LENGTH_LONG).show();
                return true;
            case 3:
                Toast.makeText(this, "You clicked four",Toast.LENGTH_LONG).show();
                return true;
            case 4:
                Toast.makeText(this, "You clicked five",Toast.LENGTH_LONG).show();
                return true;
        }
        return false;
    }
}

