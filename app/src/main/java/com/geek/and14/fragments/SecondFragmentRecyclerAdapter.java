package com.geek.and14.fragments;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.geek.and14.databinding.SecondFragmentItemsBinding;

import java.util.ArrayList;

public class SecondFragmentRecyclerAdapter extends RecyclerView.Adapter<SecondFragmentRecyclerAdapter.ViewHolder> {

    private ArrayList<Integer> list = new ArrayList<>();

    public void addItems(ArrayList<Integer> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(SecondFragmentItemsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(SecondFragmentRecyclerAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private SecondFragmentItemsBinding binding;

        public ViewHolder(SecondFragmentItemsBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;

        }

        public void onBind(Integer integer) {
            binding.tvId.setText(String.valueOf(getAdapterPosition()+1));
        }
    }
}
