package comp.yukkina.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;


public class gridlayout extends AppCompatActivity {
   //GridLayout mainGrid;
    //CardView note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridlayout);
        //mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        //note = findViewById(R.id.Note);
        //Set Event
        //OnclickCard(note);
      //  setSingleEvent(mainGrid);

    }


   /* private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(gridlayout.this,MainActivity.class);
                    intent.putExtra("info","This is activity from card item index  "+finalI);
                    startActivity(intent);
                    overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
                }
            });
        }
    }

public class ButtonDemoActivity extends gridlayout implements View.OnClickListener {

       // final Button button1 = (Button)findViewById(R.id.button1);

       @Override
       public void onClick(View v) {
           switch (v.getId()) {
               case R.id.Note: {
                   startActivity(new Intent(this, MainActivity.class));
                   overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
                   break;
               }
           }
       }
   }

*/
   public void onNoteClick(View view)
   {
               startActivity(new Intent(this, MainActivity.class));
               overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
   }
public void onCalendarClick(View v){
    startActivity(new Intent(this, calendar.class));
    overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);

}

}
