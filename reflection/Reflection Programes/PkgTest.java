class PkgTest
{
	public static void main(String args[])
	{
		Package pkgs[];
		
		pkgs = Package.getPackages();
		
		//for(int i=0;i<pkgs.length;i++)
			System.out.println(
		         pkgs[0].getName()+" "+
				 pkgs[0].getImplementationTitle()+" "+
				 pkgs[0].getImplementationVendor()+" "+
				 pkgs[0].getImplementationVersion()
			);
	}
}