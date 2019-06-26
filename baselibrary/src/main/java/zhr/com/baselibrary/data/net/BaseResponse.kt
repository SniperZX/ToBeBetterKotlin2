package zhr.com.baselibrary.data.net

/**
 * Author by zhaohongru
 * Email 764117736@qq.com
 * Date on 2019-06-26.
 * PS: Not easy to write code, please indicate.
 */
data class BaseResponse<T> (val data:T,val errorCode:Int,val errorMsg:String)