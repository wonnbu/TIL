package Week5.package1;

import Week5.role.Role;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private List<Role> members = new ArrayList<>();

    public void save(Role role){//저장
        members.add(role);
    }
    public List<Role> findAll(){//전체조회
        return members;
    }
    public Role findByName(String name){//이름검색
        for(Role member : members){
            if(member.getName().equals(name)){
                return member;
            }
        }
        return null;
    }
    public boolean existsByName(String name){//이름중복검사
        for(Role member : members){
            if(member.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
