package Day4.Interface;

 interface  remote {
    void change();
    void volume();

    static  void channel(){
        System.out.println("channel");
    }
}
  interface tv extends remote{

    }

//class implements multiple interface
class smartTv implements remote,tv{


    public void change() {

    }


    public void volume() {

    }
}