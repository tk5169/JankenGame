package com.example.android.sample.janken2;
//
//import android.content.Intent;
//import android.media.Image;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ImageButton;
//import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//
//    private static final int REQ_RESULT = 1;
//
//    int win = 0;
//    int lose = 0;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        ImageButton imageButton = (ImageButton) findViewById(R.id.left);
//        imageButton.setOnClickListener(this);
//        ImageButton imageButton2 = (ImageButton) findViewById(R.id.center);
//        imageButton2.setOnClickListener(this);
//        ImageButton imageButton3 = (ImageButton) findViewById(R.id.right);
//        imageButton3.setOnClickListener(this);
//
//        double percent = 0;
//        if(win+lose==0){
//            percent =0;
//        }else {
//            //        勝率　＝　勝った数　/　（勝った数＋負けた数）
//            percent = ((double) win / (double) (win + lose)); // 1/(1+2) = 0.3333
//        }
//
//        TextView tvWin = (TextView)findViewById(R.id.win);
//        tvWin.setText("勝利数："+ win);
//
//        TextView tvLose  = (TextView)findViewById(R.id.lose);
//        tvLose.setText("敗北数："+ lose);
//
//        TextView tvPercent = (TextView)findViewById(R.id.percent);
//        tvPercent.setText("勝率："+ percent + "%");
//
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if(resultCode != RESULT_OK) return;
//
//        if(requestCode == REQ_RESULT) {
//            Bundle resultBundle = data.getExtras();
//            if(!resultBundle.containsKey("WIN")) return;
//            if(!resultBundle.containsKey("LOSE")) return;
//            if(!resultBundle.containsKey("PERCENT")) return;
//
//
//            win = resultBundle.getInt("WIN");
//            lose = resultBundle.getInt("LOSE");
//            double percent = resultBundle.getDouble("PERCENT");
//
//            TextView tvWin = (TextView)findViewById(R.id.win);
//            tvWin.setText("勝利数："+ win);
//
//            TextView tvLose  = (TextView)findViewById(R.id.lose);
//            tvLose.setText("敗北数："+ lose);
//
//            TextView tvPercent = (TextView)findViewById(R.id.percent);
//            tvPercent.setText("勝率："+ percent + "%");
//
//        }
//
//    }
//
//    @Override
//    public void onClick(View view) {
//
//
////        Intent intenta = new Intent(this, ResultActivity.class);
////        intenta.putExtra("result", "あなたはテスト");
////        intenta.putExtra("RESULT", 0);
////        intenta.putExtra("WIN", win);
////        intenta.putExtra("LOSE", lose);
////        startActivityForResult(intenta, REQ_RESULT);
//
//
//
//        int id = view.getId();
//        switch (id) {
//            case R.id.left:
//                Intent intent1 = new Intent(this, ResultActivity.class);
//                intent1.putExtra("result", "あなたはグー");
//                intent1.putExtra("RESULT", 0);
//                intent1.putExtra("WIN", win);
//                intent1.putExtra("LOSE", lose);
//                startActivityForResult(intent1, REQ_RESULT);
//                break;
//
//            case R.id.center:
//                Intent intent2 = new Intent(this, ResultActivity.class);
//                intent2.putExtra("result", "あなたはチョキ");
//                intent2.putExtra("RESULT", 1);
//                intent2.putExtra("WIN", win);
//                intent2.putExtra("LOSE", lose);
//                startActivityForResult(intent2, REQ_RESULT);
//                break;
//
//            case R.id.right:
//                Intent intent3 = new Intent(this, ResultActivity.class);
//                intent3.putExtra("result", "あなたはパー");
//                intent3.putExtra("RESULT", 2);
//                intent3.putExtra("WIN", win);
//                intent3.putExtra("LOSE", lose);
//                startActivityForResult(intent3, REQ_RESULT);
//                break;
//
//
//        }
//
//    }
//
//}

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}