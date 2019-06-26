package zhr.com.baselibrary.ui

import zhr.com.baselibrary.presenter.BasePresenter
import zhr.com.baselibrary.presenter.view.IBaseView
import javax.inject.Inject

/**
 * Author by zhaohongru
 * Email 764117736@qq.com
 * Date on 2019-06-25.
 * PS: Not easy to write code, please indicate.
 */
open class BaseMvpActivity <P : BasePresenter<*>> :BaseActivity(),IBaseView{

    @Inject
    lateinit var mPresenter:P

    override fun showProgressDialog() {
    }

    override fun dismissProgressDialog() {
    }

    override fun initView() {
    }

    override fun onError() {
    }

}