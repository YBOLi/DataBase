package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.widget.DialogTitle;
import android.util.Log;

/**
 * Created by E5 on 2016/7/14.
 */
public class PersonSQLiteOpenHelper extends SQLiteOpenHelper{
    private static final String TAG = "PersonSQLiteOpenHelper";
    public PersonSQLiteOpenHelper(Context context){
        super(context,PerosonTable.peroson.TABLE_NAME,null,1);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table "+PerosonTable.peroson.NAME+"("+
                    PerosonTable.peroson._ID+" integer primary key autoincrement,"
                    +PerosonTable.peroson.NUMBER+" varchar(20) )"


        );
        Log.d(TAG,"数据库被创建");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
