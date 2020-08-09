package com.olexafort.simply.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.olexafort.simply.databinding.LayoutTopStoriesBinding;
import com.olexafort.simply.models.StoriesModel;

import java.util.ArrayList;

public class TopStoriesAdapter extends RecyclerView.Adapter<TopStoriesAdapter.TopStoriesViewHolder> {

    private ArrayList<StoriesModel> arrayList;
    private Context context;

    public TopStoriesAdapter(ArrayList<StoriesModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    public static  class TopStoriesViewHolder extends RecyclerView.ViewHolder {
        private LayoutTopStoriesBinding binding;

        public TopStoriesViewHolder(@NonNull LayoutTopStoriesBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public TopStoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TopStoriesViewHolder(LayoutTopStoriesBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TopStoriesViewHolder holder, int position) {
        StoriesModel stories = arrayList.get(position);

    }

    @Override
    public int getItemCount() {
        return arrayList == null ? 0:
                arrayList.size();
    }
}
