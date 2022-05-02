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
  Optional<Boolean> conditionalUpdate();

  Optional<Code> type();

  Optional<Capabilitystatement_resourceConditionaldelete> conditionalDelete();

  Optional<Capabilitystatement_resourceVersioning> versioning();

  Optional<Boolean> conditionalCreate();

  Optional<List<String>> searchInclude();

  Optional<List<CapabilityStatement_Interaction>> interaction();

  Optional<Capabilitystatement_resourceConditionalread> conditionalRead();

  Optional<List<Capabilitystatement_resourceReferencepolicyItem>> referencePolicy();

  Optional<Canonical> profile();

  Optional<Boolean> readHistory();

  Optional<List<String>> searchRevInclude();

  Optional<Boolean> updateCreate();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<CapabilityStatement_SearchParam>> searchParam();

  Optional<List<Canonical>> supportedProfile();

  Optional<List<CapabilityStatement_Operation>> operation();

  Optional<List<Extension>> modifierExtension();

  Optional<Markdown> documentation();

  static ImmutableCapabilityStatement_Resource.Builder builder() {
    return ImmutableCapabilityStatement_Resource.builder();
  }
}
