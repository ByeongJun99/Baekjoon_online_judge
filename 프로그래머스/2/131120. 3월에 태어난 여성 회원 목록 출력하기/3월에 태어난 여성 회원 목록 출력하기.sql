SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') 'DATE_OF_BIRTH'
  FROM MEMBER_PROFILE
 WHERE SUBSTRING(DATE_OF_BIRTH FROM 6 FOR 2) = '03'
   AND GENDER = 'W'
   AND TLNO IS NOT NULL
 ORDER BY MEMBER_ID