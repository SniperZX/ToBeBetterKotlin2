package zhr.com.baselibrary.presenter.view

/**
 * Author by zhaohongru
 * Email 764117736@qq.com
 * Date on 2019-06-25.
 * PS: Not easy to write code, please indicate.
 */
interface IBaseView {

    fun showProgressDialog()

    fun dismissProgressDialog()

    fun initView()

    fun onError()

}