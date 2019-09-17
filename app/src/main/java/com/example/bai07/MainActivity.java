package com.example.bai07;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

class Card{
    public Card(String name, int path, float value) {
        this.name = name;
        this.path = path;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    private int path;
    private float value;
}
public class MainActivity extends AppCompatActivity {
    private static final Card arr[][]=new Card[][]{
            //============================Bích
            {
                    new Card("ách bích",R.drawable.bich1,1),
                    new Card("hai bích",R.drawable.bich2,2),
                    new Card("ba bích",R.drawable.bich3,3),
                    new Card("bốn bích",R.drawable.bich4,4),
                    new Card("năm bích",R.drawable.bich5,5),
                    new Card("sáu bích",R.drawable.bich6,6),
                    new Card("bảy bích",R.drawable.bich7,7),
                    new Card("tám bích",R.drawable.bich8,8),
                    new Card("chín bích",R.drawable.bich9,9),
                    new Card("mười bích",R.drawable.bich10,10),
                    new Card("bòi bích",R.drawable.bich11,10),
                    new Card("đằm bích",R.drawable.bich12,10),
                    new Card("già bích",R.drawable.bich13,10)
            },
            //==============================Chuồng
            {
                    new Card("ách chuồng",R.drawable.chuong1,1),
                    new Card("hai chuồng",R.drawable.chuong2,2),
                    new Card("ba chuồng",R.drawable.chuong3,3),
                    new Card("bốn chuồng",R.drawable.chuong4,4),
                    new Card("năm chuồng",R.drawable.chuong5,5),
                    new Card("sáu chuồng",R.drawable.chuong6,6),
                    new Card("bảy chuồng",R.drawable.chuong7,7),
                    new Card("tám chuồng",R.drawable.chuong8,8),
                    new Card("chín chuồng",R.drawable.chuong9,9),
                    new Card("mười chuồng",R.drawable.chuong10,10),
                    new Card("bồi chuồng",R.drawable.chuong11,10),
                    new Card("đằm chuòng",R.drawable.chuong12,10),
                    new Card("già chuồng",R.drawable.chuong13,10)
            },
            //=============================================Rô
            {
                    new Card("ách rô",R.drawable.ro1,1),
                    new Card("hai rô",R.drawable.ro2,2),
                    new Card("ba rô",R.drawable.ro3,3),
                    new Card("bốn rô",R.drawable.ro4,4),
                    new Card("năm rô",R.drawable.ro5,5),
                    new Card("sáu rô",R.drawable.ro6,6),
                    new Card("bảy rô",R.drawable.ro7,7),
                    new Card("tám rô",R.drawable.ro8,8),
                    new Card("chín rô",R.drawable.ro9,9),
                    new Card("mười rô",R.drawable.ro10,10),
                    new Card("bồi rô",R.drawable.ro11,10),
                    new Card("đằm rô",R.drawable.ro12,10),
                    new Card("già rô",R.drawable.ro13,10)
            },
            //======================================Cơ
            {
                    new Card("ách cơ",R.drawable.co1,1),
                    new Card("hai cơ",R.drawable.co2,2),
                    new Card("ba cơ",R.drawable.co3,3),
                    new Card("bốn cơ",R.drawable.co4,4),
                    new Card("năm cơ",R.drawable.co5,5),
                    new Card("sáu cơ",R.drawable.co6,6),
                    new Card("bảy cơ",R.drawable.co7,7),
                    new Card("tám cơ",R.drawable.co8,8),
                    new Card("chín cơ",R.drawable.co9,9),
                    new Card("mười cơ",R.drawable.co10,10),
                    new Card("bồi cơ",R.drawable.co11,10),
                    new Card("đằm cơ",R.drawable.co12,10),
                    new Card("già cơ",R.drawable.co13,10)
            }
    };
    ImageView imgview_card[]=new ImageView[3];
    Button btn_random;
    private boolean Exist_Card(ImageView[] arr_img_view,int path){
        for (int i=0;i<arr_img_view.length;i++){
            if(arr_img_view[i].getTag()==null)
                return false;
            else if((int)arr_img_view[i].getTag()==path)
                return true;
        }
        return  false;
    }
    private void Rutbai(ImageView img,ImageView[] arr_img_view){
        final int row=4;
        final int column=13;
        int random_row=0;
        int random_column=0;
        boolean status=false;
        do{
            random_row=(int)(Math.random()*row);
            random_column=(int)(Math.random()*column);
            status=Exist_Card(arr_img_view,arr[random_row][random_column].getPath());
        }
        while (status==true);
        img.setImageResource(arr[random_row][random_column].getPath());
        int tag=arr[random_row][random_column].getPath();
        img.setTag(tag);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgview_card[0]=findViewById(R.id.imgvw_card_1);
        imgview_card[1]=findViewById(R.id.imgvw_card_2);
        imgview_card[2]=findViewById(R.id.imgvw_card_3);
        btn_random=findViewById(R.id.btn_random_card);
        btn_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<imgview_card.length;i++){
                    Rutbai(imgview_card[i],imgview_card);
                }

            }
        });

    }
}



