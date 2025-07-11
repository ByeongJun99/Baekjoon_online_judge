SELECT C.ID
     , C.GENOTYPE
     , P.GENOTYPE PARENT_GENOTYPE
  FROM ECOLI_DATA P
  JOIN ECOLI_DATA C
    ON P.ID = C.PARENT_ID
 WHERE (P.GENOTYPE & C.GENOTYPE) = P.GENOTYPE
 ORDER BY 1