package com.aeron7.baahubali.model;

import com.aeron7.baahubali.R;

/**
 * Created by Dexter on 05-10-2015.
 */
public class Story {


        private Page[] mPages;

        public Story() {
            mPages = new Page[7];

            mPages[0] = new Page(
                    R.drawable.page0,
                    "While Baahubali made people reforms and solely enjoyed the people’s respect, Bhalaldev, the War Commander risked his life in indulging all kind of war activities. So, %1$s, do you think Baahubali was being killed by his own people or he managed to save his life?",
                    new Choice("Screw it, He got killed", 1),
                    new Choice("He's alive and hiding somewhere", 2));

            mPages[1] = new Page(
                    R.drawable.page1,
                    "Shivgami lost peace on seeing her biological son Bhalaldev totally overshadowed by Baahubali. Also she mentioned while saving child of Baahubali that she is feeling guilty of something at the first scene of movie. So, %1$s, do you think Shivgami killed Baahubali?",
                    new Choice("Yep, she's bad", 3),
                    new Choice("Nope, she's good", 4));

            mPages[2] = new Page(
                    R.drawable.page2,
                    "Bhalaldev became a true monster in quest of becoming  king. Also Baahubali and Bhalaldev falls for same girl. Devsena chooses Baahubali. Bhalaldev capture Devsena as she is carrying Baahubali's son and asked Shivgami to killed Baahubali. So, %1$s, do you think Shivgami will come up with some alternative solution?",
                    new Choice("Nope, she might kill", 4),
                    new Choice("She is wise, hence, she will save", 6));

            mPages[3] = new Page(
                    R.drawable.page3,
                    "It was acknowledged that a neighbouring kingdom in forming allies with other kingdoms to take down Mahismathi. Kattappa madly searches for the King and found a lady who played an skillful attack at him. Kattappa knows her before. So %1$s, do you think Kattappa had an secret crush with Devsena?",
                    new Choice("Indeed Kattappa had crush on her.", 4),
                    new Choice("No, Kattappa can't have affair.", 5));

            mPages[4] = new Page(
                    R.drawable.page4,
                    "So in the pressure from Bhalaldev, Shivgami discussed with Baahubali and Kattappa and instructed Kattappa to stage a fake killing on Baahubali so that Baahubali's son's stay safe from Bhalaldev's rage. So %1$s, do you think Kattappa had killed Baahubali instead of staging the act?",
                    new Choice("Indeed, I knew it earlier.", 5),
                    new Choice("Kattappa can't kill. I love him", 6));

            mPages[5] = new Page(
                    R.drawable.page5,
                    "But Bhalaldev mentioned he killed Baahubali in his own hands. How's that? So, %1$s , we think that after Kattappa stabbed Baahubali but somehow Baahubali survived and Bhalaldev executed the wounded Baahubali and chained Devsena.");

            mPages[6] = new Page(
                    R.drawable.page6,
                    "Shivgami discuss the plotting with the Baahubali and they asked Kattappa to do a fake killing. Baahubali left the kingdom in order to keep her mother’s words and to keep his son safe from Bhalaldev but later Bhalaldev got to know about it from %1$s and in the road he found Baahubali and killed him");
        }
public Page getPage(int pageNumber) {
        return mPages[pageNumber];
    }
}

