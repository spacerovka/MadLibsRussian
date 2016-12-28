package com.example.shch.madlibsrussian;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mbrunarskiy on 12/28/16.
 */
public class QuestionListAdapter extends ArrayAdapter<Question> {

    public QuestionListAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public QuestionListAdapter(Context context, int resource, List<Question> dataList) {
        super(context, resource, dataList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            LayoutInflater viewInflater;
            viewInflater = LayoutInflater.from(getContext());
            view = viewInflater.inflate(R.layout.question_item, null);
        }

        Question question = getItem(position);

        if (question != null) {

            TextView title = (TextView) view.findViewById(R.id.question_title);
            EditText input = (EditText) view.findViewById(R.id.question_input);

            if (question != null) {
                title.setText(question.getTitle());
            }

//            if (input != null) {
//                input.setText(question.getDescription());
//            }
        }

        return view;
    }
}
