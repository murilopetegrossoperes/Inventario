
package inventario;
/*
 * @author Murilo
 */
public class CD extends Product{
 private String artist;
private int numberOfSongs;
private String label;
//construtor que permite a definição dos valores iniciais para um CD
public CD(int number, String name, int qty, double price, String artist, int numSongs, String
label)
{
//especificar os parâmetros necessários para a superclasse
super(number, name, qty, price);
this.artist = artist;
this.numberOfSongs = numSongs;
this.label = label;
}//encerrar construtor
public String getArtist() {
return artist;
}//encerrar método getArtist
public void setArtist(String artist) {
this.artist = artist;
}//encerrar método setArtist
public int getNumberOfSongs() {
return numberOfSongs;
}//encerrar método getNumberOfSongs
public void setNumberOfSongs(int numberOfSongs) {
this.numberOfSongs = numberOfSongs;
}//encerrar método setNumberOfSongs

public String getLabel() {
return label;
}//encerrar método getLabel
public void setLabel(String label) {
this.label = label;
}//encerrar método setLabel
//substituir Método toString() da classe Produto
//para permitir a exibição de cada objeto CD na console
public String toString()
{
return "\n\nNumero do Item : " + getItemNumber()
+ "\nNome : " + getName()
+ "\nArtista : " + getArtist()
+ "\nMusicas do Album :" + getNumberOfSongs()
+ "\nSelo de Gravacao : " + getLabel()
+ "\nQuantidade em estoque: " + getQtyInStock()
+ "\nPreco : " + getPrice()
+ "\nValor do Estoque : " + getInventoryValue()
+ "\nStatus do Produto : " + (getActive()?"Ativo":"Descontinuado");
}//encerrar método toString
}//encerrar classe CD  

