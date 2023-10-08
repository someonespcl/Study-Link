package com.studylink.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.studylink.databinding.LayoutActivityCreateAccountBinding;

public class ActivityCreateAccount extends AppCompatActivity {
    
    private LayoutActivityCreateAccountBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = LayoutActivityCreateAccountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
