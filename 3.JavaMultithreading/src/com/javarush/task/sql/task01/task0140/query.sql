SELECT ip2country.ip_from, ip2country.ip_to, ip2country.country_name
FROM ip2country
ORDER BY ip_to DESC
LIMIT 10 OFFSET 74