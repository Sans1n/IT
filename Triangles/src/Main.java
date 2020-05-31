
public class Main {

	public static void main(String[] args) throws ExceptionTria {
		// TODO Auto-generated method stub

		try{
			
			Triangle t1 =  Triangle.factory(6.0,6.0,2.0);
			
			System.out.println(t1);
			
			System.out.println("Obsah "+t1.getObsah() +" m2");
			System.out.println("Obvod "+t1.getObvod() +" m");
		
		}catch(ExceptionTria e) {
			System.err.println(e.getMessage());
		}
		
	}

	

}
