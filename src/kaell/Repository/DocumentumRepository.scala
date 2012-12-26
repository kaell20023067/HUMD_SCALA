package kaell.Repository

import scala.collection.immutable.List

class DocumentumRepository extends Repository with Searchable {

  def CheckIn(Document: NodeDocument): Boolean = { false }

  def CheckOut(Document: NodeDocument): Boolean = { false }

  def CreateFolder(Collection: NodeCollection): Boolean = { false }

  def Search(query: String): List[NodeDocument] = { null }
}