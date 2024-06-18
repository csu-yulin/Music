package com.cyl.musiclake.event

import com.cyl.musiclake.bean.Playlist
import com.cyl.musiclake.common.Constants

/**
 * function : 在线歌单新增、删除、修改、重命名
 */
class MyPlaylistEvent(var operate: Int, val playlist: Playlist? = null)
