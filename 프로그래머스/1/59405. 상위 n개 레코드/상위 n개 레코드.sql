-- 코드를 입력하세요
SELECT NAME FROM ANIMAL_INS
WHERE DATETIME IN (SELECT MIN(DATETIME) FROM ANIMAL_INS); 