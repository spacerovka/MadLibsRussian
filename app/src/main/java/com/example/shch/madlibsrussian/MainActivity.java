package com.example.shch.madlibsrussian;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by OnyschenkoSM on 12/28/16.
 */

public class MainActivity extends AppCompatActivity {
    private ListView storyListView;
    private ArrayList storyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon_brain);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setTitle(" MadLibs ");

        setContentView(R.layout.story_list);

        storyListView = (ListView) findViewById(R.id.story_list_view);
        //set list
        storyList = new ArrayList<Story>();
        populateArrayWithData(storyList);
        StoryListAdapter adapter = new StoryListAdapter(this, R.layout.story_item, storyList);
        storyListView.setAdapter(adapter);
        storyListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>adapter, View v, int position, long l){
                Story story = (Story)adapter.getItemAtPosition(position);
//                Toast.makeText(MainActivity.this, story.getTitle(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, QuestionsActivity.class);
                intent.putExtra("STORY", story);
//                //based on item add info to intent
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.main, menu);


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

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void populateArrayWithData(ArrayList storyList){
        storyList.add(new Story("Title one", "fly_blue", "lorem ipsum text", "Story about book bla-bla-bla..."));
        storyList.add(new Story("Title two", "princess", "lorem ipsum text", "Story about princess bla-bla-bla..."));
        storyList.add(new Story("Title one", "castle", "lorem ipsum text", "Story in castle bla-bla-bla..."));
        storyList.add(new Story("Title one", "perates", "lorem ipsum text", "Story about pirates bla-bla-bla..."));
        storyList.add(new Story("Title one", "rocket", "lorem ipsum text", "Story about rocket bla-bla-bla..."));
        storyList.add(new Story("Title one", "fly_blue", "lorem ipsum text", "Story about book bla-bla-bla..."));
        storyList.add(new Story("Title two", "princess", "lorem ipsum text", "Story about princess bla-bla-bla..."));
        storyList.add(new Story("Title one", "castle", "lorem ipsum text", "Story in castle bla-bla-bla..."));
        storyList.add(new Story("Title one", "perates", "lorem ipsum text", "Story about pirates bla-bla-bla..."));
        storyList.add(new Story("Title one", "rocket", "lorem ipsum text", "Story about rocket bla-bla-bla..."));
    }
}
