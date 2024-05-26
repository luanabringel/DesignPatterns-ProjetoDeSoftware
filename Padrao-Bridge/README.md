# Especificação do sistema:
Você foi contratado para realizar o desenvolvimento do sistema MnSG. Esse
sistema possui três aplicativos (src.Email, src.Sms, src.Slack) que realizam envios de
mensagens. Essas mensagens podem ser de três tipos diferentes (src.Texto, src.Voz e
src.Imagem) e cada um deles é responsável por receber o conteúdo enviado pelo
usuário e gerar uma mensagem a partir dele. Os três aplicativos devem definir o
nome do destinatário, que receberá a mensagem e poderá ser alterado por
qualquer um dos aplicativos, porém, cada um deles possui sua própria lógica
para realizar o envio das mensagens.
