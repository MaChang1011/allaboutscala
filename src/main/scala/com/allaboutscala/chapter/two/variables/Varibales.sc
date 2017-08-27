//Scala 基本教程 - 如何声明明变量和类型
//变量声明，了解Scala支持的数据类型
//1.不变变量
//语法：val <Name of our variables> : <Scala type> = <Some literal>

val donutsToBuy:Int = 5
//不可以重新赋值
//donutsToBuy = 10

//2.可变变量
//将 val 关键字替换为 var
var favoriteDount:String = "Glazed Donut"
favoriteDount = "Vanilla Donut"

//3.懒值初始化
//应用程序执行到某些变量的时候进行初始化 使用 lazy 关键字
lazy val donutService = "initialize some donut service"

//4.Scala 支持的类型
val donutsBought:Int = 5
val bigNumberOfDonuts:Long = 100000000L
val smallNumberOfDonuts:Short = 1
val priceOfDonut:Double = 2.50
val donutPrice = 2.50f
val donutStoreName:String = "allaboutscala Donut Store"
val donutByte:Byte = 0xa
val donutFirstLetter:Char = 'D'
val nothing:Unit = ()

//5.声明一个没有初始化的变量
var leastFavoriteDonut:String = _

leastFavoriteDonut = "Plain Donut"



























