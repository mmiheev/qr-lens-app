package com.zeon.qrlens

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.zeon.qrscanner.QrResult
import com.zeon.qrscanner.QrScanner

class MainActivity : AppCompatActivity() {
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val qrScannerLauncher = registerForActivityResult(QrScanner.ScannerContract()) { result ->
            when (result) {
                is QrResult.Success -> {
                    resultTextView.text = "Result: ${result.text}"
                    Toast.makeText(this, "QR code recognized: ${result.text}", Toast.LENGTH_SHORT).show()
                }
                is QrResult.Error -> {
                    resultTextView.text = "Error: ${result.exception.message}"
                    Toast.makeText(this, "Error: ${result.exception.message}", Toast.LENGTH_SHORT).show()
                }
                QrResult.Canceled -> {
                    resultTextView.text = "Scan canceled"
                    Toast.makeText(this, "Scan canceled", Toast.LENGTH_SHORT).show()
                }
            }
        }

        resultTextView = findViewById(R.id.resultTextView)
        val scanButton: Button = findViewById(R.id.scanButton)

        scanButton.setOnClickListener {
            qrScannerLauncher.launch(Unit)
        }
    }
}