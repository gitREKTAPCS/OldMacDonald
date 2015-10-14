class NamedCow extends Cow
{
	private String name;
	 public NamedCow(String type,String cowName, String sound)     {         
         myType = type;  
         name = cowName;       
         mySound = sound;     
     }     
     public NamedCow()     { 
     }      

	public String getName(){return name;}
}
