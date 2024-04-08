// SignIngContainer 함수형 컴포넌트를 생성
// 해당 컴포넌트는 InputBox 컴포넌트를 2개 포함
// SignIngContainer 컴포넌트를 기본 값으로 내보내기

import React from 'react'
import InputBox, { IdInputBox, PasswordInputBox } from './InputBox';
import './style.css';
import './common.css';


export default function SignUpContainer() {
  return (
    <>
    <InputBox label="아이디" type="text" placeholder="아이디를 입력하세요." />
    <InputBox label="비밀번호" type="password" placeholder="비밀번호를 입력하세요." />
    </>
  );
}
