package zhr.com.usercenter.data.bean

import com.google.gson.Gson

/**
 * Author by zhaohongru
 * Email 764117736@qq.com
 * Date on 2019-06-26.
 * PS: Not easy to write code, please indicate.
 */
data class RegisterBean(
    val admin: Boolean,
    val chapterTops: List<Any>,
    val collectIds: List<Any>,
    val email: String,
    val icon: String,
    val id: Int,
    val password: String,
    val token: String,
    val type: Int,
    val username: String
)
