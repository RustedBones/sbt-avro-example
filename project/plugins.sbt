addSbtPlugin("com.cavorite" % "sbt-avro" % "3.1.0")

// Java sources compiled with one version of Avro might be incompatible with a
// different version of the Avro library. Therefore we specify the compiler
// version here explicitly.
libraryDependencies += "org.apache.avro" % "avro-compiler" % "1.10.2"
