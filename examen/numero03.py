
#definir variable
inicio:float()
segun:float()
simbolo:float()
total:float()
#datos de entrada
inicio=float(input("ingresar el primer numero"))
segun=float(input("ingresar el segundo numero"))
print("+=suma")
print("-=resta")
print("/=division")
print("*=multiplicacion")
print("^=potencia")
print("R=raiz")
print("%=modulo de 2")
simbolo=str(input("ingresar simbolo"))
#proceso
if simbolo=="+":
    total=inicio+segun
elif simbolo=="-":
    total=inicio-segun
elif simbolo=="/":
    total=inicio/segun
elif simbolo=="*":
    total=inicio*segun
elif simbolo=="^":
    total=inicio**segun
elif simbolo=="R":
    total=inicio**(segun**-1)
else:
    total= 7
#datos de salida
    print(f"resultado final es:{total}")