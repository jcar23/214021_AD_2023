import java.util.Objects;

public class Course {
    public int code;
    public String name;
    public int ects;
    public int ano;

    public Course(){
        this.code = 0;
        this.name = "";
        this.ects = 0;
        this.ano = 0;
    }
    public Course(int code, String name, int ects, int ano) {
        this.code = code;
        this.name = name;
        this.ects = ects;
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;
        return code == course.code && ects == course.ects && ano == course.ano && name.equals(course.name);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Course{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", ects=" + ects +
                ", ano=" + ano +
                '}';
    }
}
