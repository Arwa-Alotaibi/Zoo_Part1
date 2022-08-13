package zoo_part1;


public class GorillaTest {
	public static void main(String[] args) {

		Gorilla GorillaA = new Gorilla();
	System.out.println("--GorillaA");
	GorillaA.displayEnergy();
	GorillaA.throwSomething();
	GorillaA.throwSomething();
	GorillaA.throwSomething();
	GorillaA.eatBananas();
	GorillaA.eatBananas();
	GorillaA.climb();
	


	System.out.println("Mountain_Gorilla");
	Gorilla  Mountain_Gorilla = new Gorilla();
	Mountain_Gorilla.displayEnergy();
	Mountain_Gorilla.throwSomething();
	Mountain_Gorilla.climb();
	Mountain_Gorilla.eatBananas();
	
	System.out.println("Eastern_gorilla");
	Gorilla Eastern_gorilla  = new Gorilla();
	Eastern_gorilla.displayEnergy();
	Eastern_gorilla.throwSomething();
	
	Gorilla a  = new Gorilla();
	a.displayEnergy();
	a.throwSomething();

	Gorilla b = new Gorilla();
	b.displayEnergy();
	b.throwSomething();
	b.climb();
	b.eatBananas();
	b.displayEnergy();
	

}
}
