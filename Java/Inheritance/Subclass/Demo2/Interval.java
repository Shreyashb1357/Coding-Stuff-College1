public class Interval {
    private int min;
    private int sec;

    public Interval(int m, int s)
    {
        min = m+s/60;
        sec = s % 60;
    }

    public int minutes() 
    {
        return min;
    }

    public int second() 
    {
        return sec;
    }

    public String toString()
    {
        if (sec < 10)
            return min + ":0" + sec;
        return min + ":" + sec;
    }

    public int hashCode()
    {
        return min + sec;
    }

    public boolean equals(Interval other)
    {
        if (other instanceof Interval)
        {
            Interval t = (Interval)other; //explicit cast
            return this.min == t.min && this.sec == t.sec;
        }
        return false;
    }
    
    

}
