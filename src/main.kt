import kMarket.data.Admin
import kMarket.data.NormalUser

fun main(){
    println("Hello! This is project SampleKotlinMarket.")
    println("The project is waiting for your participation!")
    var newAdmin: Admin = Admin()
    var newUser: NormalUser = NormalUser("u1d","u1d","lkjahsdfkljhasdf","lkjhasdfjkhasdf","afdkgljhasdfgjklh")
    newUser.printself();
    return
}