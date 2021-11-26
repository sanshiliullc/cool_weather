package com.example.collweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.collweather.db.City;
import com.example.collweather.db.County;
import com.example.collweather.db.Province;

import org.litepal.tablemanager.Connector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button createDatabase = (Button) findViewById(R.id.create_database);
        createDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Connector.getDatabase();
            }
        });

        Button addData = (Button) findViewById(R.id.add_data);
        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                City city = new City();
                city.setId(1);
                city.setCityName("绵阳市");
                city.save();

                County county = new County();
                county.setId(1);
                county.setCountyName("涪城区");
                county.save();

                Province province = new Province();
                province.setId(1);
                province.setProvinceName("四川省");
                province.save();
            }
        });
    }
}