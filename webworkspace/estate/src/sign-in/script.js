const ID = 'aaa';
const PASSWORD = '1q2w3e4r';

function onSignInButtonClickHandler (event) {
    const id = document.getElementById('id').value;
    const password = document.getElementById('password').value;

    if (id === ID && password === PASSWORD) {
        alert('로그인이 되었습니다');
    } else {
        const signInMessageElement = document.getElementById('sign-in-massage');
        signInMessageElement.textContent = '로그인 정보가 일치하지 않습니다.';
    }
}

function onSignUpLinkClickHandler(event){
    window.location.href='https://google.com';
}

const signUpLinkElement = document.getElementById('sign-up-link');
signUpLinkElement.addEventListener('click', onSignUpLinkClickHandler);

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



