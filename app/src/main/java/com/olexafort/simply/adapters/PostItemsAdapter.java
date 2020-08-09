package com.olexafort.simply.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.olexafort.simply.R;
import com.olexafort.simply.databinding.LayoutPostItemBinding;
import com.olexafort.simply.models.PostItemModel;

import java.util.ArrayList;

public class PostItemsAdapter extends RecyclerView.Adapter<PostItemsAdapter.PostItemsViewHolder> {

    private ArrayList<PostItemModel> arrayList;
    private Context context;

    public PostItemsAdapter(ArrayList<PostItemModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    public static class PostItemsViewHolder extends RecyclerView.ViewHolder {
        private LayoutPostItemBinding binding;

        public PostItemsViewHolder(@NonNull LayoutPostItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public PostItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostItemsViewHolder(LayoutPostItemBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final PostItemsViewHolder holder, int position) {
        PostItemModel post = arrayList.get(position);

        holder.binding.likeContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.binding.likePost.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_round_favorite_liked));
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList == null ? 0:
                arrayList.size();
    }
}
