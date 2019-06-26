package zhr.com.baselibrary.presenter

import zhr.com.baselibrary.presenter.view.IBaseView
import javax.inject.Inject

/**
 * Author by zhaohongru
 * Email 764117736@qq.com
 * Date on 2019-06-25.
 * PS: Not easy to write code, please indicate.
 */
open class BasePresenter<T : IBaseView> {

    lateinit var mView : T

}