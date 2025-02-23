public class Main
{
	public static void main(String[] args)
	{
		String name = "Tina";
		int age = 25;

		System.out.println("Hello, GOALS in CS!");
		Main.printBio(name, age);
		System.out.printf("I'm currently taking 12 units, so my semester cost is $%,.2f%n%n",
		    Main.calculateSemesterTotal(12, 336.00, 54.00));

		System.out.printf("My tutor job on campus pays me: $%.2f%n%n",
		    Main.calculateWageForHourly(13.25, 30, 0, 0) );

		System.out.println("I help students with CS and Math, calculating things like f(x) = 5x^2 + 3x + 2");
		System.out.println("For example, f(6) = " + Main.foo(6) + "\n");

		System.out.println("The job doesn't pay much but I'd like to buy pizza's for the class!");
		System.out.println("You all might not be kids, but I'm sure you appreciate a good pizza party :D");
		System.out.println("For 28 students, I'll pick up " + Main.calculateTotalPizzas(28) + " pizzas.\n");

		System.out.println("Looking forward to learning with you all this semester!");
	}

	public static void printBio(String name, int age)
	{
		System.out.println("My name is " + name + " and I'm " + age + ", nice to meet you!");
	}

	public static double calculateSemesterTotal(int numCredits, double pricePerCredit, double miscCosts)
	{
		double semesterTotal = (numCredits * pricePerCredit) + miscCosts;

		return semesterTotal;
	}

	public static double calculateWageForHourly(double hourlyRate, double payPeriodHoursWorked, double bonus, double overTimeHours)
	{
		double overTimeHourlyRate, overTimeEarnings;

		overTimeHourlyRate = (hourlyRate/2) + hourlyRate;
		overTimeEarnings =  overTimeHourlyRate * overTimeHours;

		return ( hourlyRate * payPeriodHoursWorked ) + overTimeEarnings + bonus;
	}

	public static int foo(int x)
	{
		return (5 * x * x) + (3 * x) + 2;
	}

	public static int calculateTotalPizzas(int kids)
	{
		int slices, pizzas;

		slices = kids * 2;
		pizzas = (int) Math.ceil(slices / 8.0);

		return pizzas;
	}
}