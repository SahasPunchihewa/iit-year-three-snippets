package week1.tute;

public class Director
{
    private String name;
    private String surname;
    private int numDirectedMovies;
    private Date dob;

    public Director(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getNumDirectedMovies()
    {
        return numDirectedMovies;
    }

    public void setNumDirectedMovies(int numDirectedMovies)
    {
        this.numDirectedMovies = numDirectedMovies;
    }

    public Date getDob()
    {
        return dob;
    }

    public void setDob(Date dob)
    {
        this.dob = dob;
    }

    @Override
    public String toString()
    {
        return "Director{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numDirectedMovies=" + numDirectedMovies +
                ", dob=" + dob +
                '}';
    }
}
