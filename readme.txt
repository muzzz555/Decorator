Decorator ( Object Structural )

Motivation
- มี object ที่ต้องใส่คุณสมบัติหรือการทำงานบางอย่างที่คสดการไม่ได้ เช่น 
    นักศึกษาใส่เสื้อช๊อปหรือชุดนักศึกษา แล้วนักศึกษาคนนั้นใส่เเว่นไหม ???
    รูปร่างทรงเรขาคณิต มีสี มีความโปร่งแสงไหม ???

Problem
- Decorator because redCircle is new object not have old object ability

ข้อดี
- เพิ่มความยืดหยุ่น
- เลือกใช้การทำงานเท่าที่จำเป็นได้

ข้อเสีย
- object เริ่มต้นกับ object ที่ Decorator เเล้วถือเป็นคนละตัวกัน
- object เล็กๆ กระจาย เยอะ

สิ่งที่ต้องคำนึงถึง
1. จะต้อง Inherit interface หรือ class เดียวกับตัวที่ Decorator และความสามารถหลักต้องมีด้วย เช่น info()
2. Decorator ต้องรับผิดชอบอย่างเดียว 
3. class แม่ต้องทำให้ LinghtWeigth ที่สุด ( มีข้อมูลน้อยที่สุด เอาเฉพาะข้อมูลที่จำเป็น)
4. ข้อแตกต่างระหว่าง Strategy กับ Decorator
  - Decorator หุ้มไปเรื่อยๆ แต่ละ Decorator จะเป็นคนเก็บข้อมูลเอง  ( ใส่เสื้อผ้า )  
  - Strategy เก็บภายใน ( เครื่องใน )