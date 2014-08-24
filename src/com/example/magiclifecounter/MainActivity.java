package com.example.magiclifecounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	//Player p1 = new Player();
	private int p1Health = 20;
	private int p2Health = 20;

    @Override
    public void onCreate(Bundle savedInstanceState) {	
        super.onCreate(savedInstanceState);
        
        // Set the activity layout (using activity_main.xml) as the template
        setContentView(R.layout.activity_main);  
        
        // Player Counters
        final TextView p1HealthText = (TextView) findViewById(R.id.p1HealthText);
        final TextView p2HealthText = (TextView) findViewById(R.id.p2HealthText);
                
        // Player 1 Buttons
        final Button p1Add5HealthButton   = (Button) findViewById(R.id.p1_add_5_health);
        final Button p1Minus5HealthButton = (Button) findViewById(R.id.p1_minus_5_health);
        final Button p1Add1HealthButton   = (Button) findViewById(R.id.p1_add_1_health);
        final Button p1Minus1HealthButton = (Button) findViewById(R.id.p1_minus_1_health);        
        
        // Player 2 Buttons
        final Button p2Add5HealthButton   = (Button) findViewById(R.id.p2_add_5_health);
        final Button p2Minus5HealthButton = (Button) findViewById(R.id.p2_minus_5_health);
        final Button p2Add1HealthButton   = (Button) findViewById(R.id.p2_add_1_health);
        final Button p2Minus1HealthButton = (Button) findViewById(R.id.p2_minus_1_health);            
        
        p1Add1HealthButton.setOnClickListener(new OnClickListener() {      	
        	public void onClick(View v) {
        		p1Health++;
        		p1HealthText.setText(Integer.valueOf(p1Health).toString());
        	}
        });
        
        p2Add1HealthButton.setOnClickListener(new OnClickListener() {      	
        	public void onClick(View v) {
        		p2Health++;
        		p2HealthText.setText(Integer.valueOf(p2Health).toString());
        	}
        });
        
        p1Add5HealthButton.setOnClickListener(new OnClickListener() {       	
        	public void onClick(View v) {
        		p1Health += 5;
        		p1HealthText.setText(Integer.valueOf(p1Health).toString());		
        	}
        });
        
        p2Add5HealthButton.setOnClickListener(new OnClickListener() {       	
        	public void onClick(View v) {
        		p2Health += 5;
        		p2HealthText.setText(Integer.valueOf(p2Health).toString());		
        	}
        });
        
		p1Minus1HealthButton.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		p1Health--;
        		p1HealthText.setText(Integer.valueOf(p1Health).toString());
        	}
        });
		
		p2Minus1HealthButton.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		p2Health--;
        		p2HealthText.setText(Integer.valueOf(p2Health).toString());
        	}
        });
        
        p1Minus5HealthButton.setOnClickListener(new OnClickListener() {       	
        	public void onClick(View v) {
        		p1Health -= 5;
        		p1HealthText.setText(Integer.valueOf(p1Health).toString());
        	}
        });
        
        p2Minus5HealthButton.setOnClickListener(new OnClickListener() {       	
        	public void onClick(View v) {
        		p2Health -= 5;
        		p2HealthText.setText(Integer.valueOf(p2Health).toString());
        	}
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    /** Called when the user clicks the Send button */
    public void aboutPage(View view) {
        // Do something in response to button
    	//Toast.makeText(this, "ABOUT PAGE", Toast.LENGTH_SHORT).show();
    	
    	Intent intent = new Intent(this, DisplayAboutActivity.class);
    	startActivity(intent);
    }
    
   
    
    // this method is called at button click because we assigned the
    // name to the "onClick" property of the button
    public void p1Add5HealthClick(View view) {
    	
    	//int textView = R.string.calc;
    	//Toast.makeText(this, textView, Toast.LENGTH_SHORT).show();
    	
    	//Player p1 = new Player();
    	
    	//p1.incrementHealth(5);
    	//String p1Health = String.valueOf(p1.getHealth());
    	
    	Toast.makeText(this, p1Health, Toast.LENGTH_LONG).show();
    	//Toast.makeText(this, "Added 5 Hp", Toast.LENGTH_LONG).show();
    	
    }	

    
}
