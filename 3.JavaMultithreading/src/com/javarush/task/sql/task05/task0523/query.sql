SELECT number,
       ROUND(inventory + (inventory / 100)) with_spare_parts
FROM lego_set