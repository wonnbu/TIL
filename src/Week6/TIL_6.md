## 1. 오늘 배운 내용

- Spring Container(ApplicationContext)가 Bean을 생성하고 관리하는 역할을 한다는 것을 이해했다.
- Bean은 “Spring이 관리하는 객체”라는 개념을 배웠다.
- @Configuration+@Bean을 사용하는 수동 주입과 를 @Service랑 @Repository만 사용하는 자동 주입의 차이를 배웠다.
- 생성자 주입 방식과 @Autowired의 역할을 이해했다.
    
    + 생성자가 1개일 때는 @Autowired를 생략해도 Spring이 자동 주입을 수행한다는 것을 확인했다.
    
- @RestController와 @GetMapping(”/hello”)을 사용해 웹 요청을 처리하는 첫 REST API를 만들어보았다. → /hello요청 시 문자열을 브라우저에 반환하는 API를 구현했다.

## 2. 핵심정리 (나의 언어로)

5주차까지는 Main에서 직접 new로 객체를 만들고 연결 필요. 하지만 Spring Boot에서는 객체 생성 자체보다 “누가 객체를 관리하느냐”가 핵심.

Appconfig 클래스에서 MemoryMemberRepository()와 MemberService(memberRepository())의 차이 헷갈렸었음 → service(repository의존하니까)가 필요한 객체들을 생성자 괄호에 넣는것

수동 주입에서는 Appconfig에서 @Bean으로 객체를 직접 등록. 여기서는 개발자가 객체를 만들지만, Spring 컨테이너가 그 객체를 보관하고 관리함.

반면 자동 주입에서는 @Service랑 @Repository같은 어노테이션만 붙이면 Spring이 알아서 객체를 생성하고 연결함.

- @Repository : 스프링아, 이 클래스는 저장소 역할이니까 Bean으로 등록해줘.
- @Service : 스프링아, 이 클래스는 서비스 역할이니까 Bean으로 등록해줘.
- @Autowired : 스프링아, MemberService 만들 때 MemberRepository 타입 Bean을 찾아서 넣어줘.
- @RestController : "이 클래스는 웹 요청 처리 담당”
- @GetMapping(”/hello”) : 브라우저에서 /hello 요청 오면 아래 메서드 실행(/는 경로→브라우저 URL이니까)

## 3. 결과 이미지(스크린샷)
<img width="1280" height="832" alt="스크린샷 2026-05-14 오후 4 57 25" src="https://github.com/user-attachments/assets/97b4cf0a-f6df-4726-90d9-1b4afcd19b3a" />


## 4. 느낀점

이번 주차는 어려운 코딩보다는 Java와 Spring의 사고방식 차이를 이해하는 과제였던 것 같다. 처음에는 @Bean, @Autowired, ApplicationContext 같은 개념들이 하나도 와닿지 않아서 막막했었는데, 점차 단계별로 어노테이션을 이해하면서 흐름이 정리되었다.

또, 어노테이션이 정말 많다는 것을 알게됐다. 점점 코드가 단순해지긴 하지만 흐름을 제대로 파악해야 여러 효율적인 기능들을 쓸 수 있겠다고 느꼈다. API를 구현하면서 이제 프로그램이 콘솔 안에서만 동작하는 것이 아니라, 브라우저 요청과 연결되는 웹 애플리케이션 형태로 확장되기 시작했다는 점이 흥미로웠다.아직은 단순 문자열 반환이었지만 앞으로 더 큰 서비스를 만들 수 있다고 생각하니 재밌을 것 같다.
