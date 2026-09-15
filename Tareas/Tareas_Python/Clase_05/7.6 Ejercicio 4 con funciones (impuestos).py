def calcular_impuesto(pago_sin_impuesto,impuesto):
    return pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)

print("El pago total con impuesto es:", calcular_impuesto(1000, 21))