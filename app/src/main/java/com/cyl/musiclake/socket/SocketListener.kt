package com.cyl.musiclake.socket

import com.cyl.musiclake.bean.MessageInfoBean
import com.cyl.musiclake.bean.UserInfoBean

/**

 */
interface SocketListener {
    /**
     * 用户下线
     */
    fun onLeaveEvent(user: UserInfoBean)

    /**
     * 用户上线
     */
    fun onJoinEvent(user: UserInfoBean)

    /**
     * 在线用户
     */
    fun onOnlineUsers(users: MutableList<UserInfoBean>)

    /**
     * 消息
     */
    fun onMessage(msgInfo: MessageInfoBean)

    /**
     * 错误
     */
    fun onError(msg: String)
}