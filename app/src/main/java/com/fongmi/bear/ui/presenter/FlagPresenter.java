package com.fongmi.bear.ui.presenter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.leanback.widget.Presenter;

import com.fongmi.bear.bean.Vod;
import com.fongmi.bear.databinding.AdapterItemBinding;

public class FlagPresenter extends Presenter {

    @Override
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        return new ViewHolder(AdapterItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object object) {
        Vod.Flag item = (Vod.Flag) object;
        ViewHolder holder = (ViewHolder) viewHolder;
        holder.binding.text.setText(item.getFlag());
    }

    @Override
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
    }

    public static class ViewHolder extends Presenter.ViewHolder {

        private final AdapterItemBinding binding;

        public ViewHolder(@NonNull AdapterItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}