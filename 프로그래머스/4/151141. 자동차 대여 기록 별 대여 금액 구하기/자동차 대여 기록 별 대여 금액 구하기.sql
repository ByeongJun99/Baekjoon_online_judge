# SELECT HISTORY_ID
#      , FLOOR(MIN(DAILY_FEE * (1 - IFNULL(DISCOUNT_RATE, 0) * 0.01) * DURATION)) 'FEE'
#      , DURATION
#      , IFNULL(DURATION_TYPE, 0) 'DURATION_TYPE'
#      , IFNULL(DISCOUNT_RATE, 0) 'DISCOUNT_RATE'
#   FROM CAR_RENTAL_COMPANY_CAR A
#  INNER JOIN (
#              SELECT HISTORY_ID
#                   , CAR_ID
#                   , (END_DATE - START_DATE) + 1 'DURATION'
#                FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
#             ) B USING (CAR_ID)
#   LEFT JOIN (
#              SELECT PLAN_ID
#                   , CAR_TYPE
#                   , SUBSTRING_INDEX(DURATION_TYPE, '일', 1) 'DURATION_TYPE'
#                   , DISCOUNT_RATE
#                FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
#               WHERE CAR_TYPE = '트럭'
#             ) C ON A.CAR_TYPE = C.CAR_TYPE
#                AND B.DURATION >= C.DURATION_TYPE
#  WHERE A.CAR_TYPE = '트럭'
#  GROUP BY HISTORY_ID
#  ORDER BY 2 DESC, 1 DESC


SELECT HISTORY_ID
     , floor(daily_fee*(datediff(end_date, start_date)+1)*(1-IFNULL(discount_rate, 0)*0.01)) FEE
  FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY H
  JOIN CAR_RENTAL_COMPANY_CAR C
    ON C.car_id = H.car_id
   AND C.car_type = '트럭'
  LEFT JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN P
    ON P.car_type = '트럭'
   AND ((datediff(end_date, start_date)+1 >= 90 AND P.duration_type = '90일 이상')
    OR (datediff(end_date, start_date)+1 BETWEEN 30 AND 89 AND P.duration_type = '30일 이상')
    OR (datediff(end_date, start_date)+1 BETWEEN 7 AND 29 AND P.duration_type = '7일 이상'))
 ORDER BY 2 DESC, 1 DESC