-- 코드를 입력하세요
SELECT A.CATEGORY,SUM(B.SALES) TOTAL_SALES FROM BOOK A, BOOK_SALES B
WHERE A.BOOK_ID=B.BOOK_ID AND YEAR(B.SALES_DATE)=2022 AND MONTH(B.SALES_DATE)=01 
GROUP BY CATEGORY
ORDER BY CATEGORY