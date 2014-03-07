package ro.pub.cs.pdsd.lab4;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/*
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
*/ 
class Personaj
{
    public String nume;
    public String desen;
 
    @Override
    public String toString ()
    {
        // acesta functie este apelata de catre ArrayAdapter pentru a transforma obiectul intr-un String ce
        // sa fie afisat in lista
        return nume+" din desenul animat "+desen;
    } 
} 
 
public class MainActivity extends ListActivity
{
    ArrayList<Personaj> personaje;
    ArrayAdapter<Personaj> adapter;
 
    @Override
    public void onCreate (Bundle savedInstanceBundle)
    {
    	super.onCreate (savedInstanceBundle);
        personaje = new ArrayList<Personaj>();
        adapter = new ArrayAdapter<Personaj>(this, android.R.layout.simple_list_item_1, personaje);
        setContentView (R.layout.activity_main);
        setListAdapter (adapter);
 
        // adaugam cateva personaje in lista
        adaugaFunnyGuy("Bugs Bunny", "Looney Toons");
        adaugaFunnyGuy("Fred Flinstone", "The Flinstones");
        adaugaFunnyGuy("Betty Rubble", "The Flinstones");
        adaugaFunnyGuy("Betty Rubble1", "The Flinstones");
        adaugaFunnyGuy("Betty Rubble2", "The Flinstones");
        adaugaFunnyGuy("Betty Rubble3", "The Flinstones");
        adaugaFunnyGuy("Betty Rubble4", "The Flinstones");
        adaugaFunnyGuy("Betty Rubble5", "The Flinstones");
        adaugaFunnyGuy("Betty Rubble6", "The Flinstones");
        adaugaFunnyGuy("Betty Rubble7", "The Flinstones");
        adaugaFunnyGuy("Betty Rubble8", "The Flinstones");
        
    }
 
    @Override
    public void onListItemClick (ListView list, View v, int position, long id)
    {
        // afisam numele personajului pe care s-a dat click folosind un Toast
        Toast.makeText(MainActivity.this, personaje.get(position).nume, Toast.LENGTH_LONG).show();
    }
 
    private void adaugaFunnyGuy (String nume, String desen)
    {
        Personaj p = new Personaj ();
        p.nume = nume;
        p.desen = desen;
        personaje.add (p);
        // acesta functie determina adaptorul sa ceara listei sa reafiseze continutul
        adapter.notifyDataSetChanged();
    }
}
