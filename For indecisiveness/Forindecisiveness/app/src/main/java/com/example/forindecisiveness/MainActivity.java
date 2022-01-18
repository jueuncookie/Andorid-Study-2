package com.example.forindecisiveness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Scanner;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //변수선언
    private TextView maintext;
    private Button button;
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //화면구성사용선언
        maintext = (TextView) findViewById(R.id.maintext);
        button = (Button) findViewById(R.id.button);
        edittext = (EditText) findViewById(R.id.edittext);

        //버튼 클릭시 이벤트
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.getText().toString();

                //변수에 출력값을 저장하고 string을 int타입으로 변환해서 바운드에 집어넣기.
                //숫자 최초 0선언
                int dicenum = 0;

                //Random 함수 선언
                Random random = new Random();



                //random수 생성하여 dicenum에 입력


                try {
                    dicenum = random.nextInt(Integer.parseInt(edittext.getText().toString()))+1;
                    maintext.setText(String.valueOf(dicenum));
                } catch (java.lang.NumberFormatException e){maintext.setText("숫자를 입력하세요.");}

                //추출한 dicenum을 maintext에 출력

            }
        });

    }
}