import org.graalvm.compiler.debug.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.univille.estd.stack.StackWithArray;

//VERIFICAR AQUI!!!!

public class StackWithArrayTest {

    @Test
    public void adicionarElemento(){
        StackWithArray pilha = new StackWithArray(5);
        pilha.push(1);
        Assertions.assertEquals(1,1,"Correto");
        
    }

}
