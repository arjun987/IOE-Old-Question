package arjun.pandey.com.ioeoldquestion;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.widget.AdapterView.OnItemSelectedListener;

/**
 * Created by yubraj on 7/1/16.
 */
public class CivilEngineering extends AppCompatActivity {
    ArrayAdapter<String> listAdapter;
    List<String> data;
    ListView lv;
    String spinnerOneSelectedItem,spinnerTwoSelectedItem;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.civil_engineering);

        final String array1[] = new String[]{"Engineering Mathematics I","Engineering Drawing1","Engineering Chemistry","Fundamental of Thermodynamics & Heat Transfer",
                                                "Computer Programming","Workshop Technology"};
        final String array2[] = new String[]{"second sem","second sem","second sem","second sem","second sem","second sem","second sem","second sem"};
        final String array3[] = new String[]{"third sem","third sem","third sem","third sem","third sem","third sem","third sem","third sem","third sem"};
        final String array4[] = new String[]{"forth sem"};
        final String array5[] = new String[]{"fifth sem"};
        final String array6[] = new String[]{"sixth sem"};
        final String array7[] = new String[]{"seventh sem"};
        final String array8[] = new String[]{"eighth sem"};

        // spinner data
        final String arraySpinnerOne[] = {"First","Second","Third","Forth"};
        final String arraySpinnerTwo[]={"First","Second"};
        spinnerOneSelectedItem= arraySpinnerOne[0];
        spinnerTwoSelectedItem= arraySpinnerTwo[0];
        data = new ArrayList<>();
        data = Arrays.asList(array1);
        Spinner spnr_select = (Spinner) findViewById(R.id.year);
        final Spinner spnr_select2 = (Spinner) findViewById(R.id.semester);
        lv = (ListView) findViewById(R.id.lv_refreshList);

        // set the spinner data
        // when the spinner item is clicked the listview item should be changed

        spnr_select.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arraySpinnerOne));
        spnr_select2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arraySpinnerTwo));

        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);

        lv.setAdapter(listAdapter);

        spnr_select.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(final AdapterView<?> adapterView, View view, int i, long l) {
                final int pos = adapterView.getSelectedItemPosition();
                // changeThedataIntheListView(arraySpinnerOne[position]);
                spinnerOneSelectedItem= arraySpinnerOne[i];

                if(spinnerOneSelectedItem==arraySpinnerOne[0] && spinnerTwoSelectedItem==arraySpinnerOne[0]){
                    changeThedataIntheListView(array1);

                }
                if(spinnerOneSelectedItem==arraySpinnerOne[0] && spinnerTwoSelectedItem==arraySpinnerOne[1]){
                    changeThedataIntheListView(array2);

                }
                if(spinnerOneSelectedItem==arraySpinnerOne[1] && spinnerTwoSelectedItem==arraySpinnerOne[0]){
                    changeThedataIntheListView(array3);

                }
                if(spinnerOneSelectedItem==arraySpinnerOne[1] && spinnerTwoSelectedItem==arraySpinnerOne[1]){
                    changeThedataIntheListView(array4);

                }
                if(spinnerOneSelectedItem==arraySpinnerOne[2] && spinnerTwoSelectedItem==arraySpinnerOne[0]){
                    changeThedataIntheListView(array5);

                }
                if(spinnerOneSelectedItem==arraySpinnerOne[2] && spinnerTwoSelectedItem==arraySpinnerOne[1]){
                    changeThedataIntheListView(array6);

                }
                if(spinnerOneSelectedItem==arraySpinnerOne[3] && spinnerTwoSelectedItem==arraySpinnerOne[0]){
                    changeThedataIntheListView(array7);

                }
                if(spinnerOneSelectedItem==arraySpinnerOne[3] && spinnerTwoSelectedItem==arraySpinnerOne[1]){
                    changeThedataIntheListView(array8);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spnr_select2.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(final AdapterView<?> adapterView, View view, int i, long l) {
                final int pos = adapterView.getSelectedItemPosition();
                spinnerTwoSelectedItem= arraySpinnerTwo[i];

                if(spinnerOneSelectedItem==arraySpinnerOne[0] && spinnerTwoSelectedItem==arraySpinnerOne[0]){
                    changeThedataIntheListView(array1);

                }
                if(spinnerOneSelectedItem==arraySpinnerOne[0] && spinnerTwoSelectedItem==arraySpinnerOne[1]){
                    changeThedataIntheListView(array2);

                }
                if(spinnerOneSelectedItem==arraySpinnerOne[1] && spinnerTwoSelectedItem==arraySpinnerOne[0]){
                    changeThedataIntheListView(array3);

                }
                if(spinnerOneSelectedItem==arraySpinnerOne[1] && spinnerTwoSelectedItem==arraySpinnerOne[1]){
                    changeThedataIntheListView(array4);

                }
                if(spinnerOneSelectedItem==arraySpinnerOne[2] && spinnerTwoSelectedItem==arraySpinnerOne[0]){
                    changeThedataIntheListView(array5);

                }
                if(spinnerOneSelectedItem==arraySpinnerOne[2] && spinnerTwoSelectedItem==arraySpinnerOne[1]){
                    changeThedataIntheListView(array6);

                }
                if(spinnerOneSelectedItem==arraySpinnerOne[3] && spinnerTwoSelectedItem==arraySpinnerOne[0]){
                    changeThedataIntheListView(array7);

                }
                if(spinnerOneSelectedItem==arraySpinnerOne[3] && spinnerTwoSelectedItem==arraySpinnerOne[1]){
                    changeThedataIntheListView(array8);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void changeThedataIntheListView(String[] marray) {

        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, marray);
        lv.setAdapter(listAdapter);
    }
}

