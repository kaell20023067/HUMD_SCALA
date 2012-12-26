package kaell.Repository

abstract class Repository {
	// Subir al Repositorio
	def CheckIn(Document: NodeDocument): Boolean
	
	// Bajar del Repositorio
	def CheckOut(Document: NodeDocument): Boolean
	
	// crea directorio en el repositorio
	def CreateFolder(Collection: NodeCollection): Boolean
}	