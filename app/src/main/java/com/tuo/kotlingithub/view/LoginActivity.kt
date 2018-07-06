package com.tuo.kotlingithub.view

import android.os.Bundle
import com.tuo.kotlingithub.R
import com.tuo.kotlingithub.presenter.LoginPresenter
import com.tuo.mvp.impl.BaseActivity


class LoginActivity : BaseActivity<LoginPresenter>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

}
