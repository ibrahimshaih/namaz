package ru.ibrahimshaih.azkar;

import android.graphics.Color;
import android.os.Bundle;
import androidx.core.view.WindowCompat;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        // setDecorFitsSystemWindows(false) только разрешает контенту рисоваться под
        // системными панелями — сам цвет панелей нужно явно сделать прозрачным,
        // иначе статус-бар остаётся сплошным (как в Chrome Custom Tabs).
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        getWindow().setNavigationBarColor(Color.TRANSPARENT);
        super.onCreate(savedInstanceState);
    }
}
