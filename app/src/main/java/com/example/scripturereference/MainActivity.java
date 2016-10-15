package com.example.scripturereference;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  public static final String EXTRA_BOOK = "com.example.scripturereference.EXTRA_BOOK";
  public static final String EXTRA_CHAPTER = "com.example.scripturereference.EXTRA_CHAPTER";
  public static final String EXTRA_VERSE = "com.example.scripturereference.EXTRA_VERSE";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  /** Called when user clicks the Share button */
  public void shareScripture(View view) {
    // create an Intent to start the 2nd activity
    Intent intent = new Intent(this, DisplayScriptureActivity.class);

    // retrieve the scripture reference fields from the main activity
    EditText etBook = (EditText)findViewById(R.id.etBook);
    String book = etBook.getText().toString();
    EditText etChapter = (EditText)findViewById(R.id.etChapter);
    String chapter = etChapter.getText().toString();
    EditText etVerse = (EditText)findViewById(R.id.etVerse);
    String verse = etVerse.getText().toString();

    // attach the scripture reference fields to the intent
    intent.putExtra(EXTRA_BOOK, book);
    intent.putExtra(EXTRA_CHAPTER, chapter);
    intent.putExtra(EXTRA_VERSE, verse);

    // start the 2nd activity
    startActivity(intent);
  }
}
