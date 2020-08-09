package com.olexafort.simply.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.olexafort.simply.R;
import com.olexafort.simply.adapters.PostCategoriesAdapter;
import com.olexafort.simply.adapters.PostItemsAdapter;
import com.olexafort.simply.databinding.FragmentHomeBinding;
import com.olexafort.simply.databinding.FragmentSearchBinding;
import com.olexafort.simply.models.PostCategoriesModel;
import com.olexafort.simply.models.PostItemModel;

import java.util.ArrayList;

public class FragmentHome extends Fragment {
    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater);
        View view = binding.getRoot();

        setupPostCategories();

        setupHomePosts();

        return view;
    }

    private void setupPostCategories() {
        ArrayList<PostCategoriesModel> arrayList = new ArrayList<>();
        PostCategoriesModel category = new PostCategoriesModel("All");
        PostCategoriesModel category1 = new PostCategoriesModel("Nature");
        PostCategoriesModel category2 = new PostCategoriesModel("Fashion");
        PostCategoriesModel category3 = new PostCategoriesModel("Food & Restaurants");
        PostCategoriesModel category4 = new PostCategoriesModel("Design");
        PostCategoriesModel category5 = new PostCategoriesModel("Comics");
        PostCategoriesModel category6 = new PostCategoriesModel("Books & Novels");

        arrayList.add(category);
        arrayList.add(category1);
        arrayList.add(category2);
        arrayList.add(category3);
        arrayList.add(category4);
        arrayList.add(category5);
        arrayList.add(category6);

        PostCategoriesAdapter adapter = new PostCategoriesAdapter(arrayList, getContext());

        RecyclerView postCategoriesRecycler = binding.homePostsCategoriesRecycler;
        postCategoriesRecycler.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 1, RecyclerView.HORIZONTAL, false);
        postCategoriesRecycler.setLayoutManager(layoutManager);
        postCategoriesRecycler.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }

    private void setupHomePosts() {
        ArrayList<PostItemModel> arrayList = new ArrayList<>();
        PostItemModel post = new PostItemModel();
        PostItemModel post1 = new PostItemModel();
        PostItemModel post2 = new PostItemModel();
        PostItemModel post3 = new PostItemModel();
        PostItemModel post4 = new PostItemModel();

        arrayList.add(post);
        arrayList.add(post1);
        arrayList.add(post2);
        arrayList.add(post3);
        arrayList.add(post4);

        PostItemsAdapter adapter = new PostItemsAdapter(arrayList, getContext());

        RecyclerView postsRecycler = binding.homePostsRecycler;
        postsRecycler.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 1, RecyclerView.HORIZONTAL, false);
        postsRecycler.setLayoutManager(layoutManager);
        postsRecycler.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }
}