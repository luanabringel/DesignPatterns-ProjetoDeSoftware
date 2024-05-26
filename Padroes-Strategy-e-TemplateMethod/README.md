# Especificação do sistema:
- Em um sistema de processamento de pagamentos, podem ser aceitos
diversos métodos de pagamento. Novos métodos podem ser incluídos com o
passar do tempo, de acordo com a evolução do sistema. Inicialmente, o
sistema de pagamento foi implementado de forma simples, com uma classe
PagamentoService, que contém métodos para processar cada tipo de
pagamento diretamente. No entanto, percebe-se que essa abordagem não é
escalável, pois dificulta a adição de novos métodos de pagamento e a
modificação dos existentes. Além disso, o método principal da classe está
com uma baixa coesão e vários condicionais, o que pode prejudicar a
manutenção do sistema.
