package com.benmathes.seinfeldmethod;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.Random;

/**
 * Created by benmathes on 1/16/14.
 */
public class TaskAdapter extends BaseAdapter {
    private Context mContext;

    public TaskAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return 20; // TODO: store the tasks...
    }

    public Object getItem(int position) {
        return null; // TODO: pull the item 
    }

    public long getItemId(int position) {
        return position;
    }

    // create a new TaskView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            Random r = new Random();
            int random = r.nextInt(100) + 100;
            view = new View(mContext);
            view.setMinimumHeight(200);
            view.setMinimumWidth(50);
            view.setBackgroundColor(Color.rgb(random, random, random));
        } else {
            view = convertView;
        }
        //view.setImageResource(R.drawable.sample_2);

        return view;
    }
}
