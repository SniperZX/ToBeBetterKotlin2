package zhr.com.usercenter.data

import io.reactivex.Observable
import zhr.com.baselibrary.data.net.BaseResponse
import zhr.com.baselibrary.data.net.RetrofitFactory
import zhr.com.usercenter.data.Request.RegisterReq
import zhr.com.usercenter.data.api.UserApi
import zhr.com.usercenter.data.bean.LoginBean
import zhr.com.usercenter.data.bean.RegisterBean
import javax.inject.Inject

/**
 * Author by zhaohongru
 * Email 764117736@qq.com
 * Date on 2019-06-25.
 * PS: Not easy to write code, please indicate.
 */
class UserRepositry @Inject constructor() {

     fun register(mobile: String, pwd: String, repassword: String): Observable<BaseResponse<RegisterBean>>{
         return RetrofitFactory.instance.create(UserApi::class.java).register(mobile,pwd,repassword)

     }

    fun login(mobile: String, pwd: String): Observable<BaseResponse<LoginBean>>{
         return RetrofitFactory.instance.create(UserApi::class.java).login(mobile,pwd)

     }
}