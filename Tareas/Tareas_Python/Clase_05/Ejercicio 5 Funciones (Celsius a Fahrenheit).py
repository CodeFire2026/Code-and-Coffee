def celsius_a_fahrenheit(celsius):
    return celsius * 9 / 5 + 32


def fahrenheit_a_celsius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9


print("los Celsius a Fahrenheit son:", celsius_a_fahrenheit(20))
print("los Fahrenheit a Celsius son:", fahrenheit_a_celsius(68))