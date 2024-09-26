package Day4.Abstract;

abstract class features {

    abstract void acceralate();

    void breaks(){
        System.out.println("break");
    }
}

class vehile extends features {

    @Override
    void acceralate() {

    }
}
