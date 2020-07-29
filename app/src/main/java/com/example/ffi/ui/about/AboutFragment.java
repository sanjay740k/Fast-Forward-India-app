package com.example.ffi.ui.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.ffi.R;

public class AboutFragment extends Fragment {

    private AboutViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(AboutViewModel.class);
        View root = inflater.inflate(R.layout.fragment_about, container, false);
        final TextView textView = root.findViewById(R.id.textViewAbout);

        slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                s="Fast Forward India (FFI) is a unique effort and an initiative undertaken by the students of ISM Dhanbad." +
                        " This is an organization completely managed and administered by the young and enthusiastic students of the institution.\n" +
                        "\n" +
                        "Creative and powerful ways are implemented to tackle problems of the millions of underprivileged people in India.\n" +
                        "\n" +
                        "The organization conducts blood donation camps, imparts basic computer and English education, and numerous careers counseling" +
                        " sessions in schools to help the deprived students shape their future.";
                textView.setText(s);
            }
        });
        return root;
    }
}
