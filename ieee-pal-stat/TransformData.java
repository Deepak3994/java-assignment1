import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;

class TransformData extends StatPAL {

	//Arraylist to store formatted firstname
	protected ArrayList<String> firstname;

	//Arraylist to store formatted lastname
	protected ArrayList<String> lastname;

	//Arraylist to store formatted date



	public TransformData(String datapath) {

		//set datapath to the file
    	super(datapath);

    	//read data and load
    	if (this.start()) {
            this.analyze();
            this.finish();
        }
        else
            return; 

        //allocate minimum size for arraylist
        firstname = new ArrayList<String> (1024);
        lastname = new ArrayList<String> (1024);


	}

	public void formatNames() {

		//split prohbited author names to first name and last name
		for (String name: this.prohibitedauthornames) {
			String nameparts[] = name.split(",");

			//assign first part of nameparts to firstname
			firstname.add(nameparts[0]);

			//Check lastname of the author exists. if not present add null to last name else add last part of namespart to last name
			if (nameparts.length > 1)
				lastname.add(nameparts[1]);
			else
				lastname.add(null);

		}

	}



}