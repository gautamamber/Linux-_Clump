package gautamamber.linuxclump;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class Linux_Clump extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linux__clump);

        Button b2;
        b2 = (Button)findViewById(R.id.b2);
        b2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Linux_Clump.this,Terminology.class);
                        startActivity(i);

                    }
                }

        );
        Button b3;
        b3 = (Button)findViewById(R.id.b3);
        b3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Linux_Clump.this,about.class);
                        startActivity(i);

                    }
                }

        );
        Button b4;
        b4 = (Button)findViewById(R.id.b4);
        b4.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Linux_Clump.this,File_handling.class);
                        startActivity(i);

                    }
                }

        );
        Button b5;
        b5 = (Button)findViewById(R.id.b5);
        b5.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Linux_Clump.this,System_commands.class);
                        startActivity(i);

                    }
                }

        );
        Button b6;
        b6 = (Button)findViewById(R.id.b6);
        b6.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Linux_Clump.this,Web_commands.class);
                        startActivity(i);

                    }
                }

        );
        Button b7;
        b7 = (Button)findViewById(R.id.b7);
        b7.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Linux_Clump.this,File_permission.class);
                        startActivity(i);

                    }
                }

        );
        Button b8;
        b8 = (Button)findViewById(R.id.b8);
        b8.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Linux_Clump.this,File_editor.class);
                        startActivity(i);

                    }
                }

        );
        Button b9;
        b9 = (Button)findViewById(R.id.b9);
        b9.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Linux_Clump.this,Editor_commands.class);
                        startActivity(i);

                    }
                }

        );
        Button b10;
        b10 = (Button)findViewById(R.id.b10);
        b10.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Linux_Clump.this,Device.class);
                        startActivity(i);

                    }
                }

        );
        Button b11;
        b11 = (Button)findViewById(R.id.b11);
        b11.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Linux_Clump.this,Installing.class);
                        startActivity(i);

                    }
                }

        );
        Button b12;
        b12 = (Button)findViewById(R.id.b12);
        b12.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Linux_Clump.this,Help.class);
                        startActivity(i);




                    }
                }

        );
        Button b13;
        b13 = (Button)findViewById(R.id.b13);
        b13.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Toast.makeText(Linux_Clump.this, "Developed by: Amber Gautam",Toast.LENGTH_SHORT).show();



                    }
                }

        );

    }
}
