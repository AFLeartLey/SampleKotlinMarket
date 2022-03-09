import kMarket.data.User.Administrator

fun main(){
    println("Hello! This is project SampleKotlinMarket.")
    println("The project is waiting for your participation!")
    var newAdmin: Administrator = Administrator()
    val newUser = kMarket.data.Operations.readUserData()
    for(u in newUser){
        u.printself()
    }
    return
}