package ahmed.jaafuar.faisal.worlduniversities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start_app.*

class StartApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_app)

        time_table.setOnClickListener {
           val intent = Intent(this,table::class.java)
            startActivity(intent)
        }//End time_table(BTN)

        collageTable.setOnClickListener{
            val intent = Intent(this,unvinity_table::class.java)
            startActivity(intent)
        }

    }//End onCreate()


}//End class