package com.olexafort.simply.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.olexafort.simply.R;
import com.olexafort.simply.databinding.FragmentSearchBinding;

public class FragmentSearch extends Fragment {
    private FragmentSearchBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSearchBinding.inflate(inflater);
        View view = binding.getRoot();

        return view;
    }
}