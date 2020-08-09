package com.olexafort.simply.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.olexafort.simply.databinding.LayoutPostCategoriesBinding;
import com.olexafort.simply.models.PostCategoriesModel;

import java.util.ArrayList;

public class PostCategoriesAdapter extends RecyclerView.Adapter<PostCategoriesAdapter.PostCategoriesViewHolder> {

    private ArrayList<PostCategoriesModel> arrayList;
    private Context context;

    public PostCategoriesAdapter(ArrayList<PostCategoriesModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    public static  class PostCategoriesViewHolder extends RecyclerView.ViewHolder {
        private LayoutPostCategoriesBinding binding;

        public PostCategoriesViewHolder(@NonNull LayoutPostCategoriesBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public PostCategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostCategoriesViewHolder(LayoutPostCategoriesBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final PostCategoriesViewHolder holder, int position) {
        final PostCategoriesModel category = arrayList.get(position);

        holder.binding.postCategory.setText(category.getPost_category());
        holder.binding.postCategoryContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.binding.postCategory.setTextSize(20);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList == null ? 0:
                arrayList.size();
    }
}
