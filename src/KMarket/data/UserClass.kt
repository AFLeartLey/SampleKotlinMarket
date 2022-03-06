package kMarket.data
open class User {

    var userid: String = ""
    var upswd: String = ""
    var usercont: String? = ""
    var address: String? = ""
    protected var balance: Double? = 0.0
    protected var sudo: Boolean = false

    fun printself() {
        println(userid + " " + upswd)
    }
}

/**
 *
 * Admin class.
 */
class Admin(): User() {
    init{
        userid = "admin"
        upswd = "Administrator"
        usercont = null
        address = null
        balance = null
        sudo = true
    }
}

class NormalUser(val uid:String,val username:String,val pswd:String,val ucont:String,val addr:String): User(){
    init{
        userid = uid
        upswd = pswd
        usercont = ucont
        address = addr
    }
}