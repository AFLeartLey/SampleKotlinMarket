package kMarket.data.User

class NormalUser(val uid:String,val username:String,val pswd:String,val ucont:String,val addr:String): User(){
    init{
        userID = uid
        userPassword = pswd
        userContact = ucont
        address = addr
    }
}