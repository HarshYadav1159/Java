# from tkinter import *

# expression=""

# def press(num):
#     global expression 
#     expression=expression+str(num)
#     equation.set(expression)

# def equalpress():
#     try: 
#         global expression
#         total=str(eval(expression))
#         equation.set(total)
#         expression=""
#     except:
#         equation.set(" erroer ")
#         expression=""

# def clear():
#     global expression
#     expression=""
#     equation.set("")

# if __name__=="__main__":
#     gui=Tk()
#     gui.configure(background="grey")
#     gui.title("Calculator")
#     gui.geometry("270x150")
#     equation=StringVar()
#     expression_field=Entry(gui,textvariable=equation)
#     expression_field.grid(columnspan=4,ipadx=70)


#     button1 = Button(gui, text=' 1 ', fg='black', bg='light blue',
#                     command=lambda: press(1), height=1, width=7)
#     button1.grid(row=2, column=0)
 
#     button2 = Button(gui, text=' 2 ', fg='black', bg='light blue',
#                     command=lambda: press(2), height=1, width=7)
#     button2.grid(row=2, column=1)
 
#     button3 = Button(gui, text=' 3 ', fg='black', bg='light blue',
#                     command=lambda: press(3), height=1, width=7)
#     button3.grid(row=2, column=2)
 
#     button4 = Button(gui, text=' 4 ', fg='black', bg='light blue',
#                     command=lambda: press(4), height=1, width=7)
#     button4.grid(row=3, column=0)
 
#     button5 = Button(gui, text=' 5 ', fg='black', bg='light blue',
#                     command=lambda: press(5), height=1, width=7)
#     button5.grid(row=3, column=1)
 
#     button6 = Button(gui, text=' 6 ', fg='black', bg='light blue',
#                     command=lambda: press(6), height=1, width=7)
#     button6.grid(row=3, column=2)
 
#     button7 = Button(gui, text=' 7 ', fg='black', bg='light blue',
#                     command=lambda: press(7), height=1, width=7)
#     button7.grid(row=4, column=0)
 
#     button8 = Button(gui, text=' 8 ', fg='black', bg='light blue',
#                     command=lambda: press(8), height=1, width=7)
#     button8.grid(row=4, column=1)
 
#     button9 = Button(gui, text=' 9 ', fg='black', bg='light blue',
#                     command=lambda: press(9), height=1, width=7)
#     button9.grid(row=4, column=2)
 
#     button0 = Button(gui, text=' 0 ', fg='black', bg='light blue',
#                     command=lambda: press(0), height=1, width=7)
#     button0.grid(row=5, column=0)
 
#     plus = Button(gui, text=' + ', fg='black', bg='light blue',
#                 command=lambda: press("+"), height=1, width=7)
#     plus.grid(row=2, column=3)
 
#     minus = Button(gui, text=' - ', fg='black', bg='light blue',
#                 command=lambda: press("-"), height=1, width=7)
#     minus.grid(row=3, column=3)
 
#     multiply = Button(gui, text=' * ', fg='black', bg='light blue',
#                     command=lambda: press("*"), height=1, width=7)
#     multiply.grid(row=4, column=3)
 
#     divide = Button(gui, text=' / ', fg='black', bg='light blue',
#                     command=lambda: press("/"), height=1, width=7)
#     divide.grid(row=5, column=3)
 
#     equal = Button(gui, text=' = ', fg='black', bg='light blue',
#                 command=equalpress, height=1, width=7)
#     equal.grid(row=5, column=2)
 
#     clear = Button(gui, text='Clear', fg='black', bg='light blue',
#                 command=clear, height=1, width=7)
#     clear.grid(row=5, column='1')
 
#     Decimal= Button(gui, text='.', fg='black', bg='light blue',
#                     command=lambda: press('.'), height=1, width=7)
#     Decimal.grid(row=6, column=0)
#     # start the GUI
#     gui.mainloop()





# from tkinter import ttk
# import tkinter as tk
# from tkinter.messagebox import showinfo
# root = tk.Tk()
# root.geometry('300x120')
# root.title('Progressbar')
# def update_progress_label():
#  return f"Current Progress: {pb['value']}%"
# def progress():
#  if pb['value'] < 100:
#   pb['value'] += 20
#   value_label['text'] = update_progress_label()
#  else:
#   showinfo(message='The progress completed!')
# def start():
#  for i in range(5):
#   progress()
# def stop():
#  pb.stop()
#  value_label['text'] = update_progress_label()
# # progressbar
# pb = ttk.Progressbar(
#  root,
#  orient='horizontal',
#  mode='determinate',
#  length=280
# )
# # place the progressbar
# pb.grid(column=0, row=0, columnspan=3, padx=10, pady=20)
# # label
# value_label = ttk.Label(root, text=update_progress_label())
# value_label.grid(column=0, row=1, columnspan=3)
# # start button
# start_button = ttk.Button(
#  root,
#  text='Progress',
#  command=progress
# )
# start_button.grid(column=0, row=2, padx=10, pady=10, sticky=tk.E)
# stop_button = ttk.Button(
#  root,
#  text='Stop',
#  command=stop
# )
# stop_button.grid(column=1, row=2, padx=10, pady=10, sticky=tk.W)
# start_button = ttk.Button(root, text="Start", command=start)
# start_button.grid(column=2, row=2, padx=10, pady=10, sticky=tk.E)
# root.mainloop()




import sqlite3
conn = sqlite3.connect('ty12.db')
c= conn.cursor()

c.execute("""CREATE TABLE Product(
    id int primary key,
    prodname varchar(255),
    supplierid int,
    unitprice int,
    package int,
    orderid varchar(255)
)""")

sql_command="""INSERT INTO Product VALUES('id001','pid001','001','1000','500','Oid001');"""
c.execute(sql_command)
sql_command="""INSERT  INTO Product VALUES('id002','pid002','002','2000','600','Oid002');"""
c.execute(sql_command)
sql_command="""INSERT INTO Product VALUES('id003','pid003','003','3000','700','Oid003');"""
c.execute(sql_command)
sql_command="""INSERT INTO Product VALUES('id004','pid004','004','4000','800','Oid004');"""
c.execute(sql_command)

c.execute("""CREATE TABLE OrderItem(
    id int,
    orderid int,
    productid int,
    unitprice int,
    quantity int,
    FOREIGN KEY (id) REFERENCES Product (id)
)""")
sql_command="""INSERT  INTO OrderItem VALUES('id001','oid001','pid001','1000','100');"""
c.execute(sql_command)
sql_command="""INSERT  INTO OrderItem VALUES('id002','oid002','pid002','2000','200');"""
c.execute(sql_command)
sql_command="""INSERT  INTO OrderItem VALUES('id003','oid003','pid003','3000','300');"""
c.execute(sql_command)
sql_command="""INSERT  INTO OrderItem VALUES('id004','oid004','pid004','4000','400');"""
c.execute(sql_command)


c.execute("SELECT quantity FROM OrderItem ")
ans = c.fetchall()
for i in ans:
    print(i)
print("")


c.execute("SELECT OrderItem.unitprice FROM Product, OrderItem WHERE OrderItem.id = Product.id ORDER BY  Product.supplierid")
ans = c.fetchall()
for i in ans:
    print(i)
print("")

c.execute("SELECT Product.prodname, OrderItem.orderid, Product.supplierid FROM OrderItem, Product WHERE OrderItem.id = Product.id")
ans = c.fetchall()
for i in ans:
    print(i)
print("")
conn.commit()
conn.close()