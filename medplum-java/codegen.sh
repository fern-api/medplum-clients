version="0.0.1"
# download plugin
rm -rf fern-client-cli-"$version"-"$version"
wget https://s01.oss.sonatype.org/content/repositories/releases/io/github/fern-api/fern-client-cli/"$version"/fern-client-cli-"$version".zip
unzip fern-client-cli-"$version".zip
cd fern-client-cli-"$version"-"$version"
# delete existing code
rm -rf ../medplum-java-client/src
rm -rf ../medplum-java-client/generated_src
# run plugin
java -cp fern-client-cli-"$version".jar:lib/* com.fern.java.client.cli.ClientGeneratorCli ../../api/generated/ir.json ../medplum-java-client com.medplum