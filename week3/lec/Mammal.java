package week3.lec;

abstract class Mammal implements Animal
{
    @Override
    public abstract void sound();

    @Override
    public void feed()
    {
        System.out.println("milk");
    }
}
