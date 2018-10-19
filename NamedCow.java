class NamedCow extends Cow
{
	public String cowName;
	NamedCow(String type,String name, String sound)
	{
		cowName = name;
		sound = "eh"
	}
	public void getName(){return name;}
}