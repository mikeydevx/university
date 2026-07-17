#Consulta 1
USE autos_chachos;
SELECT * FROM CLIENTES WHERE ciudad='CIUDAD DE MEXICO';

#Consulta 2
SELECT COUNT(*) FROM CLIENTES WHERE a_pat='GONZALEZ';

#Consulta 3
SELECT * FROM CLIENTES WHERE cp BETWEEN 44000 AND 45000;

#Consulta 4
SELECT * FROM CLIENTES WHERE estado='JALISCO' OR estado='NUEVO LEON';

#Consulta 5
SELECT * FROM CLIENTES WHERE nombre LIKE 'M%';

#Consulta 6
SELECT COUNT(*) FROM CLIENTES WHERE a_pat='LOPEZ';

#Consulta 7
SELECT * FROM CLIENTES WHERE NOT ciudad='GUADALAJARA';

#Consulta 8
SELECT * FROM CLIENTES WHERE numero >= 1000;

#Consulta 9
SELECT * FROM CLIENTES WHERE telefono LIKE '55%';

#Consulta 10
SELECT COUNT(*) FROM CLIENTES WHERE colonia LIKE '%CENTRO%';

#Consulta 11
SELECT * FROM CLIENTES WHERE f_nac BETWEEN '1976-01-01' AND '1980-12-31';

#Consulta 12
SELECT * FROM CLIENTES WHERE a_pat='RAMIREZ' OR a_pat='MARTINEZ';

#Consulta 13
SELECT COUNT(*) FROM CLIENTES WHERE cp < 50000;

#Consulta 14
SELECT * FROM CLIENTES WHERE ciudad='PUEBLA' OR ciudad='TOLUCA';

#Consulta 15
SELECT * FROM CLIENTES WHERE NOT nombre='JUAN' AND NOT nombre='MARIA';

#Consulta 16
SELECT * FROM CLIENTES WHERE a_pat LIKE '%EZ';

#Consulta 17
SELECT COUNT(*) FROM CLIENTES WHERE telefono LIKE '33%' OR telefono LIKE '81%';

#Consulta 18
SELECT * FROM CLIENTES WHERE numero BETWEEN 500 AND 1500 ORDER BY numero;

#Consulta 19
SELECT * FROM CLIENTES WHERE estado='QUINTANA ROO' AND ciudad='CANCUN';

#Consulta 20
SELECT COUNT(*) FROM CLIENTES WHERE rfc LIKE '____90%';

#Consulta 21
SELECT * FROM CLIENTES WHERE NOT a_mat='GARCIA' ORDER BY a_mat;

#Consulta 22
SELECT * FROM CLIENTES WHERE cp LIKE '76%';

#Consulta 23
SELECT COUNT(*) FROM CLIENTES WHERE nombre='ANA' OR nombre='CARLOS';

#Consulta 24
SELECT * FROM CLIENTES WHERE rfc LIKE '______05%';

#Consulta 25
SELECT * FROM CLIENTES WHERE telefono LIKE '477%' AND sexo='F';

#Consulta 26
SELECT COUNT(*) FROM CLIENTES WHERE NOT colonia='CENTRO';

#Consulta 27
SELECT * FROM CLIENTES WHERE a_pat LIKE '%R%' AND nombre LIKE 'A%';

#Consulta 28
SELECT * FROM CLIENTES WHERE cp BETWEEN 70000 AND 80000 AND NOT ciudad='Ciudad de México';

#Consulta 29
SELECT COUNT(*) FROM CLIENTES WHERE nombre LIKE 'J%' OR  nombre LIKE 'M%'; 

#Consulta 30
SELECT ciudad, COUNT(*) AS Total_clientes FROM clientes GROUP BY ciudad HAVING Total_clientes <=  3;

#Consulta 31
SELECT estado, COUNT(*) AS Total_clientes FROM clientes GROUP BY estado HAVING COUNT(*)=3;

#Consulta 32
SELECT a_pat, COUNT(*) AS Total_Ocurrencias FROM clientes GROUP BY a_pat HAVING COUNT(*)>=2 ORDER BY COUNT(*);

#Consulta 33
SELECT colonia, COUNT(*) FROM clientes GROUP BY colonia HAVING COUNT(*)>5;

#Consulta 34 
SELECT ciudad, COUNT(*) FROM clientes WHERE f_nac >= '1975-01-01' AND f_nac < '1976-01-01' GROUP BY ciudad; 
