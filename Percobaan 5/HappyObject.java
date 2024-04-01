public class HappyObject extends MoodyObject{

    public HappyObject() {
    }
    protected String getMood(){
        return "happy";
    }
    public void laugh(){
        System.out.println("Hahaha");
    }
}
