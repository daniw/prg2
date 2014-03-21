public class Person
{
	private String name;
	private int age;
	/**
	* Implementation von equals() nach Schema f
	*/
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null)
		{
			return false;
		}
		if (this.getClass() != o.getClass())
		{
			return false;
		}
		if (!this.name.equals((Person) o.name))
		{
			return false;
		}
		return true;
	}
}

//##############################################################################

public abstract class AbstractPerson
{
	/**
	* Implementation von equals() mit abstrakter Basisklasse
	*/
	public final boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null)
		{
			return false;
		}
		if (! o instanceof AbstractPerson)
		{
			return false;
		}
		if (!this.name.equals((AbstractPerson) o.name))
		{
			return false;
		}
		return true;
	}
}

public class Person extends AbstractPerson
{
	
}