SELECT APNT_NO
     , PT_NAME
     , PT_NO
     , A.MCDP_CD
     , DR_NAME
     , A.APNT_YMD
  FROM APPOINTMENT A
 INNER JOIN PATIENT B USING(PT_NO)
 INNER JOIN DOCTOR C ON A.MDDR_ID = C.DR_ID
 WHERE A.MCDP_CD = 'CS'
   AND APNT_CNCL_YN = 'N'
   AND APNT_YMD REGEXP '2022-04-13'
 ORDER BY 6

# SELECT     a.apnt_no
#          , p.pt_name
#          , a.pt_no
#          , a.mcdp_cd
#          , d.dr_name
#          , a.apnt_ymd
# FROM       appointment a
# INNER JOIN patient p 
#            ON a.pt_no = p.pt_no
# INNER JOIN doctor d
#            ON a.mddr_id = d.dr_id
# WHERE      TO_CHAR(a.apnt_ymd, 'YYYY-MM-DD') = '2022-04-13'
#            AND a.apnt_cncl_yn = 'N'
#            AND a.mcdp_cd = 'CS'
# ORDER BY   a.apnt_ymd ASC;