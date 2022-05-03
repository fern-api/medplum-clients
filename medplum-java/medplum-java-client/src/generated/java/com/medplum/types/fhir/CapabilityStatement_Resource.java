package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCapabilityStatement_Resource.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Resource {
  Optional<String> id();

  Optional<Boolean> updateCreate();

  Optional<List<String>> searchRevInclude();

  Optional<Capabilitystatement_resourceConditionalread> conditionalRead();

  Optional<List<String>> searchInclude();

  Optional<List<Extension>> extension();

  Optional<Canonical> profile();

  Optional<Boolean> readHistory();

  Optional<List<Capabilitystatement_resourceReferencepolicyItem>> referencePolicy();

  Optional<List<CapabilityStatement_Operation>> operation();

  Optional<List<CapabilityStatement_SearchParam>> searchParam();

  Optional<List<Canonical>> supportedProfile();

  Optional<Capabilitystatement_resourceVersioning> versioning();

  Optional<Boolean> conditionalCreate();

  Optional<List<Extension>> modifierExtension();

  Optional<Markdown> documentation();

  Optional<Capabilitystatement_resourceConditionaldelete> conditionalDelete();

  Optional<Code> type();

  Optional<List<CapabilityStatement_Interaction>> interaction();

  Optional<Boolean> conditionalUpdate();

  static ImmutableCapabilityStatement_Resource.Builder builder() {
    return ImmutableCapabilityStatement_Resource.builder();
  }
}
