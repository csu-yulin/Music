package com.cyl.musiclake.ui.music.local.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.cyl.musiclake.R
import com.cyl.musiclake.bean.FolderInfo

/**
 *
 */

class FolderAdapter(folderInfos: MutableList<FolderInfo>) : BaseQuickAdapter<FolderInfo, BaseViewHolder>(R.layout.item_folder, folderInfos) {

    override fun convert(holder: BaseViewHolder, folderInfo: FolderInfo) {
        holder.setText(R.id.tv_title, folderInfo.folderName)
        holder.setText(R.id.tv_artist, "${folderInfo.songCount} "+context.getString(R.string.song))
        holder.setText(R.id.tv_folder_path,  folderInfo.folderPath)
    }
}