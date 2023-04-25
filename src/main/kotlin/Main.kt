import java.awt.font.NumericShaper.Range

fun main(){
random("we are happy")
    multiples()
   var account=CurrentAccount(856672345,"Marrion kisoso",33000.0)
    account.deposit(250.0)
    account.withdraw(30.0)
    account.details()

}
//1. Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun random(str:String){
    println(str[0])
    println(str[11])
    println(str.length)

}
//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
//fun takein(password:String):String{
//    for(pass in password){
//        if (pass>=password){
//            println()
//        }
//    }
//    return
//}
//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiples(){
    val nums=1..1000
    for(num in nums) {
        if (num%6==num){
            println(num)
        }else if(num%8==num){
            println(num)
        } else if(num%6==num && num%8==num){
            println(" $num Bingo")
        }
    }}
//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
class CurrentAccount(var accountnumber:Int,var accountname:String,var balance:Double){
    fun deposit(amount:Double){
        var add=balance++
        println(add)


    }
    fun withdraw(amount: Double){
        var remove=balance--
        println(remove)
    }
    fun details(){
        var detail="Accountnumber $accountnumber has $balance as balance and its operated by $accountname"
        println(detail)
    }
}
//5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a successful withdrawal (6pts)