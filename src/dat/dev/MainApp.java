package dat.dev;

public class MainApp {
	
	public static void main(String[] agrs) {
		 final String arrName[] = {"Bao","Tu","Tep","Teo","Nam"};
         final int arrOld[] = { 21, 25, 26, 24, 30};
         
         Person arrPerson[] = new Person[arrName.length];
         for( int i=0; i < arrPerson.length; i++) {
        	 Person p = new Person(arrName[i],arrOld[i]);
        	 arrPerson[i] = p;
         }
         
         for( int i=0; i < arrPerson.length; i++)  {
        	 arrPerson[i].show();
         }
    
   	}

}
