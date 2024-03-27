// kakao https://developers.kakao.com/
function onKakaoButtonClickHandler(event){
    window.location.href='https://developers.kakao.com';
}

// naver https://developers.naver.com/
function onNaverButtonClickHandler(event){
    window.location.href='https://developers.naver.com';
}

const KakaoButtonElement = document.getElementById('kakao-button');
KakaoButtonElement.addEventListener('click', onKakaoButtonClickHandler);

const NaverButtonElement = document.getElementById('naver-button');
NaverButtonElement.addEventListener('click', onNaverButtonClickHandler);

