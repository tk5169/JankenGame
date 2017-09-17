package com.example.android.sample.janken2;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Admin on 2017/09/17.
 */

public class UserNamePreferences {
    //保存先ファイル名
    public static final String PREF_FILE_NAME = "user_name";

    //ファイル名プレフィックスのKEY
    private static final String KEY_FILE_NAME_PREFIX = "file.name.prefix";
    //未設定時のデフォルト値
    private static final String KEY_FILE_NAME_PREFIX_DEFAULT = "name";

    //ファイル名プレフィックスの値を取得する
    public static String getKeyFileNamePrefix(Context context) {
        //SharedPreferencesを取得
        SharedPreferences sp = context.getSharedPreferences(
                PREF_FILE_NAME, Context.MODE_PRIVATE);

        //SharedPreferencesから設定値を取得する
        return  sp.getString(KEY_FILE_NAME_PREFIX,
                KEY_FILE_NAME_PREFIX_DEFAULT);
    }

    //ファイル名のプレフィックスを保存する
    public static void SaveName(Context context, String acount_name) {
        //SharedPreferencesを取得
        SharedPreferences sp = context.getSharedPreferences("NameSave",
                Context.MODE_PRIVATE);

        //編集するためのEditorを取得
        SharedPreferences.Editor editor = sp.edit();

        //editorを通して、SharedPreferencesを編集
        editor.putString(KEY_FILE_NAME_PREFIX, acount_name);

        //編集内容を反映
        editor.apply();

    }

}
