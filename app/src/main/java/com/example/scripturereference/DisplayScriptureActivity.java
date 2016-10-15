package com.example.scripturereference;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayScriptureActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_scripture);

    // retrieve the scripture reference fields from the main activity
    Intent intent = getIntent();
    String book = intent.getStringExtra(MainActivity.EXTRA_BOOK);
    String chapter = intent.getStringExtra(MainActivity.EXTRA_CHAPTER);
    String verse = intent.getStringExtra(MainActivity.EXTRA_VERSE);

    // create a new TextView to display the scripture reference
    TextView tvScriptureReference = new TextView(this);
    tvScriptureReference.setTextAppearance(android.R.style.TextAppearance_Material_Medium);
    tvScriptureReference.setText("Your favorite scripture is: " +
        book + " " + chapter + ":" + verse);
    ViewGroup layout = (ViewGroup)findViewById(R.id.activity_display_scripture);
    layout.addView(tvScriptureReference);
  }
}
