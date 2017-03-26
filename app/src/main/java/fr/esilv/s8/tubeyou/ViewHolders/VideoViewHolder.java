package fr.esilv.s8.tubeyou.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import fr.esilv.s8.tubeyou.Interfaces.OnElementSelectedListener;
import fr.esilv.s8.tubeyou.Models.Element_video;
import fr.esilv.s8.tubeyou.R;

/**
 * Created by raphael on 25/03/2017.
 */

public class VideoViewHolder extends RecyclerView.ViewHolder {
    private TextView video_title;
    private TextView video_id;

    private OnElementSelectedListener onElementSelectedListener;

    public VideoViewHolder(View itemView) {
        super(itemView);

        video_title = (TextView) itemView.findViewById(R.id.TextView_title);
    }

    public void bind(final Element_video element_video) {

        video_title.setText(element_video.getTitle());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onElementSelectedListener == null) {
                    return;
                }
                onElementSelectedListener.onElementSelected(element_video);
            }
        });
    }

    public void setOnElementSelectedListener(OnElementSelectedListener onElementSelectedListener) {
        this.onElementSelectedListener = onElementSelectedListener;
    }
}
