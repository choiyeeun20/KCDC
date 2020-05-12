SELECT team_id FROM team
WHERE team_name LIKE '삼성%';

SELECT player_name FROM player
WHERE team_id LIKE 'K02';

SELECT *
FROM player
WHERE (team_id LIKE(
	SELECT team_id
	FROM team
	WHERE team_name LIKE '삼성블루윙즈'
) OR team_id LIKE(
	SELECT team_id
	FROM team
	WHERE team_name LIKE '드래곤즈'))
	AND POSITION LIKE 'MF'
	AND height >=170 AND height <=180 
;


-- 전체 축구팀의 목록을 출력하시오 
-- 단, 팀명을 오름차순으로 정렬하시오.

SELECT team_name FROM team
ORDER BY team_name ; --ASC가 default, DESC는 내림차순.



-- 포지션의 종류를 모두 출력하시오 
-- 단, 중복제거은 제거합니다.

SELECT distinct position FROM player; 



-- 포지션의 종류를 모두 출력하시오 
-- 단, 중복제거은 제거합니다.
-- 포지션이 없으면 신입으로 기재

SELECT case
when POSITION LIKE '' then '신입'
ELSE POSITION
END AS POSITION, player_name
FROM player
WHERE team_id LIKE 'K08'
;

-- 수원을 연고지로 하는팀의 골키퍼는 누구인가?

SELECT *
FROM player
WHERE (team_id LIKE(
	SELECT team_id
	FROM team
	WHERE region_name LIKE '수원'
))
AND POSITION LIKE 'GK'
;

-- 수원 연고팀에서 키가 170 이상 선수
-- 이면서 성이 고씨인 선수 

SELECT*
FROM player
WHERE (team_id LIKE(
	SELECT team_id
	FROM team
	WHERE region_name LIKE '수원'	
	))	  
	AND height >= 170 
	AND player_name LIKE '고%'
	;

-- 광주팀 선수들 이름과
-- 키와 몸무게 목록을 출력하시오
-- 키와 몸무게가 없으면 "0" 표시하시오
-- 키와 몸무게는  내림차순으로 정렬하시오

SELECT player_name AS playerName, 
	CONCAT (case when height LIKE '' then '0' ELSE height END, 'cm') AS height,
	CONCAT (case when weight LIKE '' then '0' ELSE weight END, 'kg') AS weight FROM player
WHERE (team_id LIKE(
	SELECT team_id
	FROM team
	WHERE region_name LIKE '광주'))
ORDER BY  height DESC ,weight DESC
;

-- 서울팀 선수들 이름과 포지션과
-- 키(cm표시)와 몸무게(kg표시)와  각 선수의 BMI지수를 출력하시오
-- 단, 키와 몸무게가 없으면 "0" 표시하시오
-- BMI는 "NONE" 으로 표시하시오(as bmi)
-- 최종 결과는 이름내림차순으로 정렬하시오

SELECT player_name AS playerName, POSITION,
	CONCAT (case when height LIKE '' then '0' ELSE height END, 'cm') AS height,
	CONCAT (case when weight LIKE '' then '0' ELSE weight END, 'kg') AS weight, 
	case when height LIKE '' OR weight LIKE ''  then 'NONE' ELSE 
	ROUND (weight /((height / 100)*(height/100)),2) END AS bmi 
	FROM player
WHERE team_id LIKE(
	SELECT team_id
	FROM team
	WHERE region_name LIKE '서울') 
	ORDER BY player_name DESC 
	;
	
	
SELECT b.player_id, b.team_id, b.stadium_id, s.sche_date
	from(SELECT a.player_id, a.team_id, a.stadium_id
			from(SELECT p.player_id, t.team_id, t.stadium_id
				from (SELECT player_id, team_id FROM player)p
					JOIN team t	ON p.team_id LIKE t.team_id) a
			JOIN stadium s ON a.stadium_id LIKE s.stadium_id) b
	JOIN schedule s ON b.stadium_id LIKE s.stadium_id	
	;
	
	
	
	
	
	
	
