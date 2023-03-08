create table if not exists filiais(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nomeFilial VARCHAR(60),
    rua VARCHAR(60),
    numero VARCHAR(10),
    cidade VARCHAR(40),
    estado VARCHAR(40),
    e5Estrelas BIT
)