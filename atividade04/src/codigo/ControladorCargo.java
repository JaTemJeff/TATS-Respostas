package codigo;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Notebook
 */
public class ControladorCargo {
    int salarioAtualizado;

    public float calcular(String cargo, float salario) {
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
        return 0;
    }

}
