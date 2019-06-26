package zhr.com.usercenter.injection.component

import android.app.Activity
import dagger.Component
import zhr.com.usercenter.injection.module.UserModule
import zhr.com.usercenter.ui.activity.RegisterActivity

/**
 * Author by zhaohongru
 * Email 764117736@qq.com
 * Date on 2019-06-26.
 * PS: Not easy to write code, please indicate.
 */
@Component(modules = arrayOf(UserModule::class))
interface UserComponent {

    fun inject(activity : RegisterActivity)

}