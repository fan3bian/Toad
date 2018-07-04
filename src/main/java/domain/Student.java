package domain;

import java.util.Date;

/**
 * Created by zhangshuyi1 on 2018/2/15.
 */
public class Student {
    private Long id ;
    private String name;
    private Integer age;
    private Date date;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(18);
        student.setId(1L);
        student.setName("zhangshuyi");
        student.setDate(new Date());
    }
    
}
