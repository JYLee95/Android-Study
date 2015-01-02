package com.example.yj.ja_hw1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// extends 가 Activity로 되어도 되지만 API16부터는 기본적으로 ActionBarActivity 로 생성되는듯
//AvtionBar의 특성을 알려주는 페이지는 다음 숙제때 내 주겠음
//대부분의 함수를 호출하고화면을 구성하는 부분은 기본 안드로이드의 함수들을 Override하는 방식으로 진행
public class MainActivity extends ActionBarActivity {

    //생명주기상 onCreate 부분에 해단된다. 여기서 이 액티비티가 화면에서 만들어질때 어떤 작업들이 수행될지
    //작성하면 되는 것이다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // 레이아웃과 java파일을 연결하는 부분
        TextView tv = (TextView)findViewById(R.id.textView2);// activity_mail.xml에서 설정한 텍스트를 보여주는 텍스트뷰!
//         tv.                                                  //TODO tv라는 텍스트뷰에 자기 이름 띄우는 부분 작성
                                                               //TODO 인터넷을 찾아봐도 좋지만 아마 tv.을 누르면 사용할 함수들이 쏟아져 나올듯
        Button btn =(Button)findViewById(R.id.button);//activity_mail.xml에서 설정한 버튼의 id부분으로 새로운 버튼을 만든다.
        btn.setOnClickListener(new View.OnClickListener() { //버튼에 리스터 (어떤 이벤트가 발생을 받아오는 부분이라고 이해!
            @Override
            public void onClick(View v) {    //버튼을 클릭하면 어떤 작동을 해야하는지 구현하는 부분이다.
                                                  //TODO 버튼을 클릭하면 MainActivity2로 넘어가는 부분을 구현!
                                                   //TODO 넘어가는 부분에 자기 이름을 intent에 포함시켜 넘겨보자!

            }
        });








    }

    //밑의 onCreateOptionMene는 지금은 넘어가자 메뉴를 설정할때는 밑에부분에서 설정하면 되긴한다.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
