package com.olexafort.simply.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.olexafort.simply.databinding.LayoutVideoPostBinding;
import com.olexafort.simply.models.VideoPostsModel;

import java.util.ArrayList;

public class VideoPostsAdapter extends RecyclerView.Adapter<VideoPostsAdapter.VideoPostsViewHolder> {

    private ArrayList<VideoPostsModel> arrayList;
    private Context context;

    public VideoPostsAdapter(ArrayList<VideoPostsModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    public static class VideoPostsViewHolder extends RecyclerView.ViewHolder {
        private LayoutVideoPostBinding binding;

        public VideoPostsViewHolder(@NonNull LayoutVideoPostBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public VideoPostsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VideoPostsViewHolder(LayoutVideoPostBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VideoPostsViewHolder holder, int position) {
        VideoPostsModel videoPosts = arrayList.get(position);
    }

    @Override
    public int getItemCount() {
        return arrayList == null ? 0:
                arrayList.size();
    }
}
