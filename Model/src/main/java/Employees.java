import java.util.Objects;

public class Employees {
    private int january, february, march, april;
    public Employees(){}

    public int getJanuary() {
        return january;
    }

    public int getFebruary() {
        return february;
    }

    public int getMarch() {
        return march;
    }

    public int getApril() {
        return april;
    }

    public void setJanuary(int january) {
        this.january = january;
    }

    public void setFebruary(int february) {
        this.february = february;
    }

    public void setMarch(int march) {
        this.march = march;
    }

    public void setApril(int april) {
        this.april = april;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return january == employees.january &&
                february == employees.february &&
                march == employees.march &&
                april == employees.april;
    }

    @Override
    public int hashCode() {
        return Objects.hash(january, february, march, april);
    }
}
