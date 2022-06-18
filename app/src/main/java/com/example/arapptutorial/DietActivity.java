package com.example.arapptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DietActivity extends AppCompatActivity {

    Button btnRecipe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);
        btnRecipe = findViewById(R.id.reciped);
        MyListData[] myListData = new MyListData[] {
         new MyListData("Tomato Rigatoni", "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh4Eu-oOKJBZ9ZGcKTPQN1PvZYM_rBEWBvsX6RfrKvDUAOwfRyRbZLNqnybDhFKzlDeOnJ2PoZZEyZeIMvEKzbOqR0I26fAbhn5zNRGUr0c24i0QRz_WDtX90yhxu4UxSoDRrkKiHsDLPosl6mK_y4mbEPTEPuSi9KvRpQbm1Qu2zNiJj4sMFc9z-fb/s1600/picna%20(13).jpeg"),
         new MyListData("Tofu Scramble with shredded Cabbage and Chilli Sambal", "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgjHgCPv8N5J2TpcJEjFTJ0qB3EwEzW-uWyEDQsZPeGkyC08sGx-T10GthdiTDE56k6HX9S8fqyhaDMklpkHttJLxAY9S3eFnx7emobmGCpmUYlgWZCBE0uydc-oerbFyAQiaN3PNsjjWRmZk8SKLK9DsEutE9TGf-o6sDb8LUdimvTt4Hq5sYyodwE/s1600/picna%20(12).jpeg"),
         new MyListData("Puttanesca", "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhQW6e9CdrBSqA2j27MAiDJk8Hsm7PaPQELW6nA5tetrTsKdgz--e53vcHsU_vzsytT_N-47ODUPi-lrsI693aWJUcdgbaA_dBYE35lkGSqyLa_aJU4nJgOMSSXdBm0l5yXvPT7ymACYKky35FY-Jg8LlCdg4He5Rj61zqYTRBjPxV8i7PwppPkzj-S/s1600/picna%20(11).jpeg"),
         new MyListData("Pipis in Spicy Lemongrass", "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhi_OeZJbz0WuMXrarES4aBw3Qhe7t18UiWRfcsIdPW0VMcz3bmxCPHK-fRUXDPvbVu99LxfKE5UHiNS4VBDEmamPypuWuvmyZEibobRnvSw8N3pYD8noh1oT7i_zbMbfU-z4tigR2299fd1Yd4VdDlEFO1kbYqsFPeucNr15GQs-mASXGCuM2fFzzH/s1600/picna%20(10).jpeg"),
         new MyListData("Avocado Feta Sandwich", "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgndF6pts0dBRS5doJQDsqeP4xd2CYbi_SnunOsn5naz6y0UymsTu-LZFC5jCGjTYqAiNNGP7BQv2qHn6wn2KOghjOdcN5HTq4o653YFS4CJkK1_Rqq6zMmT2Q5eWm1Q_gA3597vldaAfLIsBl015ZBdbdgC1AGeJY1s9dlJd3kfrT-d-rML2ordpe0/s1600/picna%20(8).jpeg"),
         new MyListData("Mexican Rice with Eggs", "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgud9pecmPCw0_AAYgjWyXLeuaoiynq67v_ThvJ6zm1rEUgJiRdB8wVHWBRY7sSbcd4bGlGg8ktHlCiwj8xCJCshkx029RcSonm0HN8_IsFsxIMGWbEzYn1CUcYzjhsm7McZcYWlEh3NefBnpvcJDjFvjD9Nc34ZrIIXEFTlee1fm0sSK4VfO2n5eD7/s1600/picna%20(3).jpeg"),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        recyclerView.setAdapter(adapter);

        btnRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent st = new Intent(DietActivity.this, WebViewActivity.class);
                startActivity(st);
            }
        });


    }
}