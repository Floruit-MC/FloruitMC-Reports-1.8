# 📝 Reports - Sistema de Denúncias

O plugin **Reports** oferece um sistema completo para denúncias de jogadores dentro do servidor. Ele possibilita o envio de denúncias com motivo e cooldown, além de um painel visual para visualização por parte da staff.

---

## ⚙️ Funcionalidades

- Comando para denunciar jogadores com sugestões de motivo.
- Envio da denúncia para staff com integração com sistemas externos (MySQL, Discord etc.).
- Cooldown configurável para evitar spam.
- Menu visual com histórico de denúncias.
- Comando administrativo para visualização e gerenciamento de reports.

---

## 📦 Comandos e Permissões

### 🎯 Jogador

| Comando                      | Função                                       | Permissão          |
|-----------------------------|----------------------------------------------|--------------------|
| `/report <nick>`           | Abrir menu de denúncia para o jogador alvo  | (sem permissão)    |
| `/report send <nick> <motivo>` | Enviar denúncia com o motivo escolhido   | (sem permissão)    |

### 🔧 Administração

| Comando                      | Função                                       | Permissão            |
|-----------------------------|----------------------------------------------|----------------------|
| `/reports`                 | Abre o menu visual de denúncias              | `reports.admin`      |
| `/reports ver <nick>`      | Visualiza as denúncias do jogador específico | `reports.admin`      |

---

## ⏱️ Cooldown e Regras

- Os jogadores não podem se reportar.
- Cooldown padrão entre reports: `300s`
- Cooldown entre múltiplas denúncias seguidas: `600s`
- Algumas infrações graves (como **Racismo**, **Discriminação**, **Comércio Externo**) devem ser reportadas com provas via Discord.

---

## 🛠️ Instalação

1. Adicione o plugin na pasta `plugins/` do seu servidor.
2. Reinicie ou recarregue o servidor.
3. Certifique-se de que o plugin está conectado corretamente com a base de dados, se necessário.
4. Dê as permissões `reports.admin` à equipe de staff.

---

## 🧩 Dependências

- [AikarCommands](https://github.com/aikar/commands)
- Base de dados (MySQL) configurada no plugin principal

---

## 📌 Exemplo de Uso

### Jogador:
```bash
/report Jogador123
```
> Abre opções de denúncia clicáveis para o jogador informado.

```bash
/report send Jogador123 Abuso de bug
```
> Envia a denúncia diretamente com motivo específico.

### Staff:
```bash
/reports
```
> Abre o menu visual com a lista de denúncias.

```bash
/reports ver Jogador123
```
> Abre o menu visual com as denúncias daquele jogador.

---

## ✅ Boas práticas

- Incentive os jogadores a usarem `/report` apenas para situações sérias.
- Oriente a staff a verificar os reports com frequência.
- Garanta que os menus estejam com traduções e aparência adequadas.

---
