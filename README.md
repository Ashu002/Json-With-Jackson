# Json-With-Jackson
Play around basics of Jackson and on getting JSON
serialized and deserialized efficiently and with flexibility.


# Basic Notes:
 
* Dealing with Unknown Fields on the ObjectMapper
We can now configure the full ObjectMapper to ignore unknown properties in the JSON:
new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)


* We can also mark a single class as accepting unknown fields, instead of the entire Jackson
ObjectMapper:
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClassIgnoreUnknown { ... }

