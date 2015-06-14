package land.basso.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

//git test comment
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void app1OnClick(View v)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + getString(R.string.app1Title) + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void app2OnClick(View v)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + getString(R.string.app2Title) + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void app3OnClick(View v)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + getString(R.string.app3Title) + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void app4OnClick(View v)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + getString(R.string.app4Title) + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void app5OnClick(View v)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + getString(R.string.app5Title) + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void app6OnClick(View v)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch " + getString(R.string.app6Title) + "!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
