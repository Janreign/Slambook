package ph.kodego.aragon.janreign.slambook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class QuestionsActivity : AppCompatActivity() {

    val relationshipStatusOptions = arrayOf("Single", "In a relationship", "Engaged", "Married", "Divorced")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val spinnerRelationshipStatus: Spinner = findViewById(R.id.spinner_relationship_status)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, relationshipStatusOptions)
        spinnerRelationshipStatus.adapter = adapter

    }
}