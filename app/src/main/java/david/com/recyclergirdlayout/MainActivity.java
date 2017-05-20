package david.com.recyclergirdlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NumberAdapter numberAdapter;
    private GridLayoutManager gridLayoutManager;
    private String[] numList = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView = (RecyclerView) findViewById(R.id.rv_number_list);
        recyclerView.setLayoutManager(gridLayoutManager);
        numberAdapter = new NumberAdapter(numList);
        recyclerView.setAdapter(numberAdapter);
    }
}
