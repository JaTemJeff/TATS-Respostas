package codigo;

public class ControladorCargo {

    public float calcular(String cargo, float salario) throws Exception {
        if (salario == 0) {
            throw new Exception("Informe um salário maior que 0!");
        } else if (cargo == "") {
            throw new Exception("Informe um cargo!");
        } else if (cargo != "DESENVOLVEDOR" && cargo != "DBA" && cargo != "TESTADOR" && cargo != "GERENTE") {
            throw new Exception("Informe um cargo válido!\nDESENVOLVEDOR\nDBA\nTESTADOR\nGERENTE");
        } else {
            if (cargo == "DESENVOLVEDOR") {
                if (salario >= 3000) {
                    return (salario - (salario * 0.2f));
                } else {
                    return (salario - (salario * 0.1f));
                }
            }
            if (cargo == "DBA") {
                if (salario >= 2000) {
                    return (salario - (salario * 0.25f));
                } else {
                    return (salario - (salario * 0.15f));
                }
            }

            if (cargo == "TESTADOR") {
                if (salario >= 2000) {
                    return (salario - (salario * 0.25f));
                } else {
                    return (salario - (salario * 0.15f));
                }
            }
            if (cargo == "GERENTE") {
                if (salario >= 5000) {
                    return (salario - (salario * 0.3f));
                } else {
                    return (salario - (salario * 02f));
                }
            }
        }
        return salario;
    }
}
