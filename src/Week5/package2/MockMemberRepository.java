package Week5.package2;

import Week5.role.Lion;
import Week5.role.Role;
import Week5.role.Staff;

import java.util.ArrayList;
import java.util.List;

public class MockMemberRepository implements MemberRepository{
    private List<Role> members = new ArrayList<>();
    public MockMemberRepository(){
        members.add(new Lion("리한나", "컴퓨터공학과", 14, "백엔드", 202412398));
        members.add(new Staff("저스틴비버", "경제학과", 11, "프론트", "대표"));
    }

    @Override
    public void save(Role role) {
        //Mock 저장소는 실제 저장안함
    }
    @Override
    public List<Role> findAll(){
        return members;
    }
    @Override
    public Role findByName(String name){
        for (Role member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
    @Override
    public boolean existsByName(String name){
        for (Role member : members) {
            if (member.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
