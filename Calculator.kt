fun main()
{
    println("Basic Calculator")
    println("Enter 1 for Addition")
    println("Enter 2 for Subtraction")
    println("Enter 3 for Multiplication")
    println("Enter 4 for Division")

    val input = readln().toIntOrNull()?:return

    if(input < 1 || input > 4)
    {
        println("Invalid choice")
        return
    }

    print("Enter the first number: ")
    val x = readln().toIntOrNull()?:return

    print("Enter the second number: ")
    val y = readln().toIntOrNull()?:return

    when(input)
    {
        1 -> println("$x + $y = ${x + y}")
        2 -> println("$x - $y = ${x - y}")
        3 -> println("$x * $y = ${x * y}")
        4 -> {
            if (y == 0)
                println("Division by zero is not possible")
            else
                println("$x / $y = ${x / y}")
        }
    }
}
