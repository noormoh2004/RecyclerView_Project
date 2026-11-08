package com.example.ecommercerecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommercerecyclerview.adapter.ProductAdapter;
import com.example.ecommercerecyclerview.model.ProductClass;

import java.util.ArrayList;

public class ProductGallaryActivity extends AppCompatActivity {

ArrayList<ProductClass> productClassArraylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_gallary);

        RecyclerView rv = findViewById(R.id.rv);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        rv.setLayoutManager(gridLayoutManager);

        productClassArraylist=new ArrayList<>();
        productClassArraylist.add(new ProductClass(1, R.drawable.bitzwolf_bcc_camera , "Bitzwolf B-CC1 Camera 1080P Hd Webcame" , "US$48.89"));
        productClassArraylist.add(new ProductClass(2, R.drawable.camera2 , "Bitzwolf B-CC1 Camera 1080P Hd Webcame" , "US$55.89"));
        productClassArraylist.add(new ProductClass(3, R.drawable.camera3 , "Bitzwolf B-CC1 Camera 1080P Hd Webcame" , "US$78.89"));
        productClassArraylist.add(new ProductClass(4, R.drawable.camera4 , "Bitzwolf B-CC1 Camera 1080P Hd Webcame" , "US$88.55"));
        productClassArraylist.add(new ProductClass(5, R.drawable.camera5 , "Bitzwolf B-CC1 Camera 1080P Hd Webcame" , "US$23.67"));
        productClassArraylist.add(new ProductClass(6, R.drawable.camera6, "Bitzwolf B-CC1 Camera 1080P Hd Webcame" , "US$44.89"));

        ProductAdapter productAdapter = new ProductAdapter(productClassArraylist, this);
        rv.setAdapter(productAdapter);
    }
    }
