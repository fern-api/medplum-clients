version="b4a5eee"
# download plugin
rm -rf fern-client-cli-"$version"-"$version"
wget --user "$JFROG_USERNAME" --password "$JFROG_API_KEY" \
  https://usebirch.jfrog.io/artifactory/default-maven-local/com/fern/java/fern-client-cli/"$version"/fern-client-cli-"$version".zip
unzip fern-client-cli-"$version".zip
cd fern-client-cli-"$version"-"$version"
# delete existing code
rm -rf ../medplum-java-client/src
rm -rf ../medplum-java-client/generated_src
# run plugin
java -cp fern-client-cli-"$version".jar:lib/* com.fern.java.client.cli.ClientGeneratorCli ../../api/generated/ir.json ../medplum-java-client com.medplum