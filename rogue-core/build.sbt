libraryDependencies <++= (scalaVersion) { scalaVersion =>
  val specsVersion = scalaVersion match {
    case "2.8.0" => "1.6.5"
    case "2.9.1" => "1.6.9"
    case _       => "1.6.8"
  }
  val liftVersion = scalaVersion match {
    case "2.9.1" => "2.4-M4"
    case _       => "2.4-M2"
  }
  Seq(
    // "net.liftweb"             %% "lift-mongodb-record" % liftVersion  % "compile" intransitive(),
    "net.liftweb"             %% "lift-mongodb"        % liftVersion  % "compile" intransitive(),
    // "net.liftweb"             %% "lift-record"         % liftVersion  % "compile",
    "net.liftweb"             %% "lift-common"         % liftVersion  % "compile",
    "net.liftweb"             %% "lift-json"           % liftVersion  % "compile",
    "joda-time"                % "joda-time"           % "2.0"        % "provided",
    "org.joda"                 % "joda-convert"        % "1.2"        % "provided",
    "org.mongodb"              % "mongo-java-driver"   % "2.7.2"      % "compile",
    "junit"                    % "junit"               % "4.5"        % "test",
    "com.novocode"             % "junit-interface"     % "0.6"        % "test",
    "ch.qos.logback"           % "logback-classic"     % "0.9.26"     % "provided",
    "org.scala-tools.testing" %% "specs"               % specsVersion % "test",
    "org.scala-lang"           % "scala-compiler"      % scalaVersion % "test"
  )
}

Seq(defaultSettings: _*)
