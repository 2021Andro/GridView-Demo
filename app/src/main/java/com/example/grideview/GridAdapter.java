package com.example.grideview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class GridAdapter  extends BaseAdapter {

    private ArrayList<String> nameList = new ArrayList<>();
    private ArrayList<Integer> imageList = new ArrayList<>();
    private Context context;
    private LayoutInflater inflater;

    public GridAdapter(Context context, ArrayList<Integer> imageList, ArrayList<String> nameList) {
        this.context = context;
        this.imageList = imageList;
        this.nameList = nameList;
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (inflater == null)
        {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (view == null)
        {
            view = inflater.inflate(R.layout.grid_adapter_layout, viewGroup, false);
        }

        CircleImageView profileImage = view.findViewById(R.id.profile_image);
        TextView tvName = view.findViewById(R.id.tvName);

        profileImage.setImageResource(imageList.get(i));
        tvName.setText(nameList.get(i));

        return view;
    }
}
