class ticketbooking 
{
	boolean booked=false;
	public void ticketmethod(String name)
	{
		synchronized(this)
		{
		if(booked==false)
		{
		 System.out.println(name+"  selected the seat ");
		 
		 System.out.println(name+"  make the payment");
		 System.out.println(name+"  get the Ticket");
		 booked=true;
		}
		else
		{
			System.out.println(name+"   sorry andi seat Alredy Booked");	
		}
		}
		System.out.println(name+" booked this is the bus ticket");
		
	}
}
class threadclass extends Thread
{
	ticketbooking seat;
	String s;
	threadclass(ticketbooking obj,String name)
	{
		seat=obj;
		s=name;	
	}
	public void run()
	{
		seat.ticketmethod(s);
	}
	
}

class Synchronisation
{
	public static void main(String args[])
	{
		System.out.println("Main Method started");
		//Thread t=Thread.currentThread();
		//t.setDeman(true);
		ticketbooking seat1 = new ticketbooking();
		threadclass mah= new threadclass(seat1,"mahesh");
		Thread t1=new Thread(mah);
		t1.start();
		{}
		threadclass dev=new threadclass(seat1,"mahdev");
		Thread t2=new Thread(dev);
		t2.start();
		
	}
}