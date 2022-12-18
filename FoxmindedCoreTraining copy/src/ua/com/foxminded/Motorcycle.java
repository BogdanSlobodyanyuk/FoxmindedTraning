package ua.com.foxminded;

public class Motorcycle {

	   String name; 

	    int yearOfProduction;

	    int price;

	    int weight;

	    Color color;

	    String engineType;
	    
	    private int distance = 0 ;

	    boolean isReadyToDrive;
	    
	   
	    

		public Motorcycle(String name, int yearOfProduction, int price, int weight, String color, String engineType,
				boolean isReadyToDrive) {
			super();
			this.name = name;
			this.yearOfProduction = yearOfProduction;
			this.price = price;
			this.weight = weight;
			this.color = Color.valueOf(color.replace(" ", "").toUpperCase());
			this.engineType = engineType;
			this.isReadyToDrive = isReadyToDrive;
		}
		
		
		
		
		
		
		public void repair () {
			isReadyToDrive = true;
		}
		
		public void destroyEngine () {
			if (distance > 200000) { isReadyToDrive = false;}
		}
		
		public void paintMotorcycle (String color) {
			this.color = Color.valueOf(color.replace(" ", "").toUpperCase());
			
		}
		
		public void addDistance (int additionalDistance) {
			
		distance += additionalDistance ;
		
			
		}
		
		public void addDistance (double additionalDistance) {
			
			distance += additionalDistance ;
			
				
			}
		
		
		
		
		
		
		
		
		public void setDistance(int distance) {
			if (distance >=0) {this.distance = distance;} else {
				throw new IllegalArgumentException("Illegal ACTION !");
			}
		}






		@Override
		public String toString() {
			return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price
					+ ", weight=" + weight + ", color=" + color + ", engineType=" + engineType + ", distance="
					+ distance + ", isReadyToDrive=" + isReadyToDrive + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((color == null) ? 0 : color.hashCode());
			result = prime * result + ((engineType == null) ? 0 : engineType.hashCode());
			result = prime * result + (isReadyToDrive ? 1231 : 1237);
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + price;
			result = prime * result + weight;
			result = prime * result + yearOfProduction;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Motorcycle other = (Motorcycle) obj;
			if (color != other.color)
				return false;
			if (engineType == null) {
				if (other.engineType != null)
					return false;
			} else if (!engineType.equals(other.engineType))
				return false;
			if (isReadyToDrive != other.isReadyToDrive)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (price != other.price)
				return false;
			if (weight != other.weight)
				return false;
			if (yearOfProduction != other.yearOfProduction)
				return false;
			return true;
		}  
		
		


	
}
