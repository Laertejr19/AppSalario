# 💰 App Salário

Aplicativo Android simples desenvolvido em **Java + XML** no **Android Studio**, que permite ao usuário calcular o valor líquido do salário com base no valor bruto informado, considerando descontos como INSS e IRPF.  
Projeto criado como parte dos estudos de **desenvolvimento mobile nativo** e para praticar cálculos financeiros no Android.

---

## 🧠 Sobre o Projeto

O **App Salário** oferece uma interface onde o usuário pode inserir o valor bruto do salário, e o aplicativo calcula e exibe o valor líquido após os descontos.  
O objetivo é demonstrar como realizar cálculos financeiros simples e exibir os resultados de forma clara para o usuário.

---

## 🛠️ Tecnologias Utilizadas

| Categoria         | Ferramenta                         |
|-------------------|------------------------------------|
| IDE               | Android Studio                     |
| Linguagem         | Java                               |
| Layouts           | XML                                |
| Versão mínima Android | API 21 (Android 5.0)             |
| Estrutura de UI   | ConstraintLayout / LinearLayout    |

---

## 📱 Estrutura do Projeto

```
app/
 ├── java/
 │    └── br/ulbra/appsalario/
 │         └── MainActivity.java
 ├── res/
 │    ├── layout/
 │    │     └── activity_main.xml
 │    ├── drawable/
 │    │     └── (ícones ou imagens do app)
 │    └── values/
 │          └── strings.xml
 └── AndroidManifest.xml
```

---

## 🧮 Lógica de Cálculo

```java
double salarioBruto = Double.parseDouble(edtSalarioBruto.getText().toString());
double salarioLiquido = calcularSalarioLiquido(salarioBruto);
txtSalarioLiquido.setText("R$ " + String.format("%.2f", salarioLiquido));
```

---

## 🏗️ Funcionalidades Implementadas

✅ Entrada do valor bruto do salário  
✅ Cálculo do valor líquido considerando descontos  
✅ Exibição do valor líquido formatado  
✅ Interface simples e funcional  
✅ Código comentado para entendimento  

---

## 💡 Possíveis Melhorias

- Implementar campos para entrada de outros descontos (vale-transporte, plano de saúde, etc.)  
- Adicionar suporte para diferentes faixas de INSS e IRPF  
- Implementar persistência de dados utilizando banco de dados local (SQLite)  
- Criar gráficos para visualização dos descontos e do salário líquido  
- Adicionar suporte para diferentes tipos de contratos (CLT, PJ, etc.)  

---

## 👩‍💻 Autor

**Nome:** *Laerte Ferraz da Silva Júnior*  
**Instituição:** *Curso Técnico em Informática – Escola Ulbra São Lucas*  
**Disciplina:** *Desenvolvimento Mobile Android*  
**Professor:** *Jeferson Leon*  

---

## 📚 Licença

Projeto desenvolvido para fins **educacionais**.  
Livre para uso e modificação, desde que mantidos os créditos ao autor.

---

> “A melhor forma de aprender é construindo. Então... bora codar!”
