package chap08.polymorphism;

public class ProfileService {
    ProfileRepository repository;

    void saveProfile() {
        // 만약 다른 저장소가 추가된다면 객체 생성자만 바꿔주면 됨
        repository = new ProfileDBRepository();
        repository.save();
    }

    void saveProfile(ProfileRepository repository) {
        repository.save(); // 다형성 DB도 Memory도 가지고있음
        // 이렇게도 가능
    }
}
