package com.bpmpk.jhon.projek;

public class BankListening {

    final int[] quistion = {
            R.raw.quiz1,
            R.raw.quiz2,
            R.raw.quiz3,
            R.raw.quiz4,
            R.raw.quiz5,
            R.raw.quiz6,
            R.raw.quiz7,
            R.raw.quiz8,
            R.raw.quiz9,
            R.raw.quiz10,
    };

    private String imagequiz [] = {
            "hanz_mary1",
            "ivony_maria_sandy2",
            "tony_tia3",
            "randy_rany4",
            "ron_ria5",
            "kristin_zaky6",
            "family7",
            "family8",
            "ladies1",
            "ladies1",

    };

    private String textquiz [] = {
            "Short Dialogue",
            "Short Dialogue",
            "Short Dialogue",
            "Question & Answere",
            "Question & Answere",
            "Question & Answere",
            "Picture",
            "Picture",
            "Monologue",
            "Monologue",
    };

    private String selectAnswere[][] = {
            {"He will contact her.","He calls at her house.","He writes her address.",
                    "He is going to introduce her.","He will express his gratitude her."},
            {"Partners.","Colleagues.","Teammates.","Schoolmates.","Neighborhood."},
            {"Tony is able to play roller skates.","Tony is offers Tia to practice roller skates.","Tony and Tia are not skillful at roller skates.",
                    "Tony and Tia are interested in playing roller skates.","Tia is dare to accept Tony’s challenge to play roller skates."},
            {"I’m a reporter. I always review the films.","I’m a columnist. I must manage the proposes articles.","I’m a broadcaster. I always retell the listeners’ love stories.",
                    "I’m a jurnalist. I usually persuade the readers to read the articles.","I’m a press officer. I have to arrage the spectators on a certain TV program."},
            {"She is a wildlife chaser.","I thinks she gets retired.","I supposed that she is on duty.","I don’t know exactly. She is a journalist.",
                    "I’m not sure. I think she is working on a finance field"},
            {"Yes, we love it very much.","Yes, we don’t like living there.","No, we are fond of  living there.","No, weare contented to stay there.",
                    "Yes, we are unpleased to."},
            {"Jim is Harry’s aunt.","Jim is Harry’s nephew.","Harry is Jim’s niece.","Harry is Jim’s nephew.","Harry is Jim’s uncle."},
            {"2 brothers and 2 sisters.","3 brothers and 3 sisters.","2 brother and 3 sisters.","3 brothers and 2 sisters.","2 brothers and 4 sisters."},
            {"The writer’s sisters.","The writer’s parents.","The writer’s brothers.","The writer’s big family.","The place where the writer lives."},
            {"They live in the same place.","The writer’s mom lives in the writer’s home.","The witer’s lives far away from his/her mom’s home.",
                    "The writer’s mom likes living together with the writer.","The writer’s home is near from his mom’s."},
    };

    private String goodanswere[] = {
            "He will contact her.",
            "Neighborhood.",
            "Tony and Tia are not skillful at roller skates.",
            "I’m a broadcaster. I always retell the listeners’ love stories.",
            "I’m not sure. I think she is working on a finance field",
            "Yes, we love it very much.",
            "Harry is Jim’s nephew.",
            "2 brother and 3 sisters.",
            "The writer’s big family.",
            "The witer’s lives far away from his/her mom’s home.",
    };

    public int getQuistion(int x){
        int quis = quistion [x];
        return quis;
    }

    public String getAnswere1(int x){
        String answere1 = selectAnswere [x][0];
        return answere1;
    }

    public String getAnswere2(int x){
        String answere2 = selectAnswere [x][1];
        return answere2;
    }

    public String getAnswere3(int x){
        String answere3 = selectAnswere [x][2];
        return answere3;
    }
    public String getAnswere4(int x) {
        String answere4 = selectAnswere[x][3];
        return answere4;
    }
    public String getAnswere5(int x) {
        String answere5 = selectAnswere[x][4];
        return answere5;
    }

    public String getGoodAnswere(int x) {
        String tAnswere = goodanswere[x];
        return tAnswere;
    }

    public String getImageQuiz (int x) {
        String image = imagequiz[x];
        return image;
    }

    public String getTextQuiz (int x) {
        String text = textquiz[x];
        return  text;
    }
}

