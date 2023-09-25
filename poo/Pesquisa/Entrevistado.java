
public class Entrevistado
{
        private int idade;
        private double altura;
        private char sexo;
        private String corOlhos;
        private ETipoCorCabelo corCabelos;
        
        public Entrevistado(){}
        public Entrevistado(int idade, double altura, char sexo,
        String corOlhos, ETipoCorCabelo corCabelos ){
            this.idade = idade;
            this.altura = altura;
            setSexo(sexo);
            setCorOlhos(corOlhos);
            this.corCabelos = corCabelos;
        }
        
        public void setCorCabelos(ETipoCorCabelo corCabelos){
            this.corCabelos = corCabelos;
        }
        public ETipoCorCabelo getCorCabelos(){
            return corCabelos;
        }
        
        public void setCorOlhos(String corOlhos){
            if (corOlhos.toUpperCase().equals("VERDE") ||
            corOlhos.toUpperCase().equals("VERDE") ||
            corOlhos.toUpperCase().equals("VERDE")
            );
            this.corOlhos = corOlhos.toUpperCase();
        }
        
        public void setSexo(char sexo){
            if (sexo =='M' || sexo == 'F' || 
                sexo =='m' || sexo == 'f'){
                this.sexo = sexo;
            }
            /*if ( "M".charAt(0) == sexo)
             * 
             */
        }
        public char getSexo(){
            return sexo;
        }
        
        public void setAltura(double altura){
            if (altura >=0){
                this.altura = altura;
            }
        }
}
