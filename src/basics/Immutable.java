package basics;

public final class Immutable {
	 private  final int id;
	    private final String name;
	    private final Address add;
	 
	
	 
	    public Immutable(int id, String name, Address add) {
			super();
			this.id = id;
			this.name = name;
			this.add = add;
		}

		public int getId() {
	        return id;
	    }
	 
	    public String getName() {
	        return name;
	 
	    }
	    public Address getAdd()
	    {
	    	return add;
	    }
	    public static void main(String[] args) {
			Immutable i=new Immutable(3, "jyo",new Address(4, 5));
			System.out.println(i.getAdd().getA1());
	    	Address addr=new Address(1, 2);
	    	System.out.println(i.getAdd().getA1());
		}
	}
