package zhr.com.usercenter.service

import io.reactivex.Observable
import zhr.com.usercenter.data.bean.LoginBean

/**
 * Author by zhaohongru
 * Email 764117736@qq.com
 * Date on 2019-06-25.
 * PS: Not easy to write code, please indicate.
 */
interface UserService{
    fun register(mobile:String,pwd:String,verifyCode :String):Observable<Boolean>
    fun login(mobile: String, pwd: String):Observable<LoginBean>
}