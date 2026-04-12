#Today I Learned

###1. 오늘 배운 내용
오늘은 객체 지향의 기본 개념인 ‘객체로 표현하기, 책임 분리, 유효성 검증 위치, 접근 제어자’를 단계별로 학습했다. Lion클래스를 만들고, 아기사자 한명의 정보를 여러 변수가 아닌 하나의 객체로 표현하는 방식을 배웠다. 이름, 전공, 기수를 각각 따로 관리하는게 아니라 Lion이라는 단위로 묶어서 다루는 것이다. 
유효성 검증을 main에 두는 방식에서 Lion 클래스 안으로 옮기는 과정(step1 → step2)을 거쳤고, 접근 제어자(public / default / private)에 따라 외부에서 필드에 접근할 수 있는 범위가 어떻게 달라지는지 step3에서 직접 확인했다. 그리고 name.equals(””)만으로는 공백 입력을 막지 못한다는 것도 trim().isEmpty()를 통해 보완했다.

###2. 핵심 정리(내 언어로)
1) 객체가 스스로 기능
전에는 main이 "이름이 비어있나? 전공은 맞나?" 같은 걸 직접 따졌는데, 그건 사실 Lion이 알아야 할 자기 정보다. Lion 스스로 validate()로 "나 유효한 상태야 / 아니야"를 판단하게 하면, main은 신경 쓸 게 줄어든다. main의 역할은 ‘입력받기 → 객체 만들기 → 객체에게 맡기기 → 결과로 흐름 제어 → 출력 지시’까지만 하면 충분하다. 더 이상 조건을 직접 볼 필요가 없다.
2) 객체를 먼저 만들어야 필드에 접근할 수 있음
Lion이라는 설계도만 있다고 실제 사자가 생기는 게 아닌 것처럼, Lion lion = new Lion(); 으로 실체를 만들어야 비로소 아기사자의 name, major 등에 접근 가능하다.
3) 접근 제어자는 울타리
- private : 같은 클래스 안에서만 접근 가능
- default : 같은 패키지까지는 가능
- public : 어디서든 가능
4) 부가요소
다른 패키지의 클래스를 쓰려면 import가 필요하다.
lion.printInfo(); 는 객체(lion)가 가지고 있는 현재 상태를 콘솔에 출력하는 메서드 호출이다.

###3. 결과 이미지(스크린샷)
1) (Step 1) main에서 유효성 검증하는 경우
- 올바른 입력값을 입력한 경우
<img width="1280" height="832" alt="스크린샷 2026-04-12 오후 8 11 39" src="https://github.com/user-attachments/assets/cb1fdf0e-22ec-47dd-8aef-90023ac8822a" />


- 잘못된 입력값을 입력한 경우
<img width="1280" height="832" alt="스크린샷 2026-04-12 오후 8 15 55" src="https://github.com/user-attachments/assets/8c7697ea-715f-49b2-a312-e06120eaaa50" />


2) (Step2) 객체 내부에서 유효성 검증하는 경우
- 올바른 입력값을 입력한 경우
<img width="1280" height="832" alt="스크린샷 2026-04-12 오후 8 17 37" src="https://github.com/user-attachments/assets/245c167f-af2e-4f9e-b8e1-601e58ddfaa7" />


- 잘못된 입력값을 입력한 경우
<img width="1280" height="832" alt="스크린샷 2026-04-12 오후 8 18 22" src="https://github.com/user-attachments/assets/cd90cf70-1ec0-45b8-8a7c-0be119df96a4" />


3) (Step3) 접근 제어자에 따른 필드 접근 차이 확인
- public 필드에 접근한 경우(name)
<img width="1280" height="832" alt="스크린샷 2026-04-12 오후 8 19 34" src="https://github.com/user-attachments/assets/29d34893-ac8d-4217-9403-43a74a5b08ca" />


- default 필드에 접근을 시도한 경우(major)
<img width="1280" height="832" alt="스크린샷 2026-04-12 오후 8 20 33" src="https://github.com/user-attachments/assets/835a7cc5-b833-49b4-acc0-2b3d6aa687ff" />


- private 필드에 접근을 시도한 경우(number)
<img width="1280" height="832" alt="스크린샷 2026-04-12 오후 8 21 09" src="https://github.com/user-attachments/assets/bdc268a7-1776-4238-a5c6-8d2ff2a263d5" />


###4. 느낀 점
클래스 안에서 아무 코드나 실행하려다가 오류가 났었다. 이를 통해 반드시 메서드 안에서 실행해야 한다는 것을 알았다.
trim().isEmpty()와 같은 작은 수정도, 그냥 외우는 게 아니라 "공백도 빈칸 아니었어?"라는 의문에서 시작해서 직접 고쳐보니 기억에 더 남을 것 같다. 
return;(메서드에서 그냥 종료)이랑 return isValid;(값을 반환하는 것)도 비슷하게 보이지만 기능이 완전히 다르다는 것을 알았다. 
아직 전체적으로 개념이 많이 부족한 상태지만 하나하나씩 누적해가면 코딩 지식이 언젠간 쌓이겠지…?!!
