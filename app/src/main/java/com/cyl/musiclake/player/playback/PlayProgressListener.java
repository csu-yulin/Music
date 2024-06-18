package com.cyl.musiclake.player.playback;

/**
 * 播放回调
 */

public interface PlayProgressListener {

    void onProgressUpdate(long position, long duration);

}
