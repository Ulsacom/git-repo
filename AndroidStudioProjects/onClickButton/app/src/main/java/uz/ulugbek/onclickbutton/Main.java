package uz.ulugbek.onclickbutton;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends AppCompatActivity {
 г  public TextView tvColor;
   public TextView tvSize;
    final int MENU_TEXT_SIZE_22 = 1;
    final int MENU_TEXT_SIZE_24 = 2;
    final int MENU_TEXT_SIZE_26 = 3;
    final int MENU_TEXT_COLOR_RED = 6;
    final int MENU_TEXT_COLOR_YELLOW = 4;
    final int MENU_TEXT_COLOR__GREEN = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tvSize = findViewById(R.id.sizeView);
        tvColor = findViewById(R.id.colorView);
        Button button = findViewById(R.id.button2);
        registerForContextMenu(tvColor);
        registerForContextMenu(tvSize);


    }





    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()) {
            case R.id.colorView:
                menu.add(0, MENU_TEXT_COLOR__GREEN, 0, "Green");
                menu.add(0, MENU_TEXT_COLOR_YELLOW, 0, "Yellow");
                menu.add(0, MENU_TEXT_COLOR_RED, 0, "Red");
                break;
            case R.id.sizeView:
                menu.add(0, MENU_TEXT_SIZE_22, 0,"1");
                menu.add(0, MENU_TEXT_SIZE_24, 0,"2");
                menu.add(0, MENU_TEXT_SIZE_26, 0,"3");
        }

    }



    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_TEXT_COLOR__GREEN:
                tvColor.setTextColor(Color.GREEN);
                break;
            case MENU_TEXT_COLOR_RED:
                tvColor.setTextColor(Color.RED);
                break;
            case MENU_TEXT_COLOR_YELLOW:
                tvColor.setTextColor(Color.YELLOW);
                break;

        }
        switch (item.getItemId()) {
            case MENU_TEXT_SIZE_22:
                tvSize.setTextSize(22);
                break;
            case MENU_TEXT_SIZE_24:
                tvSize.setTextSize(24);
                break;
            case MENU_TEXT_SIZE_26:
                tvSize.setTextSize(26);
                break;

        }
        return super.onContextItemSelected(item);
    }
}








