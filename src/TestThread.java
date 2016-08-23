public class TestThread{
	public static void main(String args[]){
/*		RunnableDemo r1 = new RunnableDemo("Thread-ONE");
		r1.start();
		
		RunnableDemo r2 = new RunnableDemo("Thread-TWO");
		r2.start();
*/		
		ThreadDemo td1 = new ThreadDemo("T-One");
		td1.start();
		
		ThreadDemo td2 = new ThreadDemo("T-Two");
		td2.start();
	}
}

