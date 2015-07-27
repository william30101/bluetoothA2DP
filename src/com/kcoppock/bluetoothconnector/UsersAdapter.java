package com.kcoppock.bluetoothconnector;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class UsersAdapter extends ArrayAdapter<User> {
    public UsersAdapter(Context context, ArrayList<User> users) {
       super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       // Get the data item for this position
       User user = getItem(position);    
       // Check if an existing view is being reused, otherwise inflate the view
       if (convertView == null) {
          convertView = LayoutInflater.from(getContext()).inflate(R.layout.ble_device, parent, false);
       }
       // Lookup view for data population
       TextView bleName = (TextView) convertView.findViewById(R.id.bleName);
       TextView bleHome = (TextView) convertView.findViewById(R.id.bleAddress);
       // Populate the data into the template view using the data object
       bleName.setText(user.name);
       bleHome.setText(user.address);
       // Return the completed view to render on screen
       return convertView;
   }
}