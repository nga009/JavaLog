package jp.techacademy.noriko.seri.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ここを追加
import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.move();

        dog.say();
        Log.d("javatest", "犬の名前は" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");

        BigDog bigdog = new BigDog("ヨーゼフ", 15);     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る

        bigdog.say();
        Log.d("javatest", "犬の名前は" + bigdog.name + "です。");
        Log.d("javatest", "犬の年齢は" + bigdog.age + "歳です。");
*/
        //課題
        ArrayList<Human> list = new ArrayList<>();
        list.add(new Human("太郎", 10, "野球"));
        list.add(new Human("次郎",21, "サッカー"));
        list.add(new Human("三郎", 68, "バスケットボール"));

        for (int cnt=0; cnt<list.size(); cnt++) {
            list.get(cnt).say();
            list.get(cnt).think();
        }

    }
}
