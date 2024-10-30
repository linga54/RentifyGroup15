package com.example.rentify;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CategoryList extends ArrayAdapter<CategoryEx> {
    private Activity context;
    List<CategoryEx> categories;

    public CategoryList(Activity context, List<CategoryEx> products) {
        super(context, R.layout.layout_category_list, products);
        this.context = context;
        this.categories = categories;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.layout_category_list, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewPrice = (TextView) listViewItem.findViewById(R.id.textViewDescription);

        CategoryEx product = categories.get(position);
        textViewName.setText(product.getProductName());
        textViewPrice.setText(String.valueOf(product.getDescription()));
        return listViewItem;
    }
}

