package com.olexafort.simply.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.olexafort.simply.R;
import com.olexafort.simply.adapters.TopStoriesAdapter;
import com.olexafort.simply.adapters.VideoPostsAdapter;
import com.olexafort.simply.databinding.FragmentPostsBinding;
import com.olexafort.simply.databinding.FragmentSearchBinding;
import com.olexafort.simply.models.StoriesModel;
import com.olexafort.simply.models.VideoPostsModel;

import java.util.ArrayList;


public class FragmentPosts extends Fragment {
    private FragmentPostsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPostsBinding.inflate(inflater);
        View view = binding.getRoot();

        binding.topStoriesShimmer.startShimmer();

        //simulate network delays
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                binding.topStoriesShimmer.stopShimmer();
                binding.topStoriesShimmer.setVisibility(View.GONE);
                binding.topStoriesRecycler.setVisibility(View.VISIBLE);
                getTopStories();
                getNewsFeed();
            }
        }, 5000);

        return view;
    }

    private void getTopStories() {
        ArrayList<StoriesModel> arrayList = new ArrayList<>();
        StoriesModel model = new StoriesModel();
        arrayList.add(model);
        arrayList.add(model);
        arrayList.add(model);
        arrayList.add(model);
        arrayList.add(model);

        TopStoriesAdapter adapter = new TopStoriesAdapter(arrayList, getContext());

        RecyclerView topStoriesRecycler = binding.topStoriesRecycler;
        topStoriesRecycler.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 1, RecyclerView.HORIZONTAL, false);
        topStoriesRecycler.setLayoutManager(layoutManager);
        topStoriesRecycler.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }

    private void getNewsFeed() {
        ArrayList<VideoPostsModel> arrayList = new ArrayList<>();
        VideoPostsModel model = new VideoPostsModel();
        arrayList.add(model);
        arrayList.add(model);
        arrayList.add(model);
        arrayList.add(model);
        arrayList.add(model);

        VideoPostsAdapter adapter = new VideoPostsAdapter(arrayList, getContext());

        RecyclerView newsFeedRecycler = binding.postsRecyclerView;

        newsFeedRecycler.setHasFixedSize(true);
        newsFeedRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        newsFeedRecycler.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }
}