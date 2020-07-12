package java.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void teacherlogin(){
        //教师信息注册
    }

    private void studentlogin(){
        //学生信息注册
    }

    private void studentcheck(){
        //学生信息检查功能
    }

}