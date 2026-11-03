
function validatePassword(password) {

    let tieneNumero = false;
    let tieneMayuscula = false;

    if (password.length < 8) {
        return false;
    }

    for (let i = 0; i < password.length; i++) {

        if (password[i] >= "0" && password[i] <= "9") {
            tieneNumero = true;
        }

        if (password[i] >= "A" && password[i] <= "Z") {
            tieneMayuscula = true;
        }
    }

    if (tieneNumero && tieneMayuscula) {
        return true;
    } else {
        return false;
    }
}

console.log(validatePassword("Abc12345"));
console.log(validatePassword("weak"));
