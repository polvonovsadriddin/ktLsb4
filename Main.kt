//1.	Напишите функцию, которая принимает два списка и
// возвращает новый список, в котором каждый элемент представляет
// сумму соответствующих элементов обоих списков.


/*условие 2*/
//Пусть дано множество, которое представляет студентов:
//	students = {"Tom", "Bob", "Sam"}
//И пусть дано множество, которое представляет рабочих:
//	employees = {"Tom", "Bob", "Alex", "Mike"}
//Как видно, некоторые одновременно могут учиться и работать.
//Напишите программу, которая находит
//•	Всех людей в обоих группах
//•	Всех людей, которые одновременно и учатся, и работают
//•	Всех людей, которые только учатся, но не работают
//•	Всех людей, которые либо только учатся, либо только работают, но не одновременно

/*Условие 3*/
//Дан словарь с товарами. Выведите на экран все товары, цена которых не превышает 100 рублей, а текущий остаток не менее 10 кг

fun main() {

val lst1= listOf(1,2,3,4,5)
    val lst2= listOf(6,7,8,9,10)
    println(GetRes(lst1,lst2))

    /*2*/
    val students=setOf("Tom", "Bob", "Sam")
    val employees= setOf ("Tom", "Bob", "Alex", "Mike")
    println(employees.union(students))
    println(employees.intersect(students))
    println(students.subtract(employees))
    val StundentOnly= setOf(students.subtract(employees))
    val EmployeesOnly= setOf(employees.subtract(students))
    println(EmployeesOnly.union(StundentOnly))

    /*3*/
    val goods = mapOf(
        "Яблоки" to Pair(150, 20),
        "Груши" to Pair(80, 15),
        "Бананы" to Pair(90, 12),
        "Картофель" to Pair(50, 25),
        "Морковь" to Pair(70, 8)
    )

    println("Товары, цена которых не превышает 100 рублей, а остаток не менее 10 кг:")

    goods.forEach { entry ->
        val name = entry.key  // Получаем имя товара (ключ) из записи
        val (price, quantity) = entry.value // Распаковываем пару значений (цена, количество)

        if (price <= 100 && quantity >= 10) {
            println("$name - цена: $price руб., остаток: $quantity кг")
        }
    }

}
/*1*/
fun GetRes(list1: List<Int>, list2: List<Int>): List<Int>
{
    val result= mutableListOf<Int>()
    if(list1.size != list2.size) throw IllegalArgumentException("Списки  разного размера")
    for(i in list1.indices)
    {
        val general= list1[i]+list2[i]
        result.add(general)
    }
    return result
}






