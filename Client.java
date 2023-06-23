package muncitori;

public class Client {
	 private String nume;

	    public Client(String nume) {
	        this.nume = nume;
	    }

		public String getNume() {
			return nume;
		}

		@Override
		public String toString() {
			return " " + nume + "";
		}
	    
		
}
