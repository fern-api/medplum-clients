version="d7b6146"
# download plugin
rm -rf fern-model-codegen-"$version"-"$version"
wget --user "$JFROG_USERNAME" --password "$JFROG_API_KEY" \
  https://usebirch.jfrog.io/artifactory/default-maven-local/com/fern/java/fern-model-codegen/"$version"/fern-model-codegen-"$version".zip
unzip fern-model-codegen-"$version".zip
cd fern-model-codegen-"$version"-"$version"
# delete existing code
rm -rf ../medplum-java-model/src
rm -rf ../medplum-java-model/generated_src
# run plugin
java -cp fern-model-codegen-"$version".jar:lib/* com.fern.model.codegen.ModelGeneratorCli ../../api/generated/ir.json ../medplum-java-model