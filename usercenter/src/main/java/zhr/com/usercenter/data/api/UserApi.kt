package zhr.com.usercenter.data.api

import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import zhr.com.baselibrary.data.net.BaseResponse
import zhr.com.usercenter.data.Request.RegisterReq
import zhr.com.usercenter.data.bean.LoginBean
import zhr.com.usercenter.data.bean.RegisterBean

/**
 * Author by zhaohongru
 * Email 764117736@qq.com
 * Date on 2019-06-25.
 * PS: Not easy to write code, please indicate.
 */
interface UserApi {

    @FormUrlEncoded
    @POST("user/register")
    fun register(@Field("username") username : String,@Field("password")password:String,@Field("repassword") repassword:String):Observable<BaseResponse<RegisterBean>>


    @FormUrlEncoded
    @POST("user/login")
    fun login(@Field("username")mobile: String,@Field("password") pwd: String): Observable<BaseResponse<LoginBean>>
}