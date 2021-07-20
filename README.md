# 문자열 사칙 연산 계산기 구현

### 기능 목록

- [X] 입력 문자열을 공백으로 구분한다. StringExpression
    - [X] 입력 문자열에 숫자와 사칙연산 연산자를 제외한 값이 있을 경우 에러 처리
- [X] 사칙 연산을 계산한다. Operation
- [X] 사칙 연산 계산 결과를 출력한다. Calculator

### 기능 요구 사항

- 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
- 입력 문자열의 숫자와 사칙 연산 사이에는 반드시 빈 공백 문자열이 있다고 가정한다.
- 나눗셈의 경우 결과 값을 정수로 떨어지는 값으로 한정한다.
- 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
- 예를 들어 2 + 3 * 4 / 2와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.

# 자동차 경주 게임

### 기능 목록
- [X] 자동차 대수를 입력 받는다. Cars
    - [X] 자동차 대수는 양수만 입력 할 수 있다.
    - [X] 입력 값만큼 Car 객체를 생성 할 수 있다.
- [X] 시도할 횟수를 입력 받는다. Count
    - [X] 시도할 횟수는 양수만 입력 할 수 있다.
- [X] 자동차 객체 생성 Car
  - [X] 자동차 객체는 입력값에 따라 전진 여부를 판단 할 수 있다.
  - [X] 자동차 객체가 전진 가능 할 경우 position 값을 증가 시킨다.
- [ ] 자동차 경주 게임을 진행한다. RacingGame
- [ ] 자동차 경주 게임 결과를 출력한다. ResultView

### 기능 요구 사항
- 초간단 자동차 경주 게임을 구현한다.
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
-자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

## 진행 방법

* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)
