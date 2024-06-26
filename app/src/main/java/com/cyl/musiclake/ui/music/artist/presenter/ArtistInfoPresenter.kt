package com.cyl.musiclake.ui.music.artist.presenter

import com.cyl.musiclake.ui.base.BasePresenter
import com.cyl.musiclake.bean.Music
import com.cyl.musiclake.ui.music.artist.contract.ArtistInfoContract

import javax.inject.Inject

/**
 *
 */

class ArtistInfoPresenter @Inject
constructor() : BasePresenter<ArtistInfoContract.View>(), ArtistInfoContract.Presenter {

    override fun loadArtistInfo(music: Music) {
        val info = music.title + "-" + music.artist

    }
}
