package com.example.ecommercerecyclerview.adapter;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommercerecyclerview.R;
import com.example.ecommercerecyclerview.model.ProductClass;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolderClass> {

    ArrayList<ProductClass> arrayList;
    Activity activity ;

    public ProductAdapter(ArrayList<ProductClass> arrayList, Activity activity) {
        this.arrayList = arrayList;
        this.activity = activity;
    }




    @NonNull
    @Override


    public ProductAdapter.ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_design, parent, false);

        return new ViewHolderClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ViewHolderClass holder, int position) {
        holder.img_prod.setImageResource(arrayList.get(position).getImage());
        holder.name_prod.setText(arrayList.get(position).getName());
        holder.price_prod.setText( arrayList.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {

        public ImageView img_prod;
        public TextView name_prod;
        public TextView price_prod;
        public ImageButton btn_cart;
        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            img_prod=itemView.findViewById(R.id.img_prod);
            name_prod=itemView.findViewById(R.id.name_prod);
            price_prod=itemView.findViewById(R.id.price_prod);
            btn_cart=itemView.findViewById(R.id.btn_cart);

        }
    }
}
