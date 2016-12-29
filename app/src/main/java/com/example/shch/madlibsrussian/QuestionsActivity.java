package com.example.shch.madlibsrussian;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class QuestionsActivity extends AppCompatActivity {
private Story story;
    private List<Question> questionsList;
    private ListView questionListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon_brain);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setTitle(" MadLibs ");

        setContentView(R.layout.questions_list);
        TextView storyTitle = (TextView) findViewById(R.id.story_title);
        questionListView = (ListView) findViewById(R.id.questions_list_view);
        Intent intent = getIntent();
        story = (Story) intent.getSerializableExtra("STORY");

        storyTitle.setText(story.getTitle());

        questionsList = new ArrayList<Question>();
        populateArrayWithData(questionsList);
        QuestionListAdapter adapter = new QuestionListAdapter(this, R.layout.question_item, questionsList);
        questionListView.setAdapter(adapter);
    }

    private void populateArrayWithData(List<Question> questionsList) {
        questionsList.add(new Question("Who?", "", "$1who"));
        questionsList.add(new Question("When?", "", "$2who"));
        questionsList.add(new Question("Why?", "", "$3who"));
        questionsList.add(new Question("Who?", "", "$1who"));
        questionsList.add(new Question("When?", "", "$2who"));
        questionsList.add(new Question("Why?", "", "$3who"));
        questionsList.add(new Question("Who?", "", "$1who"));
        questionsList.add(new Question("When?", "", "$2who"));
        questionsList.add(new Question("Why?", "", "$3who"));
        questionsList.add(new Question("Who?", "", "$1who"));
        questionsList.add(new Question("When?", "", "$2who"));
        questionsList.add(new Question("Why?", "", "$3who"));
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

    public void goToMain(View view) {
//        Toast.makeText(QuestionsActivity.this, "Go to main", Toast.LENGTH_SHORT).show();
       /* Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);*/
        this.finish();
    }

    public void goToResult(View view) {
        Intent intent = new Intent(this, ResultActivity.class);
        //TODO process all input fields
       // EditText editText = (EditText) findViewById(R.id.edit_message);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra("STORY", story);
        startActivity(intent);
    }
}
