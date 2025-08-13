package generalpractice;

import java.util.LinkedList;
import java.util.Queue;

/*
 Suppose there is a circle with N petrol pumps. You will be given two sets of data:

The amount of petrol that each petrol pump has.
The distance from that petrol pump to the next petrol pump.
Find a starting point where the truck can start to get through the complete 
circle without exhausting its petrol in between. If no such path exists, return -1.

Note: Assume for 1 liter of petrol, the truck can go 1 unit of distance.
 */

public class PetrolPumpTour {
	
	static class PetrolPump
	{
		private int petrol;
		private int distance;
		public PetrolPump(int petrol, int distance)
		{
			this.petrol = petrol;
			this.distance = distance;
		}	
		
	}
	public static int possibility(PetrolPump[] p, int n)
	{
		Queue<PetrolPump> queue = new LinkedList<>();
		
		for(int i = 0; i < n; i++)
		{
			queue.offer(p[i]);
		}
		
		for(int i = 0; i < n; i++)
		{
			int tank = 0;
			boolean running = true;
			
			for(PetrolPump pump : queue)
			{
				tank += pump.petrol;
				tank -= pump.distance;
				
				if(tank < 0)
				{
					running = false;
					break;
				}
			}
			if(running)
			{
				return i;
			}
			
			queue.add(queue.poll());
		}
		
		return -1;
	}
	
	
	

	public static void main(String[] args) {
		
		PetrolPump[] pump = {new PetrolPump(4,6),
							new PetrolPump(6,5),
							new PetrolPump(7,3),
							new PetrolPump(4,5),};
		int k = pump.length;
		
		System.out.println(possibility(pump,k));
	}

}
