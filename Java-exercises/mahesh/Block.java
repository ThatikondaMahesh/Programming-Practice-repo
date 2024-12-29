// program to demo on the break 
class Block
{
	public static void main(String m[])
	{
		boolean exp=true;
		bl1:{
			bl2:{
				bl3:{
					
					System.out.println("3 Block");
					
					
				    if(exp)
					break bl2;
				
				}
				System.out.println("2 Block");
				
			}
			
			System.out.println("1 Block");
			
			
		}
	
		System.out.println(" out of all  Block");
	}
	
	
	
	
}