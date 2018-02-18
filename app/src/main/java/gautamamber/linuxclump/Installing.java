package gautamamber.linuxclump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Installing extends AppCompatActivity {
    String[] array = new String[] {

            "$apt-get install <packagename>: Install new package",
    "$apt-get remove <packagename> : Remove package",
    "$apt-get update/upgrade <package>: Update packsge"};
    String[] array1 = new String[]

    {
        "$yum install <package>: Install new package",
                "$yum remove <packagename> : Remove package",
                "$yum update <packagename> : Update package"
    };
    String[] array2 = new String[]

    {
    "$urpmi <packagename>: Install new package",
    "$urpme <packagename> : Remove package",
    "$urpmi.update -a : Update package",
    "$urpmi --auto-select : Install security update and bug fixed"

};
ListView listView1,listView2,listView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_installing);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);

        listView1 = (ListView) findViewById(R.id.list);
        listView1.setAdapter(adapter);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);

        listView2 = (ListView) findViewById(R.id.list1);
        listView2.setAdapter(adapter);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array1);
        listView3 = (ListView) findViewById(R.id.list2);
        listView3.setAdapter(adapter);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array2);
    }
}
