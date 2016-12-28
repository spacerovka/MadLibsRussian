package com.example.shch.madlibsrussian;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mbrunarskiy on 12/28/16.
 */
public class StoryListAdapter extends ArrayAdapter<Story> {

    public StoryListAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public StoryListAdapter(Context context, int resource, List<Story> dataList) {
        super(context, resource, dataList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            LayoutInflater viewInflater;
            viewInflater = LayoutInflater.from(getContext());
            view = viewInflater.inflate(R.layout.story_item, null);
        }

        Story story = getItem(position);

        if (story != null) {
            ImageView storyImage = (ImageView) view.findViewById(R.id.icon);
            TextView storyTitle = (TextView) view.findViewById(R.id.story_title);
            TextView description = (TextView) view.findViewById(R.id.description);

            if (storyImage != null) {
                //tt1.setText(p.getId());
                try {
                    String uri = "@drawable/" + story.getImageName();
                    int imageResource = getContext().getResources().getIdentifier(uri, null, getContext().getPackageName());
                    Drawable res = getContext().getResources().getDrawable(imageResource);
                    storyImage.setImageDrawable(res);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            if (storyTitle != null) {
                storyTitle.setText(story.getTitle());
            }

            if (description != null) {
                description.setText(story.getDescription());
            }
        }

        return view;
    }
}
