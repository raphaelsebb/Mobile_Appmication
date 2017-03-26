package fr.esilv.s8.tubeyou.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.esilv.s8.tubeyou.Interfaces.OnElementSelectedListener;
import fr.esilv.s8.tubeyou.Models.VideoList;
import fr.esilv.s8.tubeyou.R;
import fr.esilv.s8.tubeyou.ViewHolders.VideoViewHolder;

/**
 * Created by raphael on 25/03/2017.
 */

public class ElementAdapter extends RecyclerView.Adapter<VideoViewHolder> {
    private final VideoList videoList;
    private OnElementSelectedListener onElementSelectedListener;
    public ElementAdapter(VideoList videoList) {this.videoList = videoList; }

    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_video, parent, false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position) {
        holder.setOnElementSelectedListener(onElementSelectedListener);
        holder.bind(videoList.get(position));
    }

    @Override
    public int getItemCount() {
        return videoList != null ? videoList.size() : 0 ;
    }

    public void setOnElementSelectedListener (OnElementSelectedListener onElementSelectedListener) {
        this.onElementSelectedListener = onElementSelectedListener;
    }
}
