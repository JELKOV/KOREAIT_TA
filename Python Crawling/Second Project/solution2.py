from bs4 import BeautifulSoup  # HTML 파싱 도구
import requests  # 웹 요청 라이브러리

# 1. Hacker News 사이트에서 HTML 데이터 가져오기
response = requests.get("https://news.ycombinator.com/news")  # 해당 URL로 GET 요청 전송
response.raise_for_status()  # 요청에 실패했을 경우 예외 발생 → 코드 중단됨
soup = BeautifulSoup(response.text, "html.parser")  # 받은 HTML 텍스트를 BeautifulSoup 객체로 파싱

# ※ soup 객체는 이제 웹사이트의 HTML 구조 전체를 담고 있음
# print(soup.prettify())  # HTML 예쁘게 출력 (디버깅용)


# 2. 웹사이트의 <title> 태그 텍스트 출력
print("Website Title:")
print(soup.title.get_text())  # 예: "Hacker News" → <title> 태그의 순수 텍스트 추출


# 3. 첫 번째 기사 정보 가져오기
print("\nFirst Article:")
first_title = soup.select_one("span.titleline > a")  # 기사 제목은 <span class="titleline"><a>로 감싸져 있음 → 첫 번째 <a> 선택
print("Title:", first_title.get_text())  # 기사 제목 텍스트 출력
article_link = first_title.get("href")  # <a> 태그의 href 속성 값(=링크 주소) 추출
print("Link:", article_link)  # 기사 링크 출력


# 4. 첫 번째 기사 투표 수 가져오기
article_upvotes = soup.find('span', class_="score")  # class="score"인 첫 번째 <span> 태그 선택
# 예시: <span class="score" id="score_12345678">95 points</span>

# 5. 모든 기사들의 투표 수 가져오기
print("\nAll Article Upvotes:")
article_upvotes_all = soup.find_all('span', class_="score")  # class="score"인 모든 <span> 태그를 리스트로 가져옴
# 리스트 컴프리헨션을 이용해 숫자만 추출 → '95 points' → '95' → int(95)
upvotes = [int(article.get_text().split()[0]) for article in article_upvotes_all]
print(upvotes)  # 예: [95, 88, 72, 51, 40, ...]


# 6. 모든 기사 제목과 링크 가져오기
print("\nAll Article Titles and Links:")
titles_list = soup.select("span.titleline > a")  # <span class="titleline"><a> 태그들을 모두 선택
titles_texts = [title.get_text() for title in titles_list]  # 각 <a> 태그의 텍스트만 추출 → 제목 리스트
print(titles_texts)  # 예: ['Apple Releases...', 'ChatGPT 5...', ...]
links = [title.get("href") for title in titles_list]  # 각 <a> 태그의 href 속성만 추출 → 링크 리스트
print(links)  # 예: ['https://...', 'https://...', ...]

# 7. 가장 높은 투표수를 가진 기사 찾기
max_upvote = max(upvotes)  # 투표 수 중 가장 높은 값
max_index = upvotes.index(max_upvote)  # 가장 높은 투표 수의 인덱스 → 제목/링크 리스트와 같은 위치

# 가장 높은 투표 수, 제목, 링크 출력
print("\nMost Upvoted Article:")
print("Upvotes:", upvotes[max_index])
print("Title:", titles_texts[max_index])
print("Link:", links[max_index])