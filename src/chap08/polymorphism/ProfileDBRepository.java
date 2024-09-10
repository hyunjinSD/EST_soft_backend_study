package chap08.polymorphism;

public class ProfileDBRepository implements ProfileRepository{

    @Override
    public void save() {
        System.out.println("Profile을 DB에 저장");
    }
}
