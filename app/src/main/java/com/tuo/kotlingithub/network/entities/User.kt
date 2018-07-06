package com.tuo.kotlingithub.network.entities

import com.tuo.common.anno.PoKo


/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/7/6 17:05
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@PoKo
data class User(var login: String,
                var avatar_url: String,
                var html_url: String,
                var id: Int,
                var type: String,
                var site_admin: Boolean,
                var name: String?,
                var company: String?,
                var blog: String?,
                var location: String?,
                var email: String?,
                var bio: String?,
                var public_repos: Int,
                var public_gists: Int,
                var followers: Int,
                var following: Int,
                var created_at: String,
                var updated_at: String,
                var private_gists: Int,
                var total_private_repos: Int,
                var owned_private_repos: Int,
                var disk_usage: Int,
                var collaborators: Int)