package zhr.com.usercenter.ui.activity

import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import io.reactivex.plugins.RxJavaPlugins
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import zhr.com.baselibrary.ui.BaseMvpActivity
import zhr.com.usercenter.R
import zhr.com.usercenter.data.bean.LoginBean
import zhr.com.usercenter.injection.component.DaggerUserComponent
import zhr.com.usercenter.presenter.RegisterPresenter
import zhr.com.usercenter.presenter.view.IRegisterView

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(),IRegisterView {
    override fun loginResult(t: LoginBean) {
        println(t)
        toast("登录成功")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
//        mPresenter = RegisterPresenter()
        initInjection()

       RxJavaPlugins.setErrorHandler {
           toast("error handler")
       }
        mRegisterBtn.onClick {
//          mPresenter.register("13146189691","")
          mPresenter.login("13146189691","123456")
        }
    }

    override fun registerResult(result:Boolean) {
        if (result)  toast("注册成功") else  toast("注册失败")

    }

    fun initInjection(){
        DaggerUserComponent.builder().build().inject(this)
        mPresenter.mView = this
    }

}
