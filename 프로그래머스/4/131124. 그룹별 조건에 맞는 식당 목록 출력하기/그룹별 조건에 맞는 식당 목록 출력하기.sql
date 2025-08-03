SELECT MEMBER_NAME
     , REVIEW_TEXT
     , DATE_FORMAT(REVIEW_DATE, '%Y-%m-%d') 'REVIEW_DATE'
  FROM MEMBER_PROFILE A
  JOIN REST_REVIEW B USING (MEMBER_ID)
 WHERE B.MEMBER_ID = (
                      SELECT MEMBER_ID
                        FROM REST_REVIEW
                       GROUP BY MEMBER_ID
                       ORDER BY COUNT(REVIEW_ID) DESC
                       LIMIT 1
                     )
 ORDER BY 3, 2