package com.geek.and14.fragments;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.geek.and14.databinding.FirstFragmentItemsBinding;

import java.util.ArrayList;

public class FirstFragmentRecyclerAdapter extends RecyclerView.Adapter<FirstFragmentRecyclerAdapter.ViewHolder> {

    private ArrayList<FirstFragmentModel> list = new ArrayList<>();

    public void addItems(ArrayList<FirstFragmentModel> list) {
        this.list.addAll(list);
        notifyDataSetChanged();

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(FirstFragmentItemsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(FirstFragmentRecyclerAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private FirstFragmentItemsBinding binding;

        public ViewHolder(FirstFragmentItemsBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(FirstFragmentModel firstFragmentModel) {
            binding.tvName.setText(firstFragmentModel.getName());
            binding.tvSecondName.setText(firstFragmentModel.getSecondName());
        }
    }
}
