// SignIngContainer 함수형 컴포넌트를 생성
// 해당 컴포넌트는 InputBox 컴포넌트를 2개 포함
// SignIngContainer 컴포넌트를 기본 값으로 내보내기

import React from 'react'
import InputBox from './inputbox';
import './style.css';
import './common.css';


export default function SignInContainer() {
  return (
    <>
    <InputBox label="이메일" type="text" placeholder="이메일 주소를 입력해주세요." buttonTitle="이메일 인증" />
    </>
  );
}
