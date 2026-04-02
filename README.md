# Compiladores
Atividade2
<img width="1918" height="936" alt="image" src="https://github.com/user-attachments/assets/c633b150-3bf1-4e26-ab2e-3ffdfa2a8644" />
<img width="1915" height="940" alt="image" src="https://github.com/user-attachments/assets/db0a61c0-9e5d-4e13-8f2d-76a8012e9cee" />
<img width="1912" height="949" alt="image" src="https://github.com/user-attachments/assets/1cb6ad9e-6ab0-40bd-8e42-7d09caa5ecee" />
<img width="1918" height="943" alt="image" src="https://github.com/user-attachments/assets/c76d04ed-9241-4593-9e0d-24139b50afa7" />

As expressões regulares são utilizadas para definir padrões que permitem reconhecer tokens, que são a base de funcionamento de um analisador léxico. 
No exemplo testado, a regex foi capaz de identificar corretamente identificadores, operadores e números na expressão “position = initial + rate * 60”. 
Isso demonstra como um scanner pode dividir a entrada em unidades menores antes da análise sintática.
Atividade3
<img width="1919" height="1000" alt="image" src="https://github.com/user-attachments/assets/35ed6d4e-5443-4f70-b9b9-cfb86385111f" />
<img width="1919" height="1000" alt="image" src="https://github.com/user-attachments/assets/fecf7d97-4d7f-4a4a-b187-1acb256b6c81" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/09da7bf7-7fcd-4113-b950-299601bf3dd4" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/a4033b31-cfc4-4f4b-ae05-bb069072e681" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/ba3d011b-c5b8-41ce-afd3-59291cd9c7ca" />
Expressões regulares permitem manipular e transformar dados rapidamente, como remover comentários e ajustar arquivos CSV.
Apesar de eficientes, possuem limitações por não entenderem o contexto completo do código.
Assim, simulam de forma simplificada o funcionamento de um scanner, que é mais preciso e robusto.
Atividade4
<img width="1903" height="885" alt="image" src="https://github.com/user-attachments/assets/40674316-f0cd-48ac-b840-0e1130abf495" />
<img width="1123" height="580" alt="image" src="https://github.com/user-attachments/assets/e6374180-46d4-431a-9eb8-6e673c764b94" />
<img width="1112" height="262" alt="image" src="https://github.com/user-attachments/assets/15d4e7a3-13fc-4512-ba7a-32f947640a8d" />
O uso de expressões regulares em Python e Java permitiu identificar padrões como e-mails e tokens de forma automatizada.
Em ambos os casos, a implementação simula o funcionamento de um scanner léxico baseado em autômatos finitos.
Apesar das limitações de contexto, as duas abordagens são eficientes para reconhecimento de padrões em texto.
Atividade5
<img width="1919" height="1032" alt="image" src="https://github.com/user-attachments/assets/f150411f-2f23-44bc-a15f-b4a46836f9ae" />
<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/bc0ec5f6-e7e7-4091-964c-89633f13546e" />
<img width="1919" height="1033" alt="image" src="https://github.com/user-attachments/assets/86342917-25ef-4d38-a6b3-079fa9fd4c25" />
<img width="1919" height="1033" alt="image" src="https://github.com/user-attachments/assets/80fa8ba0-e00f-4a43-a845-cb4980ae5095" />

Atividade6
O tokenizer da OpenAI divide palavras como “position” em partes como “pos” e “ition” porque utiliza BPE (Byte Pair Encoding), um método baseado em frequência de padrões no texto, e não em regras gramaticais. Já os tokens léxicos de compiladores seguem regras formais da linguagem (gramática regular), garantindo que cada token tenha um significado preciso. Enquanto o scanner de um compilador precisa ser rigoroso para não comprometer a execução do programa, o tokenizer de LLM pode ser mais flexível, pois seu objetivo é apenas representar o texto de forma eficiente para previsão probabilística.
Atividade7


Conclusão:
Ao longo deste laboratório, foi possível compreender na prática o funcionamento da análise léxica, primeira etapa de um compilador, observando como um fluxo de caracteres é transformado em tokens significativos. A utilização de expressões regulares, ferramentas como JFLAP e implementações em Python e Java evidenciou como autômatos finitos são a base para o reconhecimento de padrões e construção de scanners .

Além disso, atividades como manipulação de texto com regex e comparação com o tokenizer da OpenAI mostraram diferenças importantes entre abordagens formais (baseadas em gramáticas) e modelos estatísticos (como BPE), ampliando a visão sobre processamento de linguagem.

Por fim, a construção de um analisador léxico para textos em português consolidou o entendimento teórico e prático, demonstrando como conceitos fundamentais de compiladores podem ser aplicados em diferentes contextos computacionais.
