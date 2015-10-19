package inclumedia.at.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void onButtonClicked(View view)
    {
        Button butt = (Button)view;
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence butter = "You want to see my " + butt.getText() + " App? Coming soon!";
        Toast toast = Toast.makeText(context, butter, duration);
        toast.show();
    }
}
