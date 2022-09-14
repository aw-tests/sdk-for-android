package io.appwrite

class Query {
  companion object {
    fun equal(attribute: String, value: Any) = addQuery(attribute, "equal", value)

    fun notEqual(attribute: String, value: Any) = Query.addQuery(attribute, "notEqual", value)

    fun lessThan(attribute: String, value: Any) = Query.addQuery(attribute, "lessThan", value)

    fun lessThanEqual(attribute: String, value: Any) = Query.addQuery(attribute, "lessThanEqual", value)

    fun greaterThan(attribute: String, value: Any) = Query.addQuery(attribute, "greaterThan", value)

    fun greaterThanEqual(attribute: String, value: Any) = Query.addQuery(attribute, "greaterThanEqual", value)
    
    fun search(attribute: String, value: String) = Query.addQuery(attribute, "search", value)

    fun orderAsc(attribute: String) = "orderAsc(\"${attribute}\")"

    fun orderDesc(attribute: String) = "orderDesc(\"${attribute}\")"

    fun cursorBefore(documentId: String) = "cursorBefore(\"${documentId}\")"

    fun cursorAfter(documentId: String) = "cursorAfter(\"${documentId}\")"

    fun limit(limit: Int) = "limit(${limit})"

    fun offset(offset: Int) = "offset(${offset})"

    private fun addQuery(attribute: String, method: String, value: Any): String {
      return when (value) {
        is List<*> -> "${method}(\"${attribute}\", [${value.map{it -> parseValues(it!!)}.joinToString(",")}])"
    	  else -> "${method}(\"${attribute}\", [${Query.parseValues(value)}])"
      }
    }
    private fun parseValues(value: Any): String {
      return when (value) {
        is String -> "\"${value}\""
    	  else -> "${value}"
      }
    }
  }
}
