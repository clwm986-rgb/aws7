/*
ERD:https://app.diagrams.net/#G1RP_6sVhYB-iXs2xfsOcnTD6ThmXvxdy8#%7B%22pageId%22%3A%22eC6mUv7sG007SezlZfaW%22%7D
논리적 설계

회원(회원번호(PK), 이름, 연락처, 가입일)
트레이너(사번(PK), 이름, 전공, 경력, 팀장사번(FK))
프로그램(프로그램코드(PK), 강좌명, 정원, 수강료, 트레이너사번(FK)
사물함(번호(PK),회원번호(FK), 위치) : 식별관계
*/

# 수강(수강번호(PK),신청일자, 결재상태, 회원번호(FK), 프로그램코드(FK))
# 출석(수강번호(PK), 날짜, 출석여부, 회원번호(PK), 프로그램코드(FK))