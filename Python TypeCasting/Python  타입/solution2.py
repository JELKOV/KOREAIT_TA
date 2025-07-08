# Type Error 예시
# len(12345)  # TypeError 발생: 숫자는 길이를 구할 수 없음
# 문자열, 리스트, 튜플, 딕셔너리, 세트 등 컬렉션에만 len() 사용 가능

# Type Checking (자료형 확인)
print(type("Hello"))   # <class 'str'> → 문자열
print(type(123))       # <class 'int'> → 정수
print(type(True))      # <class 'bool'> → 불리언
print(type(1.2313))    # <class 'float'> → 실수

# Type Conversion (자료형 변환)
print(int("123") + int("456"))  # 579 → 문자열을 정수로 변환 후 덧셈

# 사용자 입력 및 문자열 길이 계산
name_of_the_user = input("Enter your name: ")       # 예: "Jacob"
length_of_the_name = len(name_of_the_user)          # 입력된 문자열 길이 계산
print("Number of letters in your name: " + str(length_of_the_name))
# 예: 입력값이 "Jacob"이면 출력 → Number of letters in your name: 5

# 숫자와 문자열 변환 예시
print("My age: " + str(12))  # "My age: 12" → 정수를 문자열로 변환 후 연결

# 산술 연산 예시
print(123 + 456)  # 579 → 정수 덧셈
print(7 - 3)      # 4   → 정수 뺄셈
print(3 * 2)      # 6   → 정수 곱셈
print(5 / 3)      # 1.666... → 실수 나눗셈
print(5 // 3)     # 1   → 정수 몫 연산
print(2 ** 3)     # 8   → 거듭제곱 (2의 3승)

# 연산 우선순위: 괄호 > 지수 > 곱셈/나눗셈 > 덧셈/뺄셈
print(3 * 3 + 3 / 3 - 3)  # 7.0 → (9 + 1 - 3)

# BMI (체질량지수) 계산 예시
bmi = 84 / 1.65 ** 2           # 30.865... → 실수 연산
print(bmi)                     # 30.865800865800867
print(int(bmi))                # 30 → 정수로 변환
print(round(bmi))              # 31 → 반올림
print(round(bmi, 2))           # 30.87 → 소수점 둘째 자리 반올림

# Assignment Operators (대입 연산자)
score = 0
score += 2        # score = score + 2 → 2
print(score)      # 2
score /= 2        # score = score / 2 → 1.0
print(score)      # 1.0

# f-Strings (문자열 포맷)
print(f"Your score is = {score}")  # Your score is = 1.0
