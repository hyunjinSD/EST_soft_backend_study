package chap11.set;

public class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
                return this.name.equals(member.name) && this.age == member.age;
        } else {
            return super.equals(obj);
        }
    }
}

