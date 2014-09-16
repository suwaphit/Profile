package app.kai.resume;

import android.R.string;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class controlinsert extends SQLiteOpenHelper {
	String strName,strNickname,intCode,intSub,intTel,strEmail,strBuu;
	private static final String DATABASE_NAME = "db595";
	private static final String TABLE_RESUME = "resume";
	private static final int DATBASE_VERSION = 1;
	

	public controlinsert(Context context) {
		super(context,TABLE_RESUME,null,DATBASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE   "+ TABLE_RESUME
				+"(ResumeID INTEGER  PRIMARY KEY AUTOINCREMENT,"
				+"NAME TEXT(100),"
				+"NICKNAME TEXT(100),"
				+"CODE INTEGER,"
				+"SUB TEXT(100),"
				+"TEL INTEGER,"
				+"E_MAIL TEXT(100),"
				+"BUU TEXT(100));");

		
			Log.d("CREATE TABLE", "Create Table Successfully");
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_RESUME);
		onCreate(db);
		
	}
	//Insert Data
	public long insertData(String strName, String strNickname,String intCode,String strSub,
			String intTel,String strEmail,String strBuu){
		try {
			SQLiteDatabase db;
			db = this.getWritableDatabase();
			ContentValues k = new ContentValues();
			k.put("NAME", strName);
			k.put("NICKNAME", strNickname);
			k.put("CODE", intCode);
			k.put("SUB", strSub);
			k.put("TEL", intTel);
			k.put("E_MAIL", strEmail);
			k.put("BUU", strBuu);
			
			long m = db.insert(TABLE_RESUME, null, k);
			db.close();
			return m ;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			return -1 ;
			
		}
		
		
		
		
	}
	
	

}

