import React from 'react'

// Hook 함수 :
//	- react에서 컴포넌트의 상태와 생명주기에 따른 기능을 수행할 수 있도록 해주는 특별한 함수
//	- use 로 시작하는 함수
//	- hook 함수의 종류
//		- useState : 컴포넌트의 상태 관리를 가능하게 해주는 함수. ( 상태 생성, 업데이트, 값에 접근 )
//      - useEffect : 컴포넌트가 랜더링될 때마다 특정 작업을 수행 할 수 있도록 하는 함수. mount, update, unmount 단계에서 수행되는 함수
//      	- mount : 완전 초기상태
//          - update : 변경 상황이 생겼을때 새로운 페이지를 열리는 상태
//          - unmount : 사이트가 닫힌 상태
//		- useRef : DOM 요소에 직접 접근하기 위한 함수 또는 랜더링 사이에 값을 기억하는 함수
//  	- useContext : 컴포넌트 트리상에서 전역적으로 상태를 공유하고자 할 때 사용하는 함수
//		- useReducer : 상태 로직을 관리하는 함수, 상태 업데이트 로직을 컴포터는 외부로 옮길 수 있게 하여 코드관리를 조금 더 수월하게 해주는 함수



export default function HookComponent1() {
	return <div>HookComponent1</div>
}
