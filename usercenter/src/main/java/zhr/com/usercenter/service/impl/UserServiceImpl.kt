package zhr.com.usercenter.service.impl

import io.reactivex.Observable
import zhr.com.usercenter.data.UserRepositry
import zhr.com.usercenter.data.bean.LoginBean
import zhr.com.usercenter.service.UserService
import javax.inject.Inject

/**
 * Author by zhaohongru
 * Email 764117736@qq.com
 * Date on 2019-06-25.
 * PS: Not easy to write code, please indicate.
 */
class UserServiceImpl @Inject constructor():UserService {

    @Inject
    lateinit var userRepositry:UserRepositry

    override fun login(mobile: String, pwd: String): Observable<LoginBean> {

        return userRepositry.login(mobile, pwd)
            .flatMap { it ->
                    Observable.just(it.data)
            }

    }

    override fun register(mobile: String, pwd: String, verifyCode: String): Observable<Boolean> {
       return userRepositry.register(mobile, pwd, verifyCode)
           .flatMap { s ->
               if (s.errorCode!=0) {
                   Observable.just(false)
               } else Observable.just(true)
           }
    }
}

