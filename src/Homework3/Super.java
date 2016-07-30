package Homework3;

public class Super {
	public Super() {

	super();
	
}

String objectMessage = "This is the original superclass message: ";

public void getMessage(){
	System.out.println("This is the SUPERCLASS message: " + objectMessage);
	
}

public void setMessage(String newMessage){
	objectMessage = newMessage;
}

public void eMesssage(){
	System.out.println("This is the message experiment");
}
}
