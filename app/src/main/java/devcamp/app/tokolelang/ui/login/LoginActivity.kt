package devcamp.app.tokolelang.ui.login

import android.content.Intent
import com.github.rahatarmanahmed.cpv.CircularProgressView
import devcamp.app.tokolelang.R
import devcamp.app.tokolelang.base.BaseActivity
import devcamp.app.tokolelang.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.toolbar.view.*

/**
 * Created by isfaaghyth on 8/30/18.
 * github: @isfaaghyth
 */
class LoginActivity: BaseActivity<LoginPresenter>(), LoginView {

    override fun initPresenter(): LoginPresenter = LoginPresenter(this)
    override fun contentView(): Int = R.layout.activity_login
    override fun loader(): CircularProgressView = header.progressBar

    override fun onCreated() {
        onClick()
    }

    fun onClick() {
        btnLogin.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

}