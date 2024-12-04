SELECT
    CASE
        WHEN number_of_season = 1 THEN 'winter'
        WHEN number_of_season = 2 THEN 'spring'
        WHEN number_of_season = 3 THEN 'summer'
        WHEN number_of_season = 4 THEN 'autumn'
        ELSE 'unknown'
    END
FROM months