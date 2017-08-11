package jp.techacademy.noriko.seri.javalog;

import android.util.Log;
/**
 * Created by Noriko on 2017/07/03.
 */

public class Dog extends Animal implements Movable{
    // クラス変数
    static String to_jp = "犬";

    // コンストラクタ
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは犬クラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }


}
