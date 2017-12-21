package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Oways on 17-Dec-17.
 */

public class WordAdapter extends ArrayAdapter {

    private int mColorResourseID;

    public WordAdapter(Context context, ArrayList pWords,int ColorResourceID) {
        super(context,0, pWords);
        mColorResourseID=ColorResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    Word my_words=(Word)getItem(position);

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        TextView miwok_textView=(TextView)listItemView.findViewById(R.id.textViewMiwok);
        miwok_textView.setText(my_words.getmMiwokTranslation());

        TextView default_textView=(TextView)listItemView.findViewById(R.id.textViewEnglish);
        default_textView.setText(my_words.getmDefaultTranslation());

        ImageView imageView=(ImageView)listItemView.findViewById(R.id.imageView);
        if(my_words.hasImage()){
            imageView.setImageResource(my_words.getmImageResourceID());
imageView.setVisibility(View.VISIBLE);

        }
        else{

            imageView.setVisibility(View.GONE);
        }

        View textContainer=listItemView.findViewById(R.id.container);
        int color= ContextCompat.getColor(getContext(),mColorResourseID);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
