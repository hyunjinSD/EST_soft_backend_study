package chap08.polymorphism;

public class ProfileMemoryRepository implements ProfileRepository {

    @Override
    public void save() {
        System.out.println("Profile을 Memory에 저장");
    }
}
