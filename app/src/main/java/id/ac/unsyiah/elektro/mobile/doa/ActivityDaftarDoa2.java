package id.ac.unsyiah.elektro.mobile.doa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by USER on 13/05/2016.
 */
public class ActivityDaftarDoa2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_daftardoa2);
    }
    final int[] doa2={R.drawable.b1,R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.b5,R.drawable.b6,R.drawable.b7,R.drawable.b8,R.drawable.b9,R.drawable.b10};

    public void onClickBtnK2Doa1(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa2[0]);
        startActivity(pesan);
    }

    public void onClickBtnK2Doa2(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa2[1]);
        startActivity(pesan);
    }

    public void onClickBtnK2Doa3(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa2[2]);
        startActivity(pesan);
    }

    public void onClickBtnK2Doa4(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa2[3]);
        startActivity(pesan);
    }

    public void onClickBtnK2Doa5(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa2[4]);
        startActivity(pesan);
    }

    public void onClickBtnK2Doa6(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa2[5]);
        startActivity(pesan);
    }

    public void onClickBtnK2Doa7(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa2[6]);
        startActivity(pesan);
    }

    public void onClickBtnK2Doa8(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa2[7]);
        startActivity(pesan);
    }

    public void onClickBtnK2Doa9(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa2[8]);
        startActivity(pesan);
    }

    public void onClickBtnK2Doa10(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa2[9]);
        startActivity(pesan);
    }
}
