//http://www.tutorialspoint.com/java/java_thread_communication.htm
public class T1 {
	Chat m;
	String[] s1 = {"Hi", "How are you?", "I am doing fine"};
	
	public T1(Chat m1){
		this.m = m1;
		new Thread(this, "Question").start();
	}
	
	public void run(){
		for(int i = 0; i<s1.length; i++){
			m.Question(s1[i]);
		}
	}
	
}
