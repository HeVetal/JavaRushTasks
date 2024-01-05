SELECT ip2country.country_code, ip2country.ip_from, ip2country.ip_to
FROM ip2country
ORDER BY ip_from ASC
LIMIT 17