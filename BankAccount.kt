class BankAccount(val acc_no: String, val acc_name:String,var balance: Double) {
    fun deposit(amount:Double){
        balance += amount
        println("final Balance: $balance")



    }
    fun withdraw(amount: Double){
        if(balance >= amount) {
            balance -= amount
            println("final balance :$balance")
        }
            else{
                print("Insufficient balance")

        }
    }
}
fun main(){
    print("enter the account number")
    var a= readln()
    print("enter the account holder name")
    var n= readln()
    println("enter the balance")
    var b= readln().toDouble()
    val ba=BankAccount(a,n,b)
    print("enter the option")
    var op= readln().toInt()
    if(op==1){
        print("enter the amount")
        val am= readln().toDouble()
        ba.deposit(am)
    }
    if(op==2){
        print("Enter the amount")
        val am= readln().toDouble()
        ba.withdraw(am)
    }
}