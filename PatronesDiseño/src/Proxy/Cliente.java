
package Proxy;

public	class	Cliente	{
				
    public static void	main(String[] args){
	InformacionProxy proxyTest= new	InformacionProxy("Alfredo");
        System.out.println("Hola Alfredo");
	proxyTest.mostrarInformacion();
	InformacionProxy proxyTestAdmin	= new InformacionProxy("Administrador");
        System.out.println("Hola Administrador");
	proxyTestAdmin.mostrarInformacion();
				
    
    }
}
