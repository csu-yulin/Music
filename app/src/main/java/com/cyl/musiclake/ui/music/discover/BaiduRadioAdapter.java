package com.cyl.musiclake.ui.music.discover;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cyl.musiclake.R;
import com.cyl.musiclake.bean.Playlist;
import com.cyl.musiclake.utils.CoverLoader;

import java.util.List;

/**
 */
public class BaiduRadioAdapter extends BaseQuickAdapter<Playlist, BaseViewHolder> {

    public BaiduRadioAdapter(List<Playlist> list) {
        super(R.layout.item_top_list, list);
    }

    @Override
    protected void convert(BaseViewHolder helper, Playlist channel) {
        helper.setText(R.id.title, channel.getName());
        helper.setVisible(R.id.title, true);
        CoverLoader.INSTANCE.loadImageView(getContext(), channel.getCoverUrl(), helper.getView(R.id.iv_cover));
    }

}