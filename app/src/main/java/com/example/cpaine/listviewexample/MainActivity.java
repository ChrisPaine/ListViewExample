package com.example.cpaine.listviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] favoriteTVShows = {"Jesus Saves","Jeremiah 31:31","Jesus Christ","John 3:16",
                "Psalms 1","1 Corinthians 13","1 Samuel 15:22","Luke 2:10-14","Ezekiel 22:30","Revelation 22:17"};


        ListAdapter theAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, favoriteTVShows);

        ListView theListView = (ListView)findViewById(R.id.theListView);

        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String tvShowPicked = String.valueOf(adapterView.getItemAtPosition(position));
                String johnThreeSixteen = " \"For God so loved, the world that he have his only begotton Son, that whosoever believeth in him should not perish, but have everlasting life.\"";
                String jeremiahThirtyOneThirtyOne = " \" Behold, the days come, saith the Lord, that I will make a new covenant with the house of Israel, and with the house of Judah\"";
                String firstSamuelFifteenTwentyTwo = " \"And Samuel said, Hath the Lord as great delight in burnt offerings and sacrifices, as in obeying the voice of the Lord? Behold, to obey is better than sacrifice, and to hearken than the fat of rams.\"";
                String lukeTwoTenThruFourteen = " \n\"10 And the angel said unto them, Fear not: for, behold, I bring you good tidings of great joy, which shall be to all people.\n" +
                        "\n" +
                        "11 For unto you is born this day in the city of David a Saviour, which is Christ the Lord.\n" +
                        "\n" +
                        "12 And this shall be a sign unto you; Ye shall find the babe wrapped in swaddling clothes, lying in a manger.\n" +
                        "\n" +
                        "13 And suddenly there was with the angel a multitude of the heavenly host praising God, and saying,\n" +
                        "\n" +
                        "14 Glory to God in the highest, and on earth peace, good will toward men.\"";
                String ezekielTwentyTwoThirty = " \"And I sought for a man among them, that should make up the hedge, and stand in the gap before me for the land, that I should not destroy it: but I found none.\"";
                String RevelationTwentyTwoSeventeen = " \"And the Spirit and the bride say, Come. And let him that heareth say, Come. And let him that is athirst come. And whosoever will, let him take the water of life freely.\"";

                if (tvShowPicked.contains("John 3:16")){tvShowPicked += johnThreeSixteen;}
                else if(tvShowPicked.contains("Jeremiah 31:31")){tvShowPicked += jeremiahThirtyOneThirtyOne;}
                else if(tvShowPicked.contains("1 Samuel 15:22")){tvShowPicked += firstSamuelFifteenTwentyTwo;}
                else if(tvShowPicked.contains("Luke 2:10-14")){tvShowPicked += lukeTwoTenThruFourteen;}
                else if(tvShowPicked.contains("Ezekiel 22:30")){tvShowPicked += ezekielTwentyTwoThirty;}
                else if(tvShowPicked.contains("Revelation 22:17")){tvShowPicked += RevelationTwentyTwoSeventeen;}

                Toast.makeText(MainActivity.this, tvShowPicked, Toast.LENGTH_LONG).show();
            }
        });
    }
}
