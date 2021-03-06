package com.exmple.baselib.mvp

import android.os.Bundle
import com.exmple.baselib.base.BaseFragment
import com.exmple.baselib.http.toast


/**
 * @FileName: BaseMvpFragment.java
 * @author: villa_mou
 * @date: 06-16:20
 * @version V1.0 <描述当前版本功能>
 * @desc
 */
abstract class BaseMvpFragment<V : ITopView, P : ITopPresenter> : BaseFragment(), IView<P> {
    override fun getCtx() = context

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        inited()
    }
    override fun finish(resultCode: Int) {
    }
    override fun showToast(message: String) {
        toast(message)
    }
    override fun showToast(srtResId: Int) {
        showToast(resources.getString(srtResId))
    }
    override fun showLoading(msg: String) {
        showProgressDialog(msg)
    }

    override fun showLoading(srtResId: Int) {
        showProgressDialog(resources.getString(srtResId))
    }

    override fun dismissLoading() {
        dismissProgressDialog()
    }
}