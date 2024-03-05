# 웹 크롤링 (Crawling) : 브라우저 드라이버를 이용하여 실제로 각 페이지를 이동하며 '동적'으로 데이터를 수집하는 방법

# 웹 스크래핑 (Scrapping) : 웹 페이지의 응답을 받아 데이터를 분석하여 필요한 데이터를 수집하는 방법

# 파이썬 스크래핑 패키지 : beautifulsoup4
# 파이썬 크롤링 패키지 : selenium

# pip install beautifulsoup4
# pip install selenium
# pip install requests

# pip install beautifulsoup4 selenium
# ↑한번에 설치


# Response [100] : 추가요청을 기다림
# Response [200] : 성공
# Response [300] : 리소스 위치가 변경되었다.
# Response [400] : 클라이언트(요청자)가 잘못 입력햇다(클라이언트 오류)
# Response [500] : 서버(응답자)가 잘못 입력했다. (서버 오류)

# print(response.status_code) : 결과를 코드로 출력
# print(response.text) : 가져온 걸 텍스트로 출력


import requests
from bs4 import BeautifulSoup

URL = 'https://naver.com'

response = requests.get(URL)

if response.status_code == 200 :
    html = response.text
    soup = BeautifulSoup(html, 'html.parser')
    a_list = soup.find_all('a')
    print(a_list)
else :
    print(response.status_code)


from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

driver = webdriver.Chrome()

time.sleep(2)

driver.get(URL)
time.sleep(2)

search_input = driver.find_element(By.ID, 'query')
search_input.send_keys('제네시스')
time.sleep(1)
search_input.send_keys(Keys.ENTER)
time.sleep(2)

news_button = driver.find_element(By.CSS_SELECTOR, '#lnb > div.lnb_group > div > div.lnb_nav_area._nav_area_root > div > div.api_flicking_wrap._conveyer_root > div:nth-child(8) > a')
time.sleep(1)

ActionChains(driver).click(news_button).perform()
time.sleep(2)

news_title_elements = driver.find_elements(By.CLASS_NAME, 'news_tit')
time.sleep(1)

for news_title_element in news_title_elements :
    # title = news_title_element.text
    title = news_title_element.get_attribute('title')
    print(title)
time.sleep(1) 


driver.back()
time.sleep(2)

image_button = driver.find_element(By.CSS_SELECTOR, '#lnb > div.lnb_group > div > div.lnb_nav_area._nav_area_root > div > div.api_flicking_wrap._conveyer_root > div:nth-child(1) > a')
time.sleep(1)

ActionChains(driver).click(image_button).perform()
time.sleep(2)

image_elements = driver.find_elements(By.CLASS_NAME, '_fe_image_tab_content_thumbnail_image')
time.sleep(1)

image_list = []

for image_element in image_elements :
    # title = image_title_element.text
    image_src = image_element.get_attribute('src')
    image_list.append(image_src)
time.sleep(1)

import os

FOLDER_PATH = r'./images/'

if not os.path.isdir(FOLDER_PATH) :
    os.mkdir(FOLDER_PATH)

from urllib.request import urlretrieve

number = 1

for image_src in image_list :
    urlretrieve(image_src, FOLDER_PATH + f'{number}.png')
    number +=1
time.sleep(0.5)