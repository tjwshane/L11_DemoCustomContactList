package sg.edu.rpc346.id22035553.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvContact;
        ArrayList<Contact> alContactList;
        CustomAdapter caContact;

        lvContact = findViewById(R.id.listViewContacts);
        alContactList = new ArrayList<>();
        Contact item1 = new Contact("Mary", 65, 1234567, 'F');
        alContactList.add(item1);
        Contact item2 = new Contact("Ken", 65, 7654321, 'M');
        alContactList.add(item2);

        caContact = new CustomAdapter(this, R.layout.row, alContactList);
        lvContact.setAdapter(caContact);
    }
}