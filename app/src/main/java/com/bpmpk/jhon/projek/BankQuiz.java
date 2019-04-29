package com.bpmpk.jhon.projek;

public class BankQuiz {

    final int[] quistion_quiz = {
            R.raw.quiz6,
            R.raw.quiz10,
            R.raw.quiz8,
            R.raw.quiz3,
            R.raw.quiz9,
            R.raw.quiz1,
            R.raw.quiz5,
            R.raw.quiz7,
            R.raw.quiz2,
            R.raw.quiz4,
    };

    private String image_quiz [] = {
            "kristin_zaky6",
            "ladies1",
            "family8",
            "tony_tia3",
            "ladies1",
            "hanz_mary1",
            "ron_ria5",
            "family7",
            "ivony_maria_sandy2",
            "randy_rany4",

    };

    private String select_Answere[][] = {
            {"Yes, we love it very much.","Yes, we don’t like living there.","No, we are fond of  living there.","No, weare contented to stay there.",
                    "Yes, we are unpleased to."},
            {"They live in the same place.","The writer’s mom lives in the writer’s home.","The witer’s lives far away from his/her mom’s home.",
                    "The writer’s mom likes living together with the writer.","The writer’s home is near from his mom’s."},
            {"2 brothers and 2 sisters.","3 brothers and 3 sisters.","2 brother and 3 sisters.","3 brothers and 2 sisters.","2 brothers and 4 sisters."},
            {"Tony is able to play roller skates.","Tony is offers Tia to practice roller skates.","Tony and Tia are not skillful at roller skates.",
                    "Tony and Tia are interested in playing roller skates.","Tia is dare to accept Tony’s challenge to play roller skates."},
            {"The writer’s sisters.","The writer’s parents.","The writer’s brothers.","The writer’s big family.","The place where the writer lives."},
            {"He will contact her.","He calls at her house.","He writes her address.",
                    "He is going to introduce her.","He will express his gratitude her."},
            {"She is a wildlife chaser.","I thinks she gets retired.","I supposed that she is on duty.","I don’t know exactly. She is a journalist.",
                    "I’m not sure. I think she is working on a finance field"},
            {"Jim is Harry’s aunt.","Jim is Harry’s nephew.","Harry is Jim’s niece.","Harry is Jim’s nephew.","Harry is Jim’s uncle."},
            {"Partners.","Colleagues.","Teammates.","Schoolmates.","Neighborhood."},
            {"I’m a reporter. I always review the films.","I’m a columnist. I must manage the proposes articles.","I’m a broadcaster. I always retell the listeners’ love stories.",
                    "I’m a jurnalist. I usually persuade the readers to read the articles.","I’m a press officer. I have to arrage the spectators on a certain TV program."},
    };

    private String good_answereQuiz [] = {
            "Yes, we love it very much.",
            "The witer’s lives far away from his/her mom’s home.",
            "2 brother and 3 sisters.",
            "Tony and Tia are not skillful at roller skates.",
            "The writer’s big family.",
            "He will contact her.",
            "I’m not sure. I think she is working on a finance field",
            "Harry is Jim’s nephew.",
            "Neighborhood.",
            "I’m a broadcaster. I always retell the listeners’ love stories.",
    };

    public int get_Quistion(int x){
        int quis = quistion_quiz [x];
        return quis;
    }

    public String get_Answere1(int x){
        String answereA = select_Answere [x][0];
        return answereA;
    }

    public String get_Answere2(int x){
        String answereB = select_Answere [x][1];
        return answereB;
    }

    public String get_Answere3(int x){
        String answereC = select_Answere [x][2];
        return answereC;
    }
    public String get_Answere4(int x) {
        String answereD = select_Answere[x][3];
        return answereD;
    }
    public String get_Answere5(int x) {
        String answereE = select_Answere[x][4];
        return answereE;
    }

    public String get_GoodAnswere(int x) {
        String qAnswere = good_answereQuiz[x];
        return qAnswere;
    }

    public String get_ImageQuiz (int x) {
        String image = image_quiz[x];
        return image;
    }
}

