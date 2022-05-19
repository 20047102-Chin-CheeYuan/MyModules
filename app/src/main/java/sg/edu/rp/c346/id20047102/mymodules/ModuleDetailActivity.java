package sg.edu.rp.c346.id20047102.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView ModuleCode;
    TextView ModuleName;
    TextView AcadYear;
    TextView Semester;
    TextView ModuleCreds;
    TextView Venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        ModuleCode = findViewById(R.id.textViewModuleCode);
        ModuleName = findViewById(R.id.textViewModuleName);
        AcadYear = findViewById(R.id.textViewAcadYear);
        Semester = findViewById(R.id.textViewSemester);
        ModuleCreds = findViewById(R.id.textViewModuleCreds);
        Venue = findViewById(R.id.textViewVenue);

        Intent i = getIntent();
        String moduleSelected = i.getStringExtra("Module");

        if (moduleSelected.equals("C300")) {
            ModuleCode.setText("Module Code: " + moduleSelected);
            ModuleName.setText("Module Name: FYP Project");
            AcadYear.setText("Academic Year: 2022");
            Semester.setText("Semester: 1");
            ModuleCreds.setText("Module Credit: 4");
            Venue.setText("Venue: E62L");
        } else if (moduleSelected.equals("C322")) {
            ModuleCode.setText("Module Code: " + moduleSelected);
            ModuleName.setText("Module Name: Data Centre and Cloud Management");
            AcadYear.setText("Academic Year: 2022");
            Semester.setText("Semester: 1");
            ModuleCreds.setText("Module Credit: 4");
            Venue.setText("Venue: E61H");
        } else if (moduleSelected.equals("C346")) {
            ModuleCode.setText("Module Code: " + moduleSelected);
            ModuleName.setText("Module Name: Mobile App Development");
            AcadYear.setText("Academic Year: 2022");
            Semester.setText("Semester: 1");
            ModuleCreds.setText("Module Credit: 4");
            Venue.setText("Venue: E62E");
        } else {
            ModuleCode.setText("Module Code: " + moduleSelected);
            ModuleName.setText("Module Name: IT Service Delivery");
            AcadYear.setText("Academic Year: 2022");
            Semester.setText("Semester: 1");
            ModuleCreds.setText("Module Credit: 4");
            Venue.setText("Venue: E62B");
        }

    }
}