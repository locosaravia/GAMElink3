package GAME.LINK;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void login(View v) {

        EditText User = this.findViewById(R.id.user);
        String user = User.getText().toString();
        EditText Password = this.findViewById(R.id.password);
        String password = Password.getText().toString();

        if (user.equals("locosaravia") && password.equals("1234")) {
            Intent i = new Intent(this, juegos.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "error en credenciales", Toast.LENGTH_SHORT).show();
        }
    }

    public void register(View V){
        Intent a = new Intent(this, registro.class);
        startActivity(a);

    }



}