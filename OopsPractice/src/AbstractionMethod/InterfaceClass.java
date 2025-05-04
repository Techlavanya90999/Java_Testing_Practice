package AbstractionMethod;
interface Pen{
	public void start();
	public void stop();
}
	class Gelpen implements Pen{
		public void start() {
			System.out.println("Gelpen Start with ink");
		}
		public void stop() {
			System.out.println("Gelpen Stops");
		}
	}
	class Ballpen implements Pen{
		public void start() {
			System.out.println("Ballpen Starts with ink");
		}
		public void stop() {
				System.out.println("Ballpen Stop");
			}
		}
		
public class InterfaceClass {

	public static void main(String[] args) {
Pen Gelpen = new Gelpen();
Pen Ballpen = new Ballpen();
Gelpen.start();
Gelpen.stop();
Ballpen.start();
Ballpen.stop();
	}

}
