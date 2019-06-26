package zhr.com.usercenter.presenter.view

import zhr.com.baselibrary.presenter.view.IBaseView
import zhr.com.usercenter.data.bean.LoginBean

interface IRegisterView : IBaseView{

    fun registerResult(result:Boolean)
    fun loginResult(t: LoginBean)
}
