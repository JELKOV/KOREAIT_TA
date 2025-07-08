from bs4 import BeautifulSoup
import requests

# 1. Hacker News 웹사이트에서 HTML 가져오기
# - requests 모듈을 이용해 뉴스 페이지에 GET 요청을 보내고
# - 에러가 있으면 예외를 발생시키세요
# - 응답된 HTML을 BeautifulSoup으로 파싱하세요


# 2. 웹사이트의 <title> 태그 안 텍스트를 출력해보세요
# 예: Website Title: Hacker News


# 3. 첫 번째 기사 제목과 링크를 추출해보세요
# - select_one()을 사용해 span.titleline > a 선택
# - 기사 제목 텍스트와 링크(href)를 출력


# 4. 첫 번째 기사에 대한 upvote(투표 수)를 가져오세요
# - find()를 사용하여 class="score"인 첫 span 태그를 선택하세요
# - get_text()를 활용해 투표 수를 문자열로 출력


# 5. 모든 기사들의 투표 수를 리스트로 추출하세요
# - find_all()로 모든 class="score"인 span 태그를 선택
# - 리스트 컴프리헨션으로 숫자 부분만 정수형으로 추출
# 예: [114, 88, 55, ...]


# 6. 모든 기사 제목과 링크를 추출하세요
# - select("span.titleline > a")를 사용해 모든 제목을 선택
# - 리스트 컴프리헨션으로 텍스트와 링크를 각각 추출
# 예: ['OpenAI launches GPT-5', ...], ['https://...', ...]


# 7. 가장 높은 투표수를 받은 기사를 찾고 다음을 출력하세요
# - 가장 높은 투표 수 (max)
# - 그 기사 제목
# - 그 기사 링크

