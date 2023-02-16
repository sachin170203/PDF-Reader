package com.example.pdfreader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {
   PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);

        myPDFViewer=(PDFView) findViewById(R.id.pdfViewer);
        String getItem=getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("Description")){
            myPDFViewer.fromAsset("Description.pdf").load();
        }
        if(getItem.equals("Sppu")){
            myPDFViewer.fromAsset("sppu.pdf").load();
        }
        if(getItem.equals("Task Allocation Document")){
            myPDFViewer.fromAsset("Task Allocation Document.pdf").load();
        }
        if(getItem.equals("Offer Letter")){
            myPDFViewer.fromAsset("Offer Letter.pdf").load();
        }
        if(getItem.equals("Data Structure")){
            myPDFViewer.fromAsset("Data Structure.pdf").load();
        }
        if(getItem.equals("DBMS")){
            myPDFViewer.fromAsset("DBMS.pdf").load();
        }
        if(getItem.equals("Human Computer Interaction")){
            myPDFViewer.fromAsset("Human Computer Interaction.pdf").load();
        }
        if(getItem.equals("Machine Learning")){
            myPDFViewer.fromAsset("Machine Learning.pdf").load();
        }
        if(getItem.equals("Materials for engineering")){
            myPDFViewer.fromAsset("Materials for engineering.pdf").load();
        }
        if(getItem.equals("Object-Oriented")){
            myPDFViewer.fromAsset("Object Oriented Programming.pdf").load();
        }
        if(getItem.equals("Operating System")){
            myPDFViewer.fromAsset("Operating System.pdf").load();
        }
        if(getItem.equals("Software Engineering")){
            myPDFViewer.fromAsset("Software Engineering.pdf").load();
        }
        if(getItem.equals("Theroy Of Computation")){
            myPDFViewer.fromAsset("Theroy Of Computation.pdf").load();
        }
        if(getItem.equals("android_tutorial")){
            myPDFViewer.fromAsset("android_tutorial.pdf").load();
        }
        if(getItem.equals("Business")){
            myPDFViewer.fromAsset("Business.pdf").load();
        }
        if(getItem.equals("deep learning")){
            myPDFViewer.fromAsset("deep learning.pdf").load();
        }
        if(getItem.equals("tcp_ip")){
            myPDFViewer.fromAsset("tcp_ip.pdf").load();
        }
        if(getItem.equals("IT_pdf")){
            myPDFViewer.fromAsset("IT_pdf.pdf").load();
        }
        if(getItem.equals("Cyber_security")){
            myPDFViewer.fromAsset("Cyber_security.pdf").load();
        }
        if(getItem.equals("Data Warehousing")){
            myPDFViewer.fromAsset("Data Warehousing.pdf").load();
        }


    }
}