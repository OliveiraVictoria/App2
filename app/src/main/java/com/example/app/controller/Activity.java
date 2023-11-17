package com.example.app.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.app.R;

import java.util.ArrayList;
import java.util.List;

public class Activity extends android.app.Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela1);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Vento Forte em São Paulo", R.drawable.vento));
        contacts.add(new Contact("Album Golden - Jungkook from BTS", R.drawable.golden));
        contacts.add(new Contact("TikTok - Ultimas Novidades", R.drawable.tiktok));

        ContactAdapter adapter = new ContactAdapter(this, contacts);
        ListView listView = findViewById(R.id.myListView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Contact selectedContact = contacts.get(position);
                    Toast.makeText(Activity.this, "Selected: " + selectedContact.getName(),
                Toast.LENGTH_SHORT).show();
            }
        });


    }
}