# Tip Calculator (팁 계산기)

# Welcome 메시지 출력
print("Welcome to the tip calculator!")

# 사용자로부터 입력값 받기

# 총 금액 입력
bill = float(input("지불금액을 입력해주세요 $"))
# 팁 비율 입력
tip = int(input("원하는 팁 비율을 입력해주세요? 10, 12, or 15? "))
# 나눌 사람 수 입력
people = int(input("몇명으로 나눌 예정인가요? "))

# 팁 비율 계산
tip_multiplier = 1 + (tip / 100)  # 팁 비율을 반영한 곱셈 인자
total_bill = bill * tip_multiplier  # 총 금액에 팁 적용

# 각 사람당 지불할 금액 계산
amount_per_person = total_bill / people

# 소수점 둘째 자리까지 반올림
final_amount = round(amount_per_person, 2)
print(f"Each person should pay: ${final_amount}")

# 소수점 둘째 자리까지 강제로 포맷팅 (정확한 소수점 표현)
formatted_amount = "{:.2f}".format(amount_per_person)
print(f"Each person should pay: ${formatted_amount}")