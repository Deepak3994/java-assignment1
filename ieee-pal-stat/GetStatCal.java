import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;


class GetStatCal extends TransformData
{

	public GetStatCal (String path)
	{
		super(path);
	}

	public void getCountryCount()
	{

		int count = 0;
		ArrayList<String> countrylist = new ArrayList<String> (1024);
		ArrayList<Integer> countlist = new ArrayList<Integer> (1024);

		for (String country: countries)
			if (!countrylist.contains(country))
				countrylist.add(country);
			//System.out.println(country);

		for (String country: countrylist)
		{
			for(String country1: countries)
			{
				if(country.equals(country1))
					count++;
								
			}
			countlist.add(count);
			//System.out.println(country+" "+count);
			count = 0;
			
		}

		Iterator<Integer> itrcount = countlist.iterator();
		for (String country: countrylist)
		{
			if (itrcount.hasNext())
			{
				int element = itrcount.next();
				System.out.println(country+" "+element);
			}	
		}
	}

	public void getAuthorList(int year)
	{
		int endyear;

		Iterator<String> itrname = firstname.iterator();

		for(Date date: prohibitionenddate)
		{
			if(itrname.hasNext())
			endyear = date.getYear();
			/*if (endyear >= year)
			{
				String name = itrname.next();
				System.out.println(name+" "+endyear);
			}
			else
				itrname.next();*/
			System.out.println(endyear);	
		}


	}

}