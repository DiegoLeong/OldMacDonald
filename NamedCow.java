class NamedCow extends Cow
{
	private String cowName;
	private String name;
	public NamedCow(String animalType, String cowNameVar, String cowSound)
	{
		name = cowNameVar;
	}
	public String getName(){return name;}
}