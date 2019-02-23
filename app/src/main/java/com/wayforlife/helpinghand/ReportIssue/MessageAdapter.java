package com.wayforlife.helpinghand.ReportIssue;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.wayforlife.helpinghand.R;

import java.util.List;

public class MessageAdapter extends ArrayAdapter<Message> {
    public MessageAdapter(Context context, int resource, List<Message> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_message, parent, false);
        }

        ImageView imageImageView = convertView.findViewById(R.id.image);
        TextView datetimeTextView = convertView.findViewById(R.id.dateTime);
        TextView addressTextView = convertView.findViewById(R.id.address);
        TextView messageTextView = convertView.findViewById(R.id.message);

        Message message = getItem(position);

        boolean isPhoto = message.getImageurl() != null;
        if (isPhoto) {
            imageImageView.setVisibility(View.VISIBLE);
            messageTextView.setVisibility(View.GONE);

            Glide.with(imageImageView.getContext())
                    .load(message.getImageurl())
                    .into(imageImageView);
        } else {
            imageImageView.setVisibility(View.GONE);
            messageTextView.setVisibility(View.VISIBLE);
            messageTextView.setText(message.getMessage());
        }
        addressTextView.setText(message.getAddress());
        datetimeTextView.setText(message.getDatetime());

        return convertView;
    }
}