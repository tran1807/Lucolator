package com.example.cucolator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Integer So1 = 0;
    Integer So2 = 0;
    Character dau = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView TvKQ = (TextView) findViewById(R.id.TextView);
        final TextView txtKetQua = (TextView) findViewById(R.id.KetQua);
        Button so0 = (Button) findViewById(R.id.So0);
        so0.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                txtKetQua.setText(txtKetQua.getText().toString()+"0");
                if (dau == null)
                {So1 = Integer.parseInt(txtKetQua.getText().toString());}
                else
                    {So2 = Integer.parseInt(txtKetQua.getText().toString());
                    }
            }
        });
        Button so1 = (Button) findViewById(R.id.So1);
        so1.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                txtKetQua.setText(txtKetQua.getText().toString()+"1");
                if (dau == null) {So1 = Integer.parseInt(txtKetQua.getText().toString());}
                else
                    {So2 = Integer.parseInt(txtKetQua.getText().toString());
                    }
            }
        });
        Button so2 = (Button) findViewById(R.id.So2);
        so2.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                txtKetQua.setText(txtKetQua.getText().toString()+"2");
                if (dau == null)
                {So1 = Integer.parseInt(txtKetQua.getText().toString());}
                else
                    {So2 = Integer.parseInt(txtKetQua.getText().toString());
                    }
            }
        });
        Button so3 = (Button) findViewById(R.id.So3);
        so3.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                txtKetQua.setText(txtKetQua.getText().toString()+"3");
                if (dau == null)
                {So1 = Integer.parseInt(txtKetQua.getText().toString());}
                else {So2 = Integer.parseInt(txtKetQua.getText().toString());}}});
        Button so4 = (Button) findViewById(R.id.So4);
        so4.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                txtKetQua.setText(txtKetQua.getText().toString()+"4");
                if (dau == null)
                {So1 = Integer.parseInt(txtKetQua.getText().toString());}
                else
                    {So2 = Integer.parseInt(txtKetQua.getText().toString());
                    }
            }
        });
        Button so5 = (Button) findViewById(R.id.So5);
        so5.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                txtKetQua.setText(txtKetQua.getText().toString()+"5");
                if (dau == null)
                {So1 = Integer.parseInt(txtKetQua.getText().toString());}
                else
                    {So2 = Integer.parseInt(txtKetQua.getText().toString());
                    }
            }
        });
        Button so6 = (Button) findViewById(R.id.So6);
        so6.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                txtKetQua.setText(txtKetQua.getText().toString()+"6");
                if (dau == null)
                {So1 = Integer.parseInt(txtKetQua.getText().toString());}
                else
                    {So2 = Integer.parseInt(txtKetQua.getText().toString());
                    }
            }
        });
        Button so7 = (Button) findViewById(R.id.So7);
        so7.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                txtKetQua.setText(txtKetQua.getText().toString()+"7");
                if (dau == null)
                {So1 = Integer.parseInt(txtKetQua.getText().toString());}
                else
                    {So2 = Integer.parseInt(txtKetQua.getText().toString());
                    }
            }
        });
        Button so8 = (Button) findViewById(R.id.So8);
        so8.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                txtKetQua.setText(txtKetQua.getText().toString()+"8");
                if (dau == null)
                {So1 = Integer.parseInt(txtKetQua.getText().toString());}
                else
                    {So2 = Integer.parseInt(txtKetQua.getText().toString());
                    }
            }
        });
        Button so9 = (Button) findViewById(R.id.So9);
        so9.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v){
                txtKetQua.setText(txtKetQua.getText().toString()+"9");
                if (dau == null)
                {So1 = Integer.parseInt(txtKetQua.getText().toString());}
                else
                    {So2 = Integer.parseInt(txtKetQua.getText().toString());
                    }
                }
            });

        Button tong = (Button) findViewById(R.id.Tong);
        tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '+';
                txtKetQua.setText("");
            }
        });
        Button hieu = (Button) findViewById(R.id.Hieu);
        hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '-';
                txtKetQua.setText("");
            }
        });
        Button tich = (Button) findViewById(R.id.Tich);
        tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '*';
                txtKetQua.setText("");
            }
        });
        Button thuong = (Button) findViewById(R.id.Thuong);
        thuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '/';
                txtKetQua.setText("");
            }
        });
        Button bang = (Button) findViewById(R.id.Bang);
        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dau != null)
                {
                    Integer kq = 0;
                    switch (dau)
                    {
                        case '+': kq = So1 + So2;
                            TvKQ.setText(So1+"+"+So2+"=");
                        break;
                        case '-': kq = So1 - So2;
                            TvKQ.setText(So1+"-"+So2+"=");
                        break;
                        case '*': kq = So1 * So2;
                            TvKQ.setText(So1+"*"+So2+"=");
                        break;
                        case '/': kq = So1/So2;
                            TvKQ.setText(So1+"/"+So2+"=");
                        break;
                    }
                    txtKetQua.setText(kq.toString());
                    So1 = kq;
                    dau = null;
                }
            }
        });
        Button xoa = (Button) findViewById(R.id.Xoa);
        xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                So1 = 0;
                So2 = 0;
                dau = null;
                txtKetQua.setText("");
            }
        });
    }
}