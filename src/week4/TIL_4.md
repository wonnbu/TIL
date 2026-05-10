## 1. 오늘 배운 내용

이번 과제는 List와 Map을 활용하 멤버 관리 프로그램을 설계하는 저번주 과제의 연장선이었다. 먼저 배열과 List의 차이를 학습했다. 배열은 처음 생성할 때 크기가 고정되지만, List는 데이터를 추가할 때마다 크기가 자동으로 늘어나기 때문에 사용자 입력 수가 정해져 있지 않은 프로그램에 더 적합하다. 

List에서는 add(), get(), size(), isEmpty() 메서드를 사용했다. add()는 데이터를 추가하고, get()은 특정 위치의 데이터를 가져오며, size()는 저장된 개수를 확인하고, isEmpty()는 비어 있는지 검사한다. 또한 for-each문을 사용해 List 안의 멤버들을 반복 출력했다.

Map은 Map<키, 값>의 형태이며, 키는 중복될 수 없고 값은 중복 가능하다. 이번 과제에서는 Map<String, List<Role>> 구조를 사용해 파트명(백엔드, 프론트엔드 등)을 key, 해당 파트 멤버 목록을 value 로 저장했다. put()은 저장, get()은 꺼내기, containsKey()는 존재 여부 확인, keySet()은 모든 key 목록 조회에 사용했다.

또한 제네릭(Generic)의 의미도 이해했다. <>안에 타입을 지정하면 그 특정 타입 객체만 저장하겠다는 뜻이며, Lion과 Staff를 함께 저장할 수 있는 이유는 둘 다 Role을 상속받기 때문이다. 이를 통해 3주차에 배운 다형성 구조를 연결해 활용했다.

## 2. 핵심정리 (나의 언어로)

출력할 때 member.getInfo()를 호출하면 객체가 Lion이면 Lion의 getInfo()가 실행되고, Staff면 Staff의 getInfo()가 실행된다. 이것이 다형성이다.

이번 과제에서 menu2(전체 조회)는 짧은 정보만 필요했고, menu3(검색)는 상세 정보가 필요했다. 기존 getInfo()만으로는 둘을 동시에 만족시키기 어려워서 getSummary() 메서드를 새로 만들어 역할을 분리했다.

또한 등록 시 이름 중복 검사를 위해 isDuplicate 변수를 사용했고, 검색 시 에는 found변수를 사용했다. boolean은 초기에 false를 반환한다고 설정하고 일치, 불일치를 확인했다.

## 3. 결과 이미지(스크린샷)
(Step1) 메뉴 화면 예시
<img width="1280" height="832" alt="스크린샷 2026-05-03 오후 4 00 17" src="https://github.com/user-attachments/assets/863a1ba4-aa00-4142-b896-31790c7d74c3" />
<img width="1280" height="832" alt="스크린샷 2026-05-03 오후 4 00 37" src="https://github.com/user-attachments/assets/babc40e0-ac22-4a05-ace0-78e9c5681835" />
<img width="1280" height="832" alt="스크린샷 2026-05-03 오후 4 00 40" src="https://github.com/user-attachments/assets/396cd09d-8f0b-4504-b2f4-6792cfd90f48" />
(Step2) 메뉴 화면 예시
<img width="1280" height="832" alt="스크린샷 2026-05-03 오후 4 18 32" src="https://github.com/user-attachments/assets/1901aeb0-4be2-488c-aa0b-0d377a1a8c36" />
<img width="1280" height="832" alt="스크린샷 2026-05-03 오후 4 28 06" src="https://github.com/user-attachments/assets/cbf6f642-77c8-43c6-8b9d-8e30374ab903" />

## 4. 느낀점

왜 step1과 2가 따로 있는지 처음에는 의아했다. 하지만 step를 하면서 package2에 새로 main을 변형하여 넣으니 굳이 이전 코딩을 엎지 않아도 실행시킬 수 있다는 것을 알게 됐다. 그리고 import항목이 많아지면 util.*로 자동 변환되는 것도 알게 됐다.

또한 3주차에 배운 상속과 다형성이 이번 주차 List와 Map 안에서 실제로 활용되는 것을 보며, 이전 내용이 따로 존재하는 것이 아니라 계속 연결된다는 점을 체감했다. 처음 접하는 문법들이 복잡하고 어려웠지만, 차차 이해하고 나니 데이터를 체계적으로 관리하는 강력한 도구라는 생각이 들었다.
