public class Human_Being {
    /*
    Those are the attributes;
     */
    private int sleep;
    private int eat;
    private String talk;
    private String complain;

    /*
        Those are the constructor
     */

    public Human_Being(){
        this.sleep = 0;
        this.eat = 0;
        this.talk = "";
        this.complain="";
    }

    public Human_Being(int sleep,int eat, String talk, String complain){
        this.sleep = sleep;
        this.eat = eat;
        this.talk = talk;
        this.complain = complain;
    }

    public int getEat() {
        return eat;
    }

    public int getSleep() {
        return sleep;
    }

    public String getComplain() {
        return complain;
    }

    public String getTalk() {
        return talk;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }

    public void setEat(int eat) {
        this.eat = eat;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public void setTalk(String talk) {
        this.talk = talk;
    }

    @Override

    public String toString (){
        return getClass().getSimpleName() + " eats " + eat + " meals, sleeps " + sleep + " hours, talks " + talk + ", and complain " + complain;
    }
}
