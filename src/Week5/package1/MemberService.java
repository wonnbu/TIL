package Week5.package1;

import Week5.role.Role;

import java.util.List;

public class MemberService {
    private MemberRepository memberRepository = new MemberRepository();

    public boolean register(Role role) {
        if (memberRepository.existsByName(role.getName())) {
            return false;
        }
        memberRepository.save(role);
        return true;
    }

        public List<Role> findAll () {
            return memberRepository.findAll();
        }
        public Role findByName(String name){
        return memberRepository.findByName(name);
    }
}
