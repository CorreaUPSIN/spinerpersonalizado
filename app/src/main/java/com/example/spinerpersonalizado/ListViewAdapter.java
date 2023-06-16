package com.example.spinerpersonalizado;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<ItemData> {
    private Activity context;
    private ArrayList<ItemData> list;
    private LayoutInflater inflater;

    public ListViewAdapter(Activity context, ArrayList<ItemData> list) {
        super(context, R.layout.activity_list, list);
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.activity_list, parent, false);
        }

        ImageView imagen = convertView.findViewById(R.id.imgCategoria);
        TextView textCategoria = convertView.findViewById(R.id.lblCategorias);
        TextView textDescripcion = convertView.findViewById(R.id.lblDescripcion);

        imagen.setImageResource(list.get(position).getImageId());
        textCategoria.setText(list.get(position).getTextCategoria());
        textDescripcion.setText(list.get(position).getTextDescripcion());

        return convertView;
    }
}
