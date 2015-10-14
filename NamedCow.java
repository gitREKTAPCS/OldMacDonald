class NamedCow extends Cow
{
	private String myType;     
    private String mySound;
	private String name;
	 public NamedCow(String type,String cowName, String sound)     {         
         myType = type;  
         name = cowName;       
         mySound = sound;     
     }     
     public NamedCow()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      

	public String getName(){return name;}
}
