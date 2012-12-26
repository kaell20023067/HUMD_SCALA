package kaell.Repository

trait Searchable {
	
	// search 
	def Search(query:String):List[NodeDocument]
}