package codigo;

public class ControladorCargo {
    int salarioAtualizado;

    public float calcular(String cargo, float salario) throws Exception {
        if (salario == 0){ 
            throw new Exception("Informe um salário maior que 0!"); 
        }else if (cargo == ""){
            throw new Exception("Informe um cargo!"); 
        }else if (cargo != "DESENVOLVEDOR" && cargo != "DBA" && cargo != "TESTADOR" && cargo != "GERENTE"){
            throw new Exception("Informe um cargo válido!\nDESENVOLVEDOR\nDBA\nTESTADOR\nGERENTE");
        }
        
        else{
            if (cargo == "DESENVOLVEDOR") {
                if (salario >= 3000) {
                    //-20%
                    return (salario - (salario * 0.2f));
                } else {
                    //-10%
                    return (salario - (salario * 0.1f));
                }
            }
            if (cargo == "DBA") {
                if (salario >= 2000) {
                    //-25%
                    return (salario -(salario*0.25f));
                } else {
                    //-15%
                    return (salario - (salario * 0.15f));
                }
            }
        
            if (cargo == "TESTADOR") {
                if (salario >= 2000) {
                    //-25%
                    return (salario - (salario * 0.25f));
                } else {
                    //-15%
                    return (salario - (salario * 0.15f));
                }
            }
            if (cargo == "GERENTE") {
                if (salario >= 5000) {
                    //-30%
                    return (salario - (salario * 0.3f));
                } else {
                    //-20%
                    return (salario - (salario * 02f));
                }
            }
        }
        return salario;
    }

}
