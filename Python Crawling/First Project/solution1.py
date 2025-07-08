from bs4 import BeautifulSoup

# HTML 파일 열기 및 내용 읽기
with open("website.html", encoding="utf-8") as file:
    contents = file.read()  # HTML 내용을 문자열로 저장

# HTML 문자열을 BeautifulSoup 객체로 파싱
soup = BeautifulSoup(contents, 'html.parser')  # 'html.parser'는 기본 내장 파서

# HTML을 DOM 구조로 정리해서 출력 (들여쓰기된 형태)
print(soup.prettify())

# ────────────────────────────────────────────────
# <title> 태그 정보 추출
# ────────────────────────────────────────────────

print(soup.title)         # <title> 태그 전체 출력
print(soup.title.name)    # 'title' → 태그 이름만 출력
print(soup.title.string)  # "Jacob's Personal Site" → 텍스트 내용 출력

# ────────────────────────────────────────────────
# <a> 태그 목록 추출 및 반복 출력
# ────────────────────────────────────────────────

all_anchor_tags = soup.find_all('a')         # 모든 <a> 태그를 리스트로 반환
print(all_anchor_tags)                       # 리스트 전체 출력
print(len(all_anchor_tags))                  # <a> 태그 개수 출력

# 각각의 <a> 태그에 대해 텍스트와 href 속성 추출
for tag in all_anchor_tags:
    print(tag.getText())     # <a> 안의 텍스트 (예: 'My GitHub')
    print(tag.get("href"))   # href 속성 값 (예: 'https://github.com/...')

# ────────────────────────────────────────────────
# 특정 속성을 가진 태그 찾기 (find)
# ────────────────────────────────────────────────

heading = soup.find(name='h1', id='name')       # id="name"인 <h1> 태그 찾기
print(heading)                                  # <h1 id="name">Jacob Ahn</h1>

class_h3 = soup.find(name="h3", class_="heading")  # class="heading"인 <h3> 태그 찾기
print(class_h3)                                     # 태그 전체 출력
print(class_h3.getText())                           # 텍스트만 출력 ("Projects and Teaching")

# ────────────────────────────────────────────────
# CSS 선택자 방식으로 요소 선택 (select_one, select)
# ────────────────────────────────────────────────

company_url = soup.select_one("p a")     # <p> 안의 첫 번째 <a> 태그 선택
print(company_url)

name = soup.select_one("#name")          # id="name"인 요소 선택
print(name)

heading_s = soup.select(".heading")      # class="heading"인 모든 요소 선택 (리스트 반환)
print(heading_s)

# ────────────────────────────────────────────────
# <input> 태그에서 정보 추출
# ────────────────────────────────────────────────

input_a = soup.find("input")                  # 첫 번째 <input> 태그 찾기
print(input_a)                                # 태그 전체 출력

print(input_a.get("maxlength"))               # maxlength 속성 값 추출 (예: "255")
