package my.forest.mycubatura;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity<afterTextChanged> extends AppCompatActivity implements View.OnClickListener {
    private EditText editText_10;
    private EditText editText_11;
    private EditText editText_12;
    private EditText editText_13;
    private EditText editText_14;
    private EditText editText_15;
    private EditText editText_16;
    private EditText editText_17;
    private EditText editText_18;
    private EditText editText_19;
    private EditText editText_20;
    private EditText editText_21;
    private EditText editText_22;
    private EditText editText_23;
    private EditText editText_24;
    private EditText editText_25;
    private EditText editText_26;
    private EditText editText_27;
    private EditText editText_28;
    private EditText editText_29;
    private EditText editText_30;
    private EditText editText_31;
    private EditText editText_32;
    private EditText editText_33;
    private EditText editText_34;
    private EditText editText_35;
    private EditText editText_36;
    private EditText editText_37;
    private EditText editText_38;
    private EditText editText_39;
    private EditText editText_40;
    private EditText editText_41;
    private EditText editText_42;
    private EditText editText_43;
    private EditText editText_44;
    private EditText editText_45;
    private EditText editText_46;
    private EditText editText_47;
    private EditText editText_48;
    private EditText editText_49;
    private EditText editText_50;
    private EditText editText_51;
    private EditText editText_52;
    private EditText editText_53;
    private EditText editText_54;
    private EditText editText_55;
    private EditText editText_56;
    private EditText editText_57;
    private EditText editText_58;
    private EditText editText_59;
    private EditText editText_60;
    private EditText editText_61;
    private EditText editText_62;
    private EditText editText_63;
    private EditText editText_64;
    private EditText editText_65;
    private EditText editText_66;
    private EditText editText_67;
    private EditText editText_68;
    private EditText editText_69;
    private EditText editText_70;
    private EditText editText_71;
    private EditText editText_72;
    private EditText editText_73;
    private EditText editText_74;
    private EditText editText_75;
    private EditText editText_76;
    private EditText editText_77;
    private EditText editText_78;
    private EditText editText_79;
    private EditText editText_80;
    private EditText editText_81;
    private EditText editText_82;
    private EditText editText_83;
    private EditText editText_84;
    private EditText editText_85;
    private EditText editText_86;
    private EditText editText_87;
    private EditText editText_88;
    private EditText editText_89;
    private EditText editText_90;

    private Button button_minus_10;
    private Button button_minus_11;
    private Button button_minus_12;
    private Button button_minus_13;
    private Button button_minus_14;
    private Button button_minus_15;
    private Button button_minus_16;
    private Button button_minus_17;
    private Button button_minus_18;
    private Button button_minus_19;
    private Button button_minus_20;
    private Button button_minus_21;
    private Button button_minus_22;
    private Button button_minus_23;
    private Button button_minus_24;
    private Button button_minus_25;
    private Button button_minus_26;
    private Button button_minus_27;
    private Button button_minus_28;
    private Button button_minus_29;
    private Button button_minus_30;
    private Button button_minus_31;
    private Button button_minus_32;
    private Button button_minus_33;
    private Button button_minus_34;
    private Button button_minus_35;
    private Button button_minus_36;
    private Button button_minus_37;
    private Button button_minus_38;
    private Button button_minus_39;
    private Button button_minus_40;
    private Button button_minus_41;
    private Button button_minus_42;
    private Button button_minus_43;
    private Button button_minus_44;
    private Button button_minus_45;
    private Button button_minus_46;
    private Button button_minus_47;
    private Button button_minus_48;
    private Button button_minus_49;
    private Button button_minus_50;
    private Button button_minus_51;
    private Button button_minus_52;
    private Button button_minus_53;
    private Button button_minus_54;
    private Button button_minus_55;
    private Button button_minus_56;
    private Button button_minus_57;
    private Button button_minus_58;
    private Button button_minus_59;
    private Button button_minus_60;
    private Button button_minus_61;
    private Button button_minus_62;
    private Button button_minus_63;
    private Button button_minus_64;
    private Button button_minus_65;
    private Button button_minus_66;
    private Button button_minus_67;
    private Button button_minus_68;
    private Button button_minus_69;
    private Button button_minus_70;
    private Button button_minus_71;
    private Button button_minus_72;
    private Button button_minus_73;
    private Button button_minus_74;
    private Button button_minus_75;
    private Button button_minus_76;
    private Button button_minus_77;
    private Button button_minus_78;
    private Button button_minus_79;
    private Button button_minus_80;
    private Button button_minus_81;
    private Button button_minus_82;
    private Button button_minus_83;
    private Button button_minus_84;
    private Button button_minus_85;
    private Button button_minus_86;
    private Button button_minus_87;
    private Button button_minus_88;
    private Button button_minus_89;
    private Button button_minus_90;

    private Button button_plus_10;
    private Button button_plus_11;
    private Button button_plus_12;
    private Button button_plus_13;
    private Button button_plus_14;
    private Button button_plus_15;
    private Button button_plus_16;
    private Button button_plus_17;
    private Button button_plus_18;
    private Button button_plus_19;
    private Button button_plus_20;
    private Button button_plus_21;
    private Button button_plus_22;
    private Button button_plus_23;
    private Button button_plus_24;
    private Button button_plus_25;
    private Button button_plus_26;
    private Button button_plus_27;
    private Button button_plus_28;
    private Button button_plus_29;
    private Button button_plus_30;
    private Button button_plus_31;
    private Button button_plus_32;
    private Button button_plus_33;
    private Button button_plus_34;
    private Button button_plus_35;
    private Button button_plus_36;
    private Button button_plus_37;
    private Button button_plus_38;
    private Button button_plus_39;
    private Button button_plus_40;
    private Button button_plus_41;
    private Button button_plus_42;
    private Button button_plus_43;
    private Button button_plus_44;
    private Button button_plus_45;
    private Button button_plus_46;
    private Button button_plus_47;
    private Button button_plus_48;
    private Button button_plus_49;
    private Button button_plus_50;
    private Button button_plus_51;
    private Button button_plus_52;
    private Button button_plus_53;
    private Button button_plus_54;
    private Button button_plus_55;
    private Button button_plus_56;
    private Button button_plus_57;
    private Button button_plus_58;
    private Button button_plus_59;
    private Button button_plus_60;
    private Button button_plus_61;
    private Button button_plus_62;
    private Button button_plus_63;
    private Button button_plus_64;
    private Button button_plus_65;
    private Button button_plus_66;
    private Button button_plus_67;
    private Button button_plus_68;
    private Button button_plus_69;
    private Button button_plus_70;
    private Button button_plus_71;
    private Button button_plus_72;
    private Button button_plus_73;
    private Button button_plus_74;
    private Button button_plus_75;
    private Button button_plus_76;
    private Button button_plus_77;
    private Button button_plus_78;
    private Button button_plus_79;
    private Button button_plus_80;
    private Button button_plus_81;
    private Button button_plus_82;
    private Button button_plus_83;
    private Button button_plus_84;
    private Button button_plus_85;
    private Button button_plus_86;
    private Button button_plus_87;
    private Button button_plus_88;
    private Button button_plus_89;
    private Button button_plus_90;
    private TextView textView_ravno_10;
    private TextView textView_ravno_11;
    private TextView textView_ravno_12;
    private TextView textView_ravno_13;
    private TextView textView_ravno_14;
    private TextView textView_ravno_15;
    private TextView textView_ravno_16;
    private TextView textView_ravno_17;
    private TextView textView_ravno_18;
    private TextView textView_ravno_19;
    private TextView textView_ravno_20;
    private TextView textView_ravno_21;
    private TextView textView_ravno_22;
    private TextView textView_ravno_23;
    private TextView textView_ravno_24;
    private TextView textView_ravno_25;
    private TextView textView_ravno_26;
    private TextView textView_ravno_27;
    private TextView textView_ravno_28;
    private TextView textView_ravno_29;
    private TextView textView_ravno_30;
    private TextView textView_ravno_31;
    private TextView textView_ravno_32;
    private TextView textView_ravno_33;
    private TextView textView_ravno_34;
    private TextView textView_ravno_35;
    private TextView textView_ravno_36;
    private TextView textView_ravno_37;
    private TextView textView_ravno_38;
    private TextView textView_ravno_39;
    private TextView textView_ravno_40;
    private TextView textView_ravno_41;
    private TextView textView_ravno_42;
    private TextView textView_ravno_43;
    private TextView textView_ravno_44;
    private TextView textView_ravno_45;
    private TextView textView_ravno_46;
    private TextView textView_ravno_47;
    private TextView textView_ravno_48;
    private TextView textView_ravno_49;
    private TextView textView_ravno_50;
    private TextView textView_ravno_51;
    private TextView textView_ravno_52;
    private TextView textView_ravno_53;
    private TextView textView_ravno_54;
    private TextView textView_ravno_55;
    private TextView textView_ravno_56;
    private TextView textView_ravno_57;
    private TextView textView_ravno_58;
    private TextView textView_ravno_59;
    private TextView textView_ravno_60;
    private TextView textView_ravno_61;
    private TextView textView_ravno_62;
    private TextView textView_ravno_63;
    private TextView textView_ravno_64;
    private TextView textView_ravno_65;
    private TextView textView_ravno_66;
    private TextView textView_ravno_67;
    private TextView textView_ravno_68;
    private TextView textView_ravno_69;
    private TextView textView_ravno_70;
    private TextView textView_ravno_71;
    private TextView textView_ravno_72;
    private TextView textView_ravno_73;
    private TextView textView_ravno_74;
    private TextView textView_ravno_75;
    private TextView textView_ravno_76;
    private TextView textView_ravno_77;
    private TextView textView_ravno_78;
    private TextView textView_ravno_79;
    private TextView textView_ravno_80;
    private TextView textView_ravno_81;
    private TextView textView_ravno_82;
    private TextView textView_ravno_83;
    private TextView textView_ravno_84;
    private TextView textView_ravno_85;
    private TextView textView_ravno_86;
    private TextView textView_ravno_87;
    private TextView textView_ravno_88;
    private TextView textView_ravno_89;
    private TextView textView_ravno_90;

    private Button button_result;
    private TextView total_response;
    private EditText price_response;
    private TextView ob_response;
    private TextView col_response;

    private double dim_10 = 0.037;
    private double dim_11 = 0.045;
    private double dim_12 = 0.053;
    private double dim_13 = 0.062;
    private double dim_14 = 0.073;
    private double dim_15 = 0.084;
    private double dim_16 = 0.095;
    private double dim_17 = 0.107;
    private double dim_18 = 0.12;
    private double dim_19 = 0.134;
    private double dim_20 = 0.147;
    private double dim_21 = 0.163;
    private double dim_22 = 0.178;
    private double dim_23 = 0.194;
    private double dim_24 = 0.21;
    private double dim_25 = 0.23;
    private double dim_26 = 0.25;
    private double dim_27 = 0.27;
    private double dim_28 = 0.29;
    private double dim_29 = 0.31;
    private double dim_30 = 0.33;
    private double dim_31 = 0.355;
    private double dim_32 = 0.38;
    private double dim_33 = 0.405;
    private double dim_34 = 0.43;
    private double dim_35 = 0.455;
    private double dim_36 = 0.48;
    private double dim_37 = 0.505;
    private double dim_38 = 0.53;
    private double dim_39 = 0.555;
    private double dim_40 = 0.58;
    private double dim_41 = 0.61;
    private double dim_42 = 0.64;
    private double dim_43 = 0.67;
    private double dim_44 = 0.7;
    private double dim_45 = 0.735;
    private double dim_46 = 0.77;
    private double dim_47 = 0.805;
    private double dim_48 = 0.84;
    private double dim_49 = 0.875;
    private double dim_50 = 0.91;
    private double dim_51 = 0.95;
    private double dim_52 = 0.99;
    private double dim_53 = 1.03;
    private double dim_54 = 1.07;
    private double dim_55 = 1.115;
    private double dim_56 = 1.16;
    private double dim_57 = 1.205;
    private double dim_58 = 1.25;
    private double dim_59 = 1.29;
    private double dim_60 = 1.33;
    private double dim_61 = 1.38;
    private double dim_62 = 1.43;
    private double dim_63 = 1.475;
    private double dim_64 = 1.52;
    private double dim_65 = 1.565;
    private double dim_66 = 1.61;
    private double dim_67 = 1.655;
    private double dim_68 = 1.7;
    private double dim_69 = 1.75;
    private double dim_70 = 1.8;
    private double dim_71 = 1.85;
    private double dim_72 = 1.9;
    private double dim_73 = 1.955;
    private double dim_74 = 2.01;
    private double dim_75 = 2.065;
    private double dim_76 = 2.12;
    private double dim_77 = 2.18;
    private double dim_78 = 2.24;
    private double dim_79 = 2.295;
    private double dim_80 = 2.35;
    private double dim_81 = 2.41;
    private double dim_82 = 2.47;
    private double dim_83 = 2.53;
    private double dim_84 = 2.59;
    private double dim_85 = 2.65;
    private double dim_86 = 2.71;
    private double dim_87 = 2.78;
    private double dim_88 = 2.85;
    private double dim_89 = 2.915;
    private double dim_90 = 2.98;

    SharedPreferences sPref10;
    SharedPreferences sPref11;
    SharedPreferences sPref12;
    SharedPreferences sPref13;
    SharedPreferences sPref14;
    SharedPreferences sPref15;
    SharedPreferences sPref16;
    SharedPreferences sPref17;
    SharedPreferences sPref18;
    SharedPreferences sPref19;
    SharedPreferences sPref20;
    SharedPreferences sPref21;
    SharedPreferences sPref22;
    SharedPreferences sPref23;
    SharedPreferences sPref24;
    SharedPreferences sPref25;
    SharedPreferences sPref26;
    SharedPreferences sPref27;
    SharedPreferences sPref28;
    SharedPreferences sPref29;
    SharedPreferences sPref30;
    SharedPreferences sPref31;
    SharedPreferences sPref32;
    SharedPreferences sPref33;
    SharedPreferences sPref34;
    SharedPreferences sPref35;
    SharedPreferences sPref36;
    SharedPreferences sPref37;
    SharedPreferences sPref38;
    SharedPreferences sPref39;
    SharedPreferences sPref40;
    SharedPreferences sPref41;
    SharedPreferences sPref42;
    SharedPreferences sPref43;
    SharedPreferences sPref44;
    SharedPreferences sPref45;
    SharedPreferences sPref46;
    SharedPreferences sPref47;
    SharedPreferences sPref48;
    SharedPreferences sPref49;
    SharedPreferences sPref50;
    SharedPreferences sPref51;
    SharedPreferences sPref52;
    SharedPreferences sPref53;
    SharedPreferences sPref54;
    SharedPreferences sPref55;
    SharedPreferences sPref56;
    SharedPreferences sPref57;
    SharedPreferences sPref58;
    SharedPreferences sPref59;
    SharedPreferences sPref60;
    SharedPreferences sPref61;
    SharedPreferences sPref62;
    SharedPreferences sPref63;
    SharedPreferences sPref64;
    SharedPreferences sPref65;
    SharedPreferences sPref66;
    SharedPreferences sPref67;
    SharedPreferences sPref68;
    SharedPreferences sPref69;
    SharedPreferences sPref70;
    SharedPreferences sPref71;
    SharedPreferences sPref72;
    SharedPreferences sPref73;
    SharedPreferences sPref74;
    SharedPreferences sPref75;
    SharedPreferences sPref76;
    SharedPreferences sPref77;
    SharedPreferences sPref78;
    SharedPreferences sPref79;
    SharedPreferences sPref80;
    SharedPreferences sPref81;
    SharedPreferences sPref82;
    SharedPreferences sPref83;
    SharedPreferences sPref84;
    SharedPreferences sPref85;
    SharedPreferences sPref86;
    SharedPreferences sPref87;
    SharedPreferences sPref88;
    SharedPreferences sPref89;
    SharedPreferences sPref90;

    SharedPreferences sPref01;
    SharedPreferences sPref02;
    SharedPreferences sPref03;
    SharedPreferences sPref04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(MainActivity.this);
        View parentView = getLayoutInflater().inflate(R.layout.bottom_sheet, null);
        bottomSheetDialog.setContentView(parentView);
        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View) parentView.getParent());
        editText_10 = (EditText) findViewById(R.id.editText_10);
        editText_11 = (EditText) findViewById(R.id.editText_11);
        editText_12 = (EditText) findViewById(R.id.editText_12);
        editText_13 = (EditText) findViewById(R.id.editText_13);
        editText_14 = (EditText) findViewById(R.id.editText_14);
        editText_15 = (EditText) findViewById(R.id.editText_15);
        editText_16 = (EditText) findViewById(R.id.editText_16);
        editText_17 = (EditText) findViewById(R.id.editText_17);
        editText_18 = (EditText) findViewById(R.id.editText_18);
        editText_19 = (EditText) findViewById(R.id.editText_19);
        editText_20 = (EditText) findViewById(R.id.editText_20);
        editText_21 = (EditText) findViewById(R.id.editText_21);
        editText_22 = (EditText) findViewById(R.id.editText_22);
        editText_23 = (EditText) findViewById(R.id.editText_23);
        editText_24 = (EditText) findViewById(R.id.editText_24);
        editText_25 = (EditText) findViewById(R.id.editText_25);
        editText_26 = (EditText) findViewById(R.id.editText_26);
        editText_27 = (EditText) findViewById(R.id.editText_27);
        editText_28 = (EditText) findViewById(R.id.editText_28);
        editText_29 = (EditText) findViewById(R.id.editText_29);
        editText_30 = (EditText) findViewById(R.id.editText_30);
        editText_31 = (EditText) findViewById(R.id.editText_31);
        editText_32 = (EditText) findViewById(R.id.editText_32);
        editText_33 = (EditText) findViewById(R.id.editText_33);
        editText_34 = (EditText) findViewById(R.id.editText_34);
        editText_35 = (EditText) findViewById(R.id.editText_35);
        editText_36 = (EditText) findViewById(R.id.editText_36);
        editText_37 = (EditText) findViewById(R.id.editText_37);
        editText_38 = (EditText) findViewById(R.id.editText_38);
        editText_39 = (EditText) findViewById(R.id.editText_39);
        editText_40 = (EditText) findViewById(R.id.editText_40);
        editText_41 = (EditText) findViewById(R.id.editText_41);
        editText_42 = (EditText) findViewById(R.id.editText_42);
        editText_43 = (EditText) findViewById(R.id.editText_43);
        editText_44 = (EditText) findViewById(R.id.editText_44);
        editText_45 = (EditText) findViewById(R.id.editText_45);
        editText_46 = (EditText) findViewById(R.id.editText_46);
        editText_47 = (EditText) findViewById(R.id.editText_47);
        editText_48 = (EditText) findViewById(R.id.editText_48);
        editText_49 = (EditText) findViewById(R.id.editText_49);
        editText_50 = (EditText) findViewById(R.id.editText_50);
        editText_51 = (EditText) findViewById(R.id.editText_51);
        editText_52 = (EditText) findViewById(R.id.editText_52);
        editText_53 = (EditText) findViewById(R.id.editText_53);
        editText_54 = (EditText) findViewById(R.id.editText_54);
        editText_55 = (EditText) findViewById(R.id.editText_55);
        editText_56 = (EditText) findViewById(R.id.editText_56);
        editText_57 = (EditText) findViewById(R.id.editText_57);
        editText_58 = (EditText) findViewById(R.id.editText_58);
        editText_59 = (EditText) findViewById(R.id.editText_59);
        editText_60 = (EditText) findViewById(R.id.editText_60);
        editText_61 = (EditText) findViewById(R.id.editText_61);
        editText_62 = (EditText) findViewById(R.id.editText_62);
        editText_63 = (EditText) findViewById(R.id.editText_63);
        editText_64 = (EditText) findViewById(R.id.editText_64);
        editText_65 = (EditText) findViewById(R.id.editText_65);
        editText_66 = (EditText) findViewById(R.id.editText_66);
        editText_67 = (EditText) findViewById(R.id.editText_67);
        editText_68 = (EditText) findViewById(R.id.editText_68);
        editText_69 = (EditText) findViewById(R.id.editText_69);
        editText_70 = (EditText) findViewById(R.id.editText_70);
        editText_71 = (EditText) findViewById(R.id.editText_71);
        editText_72 = (EditText) findViewById(R.id.editText_72);
        editText_73 = (EditText) findViewById(R.id.editText_73);
        editText_74 = (EditText) findViewById(R.id.editText_74);
        editText_75 = (EditText) findViewById(R.id.editText_75);
        editText_76 = (EditText) findViewById(R.id.editText_76);
        editText_77 = (EditText) findViewById(R.id.editText_77);
        editText_78 = (EditText) findViewById(R.id.editText_78);
        editText_79 = (EditText) findViewById(R.id.editText_79);
        editText_80 = (EditText) findViewById(R.id.editText_80);
        editText_81 = (EditText) findViewById(R.id.editText_81);
        editText_82 = (EditText) findViewById(R.id.editText_82);
        editText_83 = (EditText) findViewById(R.id.editText_83);
        editText_84 = (EditText) findViewById(R.id.editText_84);
        editText_85 = (EditText) findViewById(R.id.editText_85);
        editText_86 = (EditText) findViewById(R.id.editText_86);
        editText_87 = (EditText) findViewById(R.id.editText_87);
        editText_88 = (EditText) findViewById(R.id.editText_88);
        editText_89 = (EditText) findViewById(R.id.editText_89);
        editText_90 = (EditText) findViewById(R.id.editText_90);

        button_minus_10 = (Button) findViewById(R.id.button_minus_10);
        button_minus_11 = (Button) findViewById(R.id.button_minus_11);
        button_minus_12 = (Button) findViewById(R.id.button_minus_12);
        button_minus_13 = (Button) findViewById(R.id.button_minus_13);
        button_minus_14 = (Button) findViewById(R.id.button_minus_14);
        button_minus_15 = (Button) findViewById(R.id.button_minus_15);
        button_minus_16 = (Button) findViewById(R.id.button_minus_16);
        button_minus_17 = (Button) findViewById(R.id.button_minus_17);
        button_minus_18 = (Button) findViewById(R.id.button_minus_18);
        button_minus_19 = (Button) findViewById(R.id.button_minus_19);
        button_minus_20 = (Button) findViewById(R.id.button_minus_20);
        button_minus_21 = (Button) findViewById(R.id.button_minus_21);
        button_minus_22 = (Button) findViewById(R.id.button_minus_22);
        button_minus_23 = (Button) findViewById(R.id.button_minus_23);
        button_minus_24 = (Button) findViewById(R.id.button_minus_24);
        button_minus_25 = (Button) findViewById(R.id.button_minus_25);
        button_minus_26 = (Button) findViewById(R.id.button_minus_26);
        button_minus_27 = (Button) findViewById(R.id.button_minus_27);
        button_minus_28 = (Button) findViewById(R.id.button_minus_28);
        button_minus_29 = (Button) findViewById(R.id.button_minus_29);
        button_minus_30 = (Button) findViewById(R.id.button_minus_30);
        button_minus_31 = (Button) findViewById(R.id.button_minus_31);
        button_minus_32 = (Button) findViewById(R.id.button_minus_32);
        button_minus_33 = (Button) findViewById(R.id.button_minus_33);
        button_minus_34 = (Button) findViewById(R.id.button_minus_34);
        button_minus_35 = (Button) findViewById(R.id.button_minus_35);
        button_minus_36 = (Button) findViewById(R.id.button_minus_36);
        button_minus_37 = (Button) findViewById(R.id.button_minus_37);
        button_minus_38 = (Button) findViewById(R.id.button_minus_38);
        button_minus_39 = (Button) findViewById(R.id.button_minus_39);
        button_minus_40 = (Button) findViewById(R.id.button_minus_40);
        button_minus_41 = (Button) findViewById(R.id.button_minus_41);
        button_minus_42 = (Button) findViewById(R.id.button_minus_42);
        button_minus_43 = (Button) findViewById(R.id.button_minus_43);
        button_minus_44 = (Button) findViewById(R.id.button_minus_44);
        button_minus_45 = (Button) findViewById(R.id.button_minus_45);
        button_minus_46 = (Button) findViewById(R.id.button_minus_46);
        button_minus_47 = (Button) findViewById(R.id.button_minus_47);
        button_minus_48 = (Button) findViewById(R.id.button_minus_48);
        button_minus_49 = (Button) findViewById(R.id.button_minus_49);
        button_minus_50 = (Button) findViewById(R.id.button_minus_50);
        button_minus_51 = (Button) findViewById(R.id.button_minus_51);
        button_minus_52 = (Button) findViewById(R.id.button_minus_52);
        button_minus_53 = (Button) findViewById(R.id.button_minus_53);
        button_minus_54 = (Button) findViewById(R.id.button_minus_54);
        button_minus_55 = (Button) findViewById(R.id.button_minus_55);
        button_minus_56 = (Button) findViewById(R.id.button_minus_56);
        button_minus_57 = (Button) findViewById(R.id.button_minus_57);
        button_minus_58 = (Button) findViewById(R.id.button_minus_58);
        button_minus_59 = (Button) findViewById(R.id.button_minus_59);
        button_minus_60 = (Button) findViewById(R.id.button_minus_60);
        button_minus_61 = (Button) findViewById(R.id.button_minus_61);
        button_minus_62 = (Button) findViewById(R.id.button_minus_62);
        button_minus_63 = (Button) findViewById(R.id.button_minus_63);
        button_minus_64 = (Button) findViewById(R.id.button_minus_64);
        button_minus_65 = (Button) findViewById(R.id.button_minus_65);
        button_minus_66 = (Button) findViewById(R.id.button_minus_66);
        button_minus_67 = (Button) findViewById(R.id.button_minus_67);
        button_minus_68 = (Button) findViewById(R.id.button_minus_68);
        button_minus_69 = (Button) findViewById(R.id.button_minus_69);
        button_minus_70 = (Button) findViewById(R.id.button_minus_70);
        button_minus_71 = (Button) findViewById(R.id.button_minus_71);
        button_minus_72 = (Button) findViewById(R.id.button_minus_72);
        button_minus_73 = (Button) findViewById(R.id.button_minus_73);
        button_minus_74 = (Button) findViewById(R.id.button_minus_74);
        button_minus_75 = (Button) findViewById(R.id.button_minus_75);
        button_minus_76 = (Button) findViewById(R.id.button_minus_76);
        button_minus_77 = (Button) findViewById(R.id.button_minus_77);
        button_minus_78 = (Button) findViewById(R.id.button_minus_78);
        button_minus_79 = (Button) findViewById(R.id.button_minus_79);
        button_minus_80 = (Button) findViewById(R.id.button_minus_80);
        button_minus_81 = (Button) findViewById(R.id.button_minus_81);
        button_minus_82 = (Button) findViewById(R.id.button_minus_82);
        button_minus_83 = (Button) findViewById(R.id.button_minus_83);
        button_minus_84 = (Button) findViewById(R.id.button_minus_84);
        button_minus_85 = (Button) findViewById(R.id.button_minus_85);
        button_minus_86 = (Button) findViewById(R.id.button_minus_86);
        button_minus_87 = (Button) findViewById(R.id.button_minus_87);
        button_minus_88 = (Button) findViewById(R.id.button_minus_88);
        button_minus_89 = (Button) findViewById(R.id.button_minus_89);
        button_minus_90 = (Button) findViewById(R.id.button_minus_90);


        button_plus_10 = (Button) findViewById(R.id.button_plus_10);
        button_plus_11 = (Button) findViewById(R.id.button_plus_11);
        button_plus_12 = (Button) findViewById(R.id.button_plus_12);
        button_plus_13 = (Button) findViewById(R.id.button_plus_13);
        button_plus_14 = (Button) findViewById(R.id.button_plus_14);
        button_plus_15 = (Button) findViewById(R.id.button_plus_15);
        button_plus_16 = (Button) findViewById(R.id.button_plus_16);
        button_plus_17 = (Button) findViewById(R.id.button_plus_17);
        button_plus_18 = (Button) findViewById(R.id.button_plus_18);
        button_plus_19 = (Button) findViewById(R.id.button_plus_19);
        button_plus_20 = (Button) findViewById(R.id.button_plus_20);
        button_plus_21 = (Button) findViewById(R.id.button_plus_21);
        button_plus_22 = (Button) findViewById(R.id.button_plus_22);
        button_plus_23 = (Button) findViewById(R.id.button_plus_23);
        button_plus_24 = (Button) findViewById(R.id.button_plus_24);
        button_plus_25 = (Button) findViewById(R.id.button_plus_25);
        button_plus_26 = (Button) findViewById(R.id.button_plus_26);
        button_plus_27 = (Button) findViewById(R.id.button_plus_27);
        button_plus_28 = (Button) findViewById(R.id.button_plus_28);
        button_plus_29 = (Button) findViewById(R.id.button_plus_29);
        button_plus_30 = (Button) findViewById(R.id.button_plus_30);
        button_plus_31 = (Button) findViewById(R.id.button_plus_31);
        button_plus_32 = (Button) findViewById(R.id.button_plus_32);
        button_plus_33 = (Button) findViewById(R.id.button_plus_33);
        button_plus_34 = (Button) findViewById(R.id.button_plus_34);
        button_plus_35 = (Button) findViewById(R.id.button_plus_35);
        button_plus_36 = (Button) findViewById(R.id.button_plus_36);
        button_plus_37 = (Button) findViewById(R.id.button_plus_37);
        button_plus_38 = (Button) findViewById(R.id.button_plus_38);
        button_plus_39 = (Button) findViewById(R.id.button_plus_39);
        button_plus_40 = (Button) findViewById(R.id.button_plus_40);
        button_plus_41 = (Button) findViewById(R.id.button_plus_41);
        button_plus_42 = (Button) findViewById(R.id.button_plus_42);
        button_plus_43 = (Button) findViewById(R.id.button_plus_43);
        button_plus_44 = (Button) findViewById(R.id.button_plus_44);
        button_plus_45 = (Button) findViewById(R.id.button_plus_45);
        button_plus_46 = (Button) findViewById(R.id.button_plus_46);
        button_plus_47 = (Button) findViewById(R.id.button_plus_47);
        button_plus_48 = (Button) findViewById(R.id.button_plus_48);
        button_plus_49 = (Button) findViewById(R.id.button_plus_49);
        button_plus_50 = (Button) findViewById(R.id.button_plus_50);
        button_plus_51 = (Button) findViewById(R.id.button_plus_51);
        button_plus_52 = (Button) findViewById(R.id.button_plus_52);
        button_plus_53 = (Button) findViewById(R.id.button_plus_53);
        button_plus_54 = (Button) findViewById(R.id.button_plus_54);
        button_plus_55 = (Button) findViewById(R.id.button_plus_55);
        button_plus_56 = (Button) findViewById(R.id.button_plus_56);
        button_plus_57 = (Button) findViewById(R.id.button_plus_57);
        button_plus_58 = (Button) findViewById(R.id.button_plus_58);
        button_plus_59 = (Button) findViewById(R.id.button_plus_59);
        button_plus_60 = (Button) findViewById(R.id.button_plus_60);
        button_plus_61 = (Button) findViewById(R.id.button_plus_61);
        button_plus_62 = (Button) findViewById(R.id.button_plus_62);
        button_plus_63 = (Button) findViewById(R.id.button_plus_63);
        button_plus_64 = (Button) findViewById(R.id.button_plus_64);
        button_plus_65 = (Button) findViewById(R.id.button_plus_65);
        button_plus_66 = (Button) findViewById(R.id.button_plus_66);
        button_plus_67 = (Button) findViewById(R.id.button_plus_67);
        button_plus_68 = (Button) findViewById(R.id.button_plus_68);
        button_plus_69 = (Button) findViewById(R.id.button_plus_69);
        button_plus_70 = (Button) findViewById(R.id.button_plus_70);
        button_plus_71 = (Button) findViewById(R.id.button_plus_71);
        button_plus_72 = (Button) findViewById(R.id.button_plus_72);
        button_plus_73 = (Button) findViewById(R.id.button_plus_73);
        button_plus_74 = (Button) findViewById(R.id.button_plus_74);
        button_plus_75 = (Button) findViewById(R.id.button_plus_75);
        button_plus_76 = (Button) findViewById(R.id.button_plus_76);
        button_plus_77 = (Button) findViewById(R.id.button_plus_77);
        button_plus_78 = (Button) findViewById(R.id.button_plus_78);
        button_plus_79 = (Button) findViewById(R.id.button_plus_79);
        button_plus_80 = (Button) findViewById(R.id.button_plus_80);
        button_plus_81 = (Button) findViewById(R.id.button_plus_81);
        button_plus_82 = (Button) findViewById(R.id.button_plus_82);
        button_plus_83 = (Button) findViewById(R.id.button_plus_83);
        button_plus_84 = (Button) findViewById(R.id.button_plus_84);
        button_plus_85 = (Button) findViewById(R.id.button_plus_85);
        button_plus_86 = (Button) findViewById(R.id.button_plus_86);
        button_plus_87 = (Button) findViewById(R.id.button_plus_87);
        button_plus_88 = (Button) findViewById(R.id.button_plus_88);
        button_plus_89 = (Button) findViewById(R.id.button_plus_89);
        button_plus_90 = (Button) findViewById(R.id.button_plus_90);

        textView_ravno_10 = (TextView) findViewById(R.id.textView_ravno_10);
        textView_ravno_11 = (TextView) findViewById(R.id.textView_ravno_11);
        textView_ravno_12 = (TextView) findViewById(R.id.textView_ravno_12);
        textView_ravno_13 = (TextView) findViewById(R.id.textView_ravno_13);
        textView_ravno_14 = (TextView) findViewById(R.id.textView_ravno_14);
        textView_ravno_15 = (TextView) findViewById(R.id.textView_ravno_15);
        textView_ravno_16 = (TextView) findViewById(R.id.textView_ravno_16);
        textView_ravno_17 = (TextView) findViewById(R.id.textView_ravno_17);
        textView_ravno_18 = (TextView) findViewById(R.id.textView_ravno_18);
        textView_ravno_19 = (TextView) findViewById(R.id.textView_ravno_19);
        textView_ravno_20 = (TextView) findViewById(R.id.textView_ravno_20);
        textView_ravno_21 = (TextView) findViewById(R.id.textView_ravno_21);
        textView_ravno_22 = (TextView) findViewById(R.id.textView_ravno_22);
        textView_ravno_23 = (TextView) findViewById(R.id.textView_ravno_23);
        textView_ravno_24 = (TextView) findViewById(R.id.textView_ravno_24);
        textView_ravno_25 = (TextView) findViewById(R.id.textView_ravno_25);
        textView_ravno_26 = (TextView) findViewById(R.id.textView_ravno_26);
        textView_ravno_27 = (TextView) findViewById(R.id.textView_ravno_27);
        textView_ravno_28 = (TextView) findViewById(R.id.textView_ravno_28);
        textView_ravno_29 = (TextView) findViewById(R.id.textView_ravno_29);
        textView_ravno_30 = (TextView) findViewById(R.id.textView_ravno_30);
        textView_ravno_31 = (TextView) findViewById(R.id.textView_ravno_31);
        textView_ravno_32 = (TextView) findViewById(R.id.textView_ravno_32);
        textView_ravno_33 = (TextView) findViewById(R.id.textView_ravno_33);
        textView_ravno_34 = (TextView) findViewById(R.id.textView_ravno_34);
        textView_ravno_35 = (TextView) findViewById(R.id.textView_ravno_35);
        textView_ravno_36 = (TextView) findViewById(R.id.textView_ravno_36);
        textView_ravno_37 = (TextView) findViewById(R.id.textView_ravno_37);
        textView_ravno_38 = (TextView) findViewById(R.id.textView_ravno_38);
        textView_ravno_39 = (TextView) findViewById(R.id.textView_ravno_39);
        textView_ravno_40 = (TextView) findViewById(R.id.textView_ravno_40);
        textView_ravno_41 = (TextView) findViewById(R.id.textView_ravno_41);
        textView_ravno_42 = (TextView) findViewById(R.id.textView_ravno_42);
        textView_ravno_43 = (TextView) findViewById(R.id.textView_ravno_43);
        textView_ravno_44 = (TextView) findViewById(R.id.textView_ravno_44);
        textView_ravno_45 = (TextView) findViewById(R.id.textView_ravno_45);
        textView_ravno_46 = (TextView) findViewById(R.id.textView_ravno_46);
        textView_ravno_47 = (TextView) findViewById(R.id.textView_ravno_47);
        textView_ravno_48 = (TextView) findViewById(R.id.textView_ravno_48);
        textView_ravno_49 = (TextView) findViewById(R.id.textView_ravno_49);
        textView_ravno_50 = (TextView) findViewById(R.id.textView_ravno_50);
        textView_ravno_51 = (TextView) findViewById(R.id.textView_ravno_51);
        textView_ravno_52 = (TextView) findViewById(R.id.textView_ravno_52);
        textView_ravno_53 = (TextView) findViewById(R.id.textView_ravno_53);
        textView_ravno_54 = (TextView) findViewById(R.id.textView_ravno_54);
        textView_ravno_55 = (TextView) findViewById(R.id.textView_ravno_55);
        textView_ravno_56 = (TextView) findViewById(R.id.textView_ravno_56);
        textView_ravno_57 = (TextView) findViewById(R.id.textView_ravno_57);
        textView_ravno_58 = (TextView) findViewById(R.id.textView_ravno_58);
        textView_ravno_59 = (TextView) findViewById(R.id.textView_ravno_59);
        textView_ravno_60 = (TextView) findViewById(R.id.textView_ravno_60);
        textView_ravno_61 = (TextView) findViewById(R.id.textView_ravno_61);
        textView_ravno_62 = (TextView) findViewById(R.id.textView_ravno_62);
        textView_ravno_63 = (TextView) findViewById(R.id.textView_ravno_63);
        textView_ravno_64 = (TextView) findViewById(R.id.textView_ravno_64);
        textView_ravno_65 = (TextView) findViewById(R.id.textView_ravno_65);
        textView_ravno_66 = (TextView) findViewById(R.id.textView_ravno_66);
        textView_ravno_67 = (TextView) findViewById(R.id.textView_ravno_67);
        textView_ravno_68 = (TextView) findViewById(R.id.textView_ravno_68);
        textView_ravno_69 = (TextView) findViewById(R.id.textView_ravno_69);
        textView_ravno_70 = (TextView) findViewById(R.id.textView_ravno_70);
        textView_ravno_71 = (TextView) findViewById(R.id.textView_ravno_71);
        textView_ravno_72 = (TextView) findViewById(R.id.textView_ravno_72);
        textView_ravno_73 = (TextView) findViewById(R.id.textView_ravno_73);
        textView_ravno_74 = (TextView) findViewById(R.id.textView_ravno_74);
        textView_ravno_75 = (TextView) findViewById(R.id.textView_ravno_75);
        textView_ravno_76 = (TextView) findViewById(R.id.textView_ravno_76);
        textView_ravno_77 = (TextView) findViewById(R.id.textView_ravno_77);
        textView_ravno_78 = (TextView) findViewById(R.id.textView_ravno_78);
        textView_ravno_79 = (TextView) findViewById(R.id.textView_ravno_79);
        textView_ravno_80 = (TextView) findViewById(R.id.textView_ravno_80);
        textView_ravno_81 = (TextView) findViewById(R.id.textView_ravno_81);
        textView_ravno_82 = (TextView) findViewById(R.id.textView_ravno_82);
        textView_ravno_83 = (TextView) findViewById(R.id.textView_ravno_83);
        textView_ravno_84 = (TextView) findViewById(R.id.textView_ravno_84);
        textView_ravno_85 = (TextView) findViewById(R.id.textView_ravno_85);
        textView_ravno_86 = (TextView) findViewById(R.id.textView_ravno_86);
        textView_ravno_87 = (TextView) findViewById(R.id.textView_ravno_87);
        textView_ravno_88 = (TextView) findViewById(R.id.textView_ravno_88);
        textView_ravno_89 = (TextView) findViewById(R.id.textView_ravno_89);
        textView_ravno_90 = (TextView) findViewById(R.id.textView_ravno_90);

        button_result = (Button) findViewById(R.id.button_result);
        total_response = (TextView) findViewById(R.id.total_response);
        price_response = (EditText) findViewById(R.id.price_response);
        ob_response = (TextView) findViewById(R.id.ob_response);
        col_response = (TextView) findViewById(R.id.col_response);

        button_result.setOnClickListener(this);
        button_minus_10.setOnClickListener(this);
        button_minus_11.setOnClickListener(this);
        button_minus_12.setOnClickListener(this);
        button_minus_13.setOnClickListener(this);
        button_minus_14.setOnClickListener(this);
        button_minus_15.setOnClickListener(this);
        button_minus_16.setOnClickListener(this);
        button_minus_17.setOnClickListener(this);
        button_minus_18.setOnClickListener(this);
        button_minus_19.setOnClickListener(this);
        button_minus_20.setOnClickListener(this);
        button_minus_21.setOnClickListener(this);
        button_minus_22.setOnClickListener(this);
        button_minus_23.setOnClickListener(this);
        button_minus_24.setOnClickListener(this);
        button_minus_25.setOnClickListener(this);
        button_minus_26.setOnClickListener(this);
        button_minus_27.setOnClickListener(this);
        button_minus_28.setOnClickListener(this);
        button_minus_29.setOnClickListener(this);
        button_minus_30.setOnClickListener(this);
        button_minus_31.setOnClickListener(this);
        button_minus_32.setOnClickListener(this);
        button_minus_33.setOnClickListener(this);
        button_minus_34.setOnClickListener(this);
        button_minus_35.setOnClickListener(this);
        button_minus_36.setOnClickListener(this);
        button_minus_37.setOnClickListener(this);
        button_minus_38.setOnClickListener(this);
        button_minus_39.setOnClickListener(this);
        button_minus_40.setOnClickListener(this);
        button_minus_41.setOnClickListener(this);
        button_minus_42.setOnClickListener(this);
        button_minus_43.setOnClickListener(this);
        button_minus_44.setOnClickListener(this);
        button_minus_45.setOnClickListener(this);
        button_minus_46.setOnClickListener(this);
        button_minus_47.setOnClickListener(this);
        button_minus_48.setOnClickListener(this);
        button_minus_49.setOnClickListener(this);
        button_minus_50.setOnClickListener(this);
        button_minus_51.setOnClickListener(this);
        button_minus_52.setOnClickListener(this);
        button_minus_53.setOnClickListener(this);
        button_minus_54.setOnClickListener(this);
        button_minus_55.setOnClickListener(this);
        button_minus_56.setOnClickListener(this);
        button_minus_57.setOnClickListener(this);
        button_minus_58.setOnClickListener(this);
        button_minus_59.setOnClickListener(this);
        button_minus_60.setOnClickListener(this);
        button_minus_61.setOnClickListener(this);
        button_minus_62.setOnClickListener(this);
        button_minus_63.setOnClickListener(this);
        button_minus_64.setOnClickListener(this);
        button_minus_65.setOnClickListener(this);
        button_minus_66.setOnClickListener(this);
        button_minus_67.setOnClickListener(this);
        button_minus_68.setOnClickListener(this);
        button_minus_69.setOnClickListener(this);
        button_minus_70.setOnClickListener(this);
        button_minus_71.setOnClickListener(this);
        button_minus_72.setOnClickListener(this);
        button_minus_73.setOnClickListener(this);
        button_minus_74.setOnClickListener(this);
        button_minus_75.setOnClickListener(this);
        button_minus_76.setOnClickListener(this);
        button_minus_77.setOnClickListener(this);
        button_minus_78.setOnClickListener(this);
        button_minus_79.setOnClickListener(this);
        button_minus_80.setOnClickListener(this);
        button_minus_81.setOnClickListener(this);
        button_minus_82.setOnClickListener(this);
        button_minus_83.setOnClickListener(this);
        button_minus_84.setOnClickListener(this);
        button_minus_85.setOnClickListener(this);
        button_minus_86.setOnClickListener(this);
        button_minus_87.setOnClickListener(this);
        button_minus_88.setOnClickListener(this);
        button_minus_89.setOnClickListener(this);
        button_minus_90.setOnClickListener(this);


        button_plus_10.setOnClickListener(this);
        button_plus_11.setOnClickListener(this);
        button_plus_12.setOnClickListener(this);
        button_plus_13.setOnClickListener(this);
        button_plus_14.setOnClickListener(this);
        button_plus_15.setOnClickListener(this);
        button_plus_16.setOnClickListener(this);
        button_plus_17.setOnClickListener(this);
        button_plus_18.setOnClickListener(this);
        button_plus_19.setOnClickListener(this);
        button_plus_20.setOnClickListener(this);
        button_plus_21.setOnClickListener(this);
        button_plus_22.setOnClickListener(this);
        button_plus_23.setOnClickListener(this);
        button_plus_24.setOnClickListener(this);
        button_plus_25.setOnClickListener(this);
        button_plus_26.setOnClickListener(this);
        button_plus_27.setOnClickListener(this);
        button_plus_28.setOnClickListener(this);
        button_plus_29.setOnClickListener(this);
        button_plus_30.setOnClickListener(this);
        button_plus_31.setOnClickListener(this);
        button_plus_32.setOnClickListener(this);
        button_plus_33.setOnClickListener(this);
        button_plus_34.setOnClickListener(this);
        button_plus_35.setOnClickListener(this);
        button_plus_36.setOnClickListener(this);
        button_plus_37.setOnClickListener(this);
        button_plus_38.setOnClickListener(this);
        button_plus_39.setOnClickListener(this);
        button_plus_40.setOnClickListener(this);
        button_plus_41.setOnClickListener(this);
        button_plus_42.setOnClickListener(this);
        button_plus_43.setOnClickListener(this);
        button_plus_44.setOnClickListener(this);
        button_plus_45.setOnClickListener(this);
        button_plus_46.setOnClickListener(this);
        button_plus_47.setOnClickListener(this);
        button_plus_48.setOnClickListener(this);
        button_plus_49.setOnClickListener(this);
        button_plus_50.setOnClickListener(this);
        button_plus_51.setOnClickListener(this);
        button_plus_52.setOnClickListener(this);
        button_plus_53.setOnClickListener(this);
        button_plus_54.setOnClickListener(this);
        button_plus_55.setOnClickListener(this);
        button_plus_56.setOnClickListener(this);
        button_plus_57.setOnClickListener(this);
        button_plus_58.setOnClickListener(this);
        button_plus_59.setOnClickListener(this);
        button_plus_60.setOnClickListener(this);
        button_plus_61.setOnClickListener(this);
        button_plus_62.setOnClickListener(this);
        button_plus_63.setOnClickListener(this);
        button_plus_64.setOnClickListener(this);
        button_plus_65.setOnClickListener(this);
        button_plus_66.setOnClickListener(this);
        button_plus_67.setOnClickListener(this);
        button_plus_68.setOnClickListener(this);
        button_plus_69.setOnClickListener(this);
        button_plus_70.setOnClickListener(this);
        button_plus_71.setOnClickListener(this);
        button_plus_72.setOnClickListener(this);
        button_plus_73.setOnClickListener(this);
        button_plus_74.setOnClickListener(this);
        button_plus_75.setOnClickListener(this);
        button_plus_76.setOnClickListener(this);
        button_plus_77.setOnClickListener(this);
        button_plus_78.setOnClickListener(this);
        button_plus_79.setOnClickListener(this);
        button_plus_80.setOnClickListener(this);
        button_plus_81.setOnClickListener(this);
        button_plus_82.setOnClickListener(this);
        button_plus_83.setOnClickListener(this);
        button_plus_84.setOnClickListener(this);
        button_plus_85.setOnClickListener(this);
        button_plus_86.setOnClickListener(this);
        button_plus_87.setOnClickListener(this);
        button_plus_88.setOnClickListener(this);
        button_plus_89.setOnClickListener(this);
        button_plus_90.setOnClickListener(this);
        //loadText();
        changedText(editText_10, textView_ravno_10, button_plus_10, button_minus_10, dim_10);
        changedText(editText_11, textView_ravno_11, button_plus_11, button_minus_11, dim_11);
        changedText(editText_12, textView_ravno_12, button_plus_12, button_minus_12, dim_12);
        changedText(editText_13, textView_ravno_13, button_plus_13, button_minus_13, dim_13);
        changedText(editText_14, textView_ravno_14, button_plus_14, button_minus_14, dim_14);
        changedText(editText_15, textView_ravno_15, button_plus_15, button_minus_15, dim_15);
        changedText(editText_16, textView_ravno_16, button_plus_16, button_minus_16, dim_16);
        changedText(editText_17, textView_ravno_17, button_plus_17, button_minus_17, dim_17);
        changedText(editText_18, textView_ravno_18, button_plus_18, button_minus_18, dim_18);
        changedText(editText_19, textView_ravno_19, button_plus_19, button_minus_19, dim_19);
        changedText(editText_20, textView_ravno_20, button_plus_20, button_minus_20, dim_20);
        changedText(editText_21, textView_ravno_21, button_plus_21, button_minus_21, dim_21);
        changedText(editText_22, textView_ravno_22, button_plus_22, button_minus_22, dim_22);
        changedText(editText_23, textView_ravno_23, button_plus_23, button_minus_23, dim_23);
        changedText(editText_24, textView_ravno_24, button_plus_24, button_minus_24, dim_24);
        changedText(editText_25, textView_ravno_25, button_plus_25, button_minus_25, dim_25);
        changedText(editText_26, textView_ravno_26, button_plus_26, button_minus_26, dim_26);
        changedText(editText_27, textView_ravno_27, button_plus_27, button_minus_27, dim_27);
        changedText(editText_28, textView_ravno_28, button_plus_28, button_minus_28, dim_28);
        changedText(editText_29, textView_ravno_29, button_plus_29, button_minus_29, dim_29);
        changedText(editText_30, textView_ravno_30, button_plus_30, button_minus_30, dim_30);
        changedText(editText_31, textView_ravno_31, button_plus_31, button_minus_31, dim_31);
        changedText(editText_32, textView_ravno_32, button_plus_32, button_minus_32, dim_32);
        changedText(editText_33, textView_ravno_33, button_plus_33, button_minus_33, dim_33);
        changedText(editText_34, textView_ravno_34, button_plus_34, button_minus_34, dim_34);
        changedText(editText_35, textView_ravno_35, button_plus_35, button_minus_35, dim_35);
        changedText(editText_36, textView_ravno_36, button_plus_36, button_minus_36, dim_36);
        changedText(editText_37, textView_ravno_37, button_plus_37, button_minus_37, dim_37);
        changedText(editText_38, textView_ravno_38, button_plus_38, button_minus_38, dim_38);
        changedText(editText_39, textView_ravno_39, button_plus_39, button_minus_39, dim_39);
        changedText(editText_40, textView_ravno_40, button_plus_40, button_minus_40, dim_40);
        changedText(editText_41, textView_ravno_41, button_plus_41, button_minus_41, dim_41);
        changedText(editText_42, textView_ravno_42, button_plus_42, button_minus_42, dim_42);
        changedText(editText_43, textView_ravno_43, button_plus_43, button_minus_43, dim_43);
        changedText(editText_44, textView_ravno_44, button_plus_44, button_minus_44, dim_44);
        changedText(editText_45, textView_ravno_45, button_plus_45, button_minus_45, dim_45);
        changedText(editText_46, textView_ravno_46, button_plus_46, button_minus_46, dim_46);
        changedText(editText_47, textView_ravno_47, button_plus_47, button_minus_47, dim_47);
        changedText(editText_48, textView_ravno_48, button_plus_48, button_minus_48, dim_48);
        changedText(editText_49, textView_ravno_49, button_plus_49, button_minus_49, dim_49);
        changedText(editText_50, textView_ravno_50, button_plus_50, button_minus_50, dim_50);
        changedText(editText_51, textView_ravno_51, button_plus_51, button_minus_51, dim_51);
        changedText(editText_52, textView_ravno_52, button_plus_52, button_minus_52, dim_52);
        changedText(editText_53, textView_ravno_53, button_plus_53, button_minus_53, dim_53);
        changedText(editText_54, textView_ravno_54, button_plus_54, button_minus_54, dim_54);
        changedText(editText_55, textView_ravno_55, button_plus_55, button_minus_55, dim_55);
        changedText(editText_56, textView_ravno_56, button_plus_56, button_minus_56, dim_56);
        changedText(editText_57, textView_ravno_57, button_plus_57, button_minus_57, dim_57);
        changedText(editText_58, textView_ravno_58, button_plus_58, button_minus_58, dim_58);
        changedText(editText_59, textView_ravno_59, button_plus_59, button_minus_59, dim_59);
        changedText(editText_60, textView_ravno_60, button_plus_60, button_minus_60, dim_60);
        changedText(editText_61, textView_ravno_61, button_plus_61, button_minus_61, dim_61);
        changedText(editText_62, textView_ravno_62, button_plus_62, button_minus_62, dim_62);
        changedText(editText_63, textView_ravno_63, button_plus_63, button_minus_63, dim_63);
        changedText(editText_64, textView_ravno_64, button_plus_64, button_minus_64, dim_64);
        changedText(editText_65, textView_ravno_65, button_plus_65, button_minus_65, dim_65);
        changedText(editText_66, textView_ravno_66, button_plus_66, button_minus_66, dim_66);
        changedText(editText_67, textView_ravno_67, button_plus_67, button_minus_67, dim_67);
        changedText(editText_68, textView_ravno_68, button_plus_68, button_minus_68, dim_68);
        changedText(editText_69, textView_ravno_69, button_plus_69, button_minus_69, dim_69);
        changedText(editText_70, textView_ravno_70, button_plus_70, button_minus_70, dim_70);
        changedText(editText_71, textView_ravno_71, button_plus_71, button_minus_71, dim_71);
        changedText(editText_72, textView_ravno_72, button_plus_72, button_minus_72, dim_72);
        changedText(editText_73, textView_ravno_73, button_plus_73, button_minus_73, dim_73);
        changedText(editText_74, textView_ravno_74, button_plus_74, button_minus_74, dim_74);
        changedText(editText_75, textView_ravno_75, button_plus_75, button_minus_75, dim_75);
        changedText(editText_76, textView_ravno_76, button_plus_76, button_minus_76, dim_76);
        changedText(editText_77, textView_ravno_77, button_plus_77, button_minus_77, dim_77);
        changedText(editText_78, textView_ravno_78, button_plus_78, button_minus_78, dim_78);
        changedText(editText_79, textView_ravno_79, button_plus_79, button_minus_79, dim_79);
        changedText(editText_80, textView_ravno_80, button_plus_80, button_minus_80, dim_80);
        changedText(editText_81, textView_ravno_81, button_plus_81, button_minus_81, dim_81);
        changedText(editText_82, textView_ravno_82, button_plus_82, button_minus_82, dim_82);
        changedText(editText_83, textView_ravno_83, button_plus_83, button_minus_83, dim_83);
        changedText(editText_84, textView_ravno_84, button_plus_84, button_minus_84, dim_84);
        changedText(editText_85, textView_ravno_85, button_plus_85, button_minus_85, dim_85);
        changedText(editText_86, textView_ravno_86, button_plus_86, button_minus_86, dim_86);
        changedText(editText_87, textView_ravno_87, button_plus_87, button_minus_87, dim_87);
        changedText(editText_88, textView_ravno_88, button_plus_88, button_minus_88, dim_88);
        changedText(editText_89, textView_ravno_89, button_plus_89, button_minus_89, dim_89);
        changedText(editText_90, textView_ravno_90, button_plus_90, button_minus_90, dim_90);
        editText_10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_10, textView_ravno_10, button_plus_10, button_minus_10, dim_10);
            }
        });
        editText_11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_11, textView_ravno_11, button_plus_11, button_minus_11, dim_11);
            }
        });
        editText_12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_12, textView_ravno_12, button_plus_12, button_minus_12, dim_12);
            }
        });
        editText_13.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_13, textView_ravno_13, button_plus_13, button_minus_13, dim_13);
            }
        });
        editText_14.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_14, textView_ravno_14, button_plus_14, button_minus_14, dim_14);
            }
        });
        editText_15.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_15, textView_ravno_15, button_plus_15, button_minus_15, dim_15);
            }
        });
        editText_16.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_16, textView_ravno_16, button_plus_16, button_minus_16, dim_16);
            }
        });
        editText_17.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_17, textView_ravno_17, button_plus_17, button_minus_17, dim_17);
            }
        });
        editText_18.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_18, textView_ravno_18, button_plus_18, button_minus_18, dim_18);
            }
        });
        editText_19.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_19, textView_ravno_19, button_plus_19, button_minus_19, dim_19);
            }
        });
        editText_20.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_20, textView_ravno_20, button_plus_20, button_minus_20, dim_20);
            }
        });
        editText_21.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_21, textView_ravno_21, button_plus_21, button_minus_21, dim_21);
            }
        });
        editText_22.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_22, textView_ravno_22, button_plus_22, button_minus_22, dim_22);
            }
        });
        editText_23.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_23, textView_ravno_23, button_plus_23, button_minus_23, dim_23);
            }
        });
        editText_24.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_24, textView_ravno_24, button_plus_24, button_minus_24, dim_24);
            }
        });
        editText_25.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_25, textView_ravno_25, button_plus_25, button_minus_25, dim_25);
            }
        });
        editText_26.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_26, textView_ravno_26, button_plus_26, button_minus_26, dim_26);
            }
        });
        editText_27.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_27, textView_ravno_27, button_plus_27, button_minus_27, dim_27);
            }
        });
        editText_28.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_28, textView_ravno_28, button_plus_28, button_minus_28, dim_28);
            }
        });
        editText_29.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_29, textView_ravno_29, button_plus_29, button_minus_29, dim_29);
            }
        });
        editText_30.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_30, textView_ravno_30, button_plus_30, button_minus_30, dim_30);
            }
        });
        editText_31.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_31, textView_ravno_31, button_plus_31, button_minus_31, dim_31);
            }
        });
        editText_32.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_32, textView_ravno_32, button_plus_32, button_minus_32, dim_32);
            }
        });
        editText_33.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_33, textView_ravno_33, button_plus_33, button_minus_33, dim_33);
            }
        });
        editText_34.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_34, textView_ravno_34, button_plus_34, button_minus_34, dim_34);
            }
        });
        editText_35.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_35, textView_ravno_35, button_plus_35, button_minus_35, dim_35);
            }
        });
        editText_36.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_36, textView_ravno_36, button_plus_36, button_minus_36, dim_36);
            }
        });
        editText_37.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_37, textView_ravno_37, button_plus_37, button_minus_37, dim_37);
            }
        });
        editText_38.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_38, textView_ravno_38, button_plus_38, button_minus_38, dim_38);
            }
        });
        editText_39.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_39, textView_ravno_39, button_plus_39, button_minus_39, dim_39);
            }
        });
        editText_40.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_40, textView_ravno_40, button_plus_40, button_minus_40, dim_40);
            }
        });
        editText_41.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_41, textView_ravno_41, button_plus_41, button_minus_41, dim_41);
            }
        });
        editText_42.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_42, textView_ravno_42, button_plus_42, button_minus_42, dim_42);
            }
        });
        editText_43.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_43, textView_ravno_43, button_plus_43, button_minus_43, dim_43);
            }
        });
        editText_44.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_44, textView_ravno_44, button_plus_44, button_minus_44, dim_44);
            }
        });
        editText_45.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_45, textView_ravno_45, button_plus_45, button_minus_45, dim_45);
            }
        });
        editText_46.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_46, textView_ravno_46, button_plus_46, button_minus_46, dim_46);
            }
        });
        editText_47.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_47, textView_ravno_47, button_plus_47, button_minus_47, dim_47);
            }
        });
        editText_48.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_48, textView_ravno_48, button_plus_48, button_minus_48, dim_48);
            }
        });
        editText_49.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_49, textView_ravno_49, button_plus_49, button_minus_49, dim_49);
            }
        });
        editText_50.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_50, textView_ravno_50, button_plus_50, button_minus_50, dim_50);
            }
        });
        editText_51.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_51, textView_ravno_51, button_plus_51, button_minus_51, dim_51);
            }
        });
        editText_52.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_52, textView_ravno_52, button_plus_52, button_minus_52, dim_52);
            }
        });
        editText_53.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_53, textView_ravno_53, button_plus_53, button_minus_53, dim_53);
            }
        });
        editText_54.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_54, textView_ravno_54, button_plus_54, button_minus_54, dim_54);
            }
        });
        editText_55.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_55, textView_ravno_55, button_plus_55, button_minus_55, dim_55);
            }
        });
        editText_56.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_56, textView_ravno_56, button_plus_56, button_minus_56, dim_56);
            }
        });
        editText_57.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_57, textView_ravno_57, button_plus_57, button_minus_57, dim_57);
            }
        });
        editText_58.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_58, textView_ravno_58, button_plus_58, button_minus_58, dim_58);
            }
        });
        editText_59.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_59, textView_ravno_59, button_plus_59, button_minus_59, dim_59);
            }
        });
        editText_60.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_60, textView_ravno_60, button_plus_60, button_minus_60, dim_60);
            }
        });
        editText_61.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_61, textView_ravno_61, button_plus_61, button_minus_61, dim_61);
            }
        });
        editText_62.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_62, textView_ravno_62, button_plus_62, button_minus_62, dim_62);
            }
        });
        editText_63.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_63, textView_ravno_63, button_plus_63, button_minus_63, dim_63);
            }
        });
        editText_64.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_64, textView_ravno_64, button_plus_64, button_minus_64, dim_64);
            }
        });
        editText_65.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_65, textView_ravno_65, button_plus_65, button_minus_65, dim_65);
            }
        });
        editText_66.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_66, textView_ravno_66, button_plus_66, button_minus_66, dim_66);
            }
        });
        editText_67.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_67, textView_ravno_67, button_plus_67, button_minus_67, dim_67);
            }
        });
        editText_68.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_68, textView_ravno_68, button_plus_68, button_minus_68, dim_68);
            }
        });
        editText_69.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_69, textView_ravno_69, button_plus_69, button_minus_69, dim_69);
            }
        });
        editText_70.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_70, textView_ravno_70, button_plus_70, button_minus_70, dim_70);
            }
        });
        editText_71.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_71, textView_ravno_71, button_plus_71, button_minus_71, dim_71);
            }
        });
        editText_72.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_72, textView_ravno_72, button_plus_72, button_minus_72, dim_72);
            }
        });
        editText_73.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_73, textView_ravno_73, button_plus_73, button_minus_73, dim_73);
            }
        });
        editText_74.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_74, textView_ravno_74, button_plus_74, button_minus_74, dim_74);
            }
        });
        editText_75.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_75, textView_ravno_75, button_plus_75, button_minus_75, dim_75);
            }
        });
        editText_76.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_76, textView_ravno_76, button_plus_76, button_minus_76, dim_76);
            }
        });
        editText_77.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_77, textView_ravno_77, button_plus_77, button_minus_77, dim_77);
            }
        });
        editText_78.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_78, textView_ravno_78, button_plus_78, button_minus_78, dim_78);
            }
        });
        editText_79.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_79, textView_ravno_79, button_plus_79, button_minus_79, dim_79);
            }
        });
        editText_80.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_80, textView_ravno_80, button_plus_80, button_minus_80, dim_80);
            }
        });
        editText_81.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_81, textView_ravno_81, button_plus_81, button_minus_81, dim_81);
            }
        });
        editText_82.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_82, textView_ravno_82, button_plus_82, button_minus_82, dim_82);
            }
        });
        editText_83.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_83, textView_ravno_83, button_plus_83, button_minus_83, dim_83);
            }
        });
        editText_84.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_84, textView_ravno_84, button_plus_84, button_minus_84, dim_84);
            }
        });
        editText_85.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_85, textView_ravno_85, button_plus_85, button_minus_85, dim_85);
            }
        });
        editText_86.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_86, textView_ravno_86, button_plus_86, button_minus_86, dim_86);
            }
        });
        editText_87.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_87, textView_ravno_87, button_plus_87, button_minus_87, dim_87);
            }
        });
        editText_88.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_88, textView_ravno_88, button_plus_88, button_minus_88, dim_88);
            }
        });
        editText_89.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_89, textView_ravno_89, button_plus_89, button_minus_89, dim_89);
            }
        });
        editText_90.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                changedText(editText_90, textView_ravno_90, button_plus_90, button_minus_90, dim_90);
            }
        });
        setTitle("Кубатура леса, 4 метра");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.delete: {
                clear();
            }
            break;
            case R.id.metr1:
            {
                Intent intent1=new Intent(this,MainActivity1.class);
                startActivity(intent1);
            }
            break;
            case R.id.metr1_5:
            {
                Intent intent1_5=new Intent(this,MainActivity1_5.class);
                startActivity(intent1_5);
            }
            break;
            case R.id.metr2: {
                Intent intent2 = new Intent(this, MainActivity2.class);
                startActivity(intent2);
            }
            break;
            case R.id.metr2_5: {
                Intent intent2_5 = new Intent(this, MainActivity2_5.class);
                startActivity(intent2_5);
            }
            break;
            case R.id.metr3: {
                Intent intent3 = new Intent(this, MainActivity3.class);
                startActivity(intent3);
            }
            break;
            case R.id.metr3_5: {
                Intent intent3_5 = new Intent(this, MainActivity3_5.class);
                startActivity(intent3_5);
            }
            break;
            case R.id.metr4_5: {
                Intent intent4_5 = new Intent(this, MainActivity4_5.class);
                startActivity(intent4_5);
            }
            break;
            case R.id.metr5: {
                Intent intent5 = new Intent(this, MainActivity5.class);
                startActivity(intent5);
            }
            break;
            case R.id.metr5_5: {
                Intent intent5_5 = new Intent(this, MainActivity5_5.class);
                startActivity(intent5_5);
            }
            break;
            case R.id.metr6: {
                Intent intent6 = new Intent(this, MainActivity6.class);
                startActivity(intent6);
            }
            break;
            case R.id.metr6_5: {
                Intent intent6_5 = new Intent(this, MainActivity6_5.class);
                startActivity(intent6_5);
            }
            break;
            case R.id.metr7: {
                Intent intent7 = new Intent(this, MainActivity7.class);
                startActivity(intent7);
            }
            break;
            case R.id.metr7_5: {
                Intent intent7_5 = new Intent(this, MainActivity7_5.class);
                startActivity(intent7_5);
            }
            break;
            case R.id.metr8: {
                Intent intent8 = new Intent(this, MainActivity8.class);
                startActivity(intent8);
            }
            break;
            case R.id.metr8_5:
            {
                Intent intent8_5=new Intent(this,MainActivity8_5.class);
                startActivity(intent8_5);
            }
            break;
            case R.id.metr9:
            {
                Intent intent9=new Intent(this,MainActivity9.class);
                startActivity(intent9);
            }
            break;
            case R.id.load:
            {
                Dialog();
            }
            break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void SVText(@NotNull SharedPreferences A, String s, EditText editT) {
        A = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = A.edit();
        ed.putString(s, editT.getText().toString());
        ed.apply();
    }

    private void LDText(@NotNull SharedPreferences A, String s, EditText editT) {
        A = getPreferences(MODE_PRIVATE);
        String stroke = A.getString(s, "");
        editT.setText(stroke);
    }

    private void SV(@NotNull SharedPreferences A, String s, TextView vieww) {
        A = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = A.edit();
        ed.putString(s, vieww.getText().toString());
        ed.apply();
    }

    private void LD(@NotNull SharedPreferences A, String s, TextView vieww) {
        A = getPreferences(MODE_PRIVATE);
        String stroke = A.getString(s, "");
        vieww.setText(stroke);
    }

    private void saveText() {
        SVText(sPref10, "saved10", editText_10);
        SVText(sPref11, "saved11", editText_11);
        SVText(sPref12, "saved12", editText_12);
        SVText(sPref13, "saved13", editText_13);
        SVText(sPref14, "saved14", editText_14);
        SVText(sPref15, "saved15", editText_15);
        SVText(sPref16, "saved16", editText_16);
        SVText(sPref17, "saved17", editText_17);
        SVText(sPref18, "saved18", editText_18);
        SVText(sPref19, "saved19", editText_19);
        SVText(sPref20, "saved20", editText_20);
        SVText(sPref21, "saved21", editText_21);
        SVText(sPref22, "saved22", editText_22);
        SVText(sPref23, "saved23", editText_23);
        SVText(sPref24, "saved24", editText_24);
        SVText(sPref25, "saved25", editText_25);
        SVText(sPref26, "saved26", editText_26);
        SVText(sPref27, "saved27", editText_27);
        SVText(sPref28, "saved28", editText_28);
        SVText(sPref29, "saved29", editText_29);
        SVText(sPref30, "saved30", editText_30);
        SVText(sPref31, "saved31", editText_31);
        SVText(sPref32, "saved32", editText_32);
        SVText(sPref33, "saved33", editText_33);
        SVText(sPref34, "saved34", editText_34);
        SVText(sPref35, "saved35", editText_35);
        SVText(sPref36, "saved36", editText_36);
        SVText(sPref37, "saved37", editText_37);
        SVText(sPref38, "saved38", editText_38);
        SVText(sPref39, "saved39", editText_39);
        SVText(sPref40, "saved40", editText_40);
        SVText(sPref41, "saved41", editText_41);
        SVText(sPref42, "saved42", editText_42);
        SVText(sPref43, "saved43", editText_43);
        SVText(sPref44, "saved44", editText_44);
        SVText(sPref45, "saved45", editText_45);
        SVText(sPref46, "saved46", editText_46);
        SVText(sPref47, "saved47", editText_47);
        SVText(sPref48, "saved48", editText_48);
        SVText(sPref49, "saved49", editText_49);
        SVText(sPref50, "saved50", editText_50);
        SVText(sPref51, "saved51", editText_51);
        SVText(sPref52, "saved52", editText_52);
        SVText(sPref53, "saved53", editText_53);
        SVText(sPref54, "saved54", editText_54);
        SVText(sPref55, "saved55", editText_55);
        SVText(sPref56, "saved56", editText_56);
        SVText(sPref57, "saved57", editText_57);
        SVText(sPref58, "saved58", editText_58);
        SVText(sPref59, "saved59", editText_59);
        SVText(sPref60, "saved60", editText_60);
        SVText(sPref61, "saved61", editText_61);
        SVText(sPref62, "saved62", editText_62);
        SVText(sPref63, "saved63", editText_63);
        SVText(sPref64, "saved64", editText_64);
        SVText(sPref65, "saved65", editText_65);
        SVText(sPref66, "saved66", editText_66);
        SVText(sPref67, "saved67", editText_67);
        SVText(sPref68, "saved68", editText_68);
        SVText(sPref69, "saved69", editText_69);
        SVText(sPref70, "saved70", editText_70);
        SVText(sPref71, "saved71", editText_71);
        SVText(sPref72, "saved72", editText_72);
        SVText(sPref73, "saved73", editText_73);
        SVText(sPref74, "saved74", editText_74);
        SVText(sPref75, "saved75", editText_75);
        SVText(sPref76, "saved76", editText_76);
        SVText(sPref77, "saved77", editText_77);
        SVText(sPref78, "saved78", editText_78);
        SVText(sPref79, "saved79", editText_79);
        SVText(sPref80, "saved80", editText_80);
        SVText(sPref81, "saved81", editText_81);
        SVText(sPref82, "saved82", editText_82);
        SVText(sPref83, "saved83", editText_83);
        SVText(sPref84, "saved84", editText_84);
        SVText(sPref85, "saved85", editText_85);
        SVText(sPref86, "saved86", editText_86);
        SVText(sPref87, "saved87", editText_87);
        SVText(sPref88, "saved88", editText_88);
        SVText(sPref89, "saved89", editText_89);
        SVText(sPref90, "saved90", editText_90);

        SV(sPref01, "col", col_response);
        SV(sPref02, "ob", ob_response);
        SVText(sPref03, "cost", price_response);
        SV(sPref04, "itog", total_response);

    }

    private void loadText() {
        LDText(sPref10, "saved10", editText_10);
        LDText(sPref11, "saved11", editText_11);
        LDText(sPref12, "saved12", editText_12);
        LDText(sPref13, "saved13", editText_13);
        LDText(sPref14, "saved14", editText_14);
        LDText(sPref15, "saved15", editText_15);
        LDText(sPref16, "saved16", editText_16);
        LDText(sPref17, "saved17", editText_17);
        LDText(sPref18, "saved18", editText_18);
        LDText(sPref19, "saved19", editText_19);
        LDText(sPref20, "saved20", editText_20);
        LDText(sPref21, "saved21", editText_21);
        LDText(sPref22, "saved22", editText_22);
        LDText(sPref23, "saved23", editText_23);
        LDText(sPref24, "saved24", editText_24);
        LDText(sPref25, "saved25", editText_25);
        LDText(sPref26, "saved26", editText_26);
        LDText(sPref27, "saved27", editText_27);
        LDText(sPref28, "saved28", editText_28);
        LDText(sPref29, "saved29", editText_29);
        LDText(sPref30, "saved30", editText_30);
        LDText(sPref31, "saved31", editText_31);
        LDText(sPref32, "saved32", editText_32);
        LDText(sPref33, "saved33", editText_33);
        LDText(sPref34, "saved34", editText_34);
        LDText(sPref35, "saved35", editText_35);
        LDText(sPref36, "saved36", editText_36);
        LDText(sPref37, "saved37", editText_37);
        LDText(sPref38, "saved38", editText_38);
        LDText(sPref39, "saved39", editText_39);
        LDText(sPref40, "saved40", editText_40);
        LDText(sPref41, "saved41", editText_41);
        LDText(sPref42, "saved42", editText_42);
        LDText(sPref43, "saved43", editText_43);
        LDText(sPref44, "saved44", editText_44);
        LDText(sPref45, "saved45", editText_45);
        LDText(sPref46, "saved46", editText_46);
        LDText(sPref47, "saved47", editText_47);
        LDText(sPref48, "saved48", editText_48);
        LDText(sPref49, "saved49", editText_49);
        LDText(sPref50, "saved50", editText_50);
        LDText(sPref51, "saved51", editText_51);
        LDText(sPref52, "saved52", editText_52);
        LDText(sPref53, "saved53", editText_53);
        LDText(sPref54, "saved54", editText_54);
        LDText(sPref55, "saved55", editText_55);
        LDText(sPref56, "saved56", editText_56);
        LDText(sPref57, "saved57", editText_57);
        LDText(sPref58, "saved58", editText_58);
        LDText(sPref59, "saved59", editText_59);
        LDText(sPref60, "saved60", editText_60);
        LDText(sPref61, "saved61", editText_61);
        LDText(sPref62, "saved62", editText_62);
        LDText(sPref63, "saved63", editText_63);
        LDText(sPref64, "saved64", editText_64);
        LDText(sPref65, "saved65", editText_65);
        LDText(sPref66, "saved66", editText_66);
        LDText(sPref67, "saved67", editText_67);
        LDText(sPref68, "saved68", editText_68);
        LDText(sPref69, "saved69", editText_69);
        LDText(sPref70, "saved70", editText_70);
        LDText(sPref71, "saved71", editText_71);
        LDText(sPref72, "saved72", editText_72);
        LDText(sPref73, "saved73", editText_73);
        LDText(sPref74, "saved74", editText_74);
        LDText(sPref75, "saved75", editText_75);
        LDText(sPref76, "saved76", editText_76);
        LDText(sPref77, "saved77", editText_77);
        LDText(sPref78, "saved78", editText_78);
        LDText(sPref79, "saved79", editText_79);
        LDText(sPref80, "saved80", editText_80);
        LDText(sPref81, "saved81", editText_81);
        LDText(sPref82, "saved82", editText_82);
        LDText(sPref83, "saved83", editText_83);
        LDText(sPref84, "saved84", editText_84);
        LDText(sPref85, "saved85", editText_85);
        LDText(sPref86, "saved86", editText_86);
        LDText(sPref87, "saved87", editText_87);
        LDText(sPref88, "saved88", editText_88);
        LDText(sPref89, "saved89", editText_89);
        LDText(sPref90, "saved90", editText_90);

        LD(sPref01, "col", col_response);
        LD(sPref02, "ob", ob_response);
        LDText(sPref03, "cost", price_response);
        LD(sPref04, "itog", total_response);
    }

    void clear() {
        editText_10.setText("0");
        editText_11.setText("0");
        editText_12.setText("0");
        editText_13.setText("0");
        editText_14.setText("0");
        editText_15.setText("0");
        editText_16.setText("0");
        editText_17.setText("0");
        editText_18.setText("0");
        editText_19.setText("0");
        editText_20.setText("0");
        editText_21.setText("0");
        editText_22.setText("0");
        editText_23.setText("0");
        editText_24.setText("0");
        editText_25.setText("0");
        editText_26.setText("0");
        editText_27.setText("0");
        editText_28.setText("0");
        editText_29.setText("0");
        editText_30.setText("0");
        editText_31.setText("0");
        editText_32.setText("0");
        editText_33.setText("0");
        editText_34.setText("0");
        editText_35.setText("0");
        editText_36.setText("0");
        editText_37.setText("0");
        editText_38.setText("0");
        editText_39.setText("0");
        editText_40.setText("0");
        editText_41.setText("0");
        editText_42.setText("0");
        editText_43.setText("0");
        editText_44.setText("0");
        editText_45.setText("0");
        editText_46.setText("0");
        editText_47.setText("0");
        editText_48.setText("0");
        editText_49.setText("0");
        editText_50.setText("0");
        editText_51.setText("0");
        editText_52.setText("0");
        editText_53.setText("0");
        editText_54.setText("0");
        editText_55.setText("0");
        editText_56.setText("0");
        editText_57.setText("0");
        editText_58.setText("0");
        editText_59.setText("0");
        editText_60.setText("0");
        editText_61.setText("0");
        editText_62.setText("0");
        editText_63.setText("0");
        editText_64.setText("0");
        editText_65.setText("0");
        editText_66.setText("0");
        editText_67.setText("0");
        editText_68.setText("0");
        editText_69.setText("0");
        editText_70.setText("0");
        editText_71.setText("0");
        editText_72.setText("0");
        editText_73.setText("0");
        editText_74.setText("0");
        editText_75.setText("0");
        editText_76.setText("0");
        editText_77.setText("0");
        editText_78.setText("0");
        editText_79.setText("0");
        editText_80.setText("0");
        editText_81.setText("0");
        editText_82.setText("0");
        editText_83.setText("0");
        editText_84.setText("0");
        editText_85.setText("0");
        editText_86.setText("0");
        editText_87.setText("0");
        editText_88.setText("0");
        editText_89.setText("0");
        editText_90.setText("0");

        col_response.setText("");
        ob_response.setText("");
        price_response.setText("");
        total_response.setText("");
    }

    private void changedText(EditText editt, TextView View, Button button_plus, Button button_minus, double dim) {
        String s = editt.getText().toString();
        double q;
        if (s.length() != 0) {
            int a = Integer.parseInt(s);
            if (a == 0) {
                button_minus.setEnabled(false);
                q = dim * a;
                View.setText(Double.toString(q));
            } else if (a > 0) {
                button_minus.setEnabled(true);
                q = dim * a;
                View.setText(Double.toString(q));
            }
        } else if (s.length() == 0) {
            button_minus.setEnabled(false);
            View.setText("0");
        }
    }

    private void minus(EditText editt, Button button_minus, Button button_plus, TextView View, double dim) {
        String S = editt.getText().toString();
        if (S.length() == 0) {
            editt.setText("0");
        }
        S = editt.getText().toString();
        int a = Integer.parseInt(S);
        double q;
        a--;
        q = dim * a;
        View.setText(Double.toString(q));
        editt.setText(Integer.toString(a));
        if (a == 0) {
            button_minus.setEnabled((false));
        }

    }

    private void plus(EditText editt, Button button_minus, Button button_plus, TextView View, double dim) {
        String S = editt.getText().toString();
        if (S.length() == 0) {
            editt.setText("0");
        }
        S = editt.getText().toString();
        int a = Integer.parseInt(S);
        double q;
        if (a == 0 || a > 0) {
            button_minus.setEnabled(true);
        }
        a++;
        q = a * dim;

        View.setText(Double.toString(q));
        editt.setText(Integer.toString(a));
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Toast.makeText(getApplicationContext(),"0nstart",Toast.LENGTH_SHORT).show();
        //loadText();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(getApplicationContext(),"0nPause",Toast.LENGTH_SHORT).show();
        saveText();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Toast.makeText(getApplicationContext(), "0nStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(getApplicationContext(),"0nDestroy",Toast.LENGTH_SHORT).show();
        //clear();
        //saveText();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //Toast.makeText(getApplicationContext(),"Restart",Toast.LENGTH_SHORT).show();
        loadText();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(getApplicationContext(),"Resume",Toast.LENGTH_SHORT).show();
    }

    private int col_response(EditText editt) {
        String s = editt.getText().toString();
        int a;
        if (s.length() == 0) {
            editt.setText("0");
            a = 0;
        } else
            a = Integer.parseInt(s);
        return a;
    }

    private double ob_response(TextView View) {
        String s = View.getText().toString();
        double z;
        if (s.length() == 0) {
            z = 0.0;
        } else
            z = Double.parseDouble(s);
        return z;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_plus_10:
                plus(editText_10, button_minus_10, button_plus_10, textView_ravno_10, dim_10);
                editText_10.requestFocus();
                break;
            case R.id.button_minus_10:
                minus(editText_10, button_minus_10, button_plus_10, textView_ravno_10, dim_10);
                editText_10.requestFocus();
                break;

            case R.id.button_plus_11:
                plus(editText_11, button_minus_11, button_plus_11, textView_ravno_11, dim_11);
                editText_11.requestFocus();
                break;
            case R.id.button_minus_11:
                minus(editText_11, button_minus_11, button_plus_11, textView_ravno_11, dim_11);
                editText_11.requestFocus();
                break;

            case R.id.button_plus_12:
                plus(editText_12, button_minus_12, button_plus_12, textView_ravno_12, dim_12);
                editText_12.requestFocus();
                break;
            case R.id.button_minus_12:
                minus(editText_12, button_minus_12, button_plus_12, textView_ravno_12, dim_12);
                editText_12.requestFocus();
                break;
            case R.id.button_plus_13:
                plus(editText_13, button_minus_13, button_plus_13, textView_ravno_13, dim_13);
                editText_13.requestFocus();
                break;
            case R.id.button_minus_13:
                minus(editText_13, button_minus_13, button_plus_13, textView_ravno_13, dim_13);
                editText_13.requestFocus();
                break;
            case R.id.button_plus_14:
                plus(editText_14, button_minus_14, button_plus_14, textView_ravno_14, dim_14);
                editText_14.requestFocus();
                break;
            case R.id.button_minus_14:
                minus(editText_14, button_minus_14, button_plus_14, textView_ravno_14, dim_14);
                editText_14.requestFocus();
                break;
            case R.id.button_plus_15:
                plus(editText_15, button_minus_15, button_plus_15, textView_ravno_15, dim_15);
                editText_15.requestFocus();
                break;
            case R.id.button_minus_15:
                minus(editText_15, button_minus_15, button_plus_15, textView_ravno_15, dim_15);
                editText_15.requestFocus();
                break;
            case R.id.button_plus_16:
                plus(editText_16, button_minus_16, button_plus_16, textView_ravno_16, dim_16);
                editText_16.requestFocus();
                break;
            case R.id.button_minus_16:
                minus(editText_16, button_minus_16, button_plus_16, textView_ravno_16, dim_16);
                editText_16.requestFocus();
                break;
            case R.id.button_plus_17:
                plus(editText_17, button_minus_17, button_plus_17, textView_ravno_17, dim_17);
                editText_17.requestFocus();
                break;
            case R.id.button_minus_17:
                minus(editText_17, button_minus_17, button_plus_17, textView_ravno_17, dim_17);
                editText_17.requestFocus();
                break;
            case R.id.button_plus_18:
                plus(editText_18, button_minus_18, button_plus_18, textView_ravno_18, dim_18);
                editText_18.requestFocus();
                break;
            case R.id.button_minus_18:
                minus(editText_18, button_minus_18, button_plus_18, textView_ravno_18, dim_18);
                editText_18.requestFocus();
                break;
            case R.id.button_plus_19:
                plus(editText_19, button_minus_19, button_plus_19, textView_ravno_19, dim_19);
                editText_19.requestFocus();
                break;
            case R.id.button_minus_19:
                minus(editText_19, button_minus_19, button_plus_19, textView_ravno_19, dim_19);
                editText_19.requestFocus();
                break;
            case R.id.button_plus_20: {
                plus(editText_20, button_minus_20, button_plus_20, textView_ravno_20, dim_20);
                editText_20.requestFocus();
            }
            break;
            case R.id.button_minus_20: {
                minus(editText_20, button_minus_20, button_plus_20, textView_ravno_20, dim_20);
                editText_20.requestFocus();
            }
            break;
            case R.id.button_plus_21:
                plus(editText_21, button_minus_21, button_plus_21, textView_ravno_21, dim_21);
                editText_21.requestFocus();
                break;
            case R.id.button_minus_21:
                minus(editText_21, button_minus_21, button_plus_21, textView_ravno_21, dim_21);
                editText_21.requestFocus();
                break;
            case R.id.button_plus_22:
                plus(editText_22, button_minus_22, button_plus_22, textView_ravno_22, dim_22);
                editText_22.requestFocus();
                break;
            case R.id.button_minus_22:
                minus(editText_22, button_minus_22, button_plus_22, textView_ravno_22, dim_22);
                editText_22.requestFocus();
                break;
            case R.id.button_plus_23:
                plus(editText_23, button_minus_23, button_plus_23, textView_ravno_23, dim_23);
                editText_23.requestFocus();
                break;
            case R.id.button_minus_23:
                minus(editText_23, button_minus_23, button_plus_23, textView_ravno_23, dim_23);
                editText_23.requestFocus();
                break;
            case R.id.button_plus_24:
                plus(editText_24, button_minus_24, button_plus_24, textView_ravno_24, dim_24);
                editText_24.requestFocus();
                break;
            case R.id.button_minus_24:
                minus(editText_24, button_minus_24, button_plus_24, textView_ravno_24, dim_24);
                editText_24.requestFocus();
                break;
            case R.id.button_plus_25:
                plus(editText_25, button_minus_25, button_plus_25, textView_ravno_25, dim_25);
                editText_25.requestFocus();
                break;
            case R.id.button_minus_25:
                minus(editText_25, button_minus_25, button_plus_25, textView_ravno_25, dim_25);
                editText_25.requestFocus();
                break;
            case R.id.button_plus_26:
                plus(editText_26, button_minus_26, button_plus_26, textView_ravno_26, dim_26);
                editText_26.requestFocus();
                break;
            case R.id.button_minus_26:
                minus(editText_26, button_minus_26, button_plus_26, textView_ravno_26, dim_26);
                editText_26.requestFocus();
                break;
            case R.id.button_plus_27:
                plus(editText_27, button_minus_27, button_plus_27, textView_ravno_27, dim_27);
                editText_27.requestFocus();
                break;
            case R.id.button_minus_27:
                minus(editText_27, button_minus_27, button_plus_27, textView_ravno_27, dim_27);
                editText_27.requestFocus();
                break;
            case R.id.button_plus_28:
                plus(editText_28, button_minus_28, button_plus_28, textView_ravno_28, dim_28);
                editText_28.requestFocus();
                break;
            case R.id.button_minus_28:
                minus(editText_28, button_minus_28, button_plus_28, textView_ravno_28, dim_28);
                editText_28.requestFocus();
                break;

            case R.id.button_plus_29:
                plus(editText_29, button_minus_29, button_plus_29, textView_ravno_29, dim_29);
                editText_29.requestFocus();
                break;
            case R.id.button_minus_29:
                minus(editText_29, button_minus_29, button_plus_29, textView_ravno_29, dim_29);
                editText_29.requestFocus();
                break;
            case R.id.button_plus_30:
                plus(editText_30, button_minus_30, button_plus_30, textView_ravno_30, dim_30);
                editText_30.requestFocus();
                break;
            case R.id.button_minus_30:
                minus(editText_30, button_minus_30, button_plus_30, textView_ravno_30, dim_30);
                editText_30.requestFocus();
                break;
            case R.id.button_plus_31:
                plus(editText_31, button_minus_31, button_plus_31, textView_ravno_31, dim_31);
                editText_31.requestFocus();
                break;
            case R.id.button_minus_31:
                minus(editText_31, button_minus_31, button_plus_31, textView_ravno_31, dim_31);
                editText_31.requestFocus();
                break;
            case R.id.button_plus_32:
                plus(editText_32, button_minus_32, button_plus_32, textView_ravno_32, dim_32);
                editText_32.requestFocus();
                break;
            case R.id.button_minus_32:
                minus(editText_32, button_minus_32, button_plus_32, textView_ravno_32, dim_32);
                editText_32.requestFocus();
                break;
            case R.id.button_plus_33:
                plus(editText_33, button_minus_33, button_plus_33, textView_ravno_33, dim_33);
                editText_33.requestFocus();
                break;
            case R.id.button_minus_33:
                minus(editText_33, button_minus_33, button_plus_33, textView_ravno_33, dim_33);
                editText_33.requestFocus();
                break;
            case R.id.button_plus_34:
                plus(editText_34, button_minus_34, button_plus_34, textView_ravno_34, dim_34);
                editText_34.requestFocus();
                break;
            case R.id.button_minus_34:
                minus(editText_34, button_minus_34, button_plus_34, textView_ravno_34, dim_34);
                editText_34.requestFocus();
                break;
            case R.id.button_plus_35:
                plus(editText_35, button_minus_35, button_plus_35, textView_ravno_35, dim_35);
                editText_35.requestFocus();
                break;
            case R.id.button_minus_35:
                minus(editText_35, button_minus_35, button_plus_35, textView_ravno_35, dim_35);
                editText_35.requestFocus();
                break;
            case R.id.button_plus_36:
                plus(editText_36, button_minus_36, button_plus_36, textView_ravno_36, dim_36);
                editText_36.requestFocus();
                break;
            case R.id.button_minus_36:
                minus(editText_36, button_minus_36, button_plus_36, textView_ravno_36, dim_36);
                editText_36.requestFocus();
                break;
            case R.id.button_plus_37:
                plus(editText_37, button_minus_37, button_plus_37, textView_ravno_37, dim_37);
                editText_37.requestFocus();
                break;
            case R.id.button_minus_37:
                minus(editText_37, button_minus_37, button_plus_37, textView_ravno_37, dim_37);
                editText_37.requestFocus();
                break;
            case R.id.button_plus_38:
                plus(editText_38, button_minus_38, button_plus_38, textView_ravno_38, dim_38);
                editText_38.requestFocus();
                break;
            case R.id.button_minus_38:
                minus(editText_38, button_minus_38, button_plus_38, textView_ravno_38, dim_38);
                editText_38.requestFocus();
                break;
            case R.id.button_plus_39:
                plus(editText_39, button_minus_39, button_plus_39, textView_ravno_39, dim_39);
                editText_39.requestFocus();
                break;
            case R.id.button_minus_39:
                minus(editText_39, button_minus_39, button_plus_39, textView_ravno_39, dim_39);
                editText_39.requestFocus();
                break;
            case R.id.button_plus_40:
                plus(editText_40, button_minus_40, button_plus_40, textView_ravno_40, dim_40);
                editText_40.requestFocus();
                break;
            case R.id.button_minus_40:
                minus(editText_40, button_minus_40, button_plus_40, textView_ravno_40, dim_40);
                editText_40.requestFocus();
                break;
            case R.id.button_plus_41:
                plus(editText_41, button_minus_41, button_plus_41, textView_ravno_41, dim_41);
                editText_41.requestFocus();
                break;
            case R.id.button_minus_41:
                minus(editText_41, button_minus_41, button_plus_41, textView_ravno_41, dim_41);
                editText_41.requestFocus();
                break;
            case R.id.button_plus_42:
                plus(editText_42, button_minus_42, button_plus_42, textView_ravno_42, dim_42);
                editText_42.requestFocus();
                break;
            case R.id.button_minus_42:
                minus(editText_42, button_minus_42, button_plus_42, textView_ravno_42, dim_42);
                editText_42.requestFocus();
                break;
            case R.id.button_plus_43:
                plus(editText_43, button_minus_43, button_plus_43, textView_ravno_43, dim_43);
                editText_43.requestFocus();
                break;
            case R.id.button_minus_43:
                minus(editText_43, button_minus_43, button_plus_43, textView_ravno_43, dim_43);
                editText_43.requestFocus();
                break;
            case R.id.button_plus_44:
                plus(editText_44, button_minus_44, button_plus_44, textView_ravno_44, dim_44);
                editText_44.requestFocus();
                break;
            case R.id.button_minus_44:
                minus(editText_44, button_minus_44, button_plus_44, textView_ravno_44, dim_44);
                editText_44.requestFocus();
                break;
            case R.id.button_plus_45:
                plus(editText_45, button_minus_45, button_plus_45, textView_ravno_45, dim_45);
                editText_45.requestFocus();
                break;
            case R.id.button_minus_45:
                minus(editText_45, button_minus_45, button_plus_45, textView_ravno_45, dim_45);
                editText_45.requestFocus();
                break;
            case R.id.button_plus_46:
                plus(editText_46, button_minus_46, button_plus_46, textView_ravno_46, dim_46);
                editText_46.requestFocus();
                break;
            case R.id.button_minus_46:
                minus(editText_46, button_minus_46, button_plus_46, textView_ravno_46, dim_46);
                editText_46.requestFocus();
                break;
            case R.id.button_plus_47:
                plus(editText_47, button_minus_47, button_plus_47, textView_ravno_47, dim_47);
                editText_47.requestFocus();
                break;
            case R.id.button_minus_47:
                minus(editText_47, button_minus_47, button_plus_47, textView_ravno_47, dim_47);
                editText_47.requestFocus();
                break;
            case R.id.button_plus_48:
                plus(editText_48, button_minus_48, button_plus_48, textView_ravno_48, dim_48);
                editText_48.requestFocus();
                break;
            case R.id.button_minus_48:
                minus(editText_48, button_minus_48, button_plus_48, textView_ravno_48, dim_48);
                editText_48.requestFocus();
                break;
            case R.id.button_plus_49:
                plus(editText_49, button_minus_49, button_plus_49, textView_ravno_49, dim_49);
                editText_49.requestFocus();
                break;
            case R.id.button_minus_49:
                minus(editText_49, button_minus_49, button_plus_49, textView_ravno_49, dim_49);
                editText_49.requestFocus();
                break;
            case R.id.button_plus_50:
                plus(editText_50, button_minus_50, button_plus_50, textView_ravno_50, dim_50);
                editText_50.requestFocus();
                break;
            case R.id.button_minus_50:
                minus(editText_50, button_minus_50, button_plus_50, textView_ravno_50, dim_50);
                editText_50.requestFocus();
                break;
            case R.id.button_plus_51:
                plus(editText_51, button_minus_51, button_plus_51, textView_ravno_51, dim_51);
                editText_51.requestFocus();
                break;
            case R.id.button_minus_51:
                minus(editText_51, button_minus_51, button_plus_51, textView_ravno_51, dim_51);
                editText_51.requestFocus();
                break;
            case R.id.button_plus_52:
                plus(editText_52, button_minus_52, button_plus_52, textView_ravno_52, dim_52);
                editText_52.requestFocus();
                break;
            case R.id.button_minus_52:
                minus(editText_52, button_minus_52, button_plus_52, textView_ravno_52, dim_52);
                editText_52.requestFocus();
                break;
            case R.id.button_plus_53:
                plus(editText_53, button_minus_53, button_plus_53, textView_ravno_53, dim_53);
                editText_53.requestFocus();
                break;
            case R.id.button_minus_53:
                minus(editText_53, button_minus_53, button_plus_53, textView_ravno_53, dim_53);
                editText_53.requestFocus();
                break;
            case R.id.button_plus_54:
                plus(editText_54, button_minus_54, button_plus_54, textView_ravno_54, dim_54);
                editText_54.requestFocus();
                break;
            case R.id.button_minus_54:
                minus(editText_54, button_minus_54, button_plus_54, textView_ravno_54, dim_54);
                editText_54.requestFocus();
                break;
            case R.id.button_plus_55:
                plus(editText_55, button_minus_55, button_plus_55, textView_ravno_55, dim_55);
                editText_55.requestFocus();
                break;
            case R.id.button_minus_55:
                minus(editText_55, button_minus_55, button_plus_55, textView_ravno_55, dim_55);
                editText_55.requestFocus();
                break;
            case R.id.button_plus_56:
                plus(editText_56, button_minus_56, button_plus_56, textView_ravno_56, dim_56);
                editText_56.requestFocus();
                break;
            case R.id.button_minus_56:
                minus(editText_56, button_minus_56, button_plus_56, textView_ravno_56, dim_56);
                editText_56.requestFocus();
                break;
            case R.id.button_plus_57:
                plus(editText_57, button_minus_57, button_plus_57, textView_ravno_57, dim_57);
                editText_57.requestFocus();
                break;
            case R.id.button_minus_57:
                minus(editText_57, button_minus_57, button_plus_57, textView_ravno_57, dim_57);
                editText_57.requestFocus();
                break;
            case R.id.button_plus_58:
                plus(editText_58, button_minus_58, button_plus_58, textView_ravno_58, dim_58);
                editText_58.requestFocus();
                break;
            case R.id.button_minus_58:
                minus(editText_58, button_minus_58, button_plus_58, textView_ravno_58, dim_58);
                editText_58.requestFocus();
                break;
            case R.id.button_plus_59:
                plus(editText_59, button_minus_59, button_plus_59, textView_ravno_59, dim_59);
                editText_59.requestFocus();
                break;
            case R.id.button_minus_59:
                minus(editText_59, button_minus_59, button_plus_59, textView_ravno_59, dim_59);
                editText_59.requestFocus();
                break;
            case R.id.button_plus_60:
                plus(editText_60, button_minus_60, button_plus_60, textView_ravno_60, dim_60);
                editText_60.requestFocus();
                break;
            case R.id.button_minus_60:
                minus(editText_60, button_minus_60, button_plus_60, textView_ravno_60, dim_60);
                editText_60.requestFocus();
                break;
            case R.id.button_plus_61:
                plus(editText_61, button_minus_61, button_plus_61, textView_ravno_61, dim_61);
                editText_61.requestFocus();
                break;
            case R.id.button_minus_61:
                minus(editText_61, button_minus_61, button_plus_61, textView_ravno_61, dim_61);
                editText_61.requestFocus();
                break;
            case R.id.button_plus_62:
                plus(editText_62, button_minus_62, button_plus_62, textView_ravno_62, dim_62);
                editText_62.requestFocus();
                break;
            case R.id.button_minus_62:
                minus(editText_62, button_minus_62, button_plus_62, textView_ravno_62, dim_62);
                editText_62.requestFocus();
                break;
            case R.id.button_plus_63:
                plus(editText_63, button_minus_63, button_plus_63, textView_ravno_63, dim_63);
                editText_63.requestFocus();
                break;
            case R.id.button_minus_63:
                minus(editText_63, button_minus_63, button_plus_63, textView_ravno_63, dim_63);
                editText_63.requestFocus();
                break;
            case R.id.button_plus_64:
                plus(editText_64, button_minus_64, button_plus_64, textView_ravno_64, dim_64);
                editText_64.requestFocus();
                break;
            case R.id.button_minus_64:
                minus(editText_64, button_minus_64, button_plus_64, textView_ravno_64, dim_64);
                editText_64.requestFocus();
                break;
            case R.id.button_plus_65:
                plus(editText_65, button_minus_65, button_plus_65, textView_ravno_65, dim_65);
                editText_65.requestFocus();
                break;
            case R.id.button_minus_65:
                minus(editText_65, button_minus_65, button_plus_65, textView_ravno_65, dim_65);
                editText_65.requestFocus();
                break;
            case R.id.button_plus_66:
                plus(editText_66, button_minus_66, button_plus_66, textView_ravno_66, dim_66);
                editText_66.requestFocus();
                break;
            case R.id.button_minus_66:
                minus(editText_66, button_minus_66, button_plus_66, textView_ravno_66, dim_66);
                editText_66.requestFocus();
                break;
            case R.id.button_plus_67:
                plus(editText_67, button_minus_67, button_plus_67, textView_ravno_67, dim_67);
                editText_67.requestFocus();
                break;
            case R.id.button_minus_67:
                minus(editText_67, button_minus_67, button_plus_67, textView_ravno_67, dim_67);
                editText_67.requestFocus();
                break;
            case R.id.button_plus_68:
                plus(editText_68, button_minus_68, button_plus_68, textView_ravno_68, dim_68);
                editText_68.requestFocus();
                break;
            case R.id.button_minus_68:
                minus(editText_68, button_minus_68, button_plus_68, textView_ravno_68, dim_68);
                editText_68.requestFocus();
                break;
            case R.id.button_plus_69:
                plus(editText_69, button_minus_69, button_plus_69, textView_ravno_69, dim_69);
                editText_69.requestFocus();
                break;
            case R.id.button_minus_69:
                minus(editText_69, button_minus_69, button_plus_69, textView_ravno_69, dim_69);
                editText_69.requestFocus();
                break;
            case R.id.button_plus_70:
                plus(editText_70, button_minus_70, button_plus_70, textView_ravno_70, dim_70);
                editText_70.requestFocus();
                break;
            case R.id.button_minus_70:
                minus(editText_70, button_minus_70, button_plus_70, textView_ravno_70, dim_70);
                editText_70.requestFocus();
                break;
            case R.id.button_plus_71:
                plus(editText_71, button_minus_71, button_plus_71, textView_ravno_71, dim_71);
                editText_71.requestFocus();
                break;
            case R.id.button_minus_71:
                minus(editText_71, button_minus_71, button_plus_71, textView_ravno_71, dim_71);
                editText_71.requestFocus();
                break;
            case R.id.button_plus_72:
                plus(editText_72, button_minus_72, button_plus_72, textView_ravno_72, dim_72);
                editText_72.requestFocus();
                break;
            case R.id.button_minus_72:
                minus(editText_72, button_minus_72, button_plus_72, textView_ravno_72, dim_72);
                editText_72.requestFocus();
                break;
            case R.id.button_plus_73:
                plus(editText_73, button_minus_73, button_plus_73, textView_ravno_73, dim_73);
                editText_73.requestFocus();
                break;
            case R.id.button_minus_73:
                minus(editText_73, button_minus_73, button_plus_73, textView_ravno_73, dim_73);
                editText_73.requestFocus();
                break;
            case R.id.button_plus_74:
                plus(editText_74, button_minus_74, button_plus_74, textView_ravno_74, dim_74);
                editText_74.requestFocus();
                break;
            case R.id.button_minus_74:
                minus(editText_74, button_minus_74, button_plus_74, textView_ravno_74, dim_74);
                editText_74.requestFocus();
                break;
            case R.id.button_plus_75:
                plus(editText_75, button_minus_75, button_plus_75, textView_ravno_75, dim_75);
                editText_75.requestFocus();
                break;
            case R.id.button_minus_75:
                minus(editText_75, button_minus_75, button_plus_75, textView_ravno_75, dim_75);
                editText_75.requestFocus();
                break;
            case R.id.button_plus_76:
                plus(editText_76, button_minus_76, button_plus_76, textView_ravno_76, dim_76);
                editText_76.requestFocus();
                break;
            case R.id.button_minus_76:
                minus(editText_76, button_minus_76, button_plus_76, textView_ravno_76, dim_76);
                editText_76.requestFocus();
                break;
            case R.id.button_plus_77:
                plus(editText_77, button_minus_77, button_plus_77, textView_ravno_77, dim_77);
                editText_77.requestFocus();
                break;
            case R.id.button_minus_77:
                minus(editText_77, button_minus_77, button_plus_77, textView_ravno_77, dim_77);
                editText_77.requestFocus();
                break;
            case R.id.button_plus_78:
                plus(editText_78, button_minus_78, button_plus_78, textView_ravno_78, dim_78);
                editText_78.requestFocus();
                break;
            case R.id.button_minus_78:
                minus(editText_78, button_minus_78, button_plus_78, textView_ravno_78, dim_78);
                editText_78.requestFocus();
                break;
            case R.id.button_plus_79:
                plus(editText_79, button_minus_79, button_plus_79, textView_ravno_79, dim_79);
                editText_79.requestFocus();
                break;
            case R.id.button_minus_79:
                minus(editText_79, button_minus_79, button_plus_79, textView_ravno_79, dim_79);
                editText_79.requestFocus();
                break;
            case R.id.button_plus_80:
                plus(editText_80, button_minus_80, button_plus_80, textView_ravno_80, dim_80);
                editText_80.requestFocus();
                break;
            case R.id.button_minus_80:
                minus(editText_80, button_minus_80, button_plus_80, textView_ravno_80, dim_80);
                editText_80.requestFocus();
                break;
            case R.id.button_plus_81:
                plus(editText_81, button_minus_81, button_plus_81, textView_ravno_81, dim_81);
                editText_81.requestFocus();
                break;
            case R.id.button_minus_81:
                minus(editText_81, button_minus_81, button_plus_81, textView_ravno_81, dim_81);
                editText_81.requestFocus();
                break;
            case R.id.button_plus_82:
                plus(editText_82, button_minus_82, button_plus_82, textView_ravno_82, dim_82);
                editText_82.requestFocus();
                break;
            case R.id.button_minus_82:
                minus(editText_82, button_minus_82, button_plus_82, textView_ravno_82, dim_82);
                editText_82.requestFocus();
                break;
            case R.id.button_plus_83:
                plus(editText_83, button_minus_83, button_plus_83, textView_ravno_83, dim_83);
                editText_83.requestFocus();
                break;
            case R.id.button_minus_83:
                minus(editText_83, button_minus_83, button_plus_83, textView_ravno_83, dim_83);
                editText_83.requestFocus();
                break;
            case R.id.button_plus_84:
                plus(editText_84, button_minus_84, button_plus_84, textView_ravno_84, dim_84);
                editText_84.requestFocus();
                break;
            case R.id.button_minus_84:
                minus(editText_84, button_minus_84, button_plus_84, textView_ravno_84, dim_84);
                editText_84.requestFocus();
                break;
            case R.id.button_plus_85:
                plus(editText_85, button_minus_85, button_plus_85, textView_ravno_85, dim_85);
                editText_85.requestFocus();
                break;
            case R.id.button_minus_85:
                minus(editText_85, button_minus_85, button_plus_85, textView_ravno_85, dim_85);
                editText_85.requestFocus();
                break;
            case R.id.button_plus_86:
                plus(editText_86, button_minus_86, button_plus_86, textView_ravno_86, dim_86);
                editText_86.requestFocus();
                break;
            case R.id.button_minus_86:
                minus(editText_86, button_minus_86, button_plus_86, textView_ravno_86, dim_86);
                editText_86.requestFocus();
                break;
            case R.id.button_plus_87:
                plus(editText_87, button_minus_87, button_plus_87, textView_ravno_87, dim_87);
                editText_87.requestFocus();
                break;
            case R.id.button_minus_87:
                minus(editText_87, button_minus_87, button_plus_87, textView_ravno_87, dim_87);
                editText_87.requestFocus();
                break;
            case R.id.button_plus_88:
                plus(editText_88, button_minus_88, button_plus_88, textView_ravno_88, dim_88);
                editText_88.requestFocus();
                break;
            case R.id.button_minus_88:
                minus(editText_88, button_minus_88, button_plus_88, textView_ravno_88, dim_88);
                editText_88.requestFocus();
                break;
            case R.id.button_plus_89:
                plus(editText_89, button_minus_89, button_plus_89, textView_ravno_89, dim_89);
                editText_89.requestFocus();
                break;
            case R.id.button_minus_89:
                minus(editText_89, button_minus_89, button_plus_89, textView_ravno_89, dim_89);
                editText_89.requestFocus();
                break;
            case R.id.button_plus_90:
                plus(editText_90, button_minus_90, button_plus_90, textView_ravno_90, dim_90);
                editText_90.requestFocus();
                break;
            case R.id.button_minus_90:
                minus(editText_90, button_minus_90, button_plus_90, textView_ravno_90, dim_90);
                editText_90.requestFocus();
                break;
            case R.id.button_result: {
                int a10 = col_response(editText_10);
                int a11 = col_response(editText_11);
                int a12 = col_response(editText_12);
                int a13 = col_response(editText_13);
                int a14 = col_response(editText_14);
                int a15 = col_response(editText_15);
                int a16 = col_response(editText_16);
                int a17 = col_response(editText_17);
                int a18 = col_response(editText_18);
                int a19 = col_response(editText_19);
                int a20 = col_response(editText_20);
                int a21 = col_response(editText_21);
                int a22 = col_response(editText_22);
                int a23 = col_response(editText_23);
                int a24 = col_response(editText_24);
                int a25 = col_response(editText_25);
                int a26 = col_response(editText_26);
                int a27 = col_response(editText_27);
                int a28 = col_response(editText_28);
                int a29 = col_response(editText_29);
                int a30 = col_response(editText_30);
                int a31 = col_response(editText_31);
                int a32 = col_response(editText_32);
                int a33 = col_response(editText_33);
                int a34 = col_response(editText_34);
                int a35 = col_response(editText_35);
                int a36 = col_response(editText_36);
                int a37 = col_response(editText_37);
                int a38 = col_response(editText_38);
                int a39 = col_response(editText_39);
                int a40 = col_response(editText_40);
                int a41 = col_response(editText_41);
                int a42 = col_response(editText_42);
                int a43 = col_response(editText_43);
                int a44 = col_response(editText_44);
                int a45 = col_response(editText_45);
                int a46 = col_response(editText_46);
                int a47 = col_response(editText_47);
                int a48 = col_response(editText_48);
                int a49 = col_response(editText_49);
                int a50 = col_response(editText_50);
                int a51 = col_response(editText_51);
                int a52 = col_response(editText_52);
                int a53 = col_response(editText_53);
                int a54 = col_response(editText_54);
                int a55 = col_response(editText_55);
                int a56 = col_response(editText_56);
                int a57 = col_response(editText_57);
                int a58 = col_response(editText_58);
                int a59 = col_response(editText_59);
                int a60 = col_response(editText_60);
                int a61 = col_response(editText_61);
                int a62 = col_response(editText_62);
                int a63 = col_response(editText_63);
                int a64 = col_response(editText_64);
                int a65 = col_response(editText_65);
                int a66 = col_response(editText_66);
                int a67 = col_response(editText_67);
                int a68 = col_response(editText_68);
                int a69 = col_response(editText_69);
                int a70 = col_response(editText_70);
                int a71 = col_response(editText_71);
                int a72 = col_response(editText_72);
                int a73 = col_response(editText_73);
                int a74 = col_response(editText_74);
                int a75 = col_response(editText_75);
                int a76 = col_response(editText_76);
                int a77 = col_response(editText_77);
                int a78 = col_response(editText_78);
                int a79 = col_response(editText_79);
                int a80 = col_response(editText_80);
                int a81 = col_response(editText_81);
                int a82 = col_response(editText_82);
                int a83 = col_response(editText_83);
                int a84 = col_response(editText_84);
                int a85 = col_response(editText_85);
                int a86 = col_response(editText_86);
                int a87 = col_response(editText_87);
                int a88 = col_response(editText_88);
                int a89 = col_response(editText_89);
                int a90 = col_response(editText_90);
                int col1 = a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 + a21 + a22 + a23 + a24 + a25 + a26 + a27 + a28 + a29 + a30 + a31 + a32 + a33 + a34 + a35 + a36 + a37 + a38 + a39 + a40 + a41 + a42 + a43;
                int col2 = a44 + a45 + a46 + a47 + a48 + a49 + a50 + a51 + a52 + a53 + a54 + a55 + a56 + a57 + a58 + a59 + a60 + a61 + a62 + a63 + a64 + a65 + a66 + a67 + a68 + a69 + a70 + a71 + a72 + a73 + a74 + a75 + a76 + a77;
                int col3 = a78 + a79 + a80 + a81 + a82 + a83 + a84 + a85 + a86 + a87 + a88 + a89 + a90;
                int col = col1 + col2 + col3;
                double z10 = ob_response(textView_ravno_10);
                double z11 = ob_response(textView_ravno_11);
                double z12 = ob_response(textView_ravno_12);
                double z13 = ob_response(textView_ravno_13);
                double z14 = ob_response(textView_ravno_14);
                double z15 = ob_response(textView_ravno_15);
                double z16 = ob_response(textView_ravno_16);
                double z17 = ob_response(textView_ravno_17);
                double z18 = ob_response(textView_ravno_18);
                double z19 = ob_response(textView_ravno_19);
                double z20 = ob_response(textView_ravno_20);
                double z21 = ob_response(textView_ravno_21);
                double z22 = ob_response(textView_ravno_22);
                double z23 = ob_response(textView_ravno_23);
                double z24 = ob_response(textView_ravno_24);
                double z25 = ob_response(textView_ravno_25);
                double z26 = ob_response(textView_ravno_26);
                double z27 = ob_response(textView_ravno_27);
                double z28 = ob_response(textView_ravno_28);
                double z29 = ob_response(textView_ravno_29);
                double z30 = ob_response(textView_ravno_30);
                double z31 = ob_response(textView_ravno_31);
                double z32 = ob_response(textView_ravno_32);
                double z33 = ob_response(textView_ravno_33);
                double z34 = ob_response(textView_ravno_34);
                double z35 = ob_response(textView_ravno_35);
                double z36 = ob_response(textView_ravno_36);
                double z37 = ob_response(textView_ravno_37);
                double z38 = ob_response(textView_ravno_38);
                double z39 = ob_response(textView_ravno_39);
                double z40 = ob_response(textView_ravno_40);
                double z41 = ob_response(textView_ravno_41);
                double z42 = ob_response(textView_ravno_42);
                double z43 = ob_response(textView_ravno_43);
                double z44 = ob_response(textView_ravno_44);
                double z45 = ob_response(textView_ravno_45);
                double z46 = ob_response(textView_ravno_46);
                double z47 = ob_response(textView_ravno_47);
                double z48 = ob_response(textView_ravno_48);
                double z49 = ob_response(textView_ravno_49);
                double z50 = ob_response(textView_ravno_50);
                double z51 = ob_response(textView_ravno_51);
                double z52 = ob_response(textView_ravno_52);
                double z53 = ob_response(textView_ravno_53);
                double z54 = ob_response(textView_ravno_54);
                double z55 = ob_response(textView_ravno_55);
                double z56 = ob_response(textView_ravno_56);
                double z57 = ob_response(textView_ravno_57);
                double z58 = ob_response(textView_ravno_58);
                double z59 = ob_response(textView_ravno_59);
                double z60 = ob_response(textView_ravno_60);
                double z61 = ob_response(textView_ravno_61);
                double z62 = ob_response(textView_ravno_62);
                double z63 = ob_response(textView_ravno_63);
                double z64 = ob_response(textView_ravno_64);
                double z65 = ob_response(textView_ravno_65);
                double z66 = ob_response(textView_ravno_66);
                double z67 = ob_response(textView_ravno_67);
                double z68 = ob_response(textView_ravno_68);
                double z69 = ob_response(textView_ravno_69);
                double z70 = ob_response(textView_ravno_70);
                double z71 = ob_response(textView_ravno_71);
                double z72 = ob_response(textView_ravno_72);
                double z73 = ob_response(textView_ravno_73);
                double z74 = ob_response(textView_ravno_74);
                double z75 = ob_response(textView_ravno_75);
                double z76 = ob_response(textView_ravno_76);
                double z77 = ob_response(textView_ravno_77);
                double z78 = ob_response(textView_ravno_78);
                double z79 = ob_response(textView_ravno_79);
                double z80 = ob_response(textView_ravno_80);
                double z81 = ob_response(textView_ravno_81);
                double z82 = ob_response(textView_ravno_82);
                double z83 = ob_response(textView_ravno_83);
                double z84 = ob_response(textView_ravno_84);
                double z85 = ob_response(textView_ravno_85);
                double z86 = ob_response(textView_ravno_86);
                double z87 = ob_response(textView_ravno_87);
                double z88 = ob_response(textView_ravno_88);
                double z89 = ob_response(textView_ravno_89);
                double z90 = ob_response(textView_ravno_90);
                double ob1 = z10 + z11 + z12 + z13 + z14 + z15 + z16 + z17 + z18 + z19 + z20 + z21 + z22 + z23 + z24 + z25 + z26 + z27 + z28 + z29 + z30 + z31 + z32 + z33 + z34 + z35 + z36 + z37 + z38 + z39 + z40 + z41 + z42 + z43;
                double ob2 = z44 + z45 + z46 + z47 + z48 + z49 + z50 + z51 + z52 + z53 + z54 + z55 + z56 + z57 + z58 + z59 + z60 + z61 + z62 + z63 + z64 + z65 + z66 + z67 + z68 + z69 + z70 + z71 + z72 + z73 + z74 + z75 + z76 + z77;
                double ob3 = z78 + z79 + z80 + z81 + z82 + z83 + z84 + z85 + z86 + z87 + z88 + z89 + z90;
                double ob = ob1 + ob2 + ob3;
                double price;
                double total;
                price_response.requestFocus();
                String S = price_response.getText().toString();
                if (S.length() == 0) {
                    price = 0;
                } else {
                    price = Double.parseDouble(S);
                }
                total = price * ob;
                total_response.setText(Double.toString(total) + " руб.");
                col_response.setText(Integer.toString(col));
                ob_response.setText(Double.toString(ob) + " м\u00b3");
            }
            break;
            default:
                break;
        }
    }

    private String createStr(String n, EditText edit, String str, TextView view) {
        String s1 = edit.getText().toString();
        String s2 = view.getText().toString();
        String d = "";
        String s = "         ";
        for (int i = 0; i < 15 - s1.length(); i++) {
            d += " ";
        }
        if (s1.length() != 0 && Integer.parseInt(s1) > 0) {
            str += n + s + s1 + d + s2 + "\n";
        }
        return str;
    }

    private void createDoc(String name) throws IOException {
        String str = "";
        str+="Диаметр   Количество   Объём (м\u00b3) \n";
        str = createStr("10", editText_10, str, textView_ravno_10);
        str = createStr("11", editText_11, str, textView_ravno_11);
        str = createStr("12", editText_12, str, textView_ravno_12);
        str = createStr("13", editText_13, str, textView_ravno_13);
        str = createStr("14", editText_14, str, textView_ravno_14);
        str = createStr("15", editText_15, str, textView_ravno_15);
        str = createStr("16", editText_16, str, textView_ravno_16);
        str = createStr("17", editText_17, str, textView_ravno_17);
        str = createStr("18", editText_18, str, textView_ravno_18);
        str = createStr("19", editText_19, str, textView_ravno_19);
        str = createStr("20", editText_20, str, textView_ravno_20);
        str = createStr("21", editText_21, str, textView_ravno_21);
        str = createStr("22", editText_22, str, textView_ravno_22);
        str = createStr("23", editText_23, str, textView_ravno_23);
        str = createStr("24", editText_24, str, textView_ravno_24);
        str = createStr("25", editText_25, str, textView_ravno_25);
        str = createStr("26", editText_26, str, textView_ravno_26);
        str = createStr("27", editText_27, str, textView_ravno_27);
        str = createStr("28", editText_28, str, textView_ravno_28);
        str = createStr("29", editText_29, str, textView_ravno_29);
        str = createStr("30", editText_30, str, textView_ravno_30);
        str = createStr("31", editText_31, str, textView_ravno_31);
        str = createStr("32", editText_32, str, textView_ravno_32);
        str = createStr("33", editText_33, str, textView_ravno_33);
        str = createStr("34", editText_34, str, textView_ravno_34);
        str = createStr("35", editText_35, str, textView_ravno_35);
        str = createStr("36", editText_36, str, textView_ravno_36);
        str = createStr("37", editText_37, str, textView_ravno_37);
        str = createStr("38", editText_38, str, textView_ravno_38);
        str = createStr("39", editText_39, str, textView_ravno_39);
        str = createStr("40", editText_40, str, textView_ravno_40);
        str = createStr("41", editText_41, str, textView_ravno_41);
        str = createStr("42", editText_42, str, textView_ravno_42);
        str = createStr("43", editText_43, str, textView_ravno_43);
        str = createStr("44", editText_44, str, textView_ravno_44);
        str = createStr("45", editText_45, str, textView_ravno_45);
        str = createStr("46", editText_46, str, textView_ravno_46);
        str = createStr("47", editText_47, str, textView_ravno_47);
        str = createStr("48", editText_48, str, textView_ravno_48);
        str = createStr("49", editText_49, str, textView_ravno_49);
        str = createStr("50", editText_50, str, textView_ravno_50);
        str = createStr("51", editText_51, str, textView_ravno_51);
        str = createStr("52", editText_52, str, textView_ravno_52);
        str = createStr("53", editText_53, str, textView_ravno_53);
        str = createStr("54", editText_54, str, textView_ravno_54);
        str = createStr("55", editText_55, str, textView_ravno_55);
        str = createStr("56", editText_56, str, textView_ravno_56);
        str = createStr("57", editText_57, str, textView_ravno_57);
        str = createStr("58", editText_58, str, textView_ravno_58);
        str = createStr("59", editText_59, str, textView_ravno_59);
        str = createStr("60", editText_60, str, textView_ravno_60);
        str = createStr("61", editText_61, str, textView_ravno_61);
        str = createStr("62", editText_62, str, textView_ravno_62);
        str = createStr("63", editText_63, str, textView_ravno_63);
        str = createStr("64", editText_64, str, textView_ravno_64);
        str = createStr("65", editText_65, str, textView_ravno_65);
        str = createStr("66", editText_66, str, textView_ravno_66);
        str = createStr("67", editText_67, str, textView_ravno_67);
        str = createStr("68", editText_68, str, textView_ravno_68);
        str = createStr("69", editText_69, str, textView_ravno_69);
        str = createStr("70", editText_70, str, textView_ravno_70);
        str = createStr("71", editText_71, str, textView_ravno_71);
        str = createStr("72", editText_72, str, textView_ravno_72);
        str = createStr("73", editText_73, str, textView_ravno_73);
        str = createStr("74", editText_74, str, textView_ravno_74);
        str = createStr("75", editText_75, str, textView_ravno_75);
        str = createStr("76", editText_76, str, textView_ravno_76);
        str = createStr("77", editText_77, str, textView_ravno_77);
        str = createStr("78", editText_78, str, textView_ravno_78);
        str = createStr("79", editText_79, str, textView_ravno_79);
        str = createStr("80", editText_80, str, textView_ravno_80);
        str = createStr("81", editText_81, str, textView_ravno_81);
        str = createStr("82", editText_82, str, textView_ravno_82);
        str = createStr("83", editText_83, str, textView_ravno_83);
        str = createStr("84", editText_84, str, textView_ravno_84);
        str = createStr("85", editText_85, str, textView_ravno_85);
        str = createStr("86", editText_86, str, textView_ravno_86);
        str = createStr("87", editText_87, str, textView_ravno_87);
        str = createStr("88", editText_88, str, textView_ravno_88);
        str = createStr("89", editText_89, str, textView_ravno_89);
        str = createStr("90", editText_90, str, textView_ravno_90);
        String S1=col_response.getText().toString();
        String S2=ob_response.getText().toString();
        String S3=price_response.getText().toString();
        String S4=total_response.getText().toString();
        str+="\n\n";
        str+="Количество:  " + S1 + " шт.\n";
        str+="Объём:  " + S2 + "\n";
        str+="Цена:  " + S3 + " руб/м\u00b3\n";
        str+="Итог:  " + S4 + "\n";

        File ff=null;
        if (isStoragePermissionGranted())
        {
            if (android.os.Build.VERSION.SDK_INT >= 29)
            {
                // /storage/emulated/0/Android/data/org.o7planning.externalstoragedemo/files
                ff = new File(this.getExternalFilesDir(null),"Кубатура леса");
            }
            else {
                ff = new File(Environment.getExternalStorageDirectory() + "/Download", "Кубатура леса");
            }
            if (!ff.exists())
            {
                ff.mkdirs();
            }
        }
        //ff.createNewFile();
        File sdFile = new File(ff, name + ".doc");
        sdFile.createNewFile();
        try {
            // открываем поток для записи
            BufferedWriter bw = new BufferedWriter(new FileWriter(sdFile));
            // пишем данные
            bw.write(str);
            // закрываем поток
            Toast.makeText(this, "Файл сохранен в папке " + ff, Toast.LENGTH_LONG).show();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void Dialog()
    {
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        final View v = View.inflate(this, R.layout.dialog, null);
        builder.setView(v);
        builder.setPositiveButton("сохранить", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                final EditText ed=(EditText) v.findViewById(R.id.editTextTextPersonName);
                String name=ed.getText().toString();
                try {
                    createDoc(name);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        })
                .setNegativeButton("отмена", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        builder.create().show();
    }
        public  boolean isStoragePermissionGranted()
        {
            if (Build.VERSION.SDK_INT >= 23)
            {
                if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
                {
                    return true;

                }
                else
                    {
                    ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                    return false;
                }
            }
            else
                { //permission is automatically granted on sdk<23 upon installation
                return true;
            }
        }
}
