package id.ac.unsyiah.elektro.mobile.doa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by USER on 13/05/2016.
 */
public class ActivityDaftarDoa3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_daftardoa3);
    }
    final int[] doa3={R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5,R.drawable.c6,R.drawable.c7,R.drawable.c8,R.drawable.c9,R.drawable.c10};

    public void onClickBtnK3Doa1(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa3[0]);
        startActivity(pesan);
    }

    public void onClickBtnK3Doa2(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa3[1]);
        startActivity(pesan);
    }

    public void onClickBtnK3Doa3(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa3[2]);
        startActivity(pesan);
    }

    public void onClickBtnK3Doa4(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa3[3]);
        startActivity(pesan);
    }

    public void onClickBtnK3Doa5(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa3[4]);
        startActivity(pesan);
    }

    public void onClickBtnK3Doa6(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa3[5]);
        startActivity(pesan);
    }

    public void onClickBtnK3Doa7(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa3[6]);
        startActivity(pesan);
    }

    public void onClickBtnK3Doa8(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa3[7]);
        startActivity(pesan);
    }

    public void onClickBtnK3Doa9(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa3[8]);
        startActivity(pesan);
    }

    public void onClickBtnK3Doa10(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa3[9]);
        startActivity(pesan);
    }
}
