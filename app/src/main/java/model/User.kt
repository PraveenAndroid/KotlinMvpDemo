package model
import android.text.TextUtils
import android.util.Patterns

class User(override  val userName:String, override val password:String):IUser {
    override fun loginValidateCode(): Int {
        if(TextUtils.isEmpty(userName))
            return 1
        else if(!Patterns.EMAIL_ADDRESS.matcher(userName).matches())
            return 2
        else if(password.length<6)
        return 3
        else
            return -1
    }


}