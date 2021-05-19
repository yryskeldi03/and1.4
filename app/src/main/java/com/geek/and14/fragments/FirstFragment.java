package com.geek.and14.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;

import com.geek.and14.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private FirstFragmentRecyclerAdapter adapter;
    private ArrayList<FirstFragmentModel> list = new ArrayList<>();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        createList();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new FirstFragmentRecyclerAdapter();
        adapter.addItems(list);
        binding.recycler.setAdapter(adapter);
        binding.recycler.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("Name", "Second name"));
        list.add(new FirstFragmentModel("The end", "The end"));

    }

}