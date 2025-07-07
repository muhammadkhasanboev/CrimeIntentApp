package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends SingleFragmentActivity {

    private EditText mEditText;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        FragmentManager fm = getSupportFragmentManager();
//        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
//
//        if(fragment==null){
//            fragment = new CrimeFragment();
//            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
//        }
//
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.fragment_container), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
//    }
    @Override
    protected Fragment createFragment(){
        return new CrimeFragment();
    }
}