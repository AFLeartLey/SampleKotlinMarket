package kMarket

class User constructor(val uid: String , val pswd: String){
    /*
    * User Class.
    *
    * */
    val userid: String
    val upswd: String
    init {
        userid = uid
        upswd = pswd
    }
    public fun printself(){
        println(userid+" "+upswd)
    }


}
