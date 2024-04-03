import React from 'react'

export default function Component() {

    // 함수형 컴포넌트의 return
    // - 해당 컴포넌트가 랜더링할 요소를 지정 (반환)
    // - html처럼 보이지만 html이 아님
    // - 여러가지 자바스크립트 * 연산자 *를 사용할 수 있음

    // - 반드시 하나의 요소만 반환이 가능 ( 0개도 안됨, 2개 이상 도 안됨 )                   
    // -  하나의 컴포넌트가 다수의 요소를 반환하고자 하면 최상단에 해당 요쇼를 묶어주는 부모 요소를 포함해야한다.
    // - 부머 요소를 묶을대 <></>르 이용하여 의미없는 태그를 생성 할 수 있다.

    // - 반드시 return 바로 뒤에 반환 요소가 있어야 함
    return (
        <>
            <div>Component</div>
            <div>Component</div>
        </>
    );
}

function JsxComponent () {

    // JSX (TSX)의 규칙
    // 1. 반드시 하나의 요소를 반환 (<div> 요소 혹은 <>요소)
    // 2. 모든 태그 닫기
    // 3. 속성들을 JSX로 지정되어있는 이름으로 사용해야함 (lowerCamelCase)

    return (
        <>
            <h1>첫번째 페이지입니다.</h1> 
            <div>
                <img src='https://img.seoul.co.kr/img/upload/2023/06/04/SSC_20230604140551_O2.jpg' className='image-box' />
            </div>
        </>
    )
}