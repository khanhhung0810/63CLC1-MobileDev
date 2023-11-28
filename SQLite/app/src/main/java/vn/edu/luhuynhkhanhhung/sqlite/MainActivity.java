package vn.edu.luhuynhkhanhhung.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase bookDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Tao CSDL,
        bookDB = openOrCreateDatabase("Sach.db", MODE_PRIVATE, null);
        // Thuc hien lenh tao bang
        String sqlXoaBangNeuCo = "DROP TABLE IF EXISTS BOOKS";
        String sqlTaoBang="CREATE TABLE BOOKS (BookID interger PRIMARY KEY," +
                "BookName text," +
                "Page Interger," +
                "Price float," +
                "Description text)";
        bookDB.execSQL(sqlXoaBangNeuCo);
        bookDB.execSQL(sqlTaoBang);
        // thuc hien cac lenh insert
        String sqlThemDong1="INSERT INTO BOOKS VALUES(1, 'Java', 100, 9.99, 'sách về Java')";
        bookDB.execSQL(sqlThemDong1);

        String sqlThemDong2="INSERT INTO BOOKS VALUES(2, 'Android', 300, 8.88, 'sách về Android')";
        bookDB.execSQL(sqlThemDong2);

        bookDB.close();






    }
    public void ChuyenManHinh (View v){
        Intent iManHinhKhac = new Intent(this, BookNavigationActivity.class);
        startActivity(iManHinhKhac);
    }
}