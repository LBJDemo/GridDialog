package com.xdx.doall.griddialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SelectInsurDialog selectInsurDialog ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<InsurEntity> list = new ArrayList<InsurEntity>();
                InsurEntity insurEntity = new InsurEntity("太平洋保险",false);
                list.add(insurEntity);
                InsurEntity insurBean1 = new InsurEntity("中国人保保险",false);
                list.add(insurBean1);
                InsurEntity insurBean2 = new InsurEntity("平安保险",false);
                list.add(insurBean2);
                InsurEntity insurBean3 = new InsurEntity("中华保险",false);
                list.add(insurBean3);

                selectInsurDialog = new SelectInsurDialog(MainActivity.this, R.style.mall_Dialog);
                selectInsurDialog.setList(list);
                selectInsurDialog.setCanceledOnTouchOutside(true);
                selectInsurDialog.setDialogCallback(new SelectInsurDialog.DialogCallback() {
                    @Override
                    public void onClickRadioButton(String name) {
                        Toast.makeText(MainActivity.this,"你选择的是："+name,Toast.LENGTH_SHORT).show();
                        selectInsurDialog.dismiss();

                    }
                });

                selectInsurDialog.show();
            }
        });


    }
}
