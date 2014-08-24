package com.example.magiclifecounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class DisplayAboutActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Set the activity layout (using activity_main.xml) as the template
        setContentView(R.layout.activity_display_about);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_display_about, menu);
        return true;
    }

    /** Called when the user clicks the Send button */
    public void mainPage(View view) {
        // Do something in response to button
    	//Toast.makeText(this, "ABOUT PAGE", Toast.LENGTH_SHORT).show();
    	
    	Intent intent = new Intent(this, MainActivity.class);   	
    	startActivity(intent);
    }
    
    
    
}
