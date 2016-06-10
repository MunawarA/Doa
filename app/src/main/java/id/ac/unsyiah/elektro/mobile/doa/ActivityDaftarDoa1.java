package id.ac.unsyiah.elektro.mobile.doa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by USER on 13/05/2016.
 */
public class ActivityDaftarDoa1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_daftardoa1);
    }

    final int[] doa1={R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a9,R.drawable.a10};
    final int[] suara1={R.raw.a1,R.raw.a2,R.raw.a3,R.raw.a4,R.raw.a5,R.raw.a6,R.raw.a7,R.raw.a8,R.raw.a9,R.raw.a10};

    public void onClickBtnK1Doa1(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa1[0]);
        pesan.putExtra("var2", suara1[0]);
        startActivity(pesan);
    }

    public void onClickBtnK1Doa2(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa1[1]);
        pesan.putExtra("var2", suara1[1]);
        startActivity(pesan);
    }

    public void onClickBtnK1Doa3(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa1[2]);
        pesan.putExtra("var2", suara1[2]);
        startActivity(pesan);
    }

    public void onClickBtnK1Doa4(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa1[3]);
        pesan.putExtra("var2", suara1[3]);
        startActivity(pesan);
    }

    public void onClickBtnK1Doa5(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa1[4]);
        pesan.putExtra("var2", suara1[4]);
        startActivity(pesan);
    }

    public void onClickBtnK1Doa6(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa1[5]);
        pesan.putExtra("var2", suara1[5]);
        startActivity(pesan);
    }

    public void onClickBtnK1Doa7(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa1[6]);
        pesan.putExtra("var2", suara1[6]);
        startActivity(pesan);
    }

    public void onClickBtnK1Doa8(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa1[7]);
        pesan.putExtra("var2", suara1[7]);
        startActivity(pesan);
    }

    public void onClickBtnK1Doa9(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa1[8]);
        pesan.putExtra("var2", suara1[8]);
        startActivity(pesan);
    }

    public void onClickBtnK1Doa10(View view) {
        Intent pesan = new Intent(getApplicationContext(), ActivityDoa.class);
        pesan.putExtra("var1", doa1[9]);
        pesan.putExtra("var2", suara1[9]);
        startActivity(pesan);
    }
}
