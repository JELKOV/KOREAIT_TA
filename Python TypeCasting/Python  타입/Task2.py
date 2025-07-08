# 1. TypeError가 발생하는 이유는?
# print(len(12345))  # 이유: ?

# 2. 다음 중 자료형을 확인하는 함수는 무엇인가요?
print(type("Hello"))  # 👉 결과: ?
print(type(123))      # 👉 결과: ?
print(type(True))     # 👉 결과: ?
print(type(3.14))     # 👉 결과: ?

# 3. 문자열 "123"과 "456"을 정수로 바꾼 뒤 더하면?
print(int("123") + int("456"))  # 👉 결과: ?

# 4. 사용자 입력을 받아 이름의 글자 수를 출력하려고 한다.
# 아래 코드의 빈칸을 채우세요.
# name_of_the_user = input("Enter your name: ")
# length = len(______)
# print("이름의 글자 수는 " + _________)

# 5. 숫자를 문자열로 바꿔 출력하려면 어떤 함수가 필요할까요?
print("My age: " + str(12))  # 👉 결과: ?

# 6. 아래 산술 연산의 결과는 각각 얼마인가요?
print(123 + 456)   # 👉 ?
print(7 - 3)       # 👉 ?
print(3 * 2)       # 👉 ?
print(5 / 3)       # 👉 ?
print(5 // 3)      # 👉 ?
print(2 ** 3)      # 👉 ?

# 7. 연산 우선순위를 고려하여 아래 식의 결과를 구해보세요.
print(3 * 3 + 3 / 3 - 3)  # 👉 결과: ?

# 8. BMI 계산
# 체중: 84kg, 키: 1.65m일 때 BMI는?
bmi = 84 / 1.65 ** 2
print(bmi)            # 👉 실수값: ?
print(int(bmi))       # 👉 정수로 변환: ?
print(round(bmi))     # 👉 반올림: ?
print(round(bmi, 2))  # 👉 소수점 둘째 자리까지 반올림: ?

# 9. 아래는 어떤 연산자인가요?
score = 0
score += 2
print(score)  # 👉 출력: ?

score /= 2
print(score)  # 👉 출력: ?

# 10. f-string을 사용한 출력
score = 87
print(f"Your score is = {score}")  # 👉 출력: ?
