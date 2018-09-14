package com.example.pc.kotlinmvpdemo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*
import presenter.LoginPresenter
import view.ILoginView

class MainActivity : AppCompatActivity(),ILoginView{


    override fun loginSucess(sucess: String) {

        Toasty.success(this,sucess).show()
    }

    override fun loginFailure(failure: String) {

        Toasty.error(this,failure).show()
    }

    internal lateinit var loginPresenter: LoginPresenter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter=LoginPresenter(this)

        submit.setOnClickListener {

            loginPresenter.loggin(user_name.text.toString(),password.text.toString())
        }
    }

}
