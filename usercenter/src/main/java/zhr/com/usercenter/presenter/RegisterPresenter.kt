package zhr.com.usercenter.presenter

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import zhr.com.baselibrary.presenter.BasePresenter
import zhr.com.baselibrary.rx.BaseException
import zhr.com.usercenter.data.bean.LoginBean
import zhr.com.usercenter.presenter.view.IRegisterView
import zhr.com.usercenter.service.UserService
import zhr.com.usercenter.service.impl.UserServiceImpl
import javax.inject.Inject

class RegisterPresenter @Inject constructor(): BasePresenter<IRegisterView>() {

    @Inject
    lateinit var userService:UserService

    fun register(username:String,verifyCode :String){

//        val userService = UserServiceImpl()

        userService.register("13146189695","123456","123456")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe (object :Consumer<Boolean>{
                override fun accept(t: Boolean) {
                    mView.registerResult(t)
                }

            })

    }

    fun login(username:String,pwd :String){

//        val userService = UserServiceImpl()
        userService.login(username,pwd)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe (object :Consumer<LoginBean>{
                override fun accept(t: LoginBean) {
                    if (t!=null){
                        mView.loginResult(t);
                    }else{
                        throw BaseException(1,"1")
                    }
                }

            })

    }
}
