import kMarket.data.Operations.UserRead
import kMarket.data.User.Administrator
import kMarket.data.User.*
import java.io.File

fun main(){
    println("Hello! This is project SampleKotlinMarket.")
    println("The project is waiting for your participation!")
    var newAdmin: Administrator = Administrator()
    val newUser = UserRead()
    newUser.printself()
    return
}