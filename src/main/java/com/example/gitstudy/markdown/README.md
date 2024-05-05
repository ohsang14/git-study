# 소개 . Blog Service
_________
- 블로그 검색과 관련된 서비스를 제공합니다.

# 빌드 결과물 
_____
- [결과물 다운로드](https://www.google.com)
- JAVA 17
- SpringBoot 2.7.3
- ....

# module - application
_____
- 도메인 엔티티, 입력 포트, ....
    - `domain`
    - `service`
    - `part/input`
    - `port/output`

### 사용

> $ http GET `htt://localhos:8080...`
> 
### 요청

Parameter

| Name | Type | Description | Required
|------|------|------|-------------------
| `keyword` | `String` | 검색 키워드 | O |
| url | String | 블로그 url | X|