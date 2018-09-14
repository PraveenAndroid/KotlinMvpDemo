package presenter
import model.User
import view.ILoginView

class LoginPresenter(internal val loginVirew:ILoginView):IPresenter {

    override fun loggin(userName: String, password: String) {

        val user=User(userName,password)
        val code=user.loginValidateCode()

        if(code==1)
            loginVirew.loginFailure("Email Should Not be Empty")
        else if(code==2)

            loginVirew.loginFailure("Email Should be in proper format")
        else if(code==3)

            loginVirew.loginFailure("Password Length must be greater than 6")
        else
            loginVirew.loginSucess("Login Sucess")

    }

}