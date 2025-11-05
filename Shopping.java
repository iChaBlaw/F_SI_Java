public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    
    public Shopping(String nome, Endereco endereco, int quantMaxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantMaxLojas];
    }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }
    
    public Loja[] getLojas() { return lojas; }
    public void setLojas(Loja[] lojas) { this.lojas = lojas; }
    
    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }
    
            private String normalizaTipo(String s) {
            if (s == null) return "";
            // remove acentos simples e normaliza para minúsculas
            s = s.toLowerCase()
                .replace("á", "a").replace("à","a").replace("â","a").replace("ã","a")
                .replace("é","e").replace("ê","e")
                .replace("í","i")
                .replace("ó","o").replace("ô","o").replace("õ","o")
                .replace("ú","u")
                .replace("ç","c");
            // remove espaços extras
            return s.trim();
        }

        public int quantidadeLojasPorTipo(String tipoLoja) {
            String t = normalizaTipo(tipoLoja);

            // mapeia para chaves canônicas sem acento
            boolean tipoValido =
                t.equals("cosmetico") || t.equals("vestuario") || t.equals("bijuteria")
                || t.equals("alimentacao") || t.equals("informatica");
            if (!tipoValido) {
                return -1;
            }

            int contador = 0;
            for (Loja loja : lojas) {
                if (loja == null) continue;
                if (t.equals("cosmetico") && loja instanceof Cosmetico) contador++;
                else if (t.equals("vestuario") && loja instanceof Vestuario) contador++;
                else if (t.equals("bijuteria") && loja instanceof Bijuteria) contador++;
                else if (t.equals("alimentacao") && loja instanceof Alimentacao) contador++;
                else if (t.equals("informatica") && loja instanceof Informatica) contador++;
            }
            return contador;
        }
        
    
    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorSeguro = 0;
        
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] instanceof Informatica) {
                Informatica lojaInfo = (Informatica) lojas[i];
                if (lojaInfo.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = lojaInfo.getSeguroEletronicos();
                    lojaMaisCara = lojaInfo;
                }
            }
        }
        
        return lojaMaisCara;
    }
    
    @Override
    public String toString() {
        return "Shopping: " + nome + " | Endereço: " + endereco;
    }
}